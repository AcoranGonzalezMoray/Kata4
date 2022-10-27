package kata4;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FileLoader implements Loader {
    
    private File file;
    
    
    public FileLoader(File file) {
        this.file = file;
    }

    @Override
    public List<String> load() {
        List<String> list = new ArrayList<String>();
        try( BufferedReader reader = new BufferedReader(new FileReader(this.file))){
            while (true) {               
               String line  = reader.readLine();
               if(line == null) break;
               list.add(line);
            }    
        } catch (IOException e) {
        }    
        return list;
    }

}
