package ra;

public class BinarySearch {
    static int[] list = {1,2,3,4,12,23,32,42,51,58};

    static int binarySearch(int[] list, int key) {
        int low = 0;
        int hight = list.length -1;
        while (hight >= low){
            int mid = (low + hight)/2;
            if (key < list[mid]) {
                hight = mid - 1;
            } else if (key == list[mid]) {
                return mid;
            } else {
                low = mid + 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(binarySearch(list, 2));
        System.out.println(binarySearch(list, 11));
        System.out.println(binarySearch(list, 79));
        System.out.println(binarySearch(list, 1));
        System.out.println(binarySearch(list, 5));
        System.out.println(binarySearch(list, 80));
    }
}
