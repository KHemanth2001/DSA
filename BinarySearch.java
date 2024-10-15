public class binarySearch {
    public static int binarySearch(int arr[],int key){
        int st=0;
        int end=arr.length-1;
        while(st<=end){
            int mid=(st+end)/2;
            if(arr[mid]==key){
                return mid+1;
            }else if(arr[mid]>key){
                end=mid-1;
            }else{
                st=mid+1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int numbers[]={1,2,3,7,9};
        int val=binarySearch(numbers, 7);
        System.out.println(val);
    }
}
