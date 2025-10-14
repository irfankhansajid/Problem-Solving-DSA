package array;


import java.util.*;

public class GroupAnagram {

    public static List<List<String>> groupAnagrams(String[] strs) {

        Map<String, List<String>> map = new HashMap<>();

        for (String s : strs) {
            char[] arr = s.toCharArray();
            Arrays.sort(arr);
            String key = new String(arr);
            if (map.containsKey(key)) {
                map.get(key).add(s);
            } else {
                map.put(key , new ArrayList<>(Arrays.asList(s)));
            }



        }





return new ArrayList<>(map.values());
    }

    public static void main(String[] args) {

        String[] strs = {"a"};

        List<List<String>> result = groupAnagrams(strs);

        System.out.println(result);

    }
}
