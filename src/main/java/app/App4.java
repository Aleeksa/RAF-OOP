package app;

public class App4 {

    public static void main(String[] args) {
        String str1 = "abc";
        System.out.println(str1.concat("d"));
        String str2 = "abcdf";
        System.out.println(str2 == str1.concat("df"));
        System.out.println(str1);
        System.out.println(str1.equals(str2));
        String str3 = "abcdf";
        System.out.println(str3.equals(str2));
        System.out.println(str3 == str2);
    }
}
