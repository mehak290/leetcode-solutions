class Solution {
    public double myPow(double x, int n) {
        double res = fp(x,Math.abs(n));
        if(n<0) return 1/res;
        return res;
    }
    public double fp(double x, int n){
        if(n==0) return 1;
        double val = fp(x,n/2);
        val*=val;
        if(n%2==0) return val;
        return x*val;

    }
}