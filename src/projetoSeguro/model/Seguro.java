package projetoSeguro.model;

import java.math.BigDecimal;

public class Seguro {

private String cobertura;
private BigDecimal valorFanquia;

    public Seguro(String cobertura, BigDecimal valorFanquia) {
        this.cobertura = cobertura;
        this.valorFanquia = valorFanquia;
    }

    public String getCobertura() {
        return cobertura;
    }

    public void setCobertura(String cobertura) {
        this.cobertura = cobertura;
    }

    public BigDecimal getValorFanquia() {
        return valorFanquia;
    }

    public void setValorFanquia(BigDecimal valorFanquia) {
        this.valorFanquia = valorFanquia;
    }
}
