import javax.swing.text.html.HTMLDocument;
import java.util.ArrayList;
import java.util.Iterator;

public class IteratorPart {

    public interface IteratableByUser{
        Iterator iterator(User userToSearchWith);
    }
    public class ChatHisory implements IteratableByUser{

        @Override
        public Iterator iterator(User userToSearchWith) {
            return null;
        }
    }

    public class User implements IteratableByUser{

        @Override
        public Iterator iterator(User userToSearchWith) {
            return null;
        }
    }

    public class searchMessagesByUser implements Iterator{


        @Override
        public boolean hasNext() {
            return false;
        }

        @Override
        public Object next() {
            return null;
        }
    }
}
