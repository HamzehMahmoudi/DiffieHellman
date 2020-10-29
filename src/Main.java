import java.math.BigInteger;
public class Main {
public static void main(String[]args){
        DiffieHellman x = new DiffieHellman();
        x.genPrimeAndPrimitiveRoot();
        BigInteger a= new BigInteger("1101001010019203192312312312435234234131235457686756554434232325365645342323243");
        BigInteger b= new BigInteger("2343423432473984729384792837492837498273984739847982");
        BigInteger Alice=x.getAliceMessage(a);
        BigInteger Bob=x.getBobMessage(b);
        BigInteger S=x.aliceCalculationOfKey(Bob,a);
        BigInteger s=x.bobCalculationOfKey(Alice,b);
        System.out.println("Alice key =" + x.aliceCalculationOfKey(Bob,a));
        System.out.println("Bob   key =" + x.bobCalculationOfKey(Alice,b));
        System.out.println(s.equals(S));
        String str = s.toString();
        System.out.println(str.length());



        }
}