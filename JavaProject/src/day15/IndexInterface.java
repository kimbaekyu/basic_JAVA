package day15;

public interface IndexInterface<T> {
	public void insert(Comparable x);
	public T search(Comparable x);
	public void delete(Comparable x);
}
