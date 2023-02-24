package inheritence2;

public class SubClass extends SuperClass {
    public void Construct(){
        System.out.println(super.message);
        System.out.println(message);


    }

    String message = "Hello SubClass class";
}

