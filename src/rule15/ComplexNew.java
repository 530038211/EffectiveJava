package rule15;
/**
 * 静态工厂模式实现域的不可访问
 * @author Use
 *
 */
public class ComplexNew {
    private double re;
    private ComplexNew(){}
    private ComplexNew(double re){
    	this.re = re;
    }
    public static ComplexNew valueOf(double re){
    	return new ComplexNew(re);
    }
}
