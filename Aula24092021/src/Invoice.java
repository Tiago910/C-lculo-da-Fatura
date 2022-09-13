public class Invoice{
    private int numeroItem, quantidade;
    private String descricao;
    private double preco;
   
    Invoice(){}
    Invoice(int numeroItem, int quantidade, String descricao, double preco){
        this.numeroItem=numeroItem;
        this.quantidade=quantidade;
        this.descricao=descricao;
        this.preco=preco;
    }
   
    public void setNumeroItem(int numero){
        this.numeroItem=numero;
    }
    public void setQuantidadeProduto(int quantidade){
        this.quantidade=quantidade;
    }
    public void setDescricaoProduto(String descricao){
        this.descricao=descricao;
    }
    public void setPreco(double preco){
        this.preco=preco;
    }
   
    public int getNumeroItem(){
        return numeroItem;
    }
    public int getQuantidadeProduto(){
        return quantidade;
    }
    public String getDescricaoProduto(){
        return descricao;
    }   
    public double getPrecoItem(){
        return preco;
    }

    public double getInvoiceAmount(){
        double amount = preco*quantidade;
        if(quantidade<0){ this.quantidade=0; }
        if(preco<0){this.preco=0.0;}
        return amount;
    }
}
