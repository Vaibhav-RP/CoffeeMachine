/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package coffeemachine;

public class App {
   
    public static void main(String[] args) {
        BeverageInterface myBeverage = new MyBeverage();
        Controller controller = new Controller(myBeverage);
        controller.makeBeverage();
    }
}
