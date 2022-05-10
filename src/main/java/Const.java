public enum Const {
    URLMAIN ("https://raw.githubusercontent.com/netology-code/jd-homeworks/master/http/task1/cats"),
    ;


    private String item;

    Const(String item) {
        this.item = item;
    }

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }
}
