package main;

public abstract class Assinatura {
    protected TipoCliente cliente;

    protected float custoBase;

    public Assinatura(float custoBase) {
        this.custoBase = custoBase;
    }

    public void setTipoCliente(TipoCliente cliente) {
        this.cliente = cliente;
    }

    public void setCustoBase(float custoBase) {
        this.custoBase = custoBase;
    }

    public abstract float calcularAssinatura();
}
