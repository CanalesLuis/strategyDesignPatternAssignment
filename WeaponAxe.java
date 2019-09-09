/*
 * Implements from the WeaponBehavior interface
 * prints a message when attack is called.
 * Currently used by the Troll class
 * 
 */
public class WeaponAxe implements WeaponBehavior{
	
	public void attack()
	{
		System.out.println("Swing an axe");
	}
}
