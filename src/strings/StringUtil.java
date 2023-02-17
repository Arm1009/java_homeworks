package strings;



import java.lang.StringBuilder;

import java.util.Scanner;




public class StringUtil {
    Scanner sc = new Scanner(System.in);

    //1․  Գրել method,  որը  կատարում է String concatenation  տվյալ պարամետրով․
//    Նույնը  խնդիրը  StringBuilder-ով.
//1.1
    public void conStr() {
        String first = "hello";
        String second = "world";
        String third = first.concat(second);
        System.out.println(third);

        StringBuilder sb = new StringBuilder();
        StringBuilder stringBuilder = new StringBuilder("hello");
        System.out.println(stringBuilder.append("world"));

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

        System.out.println(a.replace(' ', '\n'));

    }

    //3․ Գրել method (reverse), որը  շուռ է տալիս String.
    public void reverseStr() {
        System.out.println("input String:");
        String str = sc.nextLine();
        String scr = "";


        for (int i = str.length() - 1; i >= 0; i--) {

            scr += String.valueOf(str.charAt(i));
            System.out.println(scr);
        }


    }
//4. Գրել method, որը ստուգում է թե քանի անգամ է տրված տեքստում հանդիպել token ենթատողը.
    public void countSubString() {
        System.out.println("input line:");
        String line = sc.nextLine();
        System.out.println("input token:");
        String token = sc.nextLine();
        int s = 0;
        while (line.contains(token)) {
            line = line.replaceFirst(token, " ");
            s++;
            System.out.println(s);
            System.out.println(line);



        }
    }

    public void bigStr(){
        System.out.println("Input String:");
        String string  =  sc.nextLine();
        String upperCase = "";
        for (int i = 0; i < string.length(); i++) {

            if (string.charAt(i)>='a' && string.charAt(i)<='z'){
                upperCase += (char) (string.charAt(i)-32);
            }else
                upperCase += string.charAt(i);
            
        }
    }
  //  6․ Գրել method, որը console-ից կարդում է 20 երկարությամբ սիմվոլների տող , տպում այն եթե տողի
    //  երկարությունը պակաս է 20 ից ապա պետք է տողը լռացնենք պակաս սիմվոլների փոխարեն գրելով «*» սիմվոլը.
    public void length20(){
        System.out.println("Input String");
        String sim = sc.nextLine();
        String len = String.valueOf(sim.length());
        
        if (sim.length()<=20){
            System.out.println(sim.replace(' ', '*'));
            System.out.println(sim.length());
        }

    }


}