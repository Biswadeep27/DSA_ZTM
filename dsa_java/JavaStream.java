
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class JavaStream {

    public static int[] retArr() {
        return new int[] {4,5,6,10,7};
    }

    public static int[] retArr(int size){
        /* generate a list of length `size` with random numbers between 0 and 20 */
        return IntStream.generate(() -> new Random().nextInt(20)).limit(size).toArray();

    }

    public static void main(String args[]){

        // Create an array of integers : only definition and then later assignment
        int[] arr = new int[4];
        Arrays.fill(arr,27);
        System.out.println("1D Array in Java: ");
        Arrays.stream(arr).forEach(x->System.out.print(x + " "));
        //to print a new line
        System.out.println();

        // Create an array of integers : initialization
        int[] arr1 = {1,2,3,7,23};
        System.out.println("Size of array: " + (arr1.length) + "; 1st element of array: " + (arr1[0]));


        // create a list of integers
        List<Integer> number = Arrays.asList(2,3,4,5);

        // demonstration of map method
        List<Integer> square = number.stream().map(x->x*x).collect(Collectors.toList());

        System.out.println("List in java - square of elements: " + (square));

        // sum of square of list elements:
        int sq_sum = number.stream().map(x->x*x).reduce(0,(x,y)->x+y);

        System.out.println("Sum of square of elements: " + (sq_sum));

        //calling retArr method with params which returns array
        System.out.println("Calling retArr method with params which returns array ");
        Arrays.stream(retArr(5)).filter(x->x<10).map(x->x+2).forEach(System.out::println);

        //calling retArr method without params which returns array
        System.out.println("Calling retArr method without params which returns array and then sorting it");
        Arrays.stream(retArr()).sorted().forEach(System.out::println);

        // collect method returns a set
        Set<Integer> squareSet = number.stream().map(x->x*x).collect(Collectors.toSet());
        System.out.println(squareSet);

        // demonstration of reduce method
        int even = number.stream().filter(x->x%2==0).reduce(0,(ans,i)-> ans+i);
        System.out.println(even);

        //Creating  IntStream :
        IntStream stream = IntStream.of(2, 4, 6, -2, -4);
        System.out.println("Sum of IntStream elements: " + stream);


        System.out.println("Sum of 1st five integers: " + (IntStream.range(0,5).map(x -> x +1).sum()));





    }
}
