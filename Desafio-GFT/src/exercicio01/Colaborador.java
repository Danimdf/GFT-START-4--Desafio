package exercicio01;

public abstract class Colaborador {
    protected String nome;
    protected int idade;
    public float salario;
    protected int grauInstrucao;

    public Colaborador(float salario, int grauInstrucao) {
        this.salario = salario;
    }

    public float bonificacao(){
        return salario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public int getGrauInstrucao() {
        return grauInstrucao;
    }

    public void setGrauInstrucao(int grauInstrucao) {
        this.grauInstrucao = grauInstrucao;
    }

}
