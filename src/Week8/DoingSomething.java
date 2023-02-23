package Week8;

import javax.swing.plaf.InternalFrameUI;
import java.util.Random;

public class DoingSomething implements Runnable {

    private String name;
    private int number;
    private int sleep;
    private int rand;

    public DoingSomething(String name, int number, int sleep) {
        this.name = name;
        this.number = number;
        this.sleep = sleep;

        Random random1 = new Random();
        this.rand = random1.nextInt(1000);
    }

    public void run() {
        System.out.println("Executing with these parameters: Name = " + name + " Number = " + number + " Sleep = " + sleep + " Random Number = " + rand + "\n\n");
        for (int count = 1; count < rand; count++) {
            if (count % number == 0) {
                System.out.print("\n\n" + name + " is sleeping. ");
                try {
                    Thread.sleep(sleep);
                } catch (InterruptedException e) {
                    System.err.println(e.toString());
                }
            }
            System.out.println("\n\n" + name + " is done. ");


        }
    }
}
