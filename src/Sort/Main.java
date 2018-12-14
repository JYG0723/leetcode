package Sort;

/**
 * @author Ji YongGuang.
 * @date 15:52 2018/12/14.
 * @description
 */
public class Main {
    public static void main(String[] args) {
        int i = 6;
        int j = 7;
        /*System.out.println(Integer.toBinaryString(i));
        System.out.println(Integer.toBinaryString(j));
        System.out.println(Integer.toBinaryString(i ^ j));*/
        i = i ^ j;
        j = i ^ j;
        i = i ^ j;
        System.out.println(i);
        System.out.println(j);
    }
}
