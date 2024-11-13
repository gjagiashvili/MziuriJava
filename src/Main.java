import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

      // ტესტები

        // 1 - პასუხია b, -3
        // 2 - პასუხია c, int[] array = new int[5][5];
        // 3 - პასუხია d, 4
        // 4 - პასუხია c, string
        // 5 - პასუხია a, A
        // 6 - პასუხია c, byte, short, int, long
        // 7 - პასუხია a, hello
        // 8 - პასუხია a, break
        // 9 - პასუხია a, აცხადებს 10 ინტიან მასივს და ყველას ანიჭებს მნიშვნელობას 0;
        // 10 - პასუხია c, 24
        // 11 - პასუხია c, მასივს აქვს ფიქსირებული ზომა
        // 12 - პასუხია c, git log
        // 13 - პასუხია a, Remote რეპოზიტორის ასლს ქმნის ლოკალურად
        // 14 - პასუხია a, 0
        // 15 - პასუხია b, მასივი არის ერთი ცვლადი, რომელსაც შეუძლია შეინახოს რამდენიმე ერთი და იმავე ტიპის მნიშვნელობა

        // სავარჯიშო 16

        int[] bookPrices = {1,5,9,2,10,7};

        int minimalPrice = bookPrices[0];
        int maximalPrice = bookPrices[0];
        int minimalIndex = 0;
        int maximalIndex = 0;

        for (int i = 1; i < bookPrices.length; i++) {
            if (bookPrices[i] < minimalPrice) {
                minimalPrice = bookPrices[i];
                minimalIndex = i;
            } else if (bookPrices[i] > maximalPrice) {
                maximalPrice = bookPrices[i];
                maximalIndex = i;
            }
        }
        System.out.println(minimalIndex + " მაღაზიაში ყველაზე იაფია და ღირს " + minimalPrice);
        System.out.println(maximalIndex + " მაღაზიაში ყველაზე იაფია და ღირს " + maximalPrice);

        // სავარჯიშო 17

        for (int i = 0; i <= 100; i++) {
            if (i % 7 == 0 && i % 5 == 0) {
                System.out.println(i + " -HEYHOW");
            } else if (i % 7 == 0) {
                System.out.println(i + " -HOW");
            } else if (i % 5 == 0) {
                System.out.println(i + " -HEY");
            } else {
                System.out.println(i);
            }
        }

        // სავარჯიშო 18

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.print("შეიყვანეთ მასივის სიგრძე: ");
        int length = scanner.nextInt();
        System.out.print("შეიყვანეთ მასივის სიგანე: ");
        int width = scanner.nextInt();

        int[][] array = new int[length][width];

        System.out.println("მასივი რანდომული რიცხვებით 0-დან 50-მდე სიგრძით " + length + " და სიგანით " + width + " არის");
        for (int i = 0; i < length; i++) {

            for (int j = 0; j < width; j++) {
                array[i][j] = random.nextInt(51);
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }

        // სავარჯიშო 19

        int[][] arrayDouble = {
                {2, 3, 4},
                {5, 6, 7},
                {8, 9, 10}
        };

        System.out.println("მასივი, რომლის მთავარი დიაგნოალის ელემენტების ჯამს ვითვლით: ");
        for (int i = 0; i < arrayDouble.length; i++) {
            for (int j = 0; j < arrayDouble[i].length; j++) {
                System.out.print(arrayDouble[i][j] + " ");
            }
            System.out.println();
        }

        int diagonal = 0;
        int secondDiagonal = 0;

        for (int i = 0; i < arrayDouble.length; i++) {
            diagonal += arrayDouble[i][i];
            secondDiagonal += arrayDouble[i][arrayDouble[i].length - 1 - i];
        }

        if (arrayDouble.length % 2 != 0) {
            int centralElement = arrayDouble.length / 2;
            diagonal -= arrayDouble[centralElement][centralElement];
        }

        System.out.println("დიაგონალი 1 ჯამი: " + diagonal);
        System.out.println("დიაგონალი 2 ჯამი: " + secondDiagonal);


        // სავარჯიშო 20

        int[][] arrayThird = {
                {2, 3, 4},
                {5, 6, 7},
                {8, 9, 10}
        };

        int row = arrayThird.length;
        int column = arrayThird[0].length;

        int[][] rotatedArray = new int[column][row];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                rotatedArray[j][row - 1 - i] = arrayThird[j][i];
            }
        }

        System.out.println("აუტრიალებელი: ");
        for (int i=0; i < arrayThird.length; i++) {
            for (int j = 0; j < arrayThird[i].length; j++) {
                System.out.print(arrayThird[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("ატრიალებული: ");
        for (int i = 0; i < rotatedArray.length; i++) {
            for (int j = 0; j < rotatedArray[i].length; j++) {
                System.out.print(rotatedArray[i][j] + " ");
            }
            System.out.println();
        }


    }
}