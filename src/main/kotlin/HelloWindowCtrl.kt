import javafx.fxml.FXML
import javafx.scene.control.Button
import jfxtras.styles.jmetro.JMetro
import jfxtras.styles.jmetro.Style

class HelloWindowCtrl: BaseWindowCtrl() {
	@FXML private lateinit var greetButton: Button
	var jMetro: JMetro? = null

	fun initialize() {
		greetButton.text = "Dark Mode"
		greetButton.setOnAction { _ -> jMetro?.style = Style.DARK }
	}
}