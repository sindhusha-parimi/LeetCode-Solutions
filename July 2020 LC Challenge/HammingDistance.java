class Solution {
    public int hammingDistance(int x, int y) {
        
        int n=x ^ y;
        return countbits(n);
    
    }
    public int countbits(int n){
        if(n==0) return 0;
        else{
            return ( (n&1)+ countbits(n>>1) );
        }
    }
}
