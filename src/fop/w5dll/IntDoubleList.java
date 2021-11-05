package fop.w5dll;

public class IntDoubleList {
	private int info;
	public IntDoubleList next;
	public IntDoubleList prev;
	public IntDoubleList (int x)
    {
        this.info = x;
        this.prev = this;
        this.next = this;
    }
}
