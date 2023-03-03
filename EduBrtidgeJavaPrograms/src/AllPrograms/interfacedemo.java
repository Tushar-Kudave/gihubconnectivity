package AllPrograms;
interface shopping{
	abstract void buy();
	void sell();
}
interface onlineshopping{
	default void returnitem() {
		System.out.println("Return an item");
	}
	static void replaceitem() {
		System.out.println("Repalcing the broken item.");
	}
	abstract void purchase();
}
public class interfacedemo implements shopping,onlineshopping{
	public void buy() {
		System.out.println("shopping interface - Buying an item in store - default");
	}
	public void sell() {
		System.out.println("shopping interface - Selling an item in store - static");
	}
	
	public void purchase() {
		System.out.println("onlineshopping interface - puchase completed");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		interfacedemo i = new interfacedemo();
		i.buy();
		i.sell();
		i.purchase();
		i.returnitem();
		onlineshopping.replaceitem();
	}
}
