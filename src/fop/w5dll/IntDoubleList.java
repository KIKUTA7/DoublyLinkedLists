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
            if(s==pos - 1) return t.getInfo();
        }
        return 0;
    }
    public void remove(int pos)
    {
        int s=-1;
        if( this.tail==this.head  )  {tail = null;head=null; return ;}
        if(pos == 0) {head=head.next;head.prev=null;return;}
        else if(pos == size() - 1) {tail=tail.prev;tail.next=null;return;}
        for (IntDoubleListElement t=head.next;t.next!=null;t=t.next)
        {
            s++;
            if(s==pos - 1) {t.next=t.next.next;t.next.prev = t;}
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


}

