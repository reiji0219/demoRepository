package demo;

import umejava_05_01.Interface;

public class Test_07_18_job 
{
	public static void main( String[] args )
	{
		Calc18 calc = new Calc18( "Poly-morphism" );
		calc.process( () -> {
			System.out.println( "関心事を記述" );

			Interface save = Calc18.create();
				save.execute();

		});
	}
}

