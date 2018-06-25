import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PositiveNumbers {
    public static void main(String[] args) {
        List<Integer> integerList = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        int num =0;
        int sum=0;

        do{
            System.out.println("Podaj liczbę dodatnią: ");
            num = scan.nextInt();
            if(num>=0){
                integerList.add(num);
            }
        }while(num>=0);

        NumbersOperation.sortBack(integerList);
        NumbersOperation.sum(integerList);
        NumbersOperation.max(integerList);
        NumbersOperation.min(integerList);





    }
}
