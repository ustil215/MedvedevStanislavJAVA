public class Test3 {
    public static void main(String[] args) {
        int [] array = {1,2,3,4,5,6,7,8,9,10};
        int c;
        for(int i = 0;i< array.length;i++){
            if(array[i]%2==0){
                c=array[i];
                System.out.print(c + " ");
            }
        }
    }
}
