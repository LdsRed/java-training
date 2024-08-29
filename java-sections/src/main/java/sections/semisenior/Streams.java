package sections.semisenior;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class Streams {

    public static void main(String[] args) {


        List<Integer> myIntegerList = Arrays.asList(500,200,10,23,3,4,32,1,2,500, 5000, 5000, 5000);

        myIntegerList.stream().distinct().forEach(System.out::println);

        Optional<Integer> maxNumberInList = myIntegerList.stream().distinct().max(Comparator.naturalOrder());

        maxNumberInList.ifPresent(thisMax -> System.out.println("The maximum number is: " + thisMax));
        
    }
}
