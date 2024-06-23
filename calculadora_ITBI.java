import javax.swing.JOptionPane;

public class calculadora_ITBI {
    public static void main(String[] args) {
        // Recebe o valor de transação do imóvel
        String valorTransacaoStr = JOptionPane.showInputDialog("Digite o valor de transacao do imovel:");
        double valorTransacao = Double.parseDouble(valorTransacaoStr);

        // Recebe o valor venal do imóvel
        String valorVenalStr = JOptionPane.showInputDialog("Digite o valor venal do imovel:");
        double valorVenal = Double.parseDouble(valorVenalStr);

        // Recebe a porcentagem do imposto ITBI
        String porcentagemITBIStr = JOptionPane.showInputDialog("Digite a porcentagem do imposto ITBI:");
        double porcentagemITBI = Double.parseDouble(porcentagemITBIStr);

        // Calcula o maior valor entre o valor de transação e o valor venal
        double maiorValor = Math.max(valorTransacao, valorVenal);

        // Calcula o imposto ITBI
        double impostoITBI = maiorValor * (porcentagemITBI / 100);

        // Exibe o resultado
        JOptionPane.showMessageDialog(null, "Valor do imposto: R$ " + impostoITBI);
    }
}