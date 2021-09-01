public class CE7 {

    public static void main(String[] args) {


        int arr[] = {-4,-3,-8,-9,1,2, 5, 3, 5, 4, 9};

        arr = sortArray(arr);
        int min=findMinPositive(arr);

        if (min==0){
            System.out.println("There is no number missing in array");
        }else
        {
            System.out.println("Minimum missing positive umber is : "+ min);
        }




    }

    public static int[] sortArray(int[] array) {

        for (int i = 0; i < array.length; i++) {

            for (int j = 0; j < array.length; j++) {

                if (array[i] < array[j]) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        return array;
    }


    public static int findMinPositive(int[] arr) {


        int firstelement=1;
        int lastElement=arr[arr.length-1];
        for (int i = 1; i < arr[arr.length - 1]; i++) {

            for (int j = 0; j <arr.length-1 ; j++) {
                if (arr[i] == i){

                }else
                {
                    if(arr[i-1]>0){
                        return i;
                    }

                }


            }


        }

        return 0;
    }
}

