package hotelApp.model.entidades;

import java.text.SimpleDateFormat;
import java.util.Date;

import hotelApp.model.exception.DominioException;

public class Reserva {
    private int numeroQuarto;
    private Date checkIn;
    private Date checkOut;

    // statico pois precisamos apenas de uma instância de SimpleDateFormat
    private static SimpleDateFormat formaDaData = new SimpleDateFormat("dd/MM/yyyy");

    public Reserva(int numeroQuarto, Date checkIn, Date checkOut) throws DominioException {

        // programação defenciva
        if (!checkOut.after(checkIn)) {
            throw new DominioException("Erro: A data de check-out deve ser posterior à data de check-in.");
        }

        this.numeroQuarto = numeroQuarto;
        this.checkIn = checkIn;
        this.checkOut = checkOut;
    }

    public int getNumeroQuarto() {
        return numeroQuarto;
    }

    public void setNumeroQuarto(int numeroQuarto) {
        this.numeroQuarto = numeroQuarto;
    }

    public Date getCheckIn() {
        return checkIn;
    }

    public Date getCheckOut() {
        return checkOut;
    }

    public int duracao() {
        long diferencaEmMilissegundos = checkOut.getTime() - checkIn.getTime();
        return (int) (diferencaEmMilissegundos / (1000 * 60 * 60 * 24));

    }

    public void atualizarDatas(Date checkIn, Date checkOut) throws DominioException {
        Date agora = new Date(); // data atual
        // exceção lancaça
        if (checkIn.before(agora) || checkOut.before(agora)) {
            throw new DominioException("Erro: As datas de check-in e check-out devem ser futuras.");
        }
        if (!checkOut.after(checkIn)) {
            throw new DominioException("Erro: A data de check-out deve ser posterior à data de check-in.");
        }
        // se não tiver erro, atualiza as datas
        this.checkIn = checkIn;
        this.checkOut = checkOut;

    }

    @Override
    public String toString() {
        return String.format("Quarto %d, Check-in: %s, Check-out: %s, Duração: %d noites",
                numeroQuarto,
                formaDaData.format(checkIn),
                formaDaData.format(checkOut),
                duracao());
    }
}