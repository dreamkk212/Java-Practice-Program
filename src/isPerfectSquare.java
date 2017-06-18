public class isPerfectSquare {
    public boolean isPerfectSquare(int num) {
        int left =1;
        int right=(num >> 1) + 1;
        while(left <=right){
            int m = left + ((right-left) >> 1);
            int mul = m * m ;
            if(mul == num) return true;
            else if (mul > num){ right = m-1;}
            else { left = m+1;}
        }
        return false;
    }
}