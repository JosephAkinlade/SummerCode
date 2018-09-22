
public class logical {
	public static void main(String args[]) {
		int passcode=555;
		String coffeeType;
		switch(passcode) {
		case 555: coffeeType = "Espresso";
		break;
		case 312: coffeeType = "Vanilla latte";
		break;
		case 629: coffeeType = "Drip coffee";
		break;
		default: coffeeType = "unknown";
		break;
				
		}
		System.out.println(coffeeType);
		
				
	}


public void playMusic() {
	
	if(playButton) {
		System.out.println("music is playing!");
	}else {
		System.out.println("music is not playing");
	}
}
}
