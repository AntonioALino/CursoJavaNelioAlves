public class Pessoal extends Contribuinte {

    private double gastosComSaude;

    public Pessoal() {
    }

    public Pessoal(String nome, double rendimentoAnual, double gastosComSaude) {
        super(nome, rendimentoAnual);
        this.gastosComSaude = gastosComSaude;
    }

    public double getGastosComSaude() {
        return gastosComSaude;
    }

    public void setGastosComSaude(double gastosComSaude) {
        this.gastosComSaude = gastosComSaude;
    }

    @Override
    public double taxa(){
        if (getRendimentoAnual() < 2000.0){
            return getRendimentoAnual() * 0.15 - gastosComSaude * 0.5;
        } else {
            return getRendimentoAnual() * 0.25 - gastosComSaude * 0.5;
        }
    }
}
