public class Cow extends Animals{
    public Cow(int weight, int age, String gender, String nickName) {
        super(weight, age, gender, nickName);
    }

    @Override
    public String toString() {
        return "\nCow: " +
                "\nNickname: " + nickName +
                 "\nAge: "+ age+
                "\nGender: "+gender+
                "\nWeight: "+weight;
    }
}
