import java.util.Scanner;

public class sistema_login 
{

    public static void main(String[] args) 
    {
        int contador=0;
        Scanner scan = new Scanner(System.in);
        while(contador<3)
        {
            System.out.print("Informe o nome de usuario:");
            String usuario = scan.nextLine();
            System.out.print("Informe a senha:");
            String senha = scan.nextLine();

            if(senha.equals("java8") || usuario.equals("java8"))
            {

                System.out.println("Acesso permitido.");
                break;
            }

            else
            {  
                System.out.println("Acesso negado.");
                contador++;
            }
        }

        scan.close();
    }
    
}
