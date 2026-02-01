package arrays.hard;

public class pascal_triangle_type2 {
    public static void functionToPrintNthrow(int n){
        int ans = 1;
        
        System.out.println(ans);
        
        for(int i = 1; i<n;i++){
            ans = ans*(n-i);
            ans = ans/i;
            System.out.println(ans);
        }
        
    }
    public static void main (String args []){
        int row = 6;

        functionToPrintNthrow(row);
    }
}
