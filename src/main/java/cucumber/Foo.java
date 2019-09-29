package cucumber;

public class Foo {
    private int id;
    private String name;
    private double rate;
    private String sign;
    private boolean flag;

//    public Foo() {
//    }

    public Foo(int id, String name, double rate, String sign, boolean flag) {
        this.id = id;
        this.name = name;
        this.rate = rate;
        this.sign = sign;
        this.flag = flag;
    }

    public int getID() {
        return id;
    }

    public void setID(int ID) {
        this.id = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public String getSign() {
        return sign;
    }

    public void setSign(String sign) {
        this.sign = sign;
    }

    public boolean isFlag() {
        return flag;
    }

    public void setFlag(boolean flag) {
        this.flag = flag;
    }

    @Override
    public String toString() {
        return "cucumber.Foo{" +
                "ID=" + id +
                ", name='" + name + '\'' +
                ", rate=" + rate +
                ", sign='" + sign + '\'' +
                ", flag=" + flag +
                '}';
    }
}
