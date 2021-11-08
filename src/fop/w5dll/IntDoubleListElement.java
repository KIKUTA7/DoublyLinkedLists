package fop.w5dll;

public class IntDoubleListElement {
    private int info;
    public IntDoubleListElement next;
    public IntDoubleListElement prev;
    public IntDoubleListElement (int x)
    {
        this.info = x;
        this.next = null;
        this.prev = null;
    }

    public void setInfo(int info) {
        this.info = info;
    }
}
