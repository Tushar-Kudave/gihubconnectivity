package AllPrograms;

interface Moveable
{
  public void run();
}
interface Speakable
{
  public void speak();
}

interface Ability extends Moveable, Speakable
{
  public void show();
}
public class interfaceConcept implements Ability{

	@Override
	  public void run()
	  {
	    System.out.println("I can run !!");
	  }
	  @Override
	  public void speak()
	  {
	    System.out.println("I can speak !!");
	  }
	  @Override
	  public void show() 
	  {
	    System.out.println("I am a person, I can speak and run !!");
	  }
	public static void main(String[] args) {
		interfaceConcept obj = new interfaceConcept ();
	    obj.run();
	    obj.speak();
	    obj.show();
	}

}
