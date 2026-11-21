class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        HashMap<String, List<String>> mapList = new HashMap<>();
        
        // for(String item : strs){

        //     char a[] =item.toCharArray();
        //     Arrays.sort(a);

        //     String sortedString = new String(a);

        //     mapList.putIfAbsent(sortedString, new ArrayList<>());
        //     mapList.get(sortedString).add(item);


        // }

        // return new ArrayList<>(mapList.values());

        /* Approach 2*/


        

        for(String item : strs){

            int alphabets[] = new int[26];

            for(char c: item.toCharArray()){

                alphabets[c - 'a']++;
            }
                String sortedString = Arrays.toString(alphabets);

mapList.putIfAbsent(sortedString, new ArrayList<>());
            mapList.get(sortedString).add(item);

 

            }
              return new ArrayList<>(mapList.values());
        }
      
    }

