public class Funcionarios {

    private int ID;
    private String nome;
    private double salario;

    public Funcionarios(int ID, String nome, double salario) {
        this.ID = ID;
        this.nome = nome;
        this.salario = salario;
    }

    public int getID() {
        return ID;
    }

    public void setID(int IDsetado) {
        this.ID = IDsetado;

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public void aumentoSalario(double porcentual){

        salario += salario * porcentual;
    }

    @Override
    public String toString() {
        return "Funcionarios{" +
                "ID=" + ID +
                ", nome='" + nome + '\'' +
                ", salario=" + salario +
                '}';
    }
}
