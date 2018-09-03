public class AlpaCountUI {

    LetterTest letterTest;

    public AlpaCountUI(LetterTest letterTest) {
        this.letterTest = letterTest;
    }

    public void showAlpa(){
        letterTest.sortAlpa();

        System.out.println(letterTest);
    }
}
