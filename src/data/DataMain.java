package data;

import com.sun.tools.javac.Main;

public class DataMain {
    public static void main(String[] args) {
        var data1=new Data(22,11,1998);
        var data2 =new Data(1,1,0001);
        System.out.println(data1.toString());
    }
}
