package lld_practice.behavioral.iterator;

import java.util.List;

public class Library implements Aggregator{

	List<Book> bookList;

	public Library(List<Book> bookList) {
		super();
		this.bookList = bookList;
	}

	@Override
	public Iterator createIterator() {
		return new BookIterator(this.bookList);
	}
}
