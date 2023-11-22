package core;
import java.util.ArrayList;
public class Stack implements IStack {

	private ArrayList<Object> elm;
	private Object top,last;
	private int limit;
	public Stack() {
		elm = new ArrayList<Object>();
		limit = 1;
	}
	public Stack(int limit) {
		elm = new ArrayList<Object>();
		this.limit = limit;
	}
	public boolean isEmpty() {
		if(elm == null ||  elm.size()==0) {
			return true;
		}
		return false;
	}

	public int getSize() {
		if(elm != null) {
			return elm.size();
		}
		return 0;
	}

	public void push(Object elm) {
		if(this.elm.size() == limit) return;
		this.elm.add(elm);
		top = elm;
		if(this.elm.size()==1) {
			last = elm;
		}
	}

	public Object top() {
		return top;
	}

	public boolean isFull() {
		if(elm.size()==limit) {
			return true;
		}
		return false;
	}
	public Object pop() {
		if(elm.size() > 0) {
			Object temp = last;
			last = elm.get(1);
			return temp;
		}
		return null;
	}

}
