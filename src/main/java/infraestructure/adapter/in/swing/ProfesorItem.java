package infraestructure.adapter.in.swing;

/**
 *
 * @author lm-carlos
 */
public class ProfesorItem {

    private final String id;
    private final String displayText;

    public ProfesorItem(String id, String displayText) {
        this.id = id;
        this.displayText = displayText;
    }

    public String getId() {
        return id;
    }

    @Override
    public String toString() {
        return displayText;
    }

}
