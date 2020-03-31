package creational.builder;

public class SubBuilderTest {

	public static void main(String[] args) {
		
		Sub.SubBuilder builder = Sub.builder();
		Sub tunaSub = builder.bread("Wheat").vegetables("Lettuce,Olives,Tomato").sauce("Mayo,Southwest").meat("Tuna").build();
		
		System.out.println(tunaSub);
		
		builder = Sub.builder();
		Sub alooTikkiSub = builder.bread("Oats").vegetables("Lettuce,Pickles,Onion").sauce("Chilli,Mustard").meat("AlooTikki").build();
		
		System.out.println(alooTikkiSub);
	}

}
