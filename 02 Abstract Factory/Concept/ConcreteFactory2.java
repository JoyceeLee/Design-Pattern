
/**
 * Concrete Factory for product family 2
 * @author joycelee
 *
 */
public class ConcreteFactory2 extends AbstractFactory {
	@Override
	public AbstractProdA createProdA() {
		return new ProdA2();
	}
	@Override
	public AbstractProdB createProdB() {
		return new ProdB2();
	}
	
}
