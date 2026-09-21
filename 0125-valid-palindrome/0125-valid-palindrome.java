class Solution {
    public boolean isPalindrome(String s) {
        String n=s.toLowerCase().replaceAll("[^a-zA-Z0-9\\s]","");
        n=n.replaceAll("\\s","");
        String rev="";
        boolean palindrome=true;
        for(int i=n.length()-1;i>=0;i--){
            rev=rev+n.charAt(i);
             }
             if(n.equals(rev)){
                palindrome= true;
             }
             else{
                palindrome=false;
             }
             return palindrome;


        }
    }
