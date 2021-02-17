interface Tour{
	int planNo=23;
	void cost();
	void travelMode();
}

 class Pondicherry implements Tour{
	int planNo=1;
	int money=2300;
	@Override
	public void cost(){
		System.out.println("Cost of Plan no " +planNo+" Pondi alone is Rs" +money);

	}
	public void travelMode(){
	}
}
class PondiChennai extends Pondicherry{
	int planNo=2;
	public void cost(int money){
		System.out.println("Cost of Plan no " +planNo+" Pondi and Chennai is Rs" +money);

	}
}
class Tourism{
	public static void main(String[] args){
		Tour []refs = new Tour[2]; //Works

		refs[0] = new Pondicherry(); // IS- A -> Tour

		refs[1] = new PondiChennai(); // IS- A -> Tour
	

		for(Tour ref : refs){
			ref.cost();
			if(ref instanceof PondiChennai)
				((PondiChennai)ref).cost(4500);
			}
		}
	}
