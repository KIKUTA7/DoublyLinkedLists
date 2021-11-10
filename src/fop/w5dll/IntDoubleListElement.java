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
    public boolean isEqual (IntDoubleListElement other) {
        if(other==null && this.info==0 && this.next == null && this.prev==null) return true;
        if(other == null) return false;
        return this.info == other.info;
    }
}
