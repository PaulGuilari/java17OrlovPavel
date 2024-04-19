package lesson6.hw;

import java.util.Arrays;

/*
 * Создать метод, который сохраняет в массиве все нечетные числа
 * и после этого печатает все элементы в одной строке от 0 до 100
 *
 * Создать двумерный массив (4 х 4)  последовательно заполнить числами
 * от 1 до 16 ячейки данного массива.
 *
 * Создать метод который будет переставлять элементы массива между собой
 * через диагональ которая проходит через массив (из левого верхнего угла в правый нижний угол)
 *
 * Тоже самое что и в предыдущем методе но диагональ(из левого нижнего угла в правый верхний угол)
 */
public class Array {
    public static void main(String[] args) {
        int[][] mat = new int[4][4];
        int count = 1;
        while (count <= 16) {
            for (int i = 0; i < mat.length; i++) {
                for (int j = 0; j < mat[i].length; j++) {
                    mat[i][j] = count;
                    count++;
                }
            }
            System.out.println(Arrays.deepToString(mat));
        }
        for (int j = 0; j < mat.length; j++) {
            for (int i = 0; i < mat[j].length; i++) {
                System.out.print(mat[j][i] + " ");
            }
            System.out.println("");
        }
    }

}
