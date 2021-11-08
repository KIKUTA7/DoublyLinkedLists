package fop.w5dll;

public class IntDoubleList {
    private int head;
    private IntDoubleList tail;
    public void append(int info)
    {
        this.head = info;
        this.tail = this;
    }
}

