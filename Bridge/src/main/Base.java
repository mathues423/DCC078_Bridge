package main;

public class Base extends Assinatura{

    public Base(float custoBase) {
        super(custoBase);
    }

    @Override
    public float calcularAssinatura() {
        return this.custoBase;
    }
}
