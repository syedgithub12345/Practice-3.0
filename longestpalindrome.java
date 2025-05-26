class longestpalindrome {
    public int longestPalindrome(String[] words) {
        Set<String> ans=new HashSet<>();
        for(int i=0;i<words.length;i++){
            ans.add(words[i]);
        }
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<words.length;i++){
            sb=sb+words[i].toStringBuilder();
        }return sb.length();
    }
}