public class Main {
    public static void main(String[] args) {
        // Массивы.Часть 1.Домашнее задание 1.Исполнение 2.
        // Задание 1.2.3.
        System.out.println("Домашнее задание 1");
        System.out.println("Задания 1,2,3");
        int[] numbersArr = new int[3];
        numbersArr[0] = 1;
        numbersArr[1] = 2;
        numbersArr[2] = 3;

        double[] arrayFN = {1.57, 7.654, 9.986};

        char[] arraySimbol = {'a', 'b', 'c', 'd', 'e'};


        for (int i = 0; i < numbersArr.length; i++) {
            System.out.print(numbersArr[i]);
            if (i != numbersArr.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
        for (int i = 0; i < arrayFN.length; i++) {
            System.out.print(arrayFN[i]);
            if (i != arrayFN.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
        for (int i = 0; i < arraySimbol.length; i++) {
            System.out.print(arraySimbol[i]);
            if (i != arraySimbol.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
        for (int i = numbersArr.length - 1; i >= 0; i--) {
            System.out.print(numbersArr[i]);
            if (i != 0) {
                System.out.print(", ");
            }
        }
        System.out.println();
        for (int i = arrayFN.length - 1; i >= 0; i--) {
            System.out.print(
                    arrayFN[i]);
            if (i != 0) {
                System.out.print(", ");
            }
        }
        System.out.println();
        for (int i = arraySimbol.length - 1; i >= 0; i--) {
            System.out.print(arraySimbol[i]);
            if (i != 0) {
                System.out.print(", ");
            }
        }
        System.out.println();

        // Задание 4.
        System.out.println("Задание 4");
        int[] numbersArray = new int[]{1, 2, 3};
        for (int i = 0; i < numbersArray.length; i++) {
            if (numbersArray[i] % 2 == 0) {
                System.out.print(numbersArray[i] + ",");
            } else {
                numbersArray[i] = numbersArray[i] + 1;
                {
                    System.out.print(numbersArray[i] + ",");
                }

            }

        }


    }
}

