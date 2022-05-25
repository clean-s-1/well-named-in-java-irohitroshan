package colorcoder.com.twistedpair.pojo;

import colorcoder.com.twistedpair.enums.MajorColor;
import colorcoder.com.twistedpair.enums.MinorColor;

import static colorcoder.com.twistedpair.util.TwistedPairWireUtil.MajorColorNames;
import static colorcoder.com.twistedpair.util.TwistedPairWireUtil.MinorColorNames;

public class ColorPair
{
    private MajorColor majorColor;
    private MinorColor minorColor;

    public ColorPair(MajorColor major, MinorColor minor)
    {
        majorColor = major;
        minorColor = minor;
    }
    public MajorColor getMajor() {
        return majorColor;
    }
    public MinorColor getMinor() {
        return minorColor;
    }
    @Override
    public String toString() {
        String colorPairStr = MajorColorNames[majorColor.getIndex()];
        colorPairStr += " ";
        colorPairStr += MinorColorNames[minorColor.getIndex()];
        return colorPairStr;
    }
}
