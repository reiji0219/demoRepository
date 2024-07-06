package demo;

import umejava_05_01.Interface;

public class Calc05 extends Item05
{
	private String name;

	public Calc05( String name ){
	super();
	this.name = name;
	}

	public static Interface create(){
	return() -> {
		Calc05 calc = new Calc05( "Poly-morphism" );
	
		Item05.save( item -> {
			item.id( "掛け算" )
			    .name( "税込み価格" )
			    .price( 980 )
			    .tax( 1.1 )
			    .calc( calc );
	
			System.out.println( "計算式 :" + item.getId());
	
			item.display();
		
			item.execute();

			});
		};
	}
	@Override
	public void display(){
		indi( name );
	}

	public void process( Interface inter ){
		indi( "start" );

		inter.execute();	

		indi( "end" );
	}
}
