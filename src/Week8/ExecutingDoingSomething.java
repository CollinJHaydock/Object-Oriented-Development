package Week8;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

public class ExecutingDoingSomething {

    public static void main(String[] args) {

        ExecutorService myService = Executors.newFixedThreadPool(3);

        DoingSomething ds1 = new DoingSomething("Collin" , 30, 1000);
        DoingSomething ds2 = new DoingSomething("Sarah" , 25, 500);
        DoingSomething ds3 = new DoingSomething("Nash" , 20, 250);
        DoingSomething ds4 = new DoingSomething("Pops" , 15, 100);
        DoingSomething ds5 = new DoingSomething("Lolly" , 10, 50);

        myService.execute(ds1);
        myService.execute(ds2);
        myService.execute(ds3);
        myService.execute(ds4);
        myService.execute(ds5);

        myService.shutdown();
    }
}
