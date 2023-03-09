package inheritance.inheritence2;

public class SubClass extends SuperClass {
    /**
     * In this constructor we called a SuperClass constructor
     */
    public void Construct(){
        System.out.println(super.message);
        System.out.println(message);


    }

    String message = "Hello SubClass class";
}

