import javafx.fxml.FXML
import javafx.scene.control.Button

class Hello {
	@FXML private lateinit var greetButton: Button

	fun initialize() {
		greetButton.text = "Show"
		greetButton.setOnAction { _ -> println("Hello, World!") }
	}
}