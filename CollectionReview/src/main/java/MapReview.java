import java.util.HashMap;

import java.util.*;

public class MapReview {

    public static void main(String[] args){
        Map<Integer,String> map=new HashMap<>();
        map.put(1,"Sergio");
        map.put(2,"Moses");
        System.out.println(map.get(2));
        System.out.println(findFirstNonRepeating("eo ava eveloe"));

    }

    public static Character findFirstNonRepeating(String str) {
        Map<Character, Integer> map = new HashMap<>();
        int count;
        for (char ch : str.toCharArray()) {
            if (map.containsKey(ch)) {
                count = map.get(ch);
            } else map.put(ch, 1);
        }
        for (char ch : str.toCharArray()) {
            if(map.get(ch)==1) return ch;

        }
        return null;
    }

}
