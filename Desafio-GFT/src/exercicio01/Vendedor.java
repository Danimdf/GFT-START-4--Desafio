package exercicio01;

public class Vendedor extends Colaborador{

    public Vendedor(float salario, int grauInstrucao) {
        super(salario, grauInstrucao);
    }

    @Override
    public float bonificacao() {
        float valorAbono = 300;
        float valorTotal;

        valorTotal = salario + ((valorAbono * grauInstrucao) * 4);
        return valorTotal;
    }

}
