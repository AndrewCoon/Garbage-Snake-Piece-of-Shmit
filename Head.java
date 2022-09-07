public class Head {
    int x, y, mSize;

    public Head(int mSize) {
        this.mSize = mSize;
        init();
    }

    public void init() {
        x = mSize / 2;
        y = mSize / 4;
    }
}
