package Replit_Cozumler;

public class Array11 {
    public static void main(String[] args) {
//    Kullanıcının gireceği iki **binary** sayıyı toplayan  Java kodunu yazınız.
//    Test Data:
//    birinci binary number: 100010
//    ikinci  binary number: 110010
//    Beklenen Çıktı:
//    1010100

        int num1 =100010;
        int num2 =110010;

        int sum= (int) binaryTopla(num1,num2);
        System.out.println(sum);
        binaryOlustur(sum);

    }

    private static void binaryOlustur(int sum) {
        String binary="";
        while (sum>0){
            binary+=sum%2;
            sum/=2;
        }
        StringBuilder str=new StringBuilder(binary);
        str.reverse();

        System.out.println(str);
    }

    private static double binaryTopla(int num1, int num2) {
        double sum=0;
        int count=0;
        while (num1>0){
          sum += num1%10*Math.pow(2,count);
          num1/=10;
          count++;
        }
        count=0;
        while (num2>0){
            sum+=num2%10*Math.pow(2,count);
            num2/=10;
            count++;
        }
        return sum;
    }
}
