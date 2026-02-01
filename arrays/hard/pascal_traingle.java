package arrays.hard;


public class pascal_traingle {
    public static long functionNcr(int n,int r){
        long res = 1;
        for(int i = 0;i<r;i++){
            res = res * (n-i);
            res = res/(i+1);
        }
        return res;
    }

    public static void main (String [] args){
        //int arr [] = {};

        int row = 5, col = 3;
        long ans = functionNcr(row-1,col-1);
        System.out.println(ans);
    }
}
