import java.util.*;
public class ConvertNum
{
    public static void main(String args[])
    {
        System.out.println(Integer.toBinaryString(10));// dec -> bin
        System.out.println(Integer.toOctalString(8));// dec -> oct
        System.out.println(Integer.toHexString(10));// dec -> hex
        System.out.println(Integer.parseInt("F",16));//hex -> dec
        System.out.println(Integer.parseInt("10",8));//oct-> dec
        System.out.println(Integer.parseInt("10001",2));//bin -> dec
    }
}
