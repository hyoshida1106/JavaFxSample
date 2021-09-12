import javafx.application.Application
import javafx.fxml.FXMLLoader
import javafx.scene.Parent
import javafx.scene.Scene
import javafx.stage.Stage
import jfxtras.styles.jmetro.JMetro
import jfxtras.styles.jmetro.JMetroStyleClass
import jfxtras.styles.jmetro.Style

class Sample: Application() {

	override fun start(primaryStage: Stage) {
		val loader = FXMLLoader(javaClass.getResource("/Hello.fxml"))
		val root = loader.load() as Parent
		root.styleClass.add(JMetroStyleClass.BACKGROUND)

		val scene = Scene(root, 300.0, 250.0)
		val jmetro = JMetro(Style.LIGHT)
		jmetro.scene = scene
		loader.getController<Hello>()?.jMetro = jmetro

		primaryStage.title = "Hello, World!"
		primaryStage.scene = scene
		primaryStage.show()
	}
}

fun main(args: Array<String>) {
	Application.launch(Sample::class.java, *args)
}