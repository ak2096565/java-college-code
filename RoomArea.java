import java.util.*;
class Room{
	int l,w;
	Room(int l,int w){
		this.l = l;
		this.w=w;
	}
	void area(){
		System.out.println("The area of Room is "+(l*w));
	}
}
class RoomArea{
	public static void main(String args[]){
	Room obj1 = new Room(10,20);
	obj1.area();
	}
}