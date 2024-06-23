import java.util.Scanner;

public class calculadora_resistencias {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Informe o valor de R1");
        int R1 = scan.nextInt();
        System.out.println("Informe o valor de R2");
        int R2 = scan.nextInt();
        System.out.println("Informe o valor de R3");
        int R3 = scan.nextInt();
        System.out.println("Informe o valor de R4");
        int R4 = scan.nextInt();

        int RTotal= R1+R2+R3+R4;

        System.out.println("Resistencia Total: " +RTotal);

        if(R1>R2 && R1>R3 && R1>R4)
        {
            System.out.println("Maior resistencia: R1");
        }
        else if(R2>R1 && R2>R3 && R2>R4)
        {
            System.out.println("Maior resistencia: R2");
        }
        else if(R3>R1 && R3>R2 && R3>R4)
        {
            System.out.println("Maior resistencia: R3");
        }
        else if(R4>R1 && R4>R3 && R4>R2)
        {
            System.out.println("Maior resistencia: R2");

        }
        else if(R1==R2 || R1==R3 || R1==R4 || R2==R3 || R2==R4 || R3==R1 || R3==R4)
        {
            System.out.println("Numeros iguais de maior resistencia.");

        }
        


        scan.close();
    }
}
