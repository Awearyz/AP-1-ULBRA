public class tabuada {
    public static void main(String[] args) {
        int numero = 5;
        int[] resultado = new int[11];

        for (int i = 1; i <= 10; i++) {
            resultado[i] = numero * i;
            System.out.println(numero + " x " + i + " = " + resultado[i]);
        }
    }
}
