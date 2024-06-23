import java.util.Scanner;

public class calc_aposentadoria {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        System.out.println("Informe a idade da pessoa");
        int idade = scan.nextInt();
        System.out.println("Informe o sexo da pessoa [M] para homem e [F] para mulher");
        String sexo = scan.next();
        sexo=sexo.toUpperCase();
        System.out.println("Informe os anos de contribuicao");
        int anosContribuicao = scan.nextInt();
        scan.close();
        
        if(sexo.equals("M"))
        {
            if(idade>=65 && anosContribuicao>=35)
            {
                System.out.println("Aposentadoria liberada.");
            }
            else if(idade<65)
            {
                System.out.println("Aposentadoria negada. Idade menor que a necessária.");
            }
            else
            {   
                int faltam = 35-anosContribuicao;
                System.out.println("Aposentadoria negada. Faltam " +faltam+" de anos de contribuicao");
                
            }
        }
        else
        {

            if(idade>=62 && anosContribuicao>=30)
            {
                System.out.println("Aposentadoria liberada.");
            }

            else if(idade<60)
            {
                System.out.println("Aposentadoria negada. Idade menor que a necessária.");
            }

            else
            {   
                int faltam = 30-anosContribuicao;
                System.out.println("Aposentadoria negada. Faltam " +faltam+" de anos de contribuicao");
                
            }

        }


    }
}
