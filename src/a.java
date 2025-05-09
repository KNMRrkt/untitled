import java.util.*;
public class a {
    public static void main(String[] args) {
        int sum = 0;
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        int num = Integer.parseInt(line);
        int[] avg = new int[num];
        for(int i = 0;i<num;i++){
            avg[i] = sc.nextInt();
            sum += avg[i];
        }
        System.out.println(sum/num);
    }
}
