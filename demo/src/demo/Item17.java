package demo;

import umejava_05_01.Interface;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Collections;
import java.util.Comparator;
import java.util.function.Consumer;

public class Item17 implements Interface
{
	private String id;
	private String name;
	private double price;
	private double tax;
	private Calc17 calc;


	public Item17 id( String id ) {
	this.id = id;
	return this;
	}
	public Item17 name( String name ) {
	this.name = name;
	return this;
	}
	public Item17 price( double price ) {
	this.price = price;
	return this;
	}
	public Item17 tax( double tax ) {
	this.tax = tax;
	return this;
	}
	public Item17 calc( Calc17 calc ){
	this.calc = calc;
	return this;
	}

	public static void save( Consumer<Item17> con ){
	Item17 item = new Item17( );
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
	public void execute() {
		indi( "Lambda" );

	ArrayList<String> animals = new ArrayList<>( Arrays.asList( "Dog" ));

	ArrayList<String> animal = new ArrayList<>();
		animal.add( "Cat" );
		animal.add( "Penguin" );
		animal.add( "Lion" );

		animals.addAll( animal );

	String getAnimal = animals.get( 2 );
		indi( getAnimal );

		animals.set( 1, "Elephant" );

		animals.remove( 2 );
		animals.add( 2, "phoenix" );

	Comparator<String> compa = new Comparator<>(){
	public int compare( String o1, String o2 ){
		return( o2.compareTo( o1 ));
		}
	};

	Collections.sort( animals, compa );

	Iterator<String> itera = animals.iterator();
	while( itera.hasNext()){
		String hoge = itera.next();
			indi( hoge );
	}
	}

	@Override
	public String toString(){
	return( "Item17 :" + "id=" + id + " " + "name=" + name + " " + "price=" + price + " " + "tax=" + tax );
	}
	public static void indi( String s0 ){
		System.out.println( s0 );
	}
}
	

