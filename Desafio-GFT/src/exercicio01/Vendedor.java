package exercicio01;

public class Vendedor extends Colaborador{

    public Vendedor(float salario, int grauInstrucao) {
        super(salario, grauInstrucao);
        this.salario = salario;
        this.grauInstrucao = grauInstrucao;
    }

    @Override
    public float bonificacao() {
        float valorAbono = 300;
        float intFloat = grauInstrucao;
        float valorTotal;

        valorTotal = this.salario + ((valorAbono * grauInstrucao) * 4);
        return valorTotal;
    }

}
