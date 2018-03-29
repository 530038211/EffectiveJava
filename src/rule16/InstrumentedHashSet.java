package rule16;

import java.io.Serializable;
import java.util.Collection;
import java.util.HashSet;
/**
 * cloneAble接口没有方法 所以不用实现，如果实现其方法可能会出现一些问题
 *
 */
public class InstrumentedHashSet<E> extends HashSet<E> implements Cloneable,Serializable{

	private int addCount ;
	
	private static final long serialVersionUID = -3802135012327981254L;

	@Override
	public boolean addAll(Collection<? extends E> c) {
		addCount += c.size();
		//调用父类方法 
		return super.addAll(c);
	}
	
	public int getAddCount(){
		return addCount;
	}
	
}
