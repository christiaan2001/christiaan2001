package au.edu.unsw.business.infs2605.ContactBook;

import java.io.IOException;
import javafx.fxml.FXML;

public class ContactBookController {

    @FXML
    private void switchToSecondary() throws IOException {
        App.setRoot("secondary");
    }
}
