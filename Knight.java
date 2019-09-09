/*
 * Inherits from Character and takes in name
 * sets weapon behavior to Bow for all knights
 * 
 */
public class Knight extends Character{
	
	public Knight(String name)
	{
		super(name);
		weaponBehavior = new WeaponBow();
	}
	
	public void display()
	{
		System.out.println(name+" is a valiant knight");
	}
}
