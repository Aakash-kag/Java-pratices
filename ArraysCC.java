import java.util.*;

public class ArraysCC{
    public static String linearSearch(String menu[],String key){
        for(int i=0;i<menu.length;i++){
            if(menu[i].equals(key)){
                return key;
            }
        }
        return key; // Return -1 if key is not found 
    }
    public static void main(String args[]){
    String menu[] = {"samosa","kachori","aalubada","dosa","sandwich"};
    String key = "dosa";
    
    String index = linearSearch(menu, key);
    if(index != key){
        System.out.println("Not found");
    }else  {
        System.out.println("key is at index: "+ index);
    }
    }
}