public class CE1 {


    public static void main(String[] args) {


        String s= "sid@soni@";

        char[] sToAraay= s.toCharArray();
        int l=0, r=sToAraay.length-1;

        while(l<r){

            if (!Character.isAlphabetic(sToAraay[l])){
                l++;
            }else if(!Character.isAlphabetic(sToAraay[r])){
                r--;
            }
            else{
                char temp= sToAraay[l];
                sToAraay[l]=sToAraay[r];
                sToAraay[r]=temp;
                l++;
                r--;
            }


        }
        for (int i = 0; i < sToAraay.length ; i++) {
            System.out.print(sToAraay[i]+ " ");
        }


    }
}
