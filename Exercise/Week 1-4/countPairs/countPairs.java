package countPairs;

import java.util.HashMap;

public class countPairs {
    static HashMap<Character, Integer> dictCount1 = new HashMap<>();
    ;

    public countPairs() {
    }

    public static void countPair(String str) {
        char[] current = str.toCharArray();
        System.out.println(str);
        if (current.length < 3) {
            return;
        } else {
            if (current[0] == current[2]) {
                System.out.println(current[0]);
                if (dictCount1.containsKey(current[0])) {
                    dictCount1.put(current[0], dictCount1.get(current[0]) + 1);
                } else {
                    dictCount1.put(current[0], 1);
                }
                countPair(str.substring(1, str.length()));
            } else {
                countPair(str.substring(1, str.length()));
            }
        }
    }

    public static void main(String[] args) {
        countPair("AxAxA");
        for(char i:countPairs.dictCount1.keySet()){
            System.out.print(i+":"+dictCount1.get(i)+" | ");
        }
    }
}
