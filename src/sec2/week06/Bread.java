package sec2.week06;

public class Bread {
    private String flourType;
    private boolean isSliced;
    private int sliceCount;

    public Bread() {
        this("wheat", false);
        System.out.println("default constructor");
//        Bread b = new Bread("wheat", false);
//        flourType = "wheat";
//        isSliced = false;
//        sliceCount = 1;
    }

    public Bread(String flourType, boolean isSliced) {
        System.out.println("parameterized constructor");
        this.flourType = flourType;
        this.isSliced = isSliced;
        if(isSliced) {
            sliceCount = 12;
        } else {
            sliceCount = 1;
        }
    }

    public void slice() {
        if(isSliced) {
            return;
        }
        isSliced = true;
        sliceCount = 12;
    }

    public String getFlourType() {
        return this.flourType;
    }

    public boolean isSliced() {
        return isSliced;
    }

    public int getSliceCount() {
        return sliceCount;
    }

}
