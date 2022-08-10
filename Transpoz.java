/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package transpoz;

/**
 *
 * @author Samsung
 */
public class Transpoz {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[][] matriks = {{1, 2, 3}, {4, 5, 6}};
        int[][] transpoz = new int[3][2];

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                transpoz[j][i] = matriks[i][j];
            }
        }
        System.out.println("Matriks:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {

                System.out.print(matriks[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Transpozu:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 2; j++) {

                System.out.print(transpoz[i][j] + " ");
            }
            System.out.println();
        }
    }

}
