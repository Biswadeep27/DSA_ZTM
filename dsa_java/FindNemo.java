import java.util.Arrays;
import java.time.Duration;
import java.time.Instant;


public class FindNemo {

    public static void find_nemo(String[] array){
        long st1 = System.nanoTime();
        long st2 = System.currentTimeMillis();
        Instant st3 = Instant.now();
        for (int i = 0; i < array.length; i++){
            if (array[i].equals("nemo")){
                System.out.println("Nemo Found!");
            }
        }
        long et1 = System.nanoTime();
        long et2 = System.currentTimeMillis();
        Instant et3 = Instant.now();
        System.out.println("Time taken in seconds: " + (et1 - st1)/1000000000);
        System.out.println("Time taken in milliseconds: " + (et2 - st2));
        System.out.println("Time taken: " + Duration.between(st3,et3).toString());
    }

    public static void main(String args[]){
        String[] arr = new String[1];
        arr[0] = "nemo";
        String[] large = new String[1000000];
        Arrays.fill(large,"nemo");
        find_nemo(large);
    }
}
