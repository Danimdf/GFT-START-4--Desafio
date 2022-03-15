package exercicio03;

public class ContaCorrente extends Conta{
    private int rendendo;

    public ContaCorrente(int valor) {
        super();
        this.rendendo = valor;
    }

    @Override
    public float rendimento() {
        float valorTotal;

        valorTotal = (this.getRendendo() * 0.05f);
        return valorTotal;
    }

    public int getRendendo() {
        return rendendo;
    }

    public void setRendendo(int rendendo) {
        this.rendendo = rendendo;
    }
}
