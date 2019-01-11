package Assoc;
 public class Association {
 String carName;
 int carId;
 Association(String name,int id)
 {
	 this.carName=name;
	this.carId=id;
	 
 }

}
class Driver extends Association{
	String driverName;
	Driver(String name,String cname,int cid){
		super(cname,cid);
		this.driverName=name;
	}
}
class TransportCompany{
	public static void main(String args[])
	{
		Driver obj=new Driver("SAI","ACCORD",1994);
		System.out.println(obj.driverName+"is a driver if car id: "+obj.carId);
	}
}
