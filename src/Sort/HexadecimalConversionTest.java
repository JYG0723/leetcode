package Sort;

/**
 * @author Ji YongGuang.
 * @date 16:23 2018/12/16.
 * @description 二, 八, 十, 十六进制转化
 */
public class HexadecimalConversionTest {

    /**
     * 二,八,十,十六进制转十进制
     */
    private static void toDecimalSystem() {
        int a = 0b11;   //声明二进制变量
        int b = 011;    //声明八进制变量
        int c = 11;     //声明十进制变量
        int d = 0xb41;   //声明十六进制变量 11*16^2+4*16^1+1*16^0
        System.out.println("a：" + a); //3
        System.out.println("b：" + b); //9
        System.out.println("c：" + c); //11
        System.out.println("d：" + d); //2881
    }

    /**
     * 十进制转其他进制
     */
    private static void decimalSystemToOthers() {
        int item = 15;
        System.out.println(Integer.toBinaryString(item));// 1*2*2*2+1*2*2+1*2+1
        System.out.println(Integer.toHexString(item));
        System.out.println(Integer.toOctalString(item));
    }

    public static void main(String[] args) {
        decimalSystemToOthers();
    }
}
