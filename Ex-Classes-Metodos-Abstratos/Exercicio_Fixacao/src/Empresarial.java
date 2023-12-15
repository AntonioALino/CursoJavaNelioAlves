public class Empresarial extends Contribuinte{

    private int numeroDeFuncionarios;

    public Empresarial (){

    }

    public Empresarial(String nome, double rendimentoAnual, int numeroDeFuncionarios) {
        super(nome, rendimentoAnual);
        this.numeroDeFuncionarios = numeroDeFuncionarios;
    }

    public int getNumeroDeFuncionarios() {
        return numeroDeFuncionarios;
    }

    public void setNumeroDeFuncionarios(int numeroDeFuncionarios) {
        this.numeroDeFuncionarios = numeroDeFuncionarios;
    }

    @Override
    public double taxa(){
        if (getNumeroDeFuncionarios() > 10){
            return getRendimentoAnual() * 0.14;
        } else {
            return getRendimentoAnual() * 0.16;
        }
    }

}
