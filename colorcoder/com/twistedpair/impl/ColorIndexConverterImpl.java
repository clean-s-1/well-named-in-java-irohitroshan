package colorcoder.com.twistedpair.impl;

public class ColorIndexConverterImpl {

    public static ColorIndexConverter fromIndex(int index,ColorIndexConverter[] colorIndexConverters) {
        return colorIndexConverters[index];
    }
}
