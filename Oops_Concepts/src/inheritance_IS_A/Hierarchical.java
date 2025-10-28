package inheritance_IS_A;

class Tree {
	
	void displayTree() {
		System.out.println("this is the Tree....");
	}
}

class Leaf extends Tree{
	
	void displaLeaf() {
		System.out.println("this is  leaf....");
	}
}

class Flower extends Tree{
	
	void displayFlower() {
		System.out.println("this is  flower....");
	}
}

class Fruit extends Tree{
	
	void displayFruit() {
		System.out.println("this is  fruit....");
	}
}

//When a parents class have more than one child class, called the, hierarchical inheritance.
public class Hierarchical {

	public static void main(String[] args) {
		
		Leaf leaf = new Leaf();
		leaf.displaLeaf();
		leaf.displayTree();
		
		System.out.println("***********************");
		Flower flower = new Flower();
		flower.displayFlower();
		flower.displayTree();
		
		
		System.out.println("***********************");
		Fruit fruit = new Fruit();
		fruit.displayFruit();
		fruit.displayTree();

	}

}
