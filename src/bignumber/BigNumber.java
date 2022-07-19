package bignumber;

public interface BigNumber {
    int length();
    void shiftLeft();
    void shiftRight();
    void addDigit();
    int getDigitAt();
    BigNumber copy();
    BigNumber add();

}
