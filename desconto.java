import java.util.Scanner;

public class desconto{

    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        try
        {
        System.out.println("Informe o valor do produto");
        double preco = scan.nextDouble();
        System.out.println("Informe o valor do desconto");
        double desconto = scan.nextDouble();

        double preco_final =preco - preco*(desconto/100);
        System.out.println("Preco final: "+preco_final);
        }
        finally
        {
        scan.close();
        }
    }


}