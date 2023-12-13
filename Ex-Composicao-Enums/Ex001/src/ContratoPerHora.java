import java.util.Date;

public class ContratoPerHora {

    private Date date;
    private double valorPorhora;
    private int horas;

    public ContratoPerHora(){

    }
    public ContratoPerHora(Date date, double valorPorhora, int horas) {
        this.date = date;
        this.valorPorhora = valorPorhora;
        this.horas = horas;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public double getValorPorhora() {
        return valorPorhora;
    }

    public void setValorPorhora(double valorPorhora) {
        this.valorPorhora = valorPorhora;
    }

    public int getHoras() {
        return horas;
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }

    public double valorTotal(){
        return  valorPorhora + horas;
    }
}
