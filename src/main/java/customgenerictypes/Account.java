package customgenerictypes;

public class Account {
    private int id;
    private int sum;

    public Account(int id, int sum){
        this.id = id;
        this.sum = sum;
    }

    @Override
    public String toString() {
        return "Account{" +
                "id=" + id +
                ", sum=" + sum +
                '}';
    }

    public int getId() {
        return id;
    }

    public int getSum() {
        return sum;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setSum(int sum) {
        this.sum = sum;
    }

}
