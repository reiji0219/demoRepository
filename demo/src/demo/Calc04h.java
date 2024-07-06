package demo;

import umejava_05_01.Interface;

public class Calc04h extends Item04h
{
	private String name;
	
	public Calc04h( String name ){
	super();
	this.name = name;
	}

	public static Interface create(){
	return() -> {
		Calc04h calc = new Calc04h( "Poly-morphism" );

		Item04h.save( item -> {
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