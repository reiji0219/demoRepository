package demo;

import umejava_05_01.Interface;

public class Calc16 extends Item16
{
	private String name;
	
	public Calc16( String name ) {
		super();
		this.name = name;
	}
	
	public static Interface create() {
		return() -> {
			Calc16 calc = new Calc16( "Poly-morphism" );

			Item16.save( item -> {
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
	public void display() {
		indi( name );		
	}
	
	public void process( Interface inter ) {
		indi( "start" );
		
		inter.execute();
		
		indi( "end" );
	}
	
}
