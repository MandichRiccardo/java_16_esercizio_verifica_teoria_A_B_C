public class A{
    private int x;
    private int y;
    private C c;

    public void setX(int x){
        this.x = x;
    }

    public A() {
        this.x = 0;
        this.y = 0;
        this.c = new C();
    }

    public A(int x, int y) {
        this.x = x;
        this.y = y;
        this.c = new C(3);
    }
    public A(A a){
        this.x = a.x;
        this.y = a.y;
        this.c = new C(a.c);
    }

    public String toString() {
        String info = "";
        info += "x:\t" + x + "\n";
        info += "y:\t" + y + "\n";
        info += "c:\n" + c + "\n";
        return info;
    }
}