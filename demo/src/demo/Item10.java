package demo;

import java.util.function.Consumer;
import umejava_05_01.Interface;

public class Item10 implements Interface
{
	@Override
	public void execute() {
		indi( "Lanbda" );
		
	}
	
	private String id;
	private String name;
	private double price;
	private double tax;
	private Calc10 calc;
	
	
	public Item10 id( String id ) {	
		this.id = id;
		return this;
	}
	public Item10 name( String name ) {
		this.name = name;
		return this;
	}
	public Item10 price( double price ) {
		this.price = price;
		return this;
	}
	public Item10 tax( double tax ) {
		this.tax = tax;
		return this;
	}
	public Item10 calc( Calc10 calc ) {
		this.calc = calc;
		return this;
	}
	
	public static void save( Consumer<Item10> con ){
		Item10 item = new Item10();
		con.accept( item );
		indi( "Save :" + item );
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
	
	public static double calcTax( double price, double tax ) {
		return( price * tax );
	}

	@Override
	public String toString() {
		return "Item10 [id=" + id + ", name=" + name + ", price=" + price + ", tax=" + tax + "]";
	}
	
	public static void indi( String s0 ) {
		System.out.println( s0 );
	}
	
}
