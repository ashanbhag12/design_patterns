package creational.builder;

public class Sub {

	private final String bread;
	private final String vegetables;
	private final String sauce;
	private final String meat;
	private final String vegpatty;
	
	public static SubBuilder builder() {
		return new SubBuilder();
	}
	
	private Sub(SubBuilder builder) {
		this.bread = builder.bread;
		this.vegetables = builder.vegetables;
		this.sauce = builder.sauce;
		this.meat = builder.meat;
		this.vegpatty = builder.vegpatty;
	}
	
	public static class SubBuilder{
		private String bread = "";
		private String vegetables = "";
		private String sauce = "";
		private String meat = "";
		private String vegpatty = "";
		
		public SubBuilder bread(String bread) {
			this.bread = bread;
			return this;
		}
		
		public SubBuilder vegetables(String vegetables) {
			this.vegetables = vegetables;
			return this;
		}
		
		public SubBuilder sauce(String sauce) {
			this.sauce = sauce;
			return this;
		}
		
		public SubBuilder meat(String meat) {
			this.meat = meat;
			return this;
		}
		
		public SubBuilder vegpatty(String vegpatty) {
			this.vegpatty = vegpatty;
			return this;
		}
		
		public Sub build() {
			return new Sub(this);
		}
		
	}
	
	public String getBread() {
		return bread;
	}

	public String getVegetables() {
		return vegetables;
	}

	public String getSauce() {
		return sauce;
	}

	public String getMeat() {
		return meat;
	}

	public String getVegpatty() {
		return vegpatty;
	}

	@Override
	public String toString() {
		return "Sub [bread=" + bread + ", vegetables=" + vegetables + ", sauce=" + sauce + ", meat=" + meat
				+ ", vegpatty=" + vegpatty + "]";
	}
	
	
}
