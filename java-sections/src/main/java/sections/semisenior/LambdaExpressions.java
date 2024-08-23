package sections.semisenior;
import java.util.ArrayList;
import java.util.List;

public class LambdaExpressions {
    public static void main(String[] args) {

        FunctionalInterfaceLambda fun = (list) -> {
            int sum = 0;
            for (Integer num : list) {
                if(num %2 == 0){ sum += num;}
            }
            return sum;
        };

        List<Integer> myIntList = new ArrayList<>();
        myIntList.add(2);
        myIntList.add(3);
        myIntList.add(4);
        myIntList.add(5);
        myIntList.add(6);
        myIntList.add(7);
        myIntList.add(8);
        myIntList.add(9);
        myIntList.add(10);
        myIntList.add(11);
        myIntList.add(12);

        System.out.println(fun.sumarParesFromList(myIntList));
            
    };

   
}

