import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class TryWithResources {
    public static void main(String[] args) throws IOException {

        System.out.println("Input a number");
        int num = 0;
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in)))
        {
            //num = Integer.parseInt(br.readLine());
            //System.out.println(num);
            String str = br.readLine();
            System.out.println(str);

        }


    }
}
