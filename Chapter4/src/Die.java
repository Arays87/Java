/*Antoni severini, Die.java, 12/18/15
 *class to create dice objects*/
public class Die {
	//hold value 1-6
	int value;
	//set high/low values for generating #
	final int HIGHEST_DIE_VALUE = 6, LOWEST_DIE_VALUE = 1;
	//constructor to create die
	public int getValue() {
		int randomValue = ((int)(Math.random() * 100) % HIGHEST_DIE_VALUE +
				LOWEST_DIE_VALUE);
		return randomValue;
	}
	public void setValue(int value) {
		this.value = value;
	}

}
