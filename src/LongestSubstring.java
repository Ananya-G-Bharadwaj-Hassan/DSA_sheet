class Substring {
    public int lengthOfLongestSubstring(String s) {
        boolean[] arr=new boolean[128];
        int maxlen=0,r=0,l=0;

        while(r<s.length()){
            if(!arr[s.charAt(r)]){
                arr[s.charAt(r)]=true;
                maxlen=Math.max(maxlen,r-l+1);
                r++;
            }else{
                arr[s.charAt(l)]=false;
                l++;
            }
        }
        return maxlen;
    }

    public static void main(String[] args) {
        Substring obj = new Substring();
        int result = obj.lengthOfLongestSubstring("abcabcbb");
        System.out.println(result);
    }
}