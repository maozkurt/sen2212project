package sen2212project;

public class Main {
	public static void main(String[] args) {
		LinkedList<Integer> list = new LinkedList<Integer>();
		list.append(5);
		System.out.println(list.getNode(5).getValue());
		
		list = null;
		
		LinkedList<Person> list2 = new LinkedList<Person>();
		Person test = new Person("asd",-1,"q");
		list2.append(test);
		Person test2 = new Person("asssd",-1,"sq");
		list2.append(test2);
		System.out.println(list2.getNode(test2).getValue().getName());
		
		list2 = null;
	}
}
