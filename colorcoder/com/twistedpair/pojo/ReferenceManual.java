package colorcoder.com.twistedpair.pojo;

public class ReferenceManual {

    private int pairNo;
    private String majorColor;
    private String minorColor;

    public int getPairNo() {
        return pairNo;
    }

    public void setPairNo(int pairNo) {
        this.pairNo = pairNo;
    }

    public String getMajorColor() {
        return majorColor;
    }

    public void setMajorColor(String majorColor) {
        this.majorColor = majorColor;
    }

    public String getMinorColor() {
        return minorColor;
    }

    public void setMinorColor(String minorColor) {
        this.minorColor = minorColor;
    }

    @Override
    public String toString() {
        return "{" +
                "pairNo=" + pairNo +
                ", majorColor='" + majorColor + '\'' +
                ", minorColor='" + minorColor + '\'' +
                '}';
    }
}
