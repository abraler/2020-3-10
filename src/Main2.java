public class Main2 {
    public static void main(String[] args) {
        int n=Fib(50);
        System.out.println(n);
    }
    public static int Fib(int n){
        if(n<=2){
            return n;
        }
        if(n==3){
            return 4;
        }
        int []a=new int[n+1];
        a[1]=1;
        a[2]=2;
        a[3]=4;
        for (int i = 4; i <=n ; i++) {
            a[i]=a[i-1]+a[i-2]+a[i-3];
        }
        return a[n];
    }
}
