class Solution {
    public boolean isPowerOfTwo(int n) {
        boolean x=true;
       for(int i=0;i<31;i++)
       {
        if(n==Math.pow(2,i))
           return x;
       }
       return false;
    }
}
