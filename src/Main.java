public class Main {

    public static void main(String[] args) {

        String str;

        DataLoader dataLoader=new DataLoader();
        str=dataLoader.loadData("C:\\zzz\\노인과바다.txt");

        LetterTest letterTest=new LetterTest(str);
        letterTest.alpaCount();


        AlpaCountUI alpaCountUI=new AlpaCountUI(letterTest);
        alpaCountUI.showAlpa();
    }
}
