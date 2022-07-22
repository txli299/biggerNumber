package bignumber;

public class node {
    public int val;
    public node next;

    public node(int val){
        this.val = val;
        this.next = null;
    }
    public node(int val,node next){
        this.val = val;
        this.next = next;
    }
    @Override
    public String toString(){
        return String.valueOf(this.val);

    }



}
