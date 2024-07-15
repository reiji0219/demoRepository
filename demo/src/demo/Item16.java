package demo;

import java.util.function.Consumer;

import umejava_05_01.Interface;

public class Item16 implements Interface
{
	@Override
	public void execute() {
		indi( "Lambda" );
		
		
	}
	
	private String id;
	private String name;
	private double price;
	private double tax;
	private Calc16 calc;
	
	
	public Item16 id(String id) {
		this.id = id;
		return this;
	}
	public Item16 name(String name) {
		this.name = name;
		return this;
	}
	public Item16 price(double price) {
		this.price = price;
		return this;
	}
	public Item16 tax(double tax) {
		this.tax = tax;
		return this;
	}
	public Item16 calc( Calc16 calc ) {
		this.calc = calc;
		return this;
	}
	
	public static void save( Consumer<Item16> con ) {
		Item16 item = new Item16();
		con.accept( item );
		indi( "save :" + item );
	}
		
	public String getId() {
		return id;
	}
	
	public void display() {
		indi( "表示内容 :" + name );
		
	 double calcInTax = calcTax( price, tax );
	 	 indi( "税込み価格は" + calcInTax + "円です" );
	 	 
	 	 calc.display();
	}
	public static double 	calcTax( double price, double tax ) {
		return( price * tax );
	}

	@Override
	public String toString() {
		return "Item16 [id=" + id + ", name=" + name + ", price=" + price + ", tax=" + tax + "]";
	}

	public static void indi( String s0 ) {
		System.out.println( s0 );
	}
	
}
