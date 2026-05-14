
class Main {
    public static void main(String[] args) {
        int n = 25; 
        int ans = 1;
        int low = 1, high = n;
        while (low <= high){
            int mid = (low + high)/2;
            if(mid*mid <= n){
                ans = mid;
                low = mid + 1;
            }
            else high = mid -1; 
        }
        System.out.print(ans);
    }
}
