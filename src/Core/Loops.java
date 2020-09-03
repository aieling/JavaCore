package Core;
/**
 * 
 */

/**
 * @author helenekev
 *
 */
public class Loops {
	public void breakApplied() {
		int i = 0;
		while(i < 20) {
			if(i == 15) {
				break;
			}
			System.out.print(i+" ");
			i++;
		}
		System.out.println();
	}
	
	public void displayOddSequences() {
		for(int i = 0; i < 20; i++) {
			if(i%2 == 0) {
				continue;
			}
			System.out.print(i+" ");
		}
		System.out.println();
	}
	
	public void multiple() {
		int i = 1;
		while(i<50625) {
			i = i*15;
			System.out.print(i+" ");
		}
	}
}
