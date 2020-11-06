public class Driver {
    public static void main(String[] args){
        BinarySearch binarySearch = new BinarySearch();
        int[] list = {1,2,3,4,5,6,7,8,9,10};

        long start = System.nanoTime();
        System.out.println("Value is at index " + binarySearch.binarySearch(list, 8));
        System.out.println("BinarySearch took = " + (System.nanoTime() - start) + " ns");

        start = System.nanoTime();
        System.out.println("Value is at index " + binarySearch.binarySearchRecursive(list, 0, list.length-1, 8));
        System.out.println("Recursive Binary Search took = " + (System.nanoTime() - start) + " ns");

//        start = System.nanoTime();
//        System.out.println("Value is at index " + binarySearch.binarySearch(list, 8));
//        System.out.println("BinarySearch took = " + (System.nanoTime() - start) + " ns");
    }
}
