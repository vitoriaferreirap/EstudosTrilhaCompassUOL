package inteface.entidades;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Parcelamento {
    // forma static para formatar data
    private static DateTimeFormatter formaData = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    private LocalDate dataVencimento;
    private Double quantia;

    public Parcelamento(LocalDate dataVencimento, Double quantia) {
        this.dataVencimento = dataVencimento;
        this.quantia = quantia;
    }

    public LocalDate getDataVencimento() {
        return dataVencimento;
    }

    public void setDataVencimento(LocalDate dataVencimento) {
        this.dataVencimento = dataVencimento;
    }

    public Double getQuantia() {
        return quantia;
    }

    public void setQuantia(Double quantia) {
        this.quantia = quantia;
    }

    @Override
    public String toString() {
        return dataVencimento.format(formaData) + " - " + String.format("%.2f", quantia);
    }

}
