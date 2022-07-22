import bignumber.biggerNumberImpl;

public class test {
    public static void main(String[] args) {
//        node node1 = new node(11);
//        node node2 = new node(9);
//        node node3 = new node(9);
//        node node4 = new node(2);
//        node1.next=node2;
//        node2.next=node3;
//        node3.next=node4;


//        biggerNumberImpl myNumber = new biggerNumberImpl(node1);
//      myNumber.makeNodeValMath();
        biggerNumberImpl myNumber = new biggerNumberImpl();

//        biggerNumberImpl myNumberCopied = (biggerNumberImpl)myNumber.copy();
        myNumber.shiftLeft(1);
        myNumber.addDigit(3);
        myNumber.shiftLeft(1);
        myNumber.addDigit(2);
        myNumber.shiftLeft(1);
        myNumber.addDigit(4);
        myNumber.shiftLeft(1);
        myNumber.addDigit(1);
        myNumber.shiftLeft(1);
        myNumber.addDigit(1);
        myNumber.shiftLeft(1);
        myNumber.addDigit(5);
        myNumber.addDigit(7);
        System.out.println(myNumber.toString());
        System.out.println(myNumber.length());
        System.out.println(myNumber.getDigitAt(0));
        System.out.println(myNumber.getDigitAt(1));
        System.out.println(myNumber.getDigitAt(2));
        System.out.println(myNumber.getDigitAt(3));
        System.out.println(myNumber.getDigitAt(4));
        System.out.println(myNumber.getDigitAt(5));
//        System.out.println(myNumber.getDigitAt(1));
  //      System.out.println(myNumber.getDigitAt(2));
        //System.out.println(myNumberCopied.toString());
        //System.out.println(myNumberCopied.length());

    }
}
