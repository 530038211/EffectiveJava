package rule8;

/**
 * 类 编 号：
 * 类 名 称：
 * 内容摘要：equals重写的自反性
 * 创建日期：2018/2/28
 * @author ：huangchenliang
 */
public class Reflexive
{
    @Override
    public boolean equals(Object obj)
    {
        return obj == this;
    }
//  自反性    
//  @Override
//  public boolean equals(Object obj)
//  {
//      return obj != this;
//  }
}
