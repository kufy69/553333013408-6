package Work02;

public class TEST {
	public static void main(String[] args) {

		System.out.println("..........ArrayList..........");
		ArrayList array = new ArrayList();
		array.add("1");
		System.out.println(array);
		array.add("2");
		System.out.println(array);
		array.add("3");
		System.out.println(array);

		

		array.addFirst(0);
		System.out.println("Add.First = "+array);

		

		array.addLast(4);
		System.out.println("Add.Last = "+array);



	

		

		array.remove(4);
		System.out.println("Remove = "+array);
	}

}
