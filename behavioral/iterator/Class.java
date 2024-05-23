package lld_practice.behavioral.iterator;

import java.util.List;

public class Class implements Aggregator{

	private List<Student> studentList;

	public Class(List<Student> studentList) {
		this.studentList = studentList;
	}

	@Override
	public Iterator createIterator() {
		// TODO Auto-generated method stub
		return new StudentIterator(this.studentList);
	}
	
	
}
