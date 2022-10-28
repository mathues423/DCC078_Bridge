package main;

public class Silver extends Assinatura{

    public Silver(float custoBase) {
        super(custoBase);
    }

    @Override
    public float calcularAssinatura() {
        return this.custoBase * (1 - this.cliente.percentDesconto());
    }
}
