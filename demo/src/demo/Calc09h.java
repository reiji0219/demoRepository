package demo;

import umejava_05_01.Interface;

public class Calc09h extends Item09h
{
	private String name;
	
	public Calc09h( String name ) {
		super();
		this.name = name;
	}
	
	public static Interface create() {
		return() -> {
			Calc09h calc = new Calc09h( "Poly-morphism" );

			Item09h.save( item -> {
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
	public void display() {
		indi( name );
	}
	
	public void process( Interface inter ) {
		indi( "start" );
		
		inter.execute();
		
		indi( "end" );
	}
	
	
}
