class Solution {
    public int[] countBits(int n) {
        int a[]=new int[n+1];
        for(int i=0;i<=n;i++){
            int j=i;
            int count=0;
            if(j==0){
                a[i]=0;
            }
            while(j>0){
                if((j&1)!=0){
                    count++;
                }
                j=j>>1;
            }
            a[i]=count;
        }
        return a;
    }
}
