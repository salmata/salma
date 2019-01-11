package getternsetter;

/*getter and setter are two conventional methods
used for retrieving and updating value of a variable.
setter is a method that updates value of a variable.
getter is a method that reads value of a variable







*/
public class Account {
    private long acno;
    private String name;

    public Account (long acno, String name){
        super();
        this.acno=acno;
        this.name = name;
    }

    public long getAcno() {
        return acno;
    }

    public void setAcno(long acno) {
        this.acno = acno;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        System.out.println('N');

    }
}
