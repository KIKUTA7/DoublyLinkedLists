package fop.w5dll;

public class IntDoubleListElement {
    private IntDoubleList info;
    public IntDoubleListElement next;
    public IntDoubleListElement prev;
    public IntDoubleListElement (IntDoubleList x)
    {
        this.info = x;
        this.next = null;
        this.prev = null;
    }


}
