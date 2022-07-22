package bignumber;

public class biggerNumberImpl implements BigNumber{
    protected node head;

    public biggerNumberImpl(){
        head = new node(0);
    }
    public biggerNumberImpl(node head){
        this.head = head;
    }

    @Override
    public String toString(){
        return printString(head);
    }

//    helper function for to string
    public String printString(node head){
        if(head==null){
            return "";
        }
        return printString(head.next)+head.toString();
    }
    
    @Override
    public int length() {
        node temp = head;
        int count = 0;
        while (temp!= null){
            count ++;
            temp = temp.next;
        }
        return count;
    }

    @Override
    public void shiftLeft(int shift) {
        if(shift<0){
            this.shiftRight(-shift);
        }
        if(head.next==null && head.val==0){
            return;
        }
        for (int i = 0; i<shift;i++) {
            node newHead = new node(0);
            newHead.next = head;
            head = newHead;
        }
    }

    @Override
    public void shiftRight(int shift) {
        if(shift<0){
            this.shiftLeft(-shift);
        }
        if(head.next==null && head.val==0){
            return;
        }
        node temp = head;
        for(int i = 0; i<shift; i++){
            temp = temp.next;
            head = temp;
        }
    }

    @Override
    public BigNumber copy() {
        node newNode = new node(head.val);
        node temp1 = newNode;
        node temp2 = head.next;
        while(temp2!=null){
            temp1.next= new node(temp2.val);
            temp1=temp1.next;
            temp2=temp2.next;
        }
        BigNumber copiedBigNumber= new biggerNumberImpl(newNode);
        return copiedBigNumber;
    }

    @Override
    public void addDigit(int digit) {
        node temp = head;
        temp.val = temp.val+digit;
        this.makeNodeValMath();
    }

    @Override
    public int getDigitAt(int index) {
        if(index>length()-1){
            throw new IllegalArgumentException();
        }
        node temp = head;
        for(int i =0; i<this.length()-index-1;i++){
            temp=temp.next;
        }
        return temp.val;
    }

    @Override
    public BigNumber add(BigNumber other) {
        biggerNumberImpl otherImpl = (biggerNumberImpl) other;
        node newHead = new node(0);
        node currentHead = newHead;
        node temp1 = this.head;
        node temp2 = otherImpl.head;
        if(this.length()==other.length()){
            currentHead.val= temp1.val+ temp2.val;
            temp1=temp1.next;
            temp2=temp2.next;
            while(temp1!=null){
                currentHead.next=new node(temp1.val+ temp2.val);
                temp1=temp1.next;
                temp2=temp2.next;
            }
            biggerNumberImpl result = new biggerNumberImpl(newHead);
            result.makeNodeValMath();
            return result;
        }else if (this.length()< other.length()){
            currentHead.val= temp2.val+ temp1.val;
            temp2 = temp2.next;
            temp1 = temp1.next;
            while(temp1!=null){
                currentHead.next = new node(temp1.val+temp2.val);
                currentHead=currentHead.next;
                temp1=temp1.next;
                temp2=temp2.next;
            }
            while(temp2.next!=null){
                currentHead.next = new node(temp2.val);
                temp2=temp2.next;
            }
            biggerNumberImpl result = new biggerNumberImpl(newHead);
            result.makeNodeValMath();
            return result;

        }else if (this.length()> other.length()){
            currentHead.val= temp2.val+ temp1.val;
            temp2 = temp2.next;
            temp1 = temp1.next;
            while(temp2!=null){
                currentHead.next = new node(temp1.val+temp2.val);
                currentHead=currentHead.next;
                temp1=temp1.next;
                temp2=temp2.next;
            }
            while(temp1.next!=null){
                currentHead.next = new node(temp1.val);
                temp1=temp1.next;
            }
            biggerNumberImpl result = new biggerNumberImpl(newHead);
            result.makeNodeValMath();
            return result;
        }

        return null;

    }

//Helper function
    public void makeNodeValMath(){
        node temp = head;
        int count =0;
        for(int i = 0; i<length();i++){
            temp.val+=count;
            count = 0;
            while(temp.val>9){
                temp.val-=10;
                count++;
            }
            temp=temp.next;

        }
    }

}
