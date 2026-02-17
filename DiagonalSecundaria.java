public class DiagonalSecundaria {
    public static void main(String[] args) {
        int[][] matriz = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        int suma = 0;
        
        for (int i = 0; i < matriz.length; i++) {
            suma += matriz[i][matriz.length - 1 - i];
        }
        System.out.println("Suma diagonal secundaria: " + suma);
    }
}
