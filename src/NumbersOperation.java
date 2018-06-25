import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class NumbersOperation {

    public static void sortBack(List<Integer> integerList){
        for(int i=integerList.size()-1;i>=0;i--){
            System.out.print(integerList.get(i) + " ");
        }
        System.out.println();
    }

    public static void sum(List<Integer> integerList){
        int sum=0;
        for(int i= 0; i<integerList.size();i++){
            sum+=integerList.get(i);
        }
        for(int i= 0; i<integerList.size();i++){
            if(i!=integerList.size()-1){
               System.out.print(integerList.get(i) + " + ");
            } else {
                System.out.print(integerList.get(i) + " = " + sum);
            }
        }
        System.out.println();
    }

    public static void max(List<Integer> integerList){
        int max = integerList.get(0);

        for(int i=0; i<integerList.size();i++){
            if(max<integerList.get(i)){
                max = integerList.get(i);
            }
        }
        System.out.println(max);
    }

    public static void min(List<Integer> integerList){
        int min = integerList.get(0);

        for(int i=0; i<integerList.size();i++){
            if(min>integerList.get(i)){
                min = integerList.get(i);
            }
        }
        System.out.println(min);
    }
}
