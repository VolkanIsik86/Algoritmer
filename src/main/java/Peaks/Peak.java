public class Peak {
    public static int findPeak(int[] a){
        if (a[0]>=a[1]){
            return 0;
        }
        for (int i = 1; i <a.length ; i++) {
            if(a[i-1] <= a[i] && a[i]>= a[i+1] ){
                return i;
            }
        }
        if (a[a.length -2] <= a[a.length-1]){
            return a.length -1;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {1,4,3,5,6,9,8,4,3,4,2,5};
        System.out.println(Peak.findPeak(arr));
    }
}
