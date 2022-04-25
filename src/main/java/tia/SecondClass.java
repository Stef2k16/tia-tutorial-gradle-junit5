package tia;

public class SecondClass {
    public SecondClass (String greeting) {
        if (greeting != null) {
            System.out.println(greeting);
        } else {
            System.out.println("No greeting provided");
        }
    }

    public void doSomething() {
        try {
            Thread.sleep(500);
            System.out.println("Awake again!");
        } catch(Exception e) {
            System.out.println("Oh no");
        }
    }
}
