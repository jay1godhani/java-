class Box{
	double width,height,length;
}



class MyBox {

	public static void main(String[] args) {
		double vol;
		Box mybox=new Box();
		mybox.width=10;
		mybox.height=20;
		mybox.length=15;
		
		vol=mybox.width*mybox.height*mybox.length;
		System.out.println("Volume is "+vol);
		

	}

}


