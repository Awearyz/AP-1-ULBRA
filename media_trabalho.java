import javax.swing.JOptionPane;

public class media_trabalho {
    public static void main(String[] args) {
        
        String nota1Str = JOptionPane.showInputDialog("Informe a nota da prova 1:");
        double ValorNota1 = Double.parseDouble(nota1Str);

        String nota2Str = JOptionPane.showInputDialog("Informe a nota da prova 2:");
        double ValorNota2 = Double.parseDouble(nota2Str);

        String NotaTrabalhoSTR = JOptionPane.showInputDialog("Informe o valor do trabalho");
        double ValorTrabalho = Double.parseDouble(NotaTrabalhoSTR);

        double media = (ValorNota1 + ValorNota2 + ValorTrabalho) / 3;

        if(media >= 6) {
            JOptionPane.showMessageDialog(null, String.format("Media: %.2f Status: Aprovado(a).", media));
        } else {
            JOptionPane.showMessageDialog(null, String.format("Media: %.2f Status: Reprovado(a).", media));
        }
    }
}
