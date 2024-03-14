class Solution {
    public double myPow(double x, int n) {
        long p=n;
        if(p==0) return 1;
        double temp=1;
        double cal=0;
        if(p<0){
            x=1/x;
            p=-p;
        }
        while(p>0){
            if(p%2==1){
                cal=temp*x;
                temp=cal;
                p--;
            }
            x*=x;
            p/=2;
        }
        return temp;
    }
}