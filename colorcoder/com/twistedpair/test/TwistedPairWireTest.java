package colorcoder.com.twistedpair.test;

import colorcoder.com.twistedpair.pojo.ColorPair;
import colorcoder.com.twistedpair.enums.MajorColor;
import colorcoder.com.twistedpair.enums.MinorColor;
import colorcoder.com.twistedpair.handler.TwistedPairWireHandler;

public class TwistedPairWireTest {

    public static void testNumberToPair(int pairNumber,
                                        MajorColor expectedMajor,
                                        MinorColor expectedMinor)
    {
        ColorPair colorPair = TwistedPairWireHandler.getColorFromPairNumber(pairNumber);
        System.out.println("Got pair " + colorPair.toString());
        assert(colorPair.getMajor() == expectedMajor);
        assert(colorPair.getMinor() == expectedMinor);
    }

    public static void testPairToNumber(
            MajorColor major,
            MinorColor minor,
            int expectedPairNumber)
    {
        int pairNumber = TwistedPairWireHandler.getPairNumberFromColor(major, minor);
        System.out.println("Got pair number " + pairNumber);
        assert(pairNumber == expectedPairNumber);
    }
}
