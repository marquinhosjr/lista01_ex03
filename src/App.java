import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        int nigel;
        int boba;
        int mane;
        Scanner audi=new Scanner(System.in);
        nigel=audi.nextInt();
        boba=audi.nextInt();
        audi.close();
        mane=nigel+boba;
        System.out.print("a soma foi "+mane);
    }
}
