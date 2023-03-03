import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList();
        Scanner scanner= new Scanner(System.in);
        for(int i=1;i<=5;i++){
            System.out.println("Please Enter the name");
            String temp =scanner.next();
            arrayList.add(temp);
        }
        for(String var: arrayList)
            System.out.println(var);

        System.out.println("This is the new line added")
    }
    
}
