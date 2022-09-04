package Replit_Cozumler;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Array7 {

  public static void main(String[] args) {
      //     Array i ARRAYLIST e çeviren Java Kodunu yazınız.
      //     Array : [ "Python", "JAVA", "PHP", "Perl", "C#", "C++" ]

      String[] arr= {"Python", "JAVA", "PHP", "Perl", "C#", "C++"};
      List list=new ArrayList<>();
      for (String w:arr){
          list.add(w);
      }

      List liste= Arrays.stream(arr).collect(Collectors.toList());
      System.out.println(list);
      System.out.println(liste);

  }
}
