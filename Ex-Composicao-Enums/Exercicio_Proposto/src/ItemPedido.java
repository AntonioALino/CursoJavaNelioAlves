public class ItemPedido {

    private int quantidade;
    private double preco;

    private Produto produto;

    public ItemPedido(int quantidade, double preco, Produto produto){
        this.quantidade = quantidade;
        this.preco = preco;
        this.produto = produto;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public double subTotal(){

        return preco * quantidade;
    }

    @Override
    public String toString() {
        return produto.getNome() +
                "\n" +
                String.format("R$ %.2f \n", preco)+
                "Quantidade: " +
                quantidade + ", \n" +
                "Subtotal: R$" +
                subTotal() + ",\n" +
                String.format("%.2f", subTotal());

    }
}
