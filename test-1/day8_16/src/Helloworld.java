import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class Helloworld {
    public static void main(String[] args) {



        ScheduledExecutorService service = Executors.newScheduledThreadPool(3);

        service.scheduleAtFixedRate(()->{
                    System.out.println("哈哈哈");
                },
                5,
                5,
                TimeUnit.SECONDS);
    }
}
