package args;

import java.util.Arrays;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class ArraysUtil {
          Scanner sc = new Scanner(System.in);
     //  1. Գրել method, որը տպում է int[] n  array-ի դրական տարրերը.
     public static void randArr() {

          int minVal = -1000;

          int maxVal = 1000;

          int[] arr = new int[10];
          for (int i = 0; i < arr.length; i++) {
               arr[i] = ThreadLocalRandom.current().nextInt(minVal, maxVal);
          }
          for (int i : arr)
               if (i > 0) {
                    System.out.println("positive arrays: " + i);
               }


          System.out.println(Arrays.toString(arr));
     }

     //3. Գրել method, որը գտնում եւ  տպում է  long[] l array-ի ամենամեծ տարրը.
//4. Գրել method, որը գտնում եւ տպում է  float[] f  array-ի ամենափոքր տարրը
     public  void maxMinArr() {
//        long minValue = -1000;
//        long maxValue = 1000;

          long[] arr = new long[10];
          long min = arr[0];
          long max = arr[0];
          for (int i = 0; i < arr.length; i++) {
               arr[i] = ThreadLocalRandom.current().nextLong(-1000, 1000);
               System.out.print(arr[i] + " ");
               if (arr[i] < min) {
                    min = arr[i];
//            } else if (arr[i] > max) {
//                max = arr[i];
               }
          }
          System.out.println();
          System.out.println(min);
//        System.out.println(max);
     }
     //2.Գրել method, որը տպում է short[] s  array-ի էլեմենտները հակառակ հերթականությամբ


     public void reverseThis() {
          int minVal = -1000;
          int maxVal = 10;

          int[] arr = new int[10];
          for (int i = 0; i < arr.length; i++) {
               arr[i] = ThreadLocalRandom.current().nextInt(minVal, maxVal);
               System.out.print(arr[i] + " ");

          }

          System.out.println("");
          for (int j = 0; j < arr.length; j++) {
               System.out.print(arr[arr.length - 1 - j] + " ");

          }


     }

     //5.Գրել method, որը int[] n array-ի էլեմենտները եւ տեղափոխում  int[] m  array-ի մեջ
     public void cloneArrays() {


          int[] n = {1, 2, 3, 4, 5};
          int[] m = new int[n.length];
          for (int i = 0; i < n.length; i++) {
               m[i] = n[i];


          }
          for (int value : m)
               System.out.print(value + "   ");
     }

     //6. Գրել method, որը ստեղծում է երկու նույն չափը ունեցող array-ներ գումարում է array
//-ի համապատասխան էլեմենտները եւ գրում երրորդ array-ի մեջ։
     public  void arraysSum3() {
          int[] a = {1, 2, 3, 4, 5};
          int[] b = {5, 4, 3, 2, 1};
          int[] c = new int[a.length];

          for (int i = 0; i < a.length; i++) {
               System.out.print(a[i] + "  ");

          }

          System.out.println();

          for (int i = 0; i < b.length; i++) {
               System.out.print(b[i] + "  ");
               c[i] = a[i] + b[i];

               System.out.print(c[i] + "\n");
          }


     }
     //7. Գրել method, որը հաշվում է թե քանի անգամ է  k թիվը հանդիպել array-ի
     //Էլեմենտների մեջ։

     public  void findNum() {

          System.out.println("input a number 0-10: ");
          int n = sc.nextInt();
          int[] a = {1, 2, 8, 9, 7, 5, 6, 3, 1, 2, 7, 8, 9, 5, 1, 5, 6, 4, 3, 7, 9, 7, 1, 6};
          int count = 0;
          for (int i = 0; i < a.length; i++) {

               if (a[i] == n) {
                    count++;
               }


          }
          System.out.print(count);
     }

     //9  Դասավորել տրված թվերի հաջորդականության անդամները նվազման կարգով:
     public  void noF3() {
          int a[] = new int[4];
          for (int i = 0; i < a.length; i++) {
               a[i] = (int) (Math.random() * 10);

               System.out.println("uncorrect" + Arrays.toString(a));
          }

          int tmt;
          for (int i = 0; i < a.length; i++) {
               for (int j = 0; j < a.length - 1; j++) {
                    if (a[j] < a[j + 1]) {
                         tmt = a[j];
                         a[j] = a[j + 1];
                         a[j + 1] = tmt;
                    }


               }

          }
          System.out.println("correct" + Arrays.toString(a));

     }
     //10  Դասավորել տրված ամբողջ թվերի հաջորդականության անդամներն անյպես, որ .
     //   վերջում լինեն կենտերը:
     public  void divideArr() {


          int[] array = {1, 5, 6, 4, 9, 18, 7, 1, 2, 4,};
          int temp;
          for (int i = 0; i < array.length; i++) {
               for (int j = i; j < array.length; j++) {
                    if (array[i] % 2 != 0) {
                         temp = array[i];
                         array[i] = array[j];
                         array[j] = temp;
                    }
               }
          }
          for (int value : array) {
               System.out.print(value + " ");
          }
     }
     //11  Տրված իրական թվերի հաջորդականությունից հեռացնել բոլոր զրոները։
     public  void zeroOut(){
          int arr[] = {1,0,6,7,9,7,0,3,6,0};
          int call = 0;
          for (int i = 0; i<arr.length;i++){
               if(call!=arr[i]){
                    System.out.print(arr[i]+"  ");
               }
          }
     }
     //13  Ներածել n բնական թիվը 2-ական տեսքով՝ ստանալով 0-ներից ու 1-երից կազմված .
     // զանգված եւ արտածել n  թվի 10-ական ներկայացումը:
     public  int  zeroOne(){
          int counter = 1;
          int number = 0;
          int power = 0;
          int temp = 0;
          int dec = 0;
          while (number / 10 != 0) {
               counter++;
               number /= 10;
          }
          int[] array = new int[counter];
          for (int i = 0; i < counter; i++) {
               array[i] = number % 10;
               number /= 10;
               System.out.println(array[i]);
          }
          for (int j = 0; j < array.length; j++) {
               temp = array[j] * ((int) Math.pow(2, power));
               dec += temp;
               power++;
          }
          return dec;





     }

}
