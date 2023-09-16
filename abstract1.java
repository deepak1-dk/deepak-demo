abstract class Animal
{
	abstract void sound();
}
class Lion extends Animal
{
	public void sound()
	{
		System.out.println("Lion is te king of forest");
	}
	public static void main(String st[])
	{
		Lion obj - new Lion();
		obj.sound();
	}
}
	