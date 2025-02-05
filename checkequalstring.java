class checkqequalstring {
    public boolean areAlmostEqual(String s1, String s2) {
        if(s1.equals(s2)){
            return true;
        }
        int diff=0;
        int[] pos=new int[2];

        for(int i=0;i<s1.length();i++){
            if(s1.charAt(i)!=s2.charAt(i)){
                if(diff==2){
                    return false;
                }
                pos[diff]=i;
                diff++;
            }
        }
        if(diff==2){
            int i=pos[0];
            int j=pos[1];

            return s1.charAt(i)==s2.charAt(j) && s1.charAt(j)==s2.charAt(i);
        }return false;
    }
}