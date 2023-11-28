package masterEscuelaIT.java.modulo1.ListaAcotadaYNoAcotada;

class BoundedQueue {

	private Interval[] elements;
	private int size;
	private int next;
	private int first;

	public BoundedQueue(int capacity) {
		this.elements = new Interval[capacity];
		this.size = 0;
		this.next = 0;
		this.first = 0;
	}

	public void add(Interval element) {
		this.size++;
		this.elements[this.next] = element;
		this.next = (this.next +1)% this.elements.length;
	}

	public boolean isEmpty() {
		return this.size == 0;
	}

	public boolean isFull() {
		return this.size == elements.length;
	}

	public Interval remove() {
		this.size--;
		Interval element = this.elements[this.first];
		this.first = (this.first + 1) % this.elements.length;
		return element;
	}

	public Interval[] getElements() {
		Interval[] elements = new Interval[this.size];
		for(int position= 0; position < this.size; position++){
			elements[position] = this.elements[(position + this.first)  % this.elements.length];
		}
		return elements;
	}

}
