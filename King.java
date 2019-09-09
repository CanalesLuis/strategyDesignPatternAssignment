/*
 * Inherits from Character and takes in name
 * sets weapon behavior to sword for all kings
 * 
 */
public class King extends Character{
	
	public King(String name)
	{
		super(name);
		weaponBehavior = new WeaponSword();
	}
	
	public void display()
	{
		System.out.println(name+" is a Noble King");
	}
}
