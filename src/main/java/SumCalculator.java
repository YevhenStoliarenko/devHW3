public class SumCalculator {
    public int sum (int n){
        if(n == 0){
            throw new IllegalArgumentException();
        }
        int result = 0;
        for (int i = 0; i <= n; i++) {
            result += i;
        }
        return result;
    }
}
