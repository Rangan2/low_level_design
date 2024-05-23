package lld_practice.behavioral.iterator;

import java.util.List;

public class StudentIterator implements Iterator{

	private int index;
	private List<Student> studentList;

	public StudentIterator(List<Student> studentList) {
		super();
		this.index = 0;
		this.studentList = studentList;
	}

	@Override
	public boolean hasNext() {
		return this.index < studentList.size();
	}

	@Override
	public Object next() {
		if(hasNext()) {
			return this.studentList.get(this.index++);
		}
		return null;
	}
}
