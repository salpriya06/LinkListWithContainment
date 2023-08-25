public class Main {
    public static void main(String[] args) {

        LinkList llt = new LinkList();

        llt.add(10);
        llt.add(20);
        llt.add(30);
        llt.add(40);
        llt.add(50);

        System.out.println();

        llt.addfromfirst(0);
        llt.display();

        llt.addOnposition(70,4);

        System.out.println();

        llt.display();

}
}
