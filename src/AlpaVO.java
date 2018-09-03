public class AlpaVO {
    char ch;
    int count;

    public AlpaVO(char ch) {
        this.ch = ch;
    }

    @Override
    public String toString() {
        return  ch +
                ": count=" + count ;
    }
}
