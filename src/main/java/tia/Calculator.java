package tia;

public class Calculator {

    public int sum(int a, int b) {
        return sumImpl(a, b);
    }

    private int sumImpl(int a, int b) {
        return a + b;
    }

    public void moreComplexMethod(boolean pathA, boolean pathB, int iterations) {
        if (pathA) {
            System.out.println("In path A because pathA is true");
        } else {
            for (int i = 0; i < iterations; i++) {
                System.out.println("Iterating in iteration" + i);
                if (pathB) {
                    System.out.println("In path B because pathB is true");
                }
            }
        }
    }

    public int minus(int a, int b) {
        System.out.println("gi");
        return a - b;
    }

}
