class Solution {
    public boolean isAnagram(String s, String t) {
HashMap<Character, Integer> mapObj1 = new HashMap<Character, Integer>();
        HashMap<Character, Integer> mapObj2 = new HashMap<Character, Integer>();

        if(s.length()!=t.length()){
            return false;
        }

        

        for (int i=0;i<s.length();i++){


mapObj1.put(s.charAt(i), mapObj1.getOrDefault(s.charAt(i),0)+1);
mapObj2.put(t.charAt(i), mapObj2.getOrDefault(t.charAt(i),0)+1);

        }

       return mapObj1.equals(mapObj2);

    }
}
