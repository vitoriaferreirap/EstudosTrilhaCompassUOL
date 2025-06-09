package hotelApp.model.entidades;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Reserva {
    private int numeroQuarto;
    private Date checkIn;
    private Date checkOut;

    // statico pois precisamos apenas de uma instância de SimpleDateFormat
    private static SimpleDateFormat formaDaData = new SimpleDateFormat("dd/MM/yyyy");

    public Reserva(int numeroQuarto, Date checkIn, Date checkOut) {
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

    public void atualizarDatas(Date checkIn, Date checkOut) {
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
