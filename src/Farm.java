import java.util.Arrays;

public class Farm {
    protected String address;
    protected Cow [] cows;
    protected Horse[] horses;
    protected Sheep[] sheep;
    protected String ownerName;

    public Farm(String address,Cow[] cows,Horse[] horses,Sheep[] sheep,String  ownerName) {
        this.address = address;
        this.cows=cows;
        this.horses=horses;
        this.sheep=sheep;
        this.ownerName=ownerName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Cow[] getCows() {
        return cows;
    }

    public void setCows(Cow[] cows) {
        this.cows = cows;
    }

    public Horse[] getHorses() {
        return horses;
    }

    public void setHorses(Horse[] horses) {
        this.horses = horses;
    }

    public Sheep[] getSheep() {
        return sheep;
    }

    public void setSheep(Sheep[] sheep) {
        this.sheep = sheep;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    @Override
    public String toString() {
        return "Farm: " +
                "address: " + address  +
                "\ncows: " + Arrays.toString(cows) +
                "\nhorses: \n" + Arrays.toString(horses) +
                "\nsheep: \n" + Arrays.toString(sheep) +
                "\nowner's name: " + ownerName;
    }
}
