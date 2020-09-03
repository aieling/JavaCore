package CollectionsFramework;

//T implements an interface
public class Wrapper<T extends Comparable<T>> {
	private T t;
	private int accessCount;
	public Wrapper(T t) {
		this.t = t;
	}
	
	public T getValue() {
		accessCount++;
		return t;
	}
	
	public int compareTo(T otherValue) {
		return t.compareTo(otherValue);
	}
	
}
