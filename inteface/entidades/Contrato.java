package inteface.entidades;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Contrato {
    private Integer numero;
    private LocalDate data;
    private Double totalValor;

    // associação - um contrato pode ter vários parcelamentos
    private List<Parcelamento> parcelamentos = new ArrayList<>();

    public Contrato(Integer numero, LocalDate data, Double totalValor) {
        this.numero = numero;
        this.data = data;
        this.totalValor = totalValor;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public Double getTotalValor() {
        return totalValor;
    }

    public void setTotalValor(Double totalValor) {
        this.totalValor = totalValor;
    }

    public List<Parcelamento> getParcelamentos() {
        return parcelamentos;
    }

}
