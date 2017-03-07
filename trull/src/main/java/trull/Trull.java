package trull;

public class Trull implements ITrull {

	private TrullState resolver;
	
	public Trull(){
		resolver = ResolverFactory.getResolver();
	}
	
	public Boolean getTrull() {
		return resolver.getTrull();
	}

	public static void main(String[] args) {
		while (true) {
			Trull myTrull = new Trull();
			System.out.println(myTrull.getTrull());
		}
	}
}
