package inheritance1;

public class Child extends Parent {
    @Override
    public void showMessage() {
        super.showMessage();
        System.out.println("I`m Child");
    }
}
