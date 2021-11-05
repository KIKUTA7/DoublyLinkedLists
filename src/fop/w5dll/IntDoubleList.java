package fop.w5dll;

public class IntDoubleList {
	private int info;
	public IntDoubleList next;
    public IntDoubleList prev;
    public IntDoubleList (int x)
    {
        this.info = x;
        this.next = this;
    }
    public IntDoubleList ()
    {

        if(this.prev != null)
            this.next =null;
    }
    public IntDoubleList getPrev() {
        return prev;
    }

    public IntDoubleList getNext() {
        return next;
    }

    public int getInfo() {
        return info;
    }

    public void setPrev(IntDoubleList prev) {
        this.prev = prev;
    }

    public void setNext(IntDoubleList next) {
        this.next = next;
    }

    public void setInfo(int info) {
        this.info = info;
    }

}
