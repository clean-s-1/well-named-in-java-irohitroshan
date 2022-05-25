package colorcoder;

import colorcoder.com.twistedpair.enums.MajorColor;
import colorcoder.com.twistedpair.enums.MinorColor;
import colorcoder.com.twistedpair.handler.TwistedPairWireHandler;
import colorcoder.com.twistedpair.test.TwistedPairWireTest;

public class TwistedPairWire {


    public static void main(String[] args) {
        TwistedPairWireTest.testNumberToPair(4, MajorColor.WHITE, MinorColor.BROWN);
        TwistedPairWireTest.testNumberToPair(5, MajorColor.WHITE, MinorColor.SLATE);

        TwistedPairWireTest.testPairToNumber(MajorColor.BLACK, MinorColor.ORANGE, 12);
        TwistedPairWireTest.testPairToNumber(MajorColor.VIOLET, MinorColor.SLATE, 25);
        TwistedPairWireHandler.generateColorCodeRefManual();
    }
}
