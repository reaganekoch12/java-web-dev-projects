package studio;
import java.util.HashMap;
public class counting {
    public static void main(String[] args) {
        //use hashMap because you have key/value pairs
        char[]char_array= str.toCharArray();
        //string to array
        int count = 0;
        //starting count
        char ch = char_array[count];
        //declaring ch and making it equal to the array I just created
        Map<Character, Integer> charCounter = new HashMap<Character, Integer>();
        //mapping to go iterate through  hashmap
        for(int i=0; i<str.length();i++){
            //for loop to go through the string
            if(charCounter.containsKey(char_array[i])){
                //if the charCounter-new HashMap contains the key in the array at that index
                charCounter.put(ch, charCounter.get(ch)+ 1);
                //the char counter will put the key/value to add 1 to the count
            }else{
                charCounter.put(ch,1);
                //if not then just put the character, and 1 as the value
            }
            for(Character key:charCounter.keySet()){
                System.out.println(key +''+ charCounter.get(key));
            }
        }
    }
}

