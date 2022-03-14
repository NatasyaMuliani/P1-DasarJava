import javax.xml.bind.SchemaOutputResolver;

public class Q_KonversiTipeData {
    public static void main(String[] args) {
        long varLong = 1000000L;
        int varInt=23456;
        varInt=(int) varLong;
        varLong=varInt;
        System.out.println("nilai varLong="+varLong);
        System.out.println("nilai varInt="+varInt);
        char varChar='a';
        varInt=(int) varChar;
        System.out.println("nilai varInt('a')="+varInt);
        varChar=(char) (varInt+1);
        System.out.println("nilai varChar="+varChar);
        byte varbyte=127;
        varInt=varbyte;
        System.out.println("nilai varInt(127)="+varInt);
        short varShort=(short) varInt;
        System.out.println("nilai varShort="+varShort);
        varShort=varbyte;
        System.out.println("nilai varShort="+varShort);
        double varDouble=3.145256718992022;
        float varFloat=(float) varDouble;
        System.out.println("nilai varDouble="+varDouble);
        System.out.println("nilai varfloat="+varFloat);
    }
}
