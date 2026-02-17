public class PromedioFilas {
    public static void main(String[] args) {
        int[][] matriz = new int[4][3];
        
        for (int i = 0; i < 4; i++) {
            int sumaFila = 0;
            for (int j = 0; j < 3; j++) {
                matriz[i][j] = (int)(Math.random() * 100) + 1;
                System.out.print(matriz[i][j] + " ");
                sumaFila += matriz[i][j];
            }
            System.out.println(" | Promedio: " + (sumaFila / 3.0));
        }
    }
}
