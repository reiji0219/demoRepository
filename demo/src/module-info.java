public class Calc04 extends Item04
{
	private String name;
	
	public Calc04( String name ){
	super();
	this.name = name;
	}

	public static Interface create(){
	return() -> {
		Item04.save( item -> {
			item.id( "掛け算" )
			    .name( "税込み価格" )
			    .price( 980　)
			    .tax( 1.1 )
			    .calc( calc );
	
			System.out.println( "計算式 :" + item.getId());

			item.display();



			});

		};
	}

	public void display(){
		indi( name );
	}

	public void process( Interface inter ){
		indi( "start" );

		inter.execute();

		indi( "end" );
	}




import java.util.function.Consumer;

public class Item04 implements Interface
{
	public void execute(){
		indi( "Lambda" );
	}

	private String id;
	private String name;
	private double price;
	private double tax;
	private Calc04 calc;


	public Item04 id( String id ){
	this.id = id;
	return this;
	}
	public Item04 name( String name ){
	this.name = name;
	return this;
	}
	public Item04 price( double price ){
	this.price = price;
	return this;
	}
	public Item04 tax( double tax ){
	this.tax = tax;
	return this;
	}
	public Item04 calc( Calc04 calc ){
	this.calc = calc;
	return this;
	}


	public static void save( Consumer<Item04> con ){
	Item04 item = new Item04( );
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

		calc,display();
	}
	public static double calcTax( double price, double tax ){
	return( price * tax );
	}

	public String toString(){
	return( "Item04" + "id=" + id + " " + "name=" + name + " " + "price=" + price + " " + "tax=" + tax );
	}
	public static void indi( String s0 ){
		System.out.println( s0 );
	}

}


public class JFrame
{
	public static void main( String[] args )
	{
	Calc04 clac = Calc04( "Poly-morphism" );
	calc.process( () -> {
		System.out.println( "関心事を記述" );

	Interface save = Calc04.create();
		save.execute();

	});

	}
}
