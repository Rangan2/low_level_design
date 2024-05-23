package lld_practice.behavioral.iterator;

import java.util.List;

public class BookIterator implements Iterator{

	private int index = 0;
	private List<Book> bookList;
	
	public BookIterator(List<Book> bookList) {
		super();
		this.bookList = bookList;
	}

	@Override
	public boolean hasNext() {
		return this.index < this.bookList.size();
	}

	@Override
	public Object next() {
		if(this.hasNext()) {
			return bookList.get(this.index++);
		}
		return null;
	}

}
