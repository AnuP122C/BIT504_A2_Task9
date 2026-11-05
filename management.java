import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;

public final class CelebrityManager {
    private final List<Celebrity> celebrities = new ArrayList<>();

    public void addCelebrity(Celebrity celebrity) {
        if (celebrity == null) {
            throw new IllegalArgumentException("Celebrity is required.");
        }
        celebrities.add(celebrity);
    }

    public List<Celebrity> getCelebrities() {
        return Collections.unmodifiableList(celebrities);
    }

