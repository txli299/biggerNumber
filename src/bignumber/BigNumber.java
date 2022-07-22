package bignumber;

public interface BigNumber {
    int length();

    void shiftLeft(int shift);

    void shiftRight(int shift);


    void addDigit(int digit);

    int getDigitAt(int index);
    BigNumber copy();
    BigNumber add(BigNumber other);

}
