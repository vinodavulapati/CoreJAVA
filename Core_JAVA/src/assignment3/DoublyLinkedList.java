package assignment3;

public class DoublyLinkedList {
	private Link head;
	private int size;

	public DoublyLinkedList() {
		head = null;
		size = 0;
	}

	public void addFront(int data) {
		if (head == null) {
			head = new Link(null, data, null);
		} else {
			Link newLink = new Link(null, data, head);
			head.previous = newLink;
			head = newLink;

		}
		size++;
	}

	public void addRear(int data) {
		if (head == null) {
			head = new Link(null, data, null);
		} else {
			Link current = head;
			while (current.next != null) {
				current = current.next;

			}

			Link newLink = new Link(current, data, null);
			current.next = newLink;

		}
		size++;

	}

	public void removeFront() {
		if (head == null)
			return;
		head = head.next;
		head.previous = null;
		size--;

	}

	public void removeRear() {

		if (head == null)
			return;
		if (head.next == null) {
			head = null;
			size--;
			return;

		}

		Link current = head;
		while (current.next.next != null)
			current = current.next;

		current.next = null;
		size--;
	}

	public void insertAtIndex(int data, int index) {
		if (head == null)
			return;
		if (index < 1 || index > size) {
			return;
		}
		Link current = head;
		int i = 1;
		while (i < index) {
			current = current.next;
			i++;
		}

		if (current.previous == null) {
			Link newLink = new Link(null, data, current);
			current.previous = newLink;
			head = newLink;

		} else {
			Link newLink = new Link(current.previous, data, current);

			current.previous.next = newLink;
			current.previous = newLink;

		}
		size++;
	}

	public void removeAtIndex(int index) {
		if (head == null)
			return;
		if (index < 1 || index > size) {
			return;
		}
		Link current = head;
		int i = 1;
		while (i < index) {
			current = current.next;
			i++;
		}

		if (current.next == null) {

			current.previous.next = null;
		} else if (current.previous == null) {
			current = current.next;
			current.previous = null;
			head = current;
		} else {

			current.previous.next = current.next;
			current.next.previous = current.previous;

		}
		size--;
	}

	public void print() {
		Link current = head;

		while (current != null) {
			System.out.println(current.data());
			current = current.next;

		}

	}

	public void search(int data) {
		Link current = head;
		int i = 1;
		while (current != null) {
			if (current.data() == data) {
				System.out.println("the data element was found at index:" + i);
				return;
			}
			current = current.next;
			i++;

		}
		System.out.println("the data element was not found any where in list," + data);

	}

	public boolean isEmpty() {
		return head == null;
	}

	public static void main(String args[]) {
		DoublyLinkedList d = new DoublyLinkedList();
		d.addFront(10);
		d.addFront(20);
		d.addFront(30);
		d.addRear(100);
		d.addRear(200);

		// d.removeFront();
		// d.removeRear();

		// d.insertAtIndex(22, 1);
		// d.removeAtIndex(1);
		d.print();
		d.search(200);
		d.search(111111);
		d.search(22222);

	}
}