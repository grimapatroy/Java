package masterEscuelaIT.java.modulo1.ListaAcotadaYNoAcotada;

class BoundedStack {

	private Interval[] elements;
	private int next;

	public BoundedStack(int capacity) {
		this.elements = new Interval[capacity];
		this.next = 0;
	}

//	push
	public void add(Interval element) {
		this.elements[this.next] = element;
		this.next++;
	}

	public boolean isEmpty() {
		return this.next == 0;
	}

	public boolean isFull() {
		return this.next == elements.length;
	}

//	metodo raro, cambiando el estado y devuelve algo(intentado copiar pop)
	public Interval remove() {
		this.next--;
		return elements[next];
	}

	public Interval[] getElements(){
		Interval[] elements = new Interval[this.next];
		for (int position = 0; position < this.next; position++) {
			elements[position] = this.elements[this.next - 1 - position];
		}
		return elements;
	}

}
