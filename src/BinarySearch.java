public class BinarySearch {

    //find where the target value is in the array list
    public int binarySearch(int arr[], int target){
        int left = 0, right = arr.length-1; //left most index //right most index
        while(left <= right){ //when we reach the end of the list
            int mid = left + (right-left) / 2; //get midpoint of list

            //basically here we are starting search in middle
            if(arr[mid] == target){
                return mid;
            }

            //we will work forwards or backwards depending on value
            //this is a quicker way to search through an ordered list
            if(arr[mid] < target){
                left = mid + 1;
            }
            else{
                right = mid - 1;
            }
        }
        return -1;
    }
}
