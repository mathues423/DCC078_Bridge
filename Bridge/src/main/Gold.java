package main;

public class Gold extends Assinatura{
    public Gold(float custoBase) {
        super(custoBase);
    }

    @Override
    public float calcularAssinatura() {
        return this.custoBase * (1 - this.cliente.percentDesconto()*1.05f);
    }
}
