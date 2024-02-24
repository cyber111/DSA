package Comparable;

public class Mobile implements Comparable<Mobile> {
    private int mobileId;
    public int price;
    public int speed;

    public Mobile(int x, int price, int speed) {
        mobileId = x;
        this.price = price;
        this.speed = speed;
    }



    @Override
    public int compareTo(Mobile mobile) {
        int x = this.mobileId;
        int y = mobile.mobileId;
        if (x > y)
            return 1;
        if (x == y)
            return 0;
        return -1;

    }

    public int getMobile() {
        return this.mobileId;
    }

}
