package inheritance.inheritance1;

public class Child extends Parent {
    /**
     * Override method and call Parent constructor , is output "I`m Parent" and "I`m Child"
     */
    @Override
    public void showMessage() {
        super.showMessage();
        System.out.println("I`m Child");
    }
}
