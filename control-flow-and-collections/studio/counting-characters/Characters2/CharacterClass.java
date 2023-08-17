package Characters2;

public class CharacterClass {
    public static void main(String[]args){
        HashMap<Character,Interger> finalCounts = new HashMap<>();
        char[] charArray= toBeCounted.toCharArray();
        for(int i=0; i<charArray.length; i++){
            if(finalCounts.containsKey(charArray[i])){
                finalCounts.put(charArray[i].finalCounts.get(charArray[i]+1))
                }else{
                finalCounts.put(charArray[i],1);
            }
        }
        for(Map.Entry : finalCounts.entrySet()){
            System.out.println9entry.getKey() + ";"+entry.getValue();
        }
    }
}
