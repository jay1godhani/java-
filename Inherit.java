
class Room
{
	int length,width;
	Room(int x,int y)
	{
		length=x;
		width=y;
	}
	int area()
	{
		return length*width;
	}
}
   
class LivingRoom extends Room
{
	 int height;
	 LivingRoom(int x,int y,int a)
	 {
		 super(x,y);
		 height=a;
	 }
	 int vol()
	 {
		 return(length*width*height);
		 
	 }
}
public class Inherit
{

	public static void main(String args[])
	{
		LivingRoom lr=new LivingRoom(12,14,16);
		int area1=lr.area();
		System.out.println("Area of Room is" + area1);
		int vol1=lr.vol();
		System.out.println("Volume of living room is"+ vol1);

	}

}
