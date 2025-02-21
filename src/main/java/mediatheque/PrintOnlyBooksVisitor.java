package mediatheque;

public class PrintOnlyBooksVisitor implements Visitor {

    public void visit(Book book) {
        System.out.println("Livre : " + book.getTitle());
    }

    public void visit(CD cd) {
    }

}
