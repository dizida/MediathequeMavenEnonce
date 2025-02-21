package mediatheque;

public class PrintOnlyCDVisitor implements Visitor{

    public void visit(CD cd) {
        System.out.println("CD : " + cd.getTitle());
   
    }

    public void visit(Book book) {
    }

}
