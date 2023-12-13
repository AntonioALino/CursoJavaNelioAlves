import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class Funcionario {

    private String nome;
    private Senioridade nivel;
    private double salarioBase;
    private Departamento departamento;
    private List<ContratoPerHora> contratos = new ArrayList<>();

    public Funcionario(){

    }

    public Funcionario(String nome, Senioridade nivel, double salarioBase, Departamento departamento) {
        this.nome = nome;
        this.nivel = nivel;
        this.salarioBase = salarioBase;
        this.departamento = departamento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Senioridade getNivel() {
        return nivel;
    }

    public void setNivel(Senioridade nivel) {
        this.nivel = nivel;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public Departamento getDepartamento() {
        return departamento;
    }

    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }

    public List<ContratoPerHora> getContratos() {
        return contratos;
    }
    public void adicionarContrato(ContratoPerHora contrato){
        contratos.add(contrato);
    }

    public void removerContrato(ContratoPerHora contrato){
        contratos.remove(contrato);
    }
    public double renda(int ano, int mes){
        double soma = salarioBase;
        Calendar calendar = Calendar.getInstance();
        for (ContratoPerHora c: contratos){
            calendar.setTime(c.getDate());
            int c_ano = calendar.get(Calendar.YEAR);
            int c_mes = 1 + calendar.get(Calendar.MONTH);
            if (ano == c_ano && mes == c_mes){
                soma += c.valorTotal();
            }
        }
        return soma;
    }
}
