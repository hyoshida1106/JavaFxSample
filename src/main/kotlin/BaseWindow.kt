import javafx.fxml.FXMLLoader
import javafx.scene.Parent
import jfxtras.styles.jmetro.JMetroStyleClass

open class BaseWindow<Controller>(formPath: String)
		where Controller: BaseWindowCtrl {
	val root: Parent
	val controller: Controller

	init {
		val loader = FXMLLoader(javaClass.getResource(formPath))
		root = loader.load()
		root.styleClass.add(JMetroStyleClass.BACKGROUND)
		controller = loader.getController() as Controller
	}
}