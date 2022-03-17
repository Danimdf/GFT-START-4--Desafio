package exercicio01;

public class Supervisor extends Colaborador{

    public Supervisor(float salario, int grauInstrucao) {
        super(salario, grauInstrucao);
        this.salario = salario;
        this.grauInstrucao = grauInstrucao;
    }

    @Override
    public float bonificacao() {
        float valorAbono = 500;
        float intFloat = grauInstrucao;
        float valorTotal;

        valorTotal = this.salario + ((valorAbono * grauInstrucao) * 3);
        return valorTotal;
    }
}
