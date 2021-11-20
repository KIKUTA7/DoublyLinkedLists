package fop.w5dll;

public class IntDoubleList {
    private IntDoubleListElement head;
    private IntDoubleListElement tail;
    public IntDoubleList (){
        this.head = null;
        this.tail = null;
    }
    public void setHead(IntDoubleListElement head) {
        this.head = head;
    }
    public void setTail(IntDoubleListElement tail) {
        this.tail = tail;
    }
    public IntDoubleListElement getFirstElement()
    {
        return this.head;
    }
    public IntDoubleListElement getLastElement()
    {
        return this.tail;
    }
    public void append(int info)
    {
        IntDoubleListElement newE = new IntDoubleListElement(info);
        if(head == null)
        {head = newE; tail = newE;}
        else {
            tail.next = newE;
            newE.prev = tail;
            tail = newE;
        }
    }
    public int size()
    {
        int s=0;
        for (IntDoubleListElement t=head;t!=null;t=t.next)
        {s++;}
        return s;
    }
    public int get(int pos)
    {
        int s=-1;
        for (IntDoubleListElement t=head;t!=null;t=t.next)
        {
            s++;
            if(s==pos) return t.getInfo();
        }
        return 0;
    }
    public void remove(int pos)
    {
        int s= -1;
        if(tail == null && head ==null) return;
        if( this.tail==this.head  )  {tail = null;head=null; return ;}
        if(pos == 0) {head=head.next;head.prev=null;return;}
        else if(pos == size() - 1) {tail=tail.prev;tail.next=null;return;}
        for (IntDoubleListElement t=head;t!=null;t=t.next)
        {
            s++;
            if(s==pos - 1) { t.next=t.next.next;t.next.prev = t;}
        }

    }
    public int sum()
    {
        int sum =0;
       for (IntDoubleListElement t=head;t!=null;t=t.next)
       {
           sum+=t.getInfo();
       }
       return sum;
    }
    public IntDoubleList copy()
    {
        IntDoubleList newE = new IntDoubleList();

        for (IntDoubleListElement t=head;t!=null;t=t.next)
        {
            newE.append(t.getInfo());
        }
        return newE;
    }
    public String toString()
    {
        StringBuilder s= new StringBuilder();
        if(this.tail == null && this.head == null) return "";
        if(this.tail==this.head) {return ""+tail.getInfo();}
        else {
            s.append(head.getInfo());
            for (IntDoubleListElement t=head.next;t!=null;t=t.next)
            {
                s.append(",").append(t.getInfo());
            }
            return s.toString();
        }
    }
    public IntDoubleListElement[] search(int intValue)
    {
        int k=0;
        IntDoubleListElement [] x= new IntDoubleListElement[size()];
        for (IntDoubleListElement t=head;t!=null;t=t.next)
        {
            if(t.getInfo() == intValue && this.head ==this.tail) {x[k]= t;x[k].prev=null;x[k].next = null;k++;}
            else if(t.getInfo() == intValue ) {
                x[k] = t;
                if(k > 0) x[k].prev = x[k-1];
                else x[k].prev = null;
                if(k > 0) x[k-1].next = x[k];
                k++;}


        }
        IntDoubleListElement [] v = new IntDoubleListElement[k];
        System.arraycopy(x, 0, v, 0, k);
        return v;
    }
    public boolean isEqual(IntDoubleList other)
    {
        if(other == null) return false;
        IntDoubleListElement k = other.head;
        boolean answer = true;
        for (IntDoubleListElement t=head; t!=null ; t=t.next){
            if(t.next==null && k.next!=null) {answer = false;break;}
           if(t.getInfo() != k.getInfo())
           { answer =false;break;}
         k=k.next;}
        return answer;
    }
    //    public boolean isEqual(IntDoubleList other) {
//        IntDoubleListElement mytemp = head;
//        IntDoubleListElement othertemp = other.head;
//        while (mytemp != null) {
//            if (!mytemp.isEqual(othertemp))
//                return false;
//            mytemp = mytemp.next;
//            othertemp = othertemp.next;
//        }
//        return othertemp == null;
//    }

}

