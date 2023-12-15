public abstract class Contribuinte {

    private String nome;

    private double rendimentoAnual;


    public Contribuinte(){

    }

    public Contribuinte(String nome, double rendimentoAnual) {
        this.nome = nome;
        this.rendimentoAnual = rendimentoAnual;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getRendimentoAnual() {
        return rendimentoAnual;
    }

    public void setRendimentoAnual(double rendimentoAnual) {
        this.rendimentoAnual = rendimentoAnual;
    }

    public abstract double taxa();

}
