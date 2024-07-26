package demo;

import umejava_05_01.Interface;

public class Calc26j extends Item26j
{
	private String name;

	public Calc26j( String name ){
	super();
	this.name = name;
	}

	public static Interface create(){
	return() -> {
	Calc26j calc = new Calc26j( "Poly-morphism" );

	Item26j.save( item -> {
		item.id( "掛け算" )
		    .name( "税込み価格" )
		    .price( 980 )
		    .tax( 1.1 )
		    .calc( calc );

		System.out.println( "計算式 :" + item.getId());

		item.display();

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
