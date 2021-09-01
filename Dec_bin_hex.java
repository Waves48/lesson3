package org.itstep;

public class Dec_bin_hex {
public static void main(String[] args){
    // decimal literal
    int id = 2;
    int io = 010;
    int ih = 0xA;
    int ib = 0b100;
    char c = 'a';
    double d1 = 1.2e20;
    String s = "This is hell of a day";
    //System.out.println(id + "\n" + io + "\n" +ih +"\n" + ib);
    //System.out.println(c + s);
    System.out.printf("From dec to bin: %s%n", Integer.toBinaryString(id));
    for (int count = 0; count < 16; count++)
    System.out.println("Count Binary: " + Integer.toBinaryString(count));
    // int ex = 10;
    // String ya = Integer.toHexString(ex);
    System.out.println("Convert from binary to decimal: ");
    String S1 = "1010";
    int numdec = Integer.parseInt(S1, 2);
    System.out.println(numdec);
    System.out.println("Get one digit from a binary literal");
   ////?????????????????
    int binary1 = 0b0101;
    int bit = binary1 & 1;
    //int bit = binary1 % 2;
    int bit1 = binary1 >> 1;
    System.out.println(bit);
    System.out.println(bit1);
    /////////????????????????????
    // Побитовые операции - logical NOT, logical AND, logical OR
    int number = 0b1010;
    int result = ~number;
    System.out.println(Integer.toBinaryString(result));
    String sresult = Integer.toBinaryString(result);
    sresult = sresult.substring(28);
    System.out.println(sresult);
    //AND
    byte numb1 = 0b0101;
    byte numb2 = 0b0100;
    int result1 = numb1 & numb2;
    System.out.println(Integer.toBinaryString(result1));
    // OR
    int res = numb1 | numb2;
    System.out.println(res);
    // Логическое сложение - научится преобразовывать из бин в дец в хекс










}
}
