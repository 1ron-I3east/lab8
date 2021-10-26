import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/* Ex3*/
public class Main {

    public static void main(String[] args) throws IOException {

        Scanner scan = new Scanner(System.in);

        String info = scan.nextLine();

        String address = "C:\\Users\\levpr\\lab8\\test.txt";

        try(FileWriter rewriter = new FileWriter(address, false)){
            rewriter.write(info);
        }
        catch (Exception ex){
            System.out.println(ex);
        };
    }
}