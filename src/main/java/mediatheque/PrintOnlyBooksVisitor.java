package mediatheque;

public class PrintOnlyBooksVisitor implements Visitor {

    public void visit(Book book) {
        System.out.println("Book : " + book.getTitle());
    }

    public void visit(CD cd) {
    }

}
