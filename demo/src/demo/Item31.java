package demo;

import java.util.Iterator;
import java.util.List;
import java.util.Collections;
import java.util.Comparator; 
import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Consumer;

import umejava_05_01.Interface;

public class Item31 implements Interface
{	
	private String id;
	private String name;
	private double price;
	private double tax;
	private Calc31 calc;
	

	public Item31 id( String id ) {
		this.id = id;
		return this;
	}
	public Item31 name( String name ) {
		this.name = name;
		return this;
	}
	public Item31 price( double price ) {
		this.price = price;
		return this;
	}
	public Item31 tax( double tax ) {
		this.tax = tax;
		return this;
	}
	public Item31 calc( Calc31 calc ) {
		this.calc = calc;
		return this;
	}
	
	public static void save( Consumer<Item31> con ) {
		Item31 item = new Item31();
		con.accept( item );
		indi( "save :" + item );
	}
	
	public String getId() {
		return id;
	}
	
	public void display() {
		indi( "表示内容 :" + name );
	
		double calcInTax= calcTax( price, tax );
		indi( "税込み価格は" + calcInTax + "円です" );
		
		calc.display();
	}
	
	public static double calcTax( double price, double tax ) {
		return( price * tax );
	}
	
	@Override
	public String toString() {
		return "Item31 [id=" + id + ", name=" + name + ", price=" + price + ", tax=" + tax + "]";
		}
	public static void indi( String s0 ) {
		System.out.println( s0 );
	}
	@Override
	public void execute() {
		indi( "Lambda" );
		
		ArrayList<String> animals = new ArrayList<String>( Arrays.asList( "Dog" ));
		
		ArrayList<String> animalList = new ArrayList<String>();
			animalList.add( "Cat" );
			animalList.add( "Lion" );
			animalList.add( "Penguin" );
			animalList.add( "Gorrila" );
			
			animals.addAll( animalList );

		String getAnimal = animals.get( 4 );
			indi( getAnimal );
			
			animals.set( 4, "Fox" );
			
			animals.remove( 0 );
			animals.add( 0, "Doragon" );
/*			//normal			
		Comparator<String> compa = new Comparator<String>() {
			@Override
			public int compare( String o1, String o2 ) {
				return( o2.compareTo( o1 ));
			}
		};
			// 匿名クラスを使用
		Comparator<String> compa = new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				return( o2.compareTo( o1 ));
			}
		};
*/
			// Lambda式で記述
		Comparator<String> compa = (  o1,  o2 ) -> {
			return( o2.compareTo( o1 ));
			};
		
			
		Collections.sort( animals, compa );	
			
		Iterator<String> itera = animals.iterator();
		while( itera.hasNext()) {
			String hoge = itera.next();
				indi( hoge );
		}
			
		List<Integer> seq = new ArrayList<>();
		
		for( int i = 0; i < 5; i++ ) {
			int number = new java.util.Random(). nextInt( 4 ) + 1;
				seq.add( number );
		}
		
		for( int i : seq ) {
			char[] base = { ' ', 'A', 'G', 'T', 'C' };
				System.out.print( base[ i ] );
		}
			indi( " " );
			
		int num = new java.util.Random().nextInt( 10 ) + 1;
		
		String str = ( ( num % 2 ) == 0 )? ( ( num % 3 ) == 0 )?
								"ture/ture" : "ture/false"
						:( ( num % 3 ) == 0 )?
								"false/ture" : "false/false" ;
			indi( num + " " + str );
			
	}
}
