public class FindNemo {

    public static void find_nemo(String[] array){
        for (int i = 0; i < array.length; i++){
            if (array[i].equals("nemo")){
                System.out.println("Nemo Found!");
            }
        }
    }

    public static void main(String args[]){
        String[] arr = new String[1];
        arr[0] = "nemo";
        find_nemo(arr);
    }
}
