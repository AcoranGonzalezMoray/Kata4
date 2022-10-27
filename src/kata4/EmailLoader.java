package kata4;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;


public class EmailLoader implements Loader {
    private Loader loader;
    
    public EmailLoader(FileLoader fileLoader) {
        this.loader = fileLoader;
    }

    @Override
    public List<String> load() {
        List<String> emails = new ArrayList<String>();
        for (String email :  loader.load()) {
            if(isEmail(email)) emails.add(email);
        }
        return emails;
    }
    
    
    private static final Pattern emailPattern = Pattern.compile("^[\\w-\\.]+@([\\w-]+\\.)+[\\w-]{2,4}$");
    private boolean isEmail(String line){
        return emailPattern.matcher(line).matches();
    }
}
