package exercicio01;

public class Gerente extends Colaborador{
    private int valorAbono;

    public Gerente(float salario, int grauInstrucao) {
        super(salario, grauInstrucao);
        this.salario = salario;
        this.grauInstrucao = grauInstrucao;
    }

    @Override
    public float bonificacao() {
        float valorAbono = 1000;
        float intFloat = grauInstrucao;
        float valorTotal;

        valorTotal = this.salario + ((valorAbono * intFloat) * 2);
        return valorTotal;
    }
}
