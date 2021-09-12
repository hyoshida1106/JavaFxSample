import javafx.application.Application
import javafx.fxml.FXMLLoader
import javafx.scene.Parent
import javafx.scene.Scene
import javafx.stage.Stage

class Sample: Application() {

	override fun start(primaryStage: Stage) {
		val loader = FXMLLoader(javaClass.getResource("/Hello.fxml"))
		val root = loader.load() as Parent
		primaryStage.title = "Hello, World!"
		primaryStage.scene = Scene(root, 300.0, 250.0)
		primaryStage.show()
	}
}

fun main(args: Array<String>) {
	Application.launch(Sample::class.java, *args)
}