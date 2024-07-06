package demo;

import umejava_05_01.Interface;

public class Test_07_04_home
{
	public static void main( String[] args )
	{
		Calc04h calc = new Calc04h( "Poly-morphism" );
		calc.process( () -> {
			System.out.println( "関心事を記述" );
	
		Interface save = Calc04h.create();
			save.execute();
	
		});

	}
}
