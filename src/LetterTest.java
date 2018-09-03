import java.util.Arrays;

public class LetterTest {


        AlpaVO[] arr = new AlpaVO[26];


        char[] chArr; //str.toCharArray();

    public LetterTest(String str) {

        this.chArr = str.toCharArray();


        for(int i=0;i<arr.length;i++){
            arr[i]=new AlpaVO((char)(i+65));
        }

    }
    public void alpaCount() {
        for (int i = 0; i < chArr.length; i++) {
            int value = (int) chArr[i];
            if (value >= 65 && value <= 90) {

                arr[value - 65].count++;
            }
        }
    }
    public void sortAlpa(){
        Arrays.sort(arr,(x1,x2)->x2.count-x1.count);

    }

    @Override
    public String toString() {
        return  Arrays.toString(arr);
    }
}
