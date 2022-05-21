package codificacao_topico_classes;

public class static_class {
	
	static class Pojo {
		public int value;
	}
	
	private static void set(Pojo pojo) {
		int b = ++pojo.value;
		b++;
	}

	public static void main(String[] args) {
		Pojo pojo = new Pojo();
		pojo.value = 0;
		
		set(pojo);
		System.out.print("Before: " + pojo.value + " | ");
		
		set(pojo);
		System.out.print("After: " + pojo.value);
	}
}
