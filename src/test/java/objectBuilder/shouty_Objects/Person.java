package objectBuilder.shouty_Objects;

import java.util.ArrayList;
import java.util.List;

public class Person {
    public void moveTo(int distance) {
    }

    public void shout(String message) {
    }

    public List<String> getMessagesHeard() {
        List<String> result = new ArrayList<String>();
        result.add("free bagels at Sean's");
        return result;
    }
}
