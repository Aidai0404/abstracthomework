public class Main {
    public static void main(String[] args) {
       Cow cow1= new Cow(200,7,"female","Musya");
        Cow cow2= new Cow(315,2,"female","Musika");
        Cow cow3= new Cow(250,3,"male","Lulu");
        Cow cow4= new Cow(190,5,"female","Mu-Mu");
        Cow cow5= new Cow(185,1,"male","Sonya");
        Cow cow6= new Cow(230,4,"female","Musya");

       Horse horse1= new Horse(302,8,"male","Strasti");
        Horse horse2=new Horse(400,5,"female","Spirit");
        Horse horse3=new Horse(500,2,"male","Lana");

        Sheep sheep1=new Sheep(150,2,"male","Cutie");
        Sheep sheep2=new Sheep(100,1,"female","Sheepy");
        Sheep sheep3=new Sheep(155,3,"male","Me-Me");
        Sheep sheep4=new Sheep(160,2,"female","Knock-io");

       Farm farm1=new Farm("City: Ural \nStreet: NovoYasenka",new Cow[]{cow1,cow2,cow3,cow4,cow5},new Horse[]{horse1,horse2},new Sheep[]{sheep1,sheep2,sheep4},"Lyudmila");
       Farm farm2=new Farm("City: Pereslavl \nStreet: Tashkentskaya",new Cow[]{cow6},new Horse[]{horse3},new Sheep[]{sheep3},"Oleg");

        System.out.println(farm1);
        System.out.println("\n\n2."+farm2);
    }
}