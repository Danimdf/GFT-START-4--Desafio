package exercicio01;

public class Supervisor extends Colaborador{

    public Supervisor(float salario, int grauInstrucao) {
        super(salario, grauInstrucao);
    }

    @Override
    public float bonificacao() {
        float valorAbono = 500;
        float valorTotal;

        valorTotal = salario + ((valorAbono * grauInstrucao) * 3);
        return valorTotal;
    }
}
