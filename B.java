public class B extends A{
    private C c;
    public B(){
        super();
        this.c = new C();
    }

    public B(int x, int y, int c) {
        super(x, y);
        this.c = new C(c);
    }

    public B(B b){
        super((A) b);
        this.c = new C(b.c);
    }

    public String toString(){
        String info = "";
        info += super.toString();
        info += "c:\n" + c + "\n";
        return info;
    }
}