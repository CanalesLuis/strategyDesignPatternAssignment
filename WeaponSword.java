/*
 * Inherits from Weapon Behavior
 * prints out the attack message when called
 * Currently used by the King class
 * 
 */
public class WeaponSword implements WeaponBehavior{
	
	public void attack()
	{
		System.out.println("Lunge and strike with sword");
	}
}
