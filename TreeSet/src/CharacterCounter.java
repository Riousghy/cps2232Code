import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;
import static java.util.Collections.replaceAll;

public class CharacterCounter {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Enter the text in lowercase: ");
//        String inputText = scanner.nextLine();
//
//        Map<Character, Integer> charCountMap = new HashMap<>();
//
//        for (char c : inputText.toCharArray()) {
//            if (Character.isLetter(c)) {
//                charCountMap.put(c, charCountMap.getOrDefault(c, 0) + 1);
//            }
//        }
//
//        for (Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {
//            System.out.println("Character: " + entry.getKey() + ", Count: " + entry.getValue());
//        }
        Map<Character, Integer> map= new HashMap<>();
        Scanner sc= new Scanner(System.in);

        System.out.println("Enter a word: ");

        while(sc.hasNextLine()){
            String str = sc.nextLine().replaceAll("\\s+","").replaceAll("\\r\\n+"," ");
            char[]arr = str.toCharArray();

            for(int i =0;i<arr.length;i++){
                char ch = str.charAt(i);
                if(map.containsKey(ch))
                    map.put(ch,map.get(ch)+1);
                else map.put(ch,1);
            }
            map.entrySet().stream()
            .sorted(Map.Entry.<Character,Integer>comparingByValue().reversed()).limit(5)
                    .forEach(entry->System.out.println(entry.getKey()+" : "+entry.getValue()));
        }
        sc.close();
    }
}