package demo;

import java.util.function.Consumer;
import umejava_05_01.Interface;

public class Item26j implements Interface
{
	@Override
	public void execute(){
		indi( "Lambda" );
	}

	private String id;
	private String name;
	private double price;
	private double tax;
	private Calc26j calc;


	public Item26j id( String id ){
	this.id = id;
	return this;
	}
	public Item26j name( String name ){
	this.name = name;
	return this;
	}
	public Item26j price( double price ){
	this.price = price;
	return this;
	}
	public Item26j tax( double tax ){
	this.tax = tax;
	return this;
	}
	public Item26j calc( Calc26j calc ){
	this.calc = calc;
	return this;
	}

	public static void save( Consumer<Item26j> con ){
	Item26j item = new Item26j();
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
	public static void indi( String s0 ){
		System.out.println( s0 );
	}
}
