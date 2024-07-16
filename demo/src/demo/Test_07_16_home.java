package demo;

import umejava_05_01.Interface;

public class Test_07_16_home 
{
	public static void main( String[] args )
	{
		Calc16 calc = new Calc16( "Poly-morphism" );
			calc.process( () -> {
				System.out.println( "関心事を記述" );
				
				Interface save = Calc16.create();
					save.execute();
			});
			
	}
	
}
