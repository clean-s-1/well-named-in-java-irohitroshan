package colorcoder.com.twistedpair.enums;

import colorcoder.com.twistedpair.impl.ColorIndexConverterImpl;
import colorcoder.com.twistedpair.impl.ColorIndexConverter;

public enum MinorColor implements ColorIndexConverter {
    BLUE(0),
    ORANGE(1),
    GREEN(2),
    BROWN(3),
    SLATE(4);
    private int index;

    private MinorColor(int index) {
        this.index = index;
    }

    public int getIndex() {
        return index;
    }

    public static MinorColor fromIndex(int index) {
        return (MinorColor) ColorIndexConverterImpl.fromIndex(index, MinorColor.values());
    }
}
