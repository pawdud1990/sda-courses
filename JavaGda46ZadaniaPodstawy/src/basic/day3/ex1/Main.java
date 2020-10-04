package basic.day3.ex1;

public class Main {

    public static void main(String[] args) {
        Cat[] cats = new Cat[2];
        Cat cat1 = new Cat("Burek");
        Cat cat2 = new Cat("Filemon");
        cats[0] = cat1;
        cats[1] = cat2;

        int mouses = 10;
        for(Cat element : cats) {
            element.print();
            System.out.println(element.toString());
            element.makeSound();
            element.eatMouses(mouses++);
            System.out.println();
        }

/*        Cat cat3 = new Cat("Bonifacy");
        System.out.println(cat3.getName());
        cat3.setName("puszek");
        System.out.println(cat3.getName());*/
    }
}
