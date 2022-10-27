package kata4;

import java.io.File;
import java.util.List;

public class Kata4 {
    public static void main(String[] args) {
        Loader loader = new EmailLoader(new FileLoader(new File("email.txt")));
        List<String> emails = loader.load();
        for(String email : emails){
            System.out.println(email);
        }
    }
}
