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

    public void setNext(IntDoubleListElement next) {
        this.next = next;
    }

    public void setPrev(IntDoubleListElement prev) {
        this.prev = prev;
    }

    public int getInfo() {
        return info;
    }

    public IntDoubleListElement getNext() {
        return next;
    }

    public IntDoubleListElement getPrev() {
        return prev;
    }
}
