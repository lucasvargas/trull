package trull;

public class ResolverFactory {

	public static TrullState getResolver() {
		// nanoservice must use system nano time
		Boolean trueOrNull = System.nanoTime() % 2 == 0; 
		return (trueOrNull)? new TrullTrue(): new TrullNull();
	}
}
