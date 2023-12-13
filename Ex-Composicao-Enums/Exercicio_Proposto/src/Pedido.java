import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Pedido {

    private Date momentoDoPedido;
    private StatusPedido status;
    private Cliente cliente;
    List<ItemPedido> lista = new ArrayList<>();

    private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

    public Pedido(Date momentoDoPedido, StatusPedido status, Cliente cliente) {
        this.momentoDoPedido = momentoDoPedido;
        this.status = status;
        this.cliente = cliente;
    }

    public Date getMomentoDoPedido() {
        return momentoDoPedido;
    }

    public void setMomentoDoPedido(Date momentoDoPedido) {
        this.momentoDoPedido = momentoDoPedido;
    }

    public StatusPedido getStatus() {
        return status;
    }

    public void setStatus(StatusPedido status) {
        this.status = status;
    }
    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public List<ItemPedido> getLista() {
        return lista;
    }
    public void adcionarItem(ItemPedido item){
        lista.add(item);
    }

    public void removerItem(ItemPedido item){
        lista.remove(item);
    }

    public double total(){
        double soma = 0.0;
        for (ItemPedido itens:  lista){
            soma += itens.subTotal();
        }
        return soma;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Momento do pedido: ");
        sb.append(sdf.format(momentoDoPedido) + "\n");
        sb.append("Status do pedido: ");
        sb.append(status + "\n");
        sb.append("Cliente: ");
        sb.append(cliente + "\n");
        sb.append("Items: ");
        for (ItemPedido itens: lista){
            sb.append(itens + "\n");
        }
        sb.append("Valor total: R$");
        sb.append(String.format("%.2f", total()));
        return sb.toString();
    }
}
