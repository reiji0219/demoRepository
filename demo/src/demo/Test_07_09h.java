package demo;

import umejava_05_01.Interface;

public class Test_07_09h 
{
	public static void main( String[] args )
	{
		Calc09h calc = new Calc09h( "Poly-morphism" );
			calc.process( () -> {
				System.out.println( "関心事を記述" );
				
				Interface save = Calc09h.create();
					save.execute();
					
			});
			
	}
}
