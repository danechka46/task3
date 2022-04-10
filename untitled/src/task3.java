public class task3 {
    public static void main(String[] args) {
        int[] ar={1,4,6,2,6};
        int a = ar[0];
        ar[0]=ar[ar.length-1];
        ar[ar.length-1]=a;
        System.out.println(ar[0]+ar[(ar.length-1)/2]);
    }
}
