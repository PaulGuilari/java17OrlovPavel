package lesson6.hw;

public class ArrayContest {

    // 1. Дан массив целых чисел. Вернуть массив только четных чисел.
    public static int[] filterIntArray(int[] array) {
        int c = 0;
        for (int j = 0; j < array.length; j++) {
            if (array[j] % 2 == 0) {
                c++;
            }
        }
        int[] numbers = new int[c];

        for (int j = 0, counter = 0; j < array.length; j++) {
            if (array[j] % 2 == 0) {
                numbers[counter] = array[j];
                counter++;
            }
        }
        return numbers;
    }

    // 2. Дан массив строк. Вернуть массив строк содержащих букву a.
    public static String[] filterStringArray(String[] array) {
        int c = 0;
        for (String s : array) {
            if (s.contains("a") || s.contains("A")) {
                c++;
            }
        }
        String[] array2 = new String[c];
        for (int j = 0, counter = 0; j < array.length; j++) {
            if (array[j].toLowerCase().contains("a")) {
                array2[counter] = array[j];
                counter++;
            }
        }
        return array2;
    }

    // 3. Дан массив целых чисел. Вернуть массив квадратов этих чисел.
    public static int[] powerIntArray(int[] array) {
        int[] array2 = new int[array.length];
        for (int i = 0; i < array2.length; i++) {
            array2[i] = array[i] * array[i];
        }
        return array2;
    }

    // 4. Дан массив строк. Проверить содержится ли слово в массиве, игнорируя case.
    public static boolean checkWord(String[] array, String word) {
        for (String str : array) {
            if (str.equalsIgnoreCase(word)) {
                return true;
            }
        }
        return false;
    }

    // 5. Дана матрица целых чисел. Вернуть строку в матрице с наибольшей суммой элементов.
    public static int[] biggestRowInMatrix(int[][] matrix) {
        int sum1 = 0;
        int sum2 = 0;
        int[] biggestSum = new int[0];
        for (int i = 0; i < matrix.length; ) {
            for (int j = 0; j < matrix[i].length; j++) {
                sum1 += matrix[i][j];
            }
            if (sum2 < sum1){
                sum2 = sum1;
                biggestSum = matrix[i];
                i++;
                sum1 = 0;
            }else i++;
        }
        return biggestSum;
    }
}
