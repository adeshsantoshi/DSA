//public class BinarySearch {
//    public static void main(String[] args) {
//       int []num = {2,5,7,9,66,144,220,234,556,3332};
//       int target = 3332;
//        int result = binarySearch(num, target);
//       if(result!=-1){
//           System.out.println("Element found at index: " + binarySearch(num, target));
//       }
//       else {
//           System.out.println("Element not found!");
//       }
//    }
//
//    public static int binarySearch(int [] num, int target){
//        int left = 0;
//        int right = num.length-1;
//        while(left<=right){
//            int mid = (left+right)/2;
//            if (num[mid]==target){
//                return mid;
//            }
//            else if(num[mid]<target){
//                left = mid+1;
//            }
//            else {
//                right = mid-1;
//            }
//
//        }
//    return -1;
//    }
//}

import java.util.Scanner;

public class BinarySearch{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] num = new int[10];
        for (int i=0; i< num.length;i++){
            num[i] = sc.nextInt();
        }
        System.out.println("Target: ");
        int target = sc.nextInt();



        int result = binarySearch(num,target);

        if (result!=-1){
            System.out.println("Element is at: " + result);
        }
        else {
            System.out.println("Not found!");
        }
    }


    public static int binarySearch(int[]num, int target){
        int left = 0;
        int right = num.length-1;
        while(left<=right) {
            int mid = (left + right)/2;
            if(num[mid]==target){
                return mid;
            }
            else if(num[mid]<target){
                left = mid+1;
            }
            else {
                right = mid-1;
            }

        }
        return -1;
    }
}