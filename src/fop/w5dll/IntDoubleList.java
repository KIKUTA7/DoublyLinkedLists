package fop.w5dll;

public class IntDoubleList {
	private double info;
	public IntDoubleList next;
    public IntDoubleList prev;
    public IntDoubleList (double x)
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

    public double getInfo() {
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
