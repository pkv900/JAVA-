class Test<T>{
	T obj;
	Test(T obj){
		this.obj=obj;
	}
	
	public T getObject() {
		return this.obj;
	}
}


public class GenericDemo {

	public static void main(String[] args) {
	Test<Integer> iobj =new Test<Integer>(15);
	System.out.println(iobj.getObject());
	
	Test<String> sobj = new Test<String>("Lets Learn Generics");
	System.out.println(sobj.getObject());
		

	}

}
