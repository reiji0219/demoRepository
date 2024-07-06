package demo;

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
