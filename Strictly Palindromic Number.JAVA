class Solution {
    public boolean isStrictlyPalindromic(int n) {
        
        int m = n-2;
        
        String temp = String.valueOf(n);
        
        for(int i=2;i<=m;i++)
        {
            if(!isPalindrome(convertFromBaseToBase(temp,10,i)))
            {
                return false;
            }
        }
        
        return true;
    }
    
    public String convertFromBaseToBase(String str, int f, int t) 
    {
        return Integer.toString(Integer.parseInt(str, f), t);
    }
    
    boolean isPalindrome(String s)
    {
        int n = s.length();
        
        int l = 0;
        int h = n-1;
        
        while(l<h)
        {
            if(s.charAt(l)!=s.charAt(h))
            {
                return false;
            }
            l++;
            h--;
        }
        
        return true;
    }
}
