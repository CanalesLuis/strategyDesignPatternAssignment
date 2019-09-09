/* @author Luis Canales
 * When WeaponBehavior is set to none
 * prints this message
 */
public class WeaponNone implements WeaponBehavior{
	
	public void attack()
	{
		System.out.println("Oh no! I lost my weapon");
	}
}
