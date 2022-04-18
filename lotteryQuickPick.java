import java.util.Arrays;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class lotteryQuickPick {
private int intTotalNumbers;
private int intTotalPicks;
private int[] iArrayQuickPicks;

	public lotteryQuickPick(int intTotalNumbers, int intTotalPicks) {
		
		this.intTotalNumbers = intTotalNumbers;
		this.intTotalPicks = intTotalPicks;
		
	}
	
	private void intializeArray() {
		
		iArrayQuickPicks = new int[intTotalPicks];
		
	}
	
	private int getNumber() {
		
		return  1 + (int) (Math.random() * intTotalPicks);
		
	}
	
	private boolean numberUsed(int intInNumber) {
		
		return false;
		
	}

	public int[] getQuickPicks() {
		
		
		intializeArray();
		for(int iNumber = 0; iNumber < iArrayQuickPicks.length; iNumber++) {
			
			int iNbrPick = getNumber();
			numberUsed(intTotalNumbers);
			iArrayQuickPicks[iNumber] = iNbrPick;
			
			
		}
		
		java.util.Arrays.sort(iArrayQuickPicks);
		return iArrayQuickPicks;
		
	}

}
