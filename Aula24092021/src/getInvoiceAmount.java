
import java.util.Scanner;

public class getInvoiceAmount{
    
public static void main(String args[]){
       
		Scanner input = new Scanner(System.in);
       
        System.out.println("Qual a quantidade de produtos?");
        
        int numeroDeProdutos=input.nextInt();
        Invoice produtos[] = new Invoice[numeroDeProdutos];
        double total = 0;
       
        for(int i=0;i<produtos.length;i++){
        	
            produtos[i] = new Invoice();
            produtos[i].setNumeroItem(i+1);
            
            System.out.println("Produto: " + (i+1));
            System.out.println("Descri��o do produto: ");
            
            String descricao = input.next();
            produtos[i].setDescricaoProduto(descricao);
            
            System.out.println("Pre�o do produto: ");
            produtos[i].setPreco(input.nextDouble());
            
            System.out.println("Quantidade de produtos: ");
            produtos[i].setQuantidadeProduto(input.nextInt());
            total+=produtos[i].getInvoiceAmount();
        }
       
        for(Invoice element:produtos){
        	
            System.out.println("Produto: " + element.getNumeroItem());
            System.out.println("Descri��o: " + element.getDescricaoProduto());
            System.out.println("Quantidade: " + element.getQuantidadeProduto());
            System.out.println("Pre�o: R$" + element.getPrecoItem() + " \n");
        }
       
        System.out.println("Valor total da fatura: R$" + total);
    }
}