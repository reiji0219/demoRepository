package demo;

import umejava_05_01.Interface;

public class Test_07_17_job 
{
	public static void main( String[] args )
	{
		Calc17 calc = new Calc17( "Poly-morphism" );
		calc.process( () -> {
			System.out.println( "関心事を記述" );

			Interface save = Calc17.create();
				save.execute();


		});

	}
}

