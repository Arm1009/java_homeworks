package strings;

import java.lang.StringBuilder;
import java.util.Scanner;

public class StringUtil {
    Scanner sc = new Scanner(System.in);

    //1․  Գրել method,  որը  կատարում է String concatenation  տվյալ պարամետրով․
//    Նույնը  խնդիրը  StringBuilder-ով.
//1.1
    public void conStr(String first , String second) {
//        String first = "hello";
//        String second = "world";
        String third = first.concat(second);

        System.out.println(third);

        StringBuilder sb = new StringBuilder();
        StringBuilder stringBuilder = new StringBuilder(second);
        System.out.println(stringBuilder.append(first));

    }

    //1.2
    public void numAndStrApp() {
        String s = 1 + 2 + "Hello";
        System.out.println(s);
        StringBuilder stringBuilder = new StringBuilder();
        System.out.println(stringBuilder.append(s));
    }

    //1.3
    public void strNumStr() {
        String s = "1" + 2 + "Hello";
        System.out.println(s);
        StringBuilder stringBuilder = new StringBuilder();
        System.out.println(stringBuilder.append(s));
    }

    //1.4
    public void strNumNumStr() {
        String s = "hello" + 1 + 2 + "world";
        System.out.println(s);
        StringBuilder stringBuilder = new StringBuilder();
        System.out.println(stringBuilder.append(s));
    }

    // 2․  Գրել method,  որը  ստանում է String պարամետր և տպում է ամեն դատարկ  սիվոլից նոր տողում օգտագործելով  String Literal ( \t, \b ….)․
    public void literals() {
        System.out.println("input String:");
        String a = sc.nextLine();
        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i)==' ') {
                System.out.print("\n");
            }else
                System.out.print(a.charAt(i));


        }
      //  System.out.println(a.replace(' ', '\n'));


    }

    //3․ Գրել method (reverse), որը  շուռ է տալիս String.
    public void reverseStr() {
        System.out.println("input String:");
        String str = sc.nextLine();
        String scr = "";


        for (int i = str.length()-1; i >= 0; i--) {

            scr += String.valueOf(str.charAt(i));

        }System.out.println(scr);


    }
//4. Գրել method, որը ստուգում է թե քանի անգամ է տրված տեքստում հանդիպել token ենթատողը.
    public void countSubString() {
        System.out.println("input line:");
        String line = sc.nextLine();
        System.out.println("input token:");
        String token = sc.nextLine();
        int s = 0;
        while (line.contains(token)) {
            line = line.replace(token, " ");
            s++;




        }System.out.println(s);
        System.out.println(line);
    }

    public String bigStr(){
        System.out.println("Input String:");
        String string  =  sc.nextLine();
        String upperCase = "";
        for (int i = 0; i < string.length(); i++) {

            if (string.charAt(i)>='a' && string.charAt(i)<='z'){
                upperCase += (char) (string.charAt(i)-32);
            }else
                upperCase += string.charAt(i);
            
        }
        return upperCase;
    }
  //  6․ Գրել method, որը console-ից կարդում է 20 երկարությամբ սիմվոլների տող , տպում այն եթե տողի
    //  երկարությունը պակաս է 20 ից ապա պետք է տողը լռացնենք պակաս սիմվոլների փոխարեն գրելով «*» սիմվոլը.
    public void length20(){
        System.out.println("Input String");
        String sim = sc.nextLine();
        String len = String.valueOf(sim.length());

        if (sim.length()<=20){
          //  System.out.println(sim.replace(sim(), '*'));
            System.out.println(sim.length());
        }

    }
//    public int aaa(int a ,int b){
//        return a+b;
//    }
//        public float aaa(float c, float d) {
//         return c+d;
//        }

    public String longestPalindrome (String a) {
        int     si = 0, l1 = 1, l2 = 1;
        boolean t;
        for (int i = 0; i < a.length() - 1; i++) {
            for (int j = i + 1; j < a.length(); j++) {
                t = isPalindrome(a.substring(i, j + 1));
                if (t) {
                    l2 = j - i + 1;
                    if (l2 > l1) {
                        si = i;
                        l1 = l2;
                    }
                }
            }
        }
        StringBuilder b = new StringBuilder();
        b.append(a.substring(si, si + l1));
        return String.valueOf(b);
    }
    public boolean isPalindrome (String a) {
        if (a.length() < 2) {
            return true;
        } else if (a.charAt(0) != a.charAt(a.length() - 1)) {
            return false;
        } else {
            return isPalindrome(a.substring(1, a.length() - 1));
        }
    }

}





