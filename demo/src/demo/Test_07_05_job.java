package demo;

import umejava_05_01.Interface;

public class Test_07_05_job
{
	public static void main( String[] args )
	{
	Calc05 calc = new Calc05( "Poly-morphism" );
	calc.process( () -> {
		System.out.println( "関心事を記述" );


	Interface save = Calc05.create();
	save.execute();

	});

	}
}
