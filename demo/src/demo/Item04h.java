package demo;

import java.util.function.Consumer;
import umejava_05_01.Interface;

public class Item04h implements Interface
{
	@Override
	public void execute(){
		indi( "Lambda" );
	}

	private String id;
	private String name;
	private double price;
	private double tax;
	private Calc04 calc;


	public Item04h id( String id ){
	this.id = id;
	return this;
	}
	public Item04h name( String name ){
	this.name = name;
	return this;
	}
	public Item04h price( double price ){
	this.price = price;
	return this;
	}
	public Item04h tax( double tax ){
	this.tax = tax;
	return this;
	}
	public Item04h calc( Calc04 calc ){
	this.calc = calc;
	return this;
	}


	public static void save( Consumer<Item04h> con ){
	Item04h item = new Item04h( );
	con.accept( item );
	indi( "save :" + item );
	}

	public String getId(){
	return id;
	}

	public void display(){
		indi( "表示内容 :" + name );

		double calcInTax = calcTax( price, tax );
			indi( "税込み価格は" + calcInTax + "円です" );

		calc.display();
	}
	public static double calcTax( double price, double tax ){
	return( price * tax );
	}

	@Override
	public String toString(){
	return( "Item04" + "id=" + id + " " + "name=" + name + " " + "price=" + price + " " + "tax=" + tax );
	}
	public static void indi( String s0 ){
		System.out.println( s0 );
	}

}

