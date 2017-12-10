import java.util.ArrayList;

public class Heap<T> {

	public ArrayList<T> data;
	public int size;



	public Heap() {
		data = new ArrayList<T>(32);
		data.add(0);
		size = 0

	}

	public void add(T value) {
		size++;
		data.add(value);
	}

	private void heapify() {

	}

	public int size() {
		return size;
	}

	public T peek() {
		return data.get(1);
	}



	swap()
}