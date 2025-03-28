public class oddPlaceAsecEvenPlaceDsec {
    public static void main(String[] args) {
        int[] arr = { 7, 1, 3, 8, 9, 2 };
        for (int i = 0; i < arr.length; i+=2) {
            for (int j = i+2; j < arr.length; j+=2) {
                if(arr[i]<arr[j]){
                    int temp=arr[j];
                    arr[j]=arr[i];
                    arr[i]=temp;
                }
            }
        }
        for (int i = 1; i < arr.length; i+=2) {
            for (int j = i+2; j < arr.length; j+=2) {
                if(arr[i]>arr[j]){
                    int temp=arr[j];
                    arr[j]=arr[i];
                    arr[i]=temp;
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
