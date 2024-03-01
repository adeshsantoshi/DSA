//public class LinearSearch {
//
//
//    public static int linearSearch(int[] num, int target){
//        for (int i =0; i<num.length;i++){
//            if(num[i] == target) {
//                return i;
//            }
//}
//    return -1;
//    }
//
//
//
//
//
//
//    public static void main(String[] args) {
//        int [] num = {2,4,6,8,9,11,13,21};
//        int target = 4;
//        int result = linearSearch(num, target);
//        if (result != -1){
//        System.out.println("Element found at: " + result);
//    }
//        else {
//            System.out.println("Element not found");
//        }
//    }
//}
//
//
//
public class LinearSearch{

    public static int linearsearch(int [] num, int target){
        for (int i = 0; i <num.length ; i++) {
            if(num[i] == target){
                return i;
            }
        }
        return -1;
    }


    public static void main(String []args){
        int [] num = {2,4,21,45,3,542,22,13,77,54,4};
        int target = 222;

        if(linearsearch(num, target)!=-1){
            System.out.println("Element found at: " + linearsearch(num, target));
        }
        else {
            System.out.println("Element not found!");
        }
    }
}