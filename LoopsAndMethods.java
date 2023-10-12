import java.util.Scanner;
public class LoopsAndMethods {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Enter a number : ");
        int n=Integer.parseInt(scanner.nextLine());
        for(int i=1;i<=n;i++){
            for(int j=n;j>=i;j--){
                System.out.printf(" * ");
            }
            System.out.println();

        }
    }
}
