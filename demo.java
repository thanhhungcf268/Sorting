import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class demo {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(4);
        list.add(5);
        list.add(3);
        list.add(45);
        list.add(453);
        list.add(45);
        list.add(8);
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        System.out.println(findNumberOfByBinary(list , number,0,list.size()-1));
    }
    static boolean findNumberOfByBinary(List<Integer> list,int number,int low,int high){
        if (low>high){
            return false;
        }
        int mid = (low+high)/2;
        if (number==list.get(mid)){
            return true;
        }else if (number>list.get(mid)){
            return findNumberOfByBinary(list,number,low=mid+1,high);
        }else {
            return findNumberOfByBinary(list,number,low,high=mid-1);
        }
    }
}
