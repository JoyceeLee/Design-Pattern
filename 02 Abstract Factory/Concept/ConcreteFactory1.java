
/**
 * Concrete Factory for product family 1
 * @author joycelee
 *
 */
public class ConcreteFactory1 extends AbstractFactory {
	@Override
	public AbstractProdA createProdA() {
		return new ProdA1();
	}
	@Override
	public AbstractProdB createProdB() {
		return new ProdB1();
	}
}