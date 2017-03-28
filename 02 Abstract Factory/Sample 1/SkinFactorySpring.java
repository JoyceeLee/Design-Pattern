
public class SkinFactorySpring implements SkinFactory {
	@Override
	public Button createButton() {
		return new SpringButton();
	}
	
	@Override
	public Button createTextField() {
		return new SpringTextField();
	}
}
