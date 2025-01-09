class Solution {
    public boolean checkInclusion(String s1, String s2) {
        HashMap<Character, Integer> s1map= new HashMap<>();
        HashMap<Character, Integer> windowmap= new HashMap<>();
        int l=0;
         for (char c : s1.toCharArray()) {
            s1map.put(c, s1map.getOrDefault(c, 0) + 1);
        }
        for(int r=0;r<s2.length();r++){
            char c= s2.charAt(r);
            windowmap.put(c,windowmap.getOrDefault(c,0)+1);
            if(r-l+1> s1.length()){
               c= s2.charAt(l);
                windowmap.put(c,windowmap.get(c)-1);
                if(windowmap.get(c)==0)
                windowmap.remove(c);
                 l++;
            }

            if(s1map.equals(windowmap))
            return true;
        }
      return false;  
}
}
