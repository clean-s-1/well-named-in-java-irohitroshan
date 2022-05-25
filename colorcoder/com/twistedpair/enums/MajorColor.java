package colorcoder.com.twistedpair.enums;

import colorcoder.com.twistedpair.impl.ColorIndexConverterImpl;
import colorcoder.com.twistedpair.impl.ColorIndexConverter;

public enum MajorColor implements ColorIndexConverter {

    WHITE(0),
    RED(1),
    BLACK(2),
    YELLOW(3),
    VIOLET(4);
    private int index;

    private MajorColor(int index) {
        this.index = index;
    }

    public int getIndex() {
        return index;
    }

    public static MajorColor fromIndex(int index) {
        return (MajorColor) ColorIndexConverterImpl.fromIndex(index, MajorColor.values());
    }

}
