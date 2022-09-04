package Replit_Cozumler;

public class Array3 {
    public static void main(String[] args) {
        //Array Sayilarinin ortalamasi:
        int [] arr={20,30,25,35,-16,60,-100};
        double avg=0;
        int sum=0;
        for (int each:arr){
            sum+=each;
        }
        avg=sum/7.0;
        System.out.println(avg);

        avg=0;

        for (int i = 0; i <arr.length ; i++) {
            avg+=arr[i]/7.0;
        }
        System.out.println(avg);
    }
}
