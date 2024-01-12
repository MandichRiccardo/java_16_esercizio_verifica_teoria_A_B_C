public class C{
    private int x;
    public C(){
        this.x = 0;
    }

    public C(int a) {
        this.x = a;
    }

    public C(C c){
        this.x = c.x;
    }

    public String toString(){
        String info = "";
        info += "\tx:\t" + x + "\n";
        return info;
    }
}