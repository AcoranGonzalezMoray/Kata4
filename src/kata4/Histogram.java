package kata4; 

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

class Histogram<T> {
    private final  Map<T, Integer> map =  new HashMap<T, Integer>();

    public Histogram() {
        
    }
    
    public Integer get(T key){
        return map.get(key);
    }
    
    public Set<T> keySet(){
    
        return map.keySet();
    }
    
    public void increment(T key) {
        map.put(key, map.containsKey(key) ? map.get(key) + 1 : 1);
    }
    
}
