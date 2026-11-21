class Solution {
    public boolean isPalindrome(String s) {

        StringBuilder stb = new StringBuilder();

        String cleanedString = s.replaceAll("[^a-zA-z0-9]","");

        String lowerCase = cleanedString.toLowerCase();

        for (int i=lowerCase.length()-1;i>=0;i--){
            

         stb.append(lowerCase.charAt(i));


        }

        String t = stb.toString();

        if(lowerCase.equals(t)){
        return true;
        }
        return false;

        
    }
}
