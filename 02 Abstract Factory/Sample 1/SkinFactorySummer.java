
public class SkinFactorySummer implements SkinFactory {
	@Override
	public Button createButton() {
		return new SummerButton();
	}
	
	@Override
	public Button createTextField() {
		return new SummerTextField();
	}
}
