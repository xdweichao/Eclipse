package application;

public class _Driver {

	public static void main(String[] args) {
//crtl shift o to organize
		
		String mode= "lettergrade"; //
		Float score = 92f;
		String display = GradeResource.get(mode, score, String.class);
		System.out.println(display);
		
		
	}


}
