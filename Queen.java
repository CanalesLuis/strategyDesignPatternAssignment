/*
 * Inherits from Character and takes in name
 * sets weapon behavior to Knife for all Queens
 * 
 */
public class Queen extends Character{
	
	public Queen(String name)
	{
		super(name);
		weaponBehavior = new WeaponKnife();
	}
	
	public void display()
	{
		System.out.println(name+" is a beautiful queen");
	}
}
