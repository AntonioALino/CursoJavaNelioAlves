public class Tercerizados extends Funcionarios{

    private double bonusAdicional;

    public Tercerizados(String nome, int horasTrabalhadas, double valorPorHora, double bonusAdicional){
        super(nome, horasTrabalhadas, valorPorHora);
        this.bonusAdicional = bonusAdicional;
    }

    public double getBonusAdicional() {
        return bonusAdicional;
    }

    public void setBonusAdicional(double bonusAdicional) {
        this.bonusAdicional = bonusAdicional;
    }

    @Override
    public double pagamento(){
        return super.pagamento() + bonusAdicional * 1.1;
    }
}
