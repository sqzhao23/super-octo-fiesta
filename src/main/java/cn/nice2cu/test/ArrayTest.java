package cn.nice2cu.test;

import java.util.Random;

/**
 * TODO
 *
 * @author：zhaosq
 * @date: 2021/12/28
 */
public class ArrayTest {

    public static void main(String[] args) {
        int[][] arr = getArray();
        System.out.println();
    }

    private static int[][] getArray() {
        Random random = new Random();
        int[][] array = new int[10][10];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = random.nextInt(10) + 1;
            }
        }
        return array;
    }
}
