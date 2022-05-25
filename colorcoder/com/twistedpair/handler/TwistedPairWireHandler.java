package colorcoder.com.twistedpair.handler;

import colorcoder.com.twistedpair.pojo.ColorPair;
import colorcoder.com.twistedpair.enums.MajorColor;
import colorcoder.com.twistedpair.enums.MinorColor;
import colorcoder.com.twistedpair.pojo.ReferenceManual;
import colorcoder.com.twistedpair.util.TwistedPairWireUtil;

public class TwistedPairWireHandler {

    private static int numberOfMinorColors = TwistedPairWireUtil.numberOfMinorColors;

    public static ColorPair getColorFromPairNumber(int pairNumber) {
        int zeroBasedPairNumber = pairNumber - 1;
        MajorColor majorColor =
                MajorColor.fromIndex(zeroBasedPairNumber / numberOfMinorColors);
        MinorColor minorColor =
                MinorColor.fromIndex(zeroBasedPairNumber % numberOfMinorColors);
        return new ColorPair(majorColor, minorColor);
    }
    public static int getPairNumberFromColor(MajorColor major, MinorColor minor) {
        return major.getIndex() * numberOfMinorColors + minor.getIndex() + 1;
    }

    public static void generateColorCodeRefManual(){
        System.out.println("--------- Reference Manual for Wire Pair -----------");
        ReferenceManual referenceManual = new ReferenceManual();
        int pairNo =0;
        for(String majorColor : TwistedPairWireUtil.MajorColorNames){
            ++pairNo;
            for(String minorColor : TwistedPairWireUtil.MinorColorNames){
                referenceManual.setPairNo(pairNo);
                referenceManual.setMajorColor(majorColor);
                referenceManual.setMinorColor(minorColor);
                System.out.println(referenceManual);
            }
        }

    }
}
