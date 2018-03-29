package rule9;

import java.util.HashSet;
import java.util.Objects;

/**
 * 类 编 号：
 * 类 名 称：CoverHashCode
 * 内容摘要：覆盖hashCode
 * 创建日期：2018/3/1
 * @author ：huangchenliang
 */
public class CoverHashCode
{
    private final short areaCode;

    private final short prefix;

    private final short lineNumber;

    public CoverHashCode(int areaCode, int prefix, int lineNumber)
    {
        this.areaCode = (short)areaCode;
        this.prefix = (short)prefix;
        this.lineNumber = (short)lineNumber;
    }

    @Override
    public boolean equals(Object obj)
    {
        if(null == obj)
        {
            return false;
        }
        if(obj.getClass() != this.getClass())
        {
            return false;
        }
        CoverHashCode c = (CoverHashCode)obj;
        return c.areaCode == areaCode && c.lineNumber == lineNumber && c.prefix == prefix;
    }

}

class CoverHashCode1
{
    private final short areaCode;

    private final short prefix;

    private final short lineNumber;

    public CoverHashCode1(int areaCode, int prefix, int lineNumber)
    {
        this.areaCode = (short)areaCode;
        this.prefix = (short)prefix;
        this.lineNumber = (short)lineNumber;
    }

    @Override
    public int hashCode()
    {
        return Objects.hash(areaCode, prefix, lineNumber);
    }
}

class CoverHashCode2
{
    private final short areaCode;

    private final short prefix;

    private final short lineNumber;

    public CoverHashCode2(int areaCode, int prefix, int lineNumber)
    {
        this.areaCode = (short)areaCode;
        this.prefix = (short)prefix;
        this.lineNumber = (short)lineNumber;
    }

    @Override
    public boolean equals(Object obj)
    {
        if(null == obj)
        {
            return false;
        }
        if(obj.getClass() != this.getClass())
        {
            return false;
        }
        CoverHashCode2 c = (CoverHashCode2)obj;
        return c.areaCode == areaCode && c.lineNumber == lineNumber && c.prefix == prefix && c.hashCode() == obj.hashCode();
    }

    @Override
    public int hashCode()
    {
        return Objects.hash(areaCode, prefix, lineNumber);
    }
}