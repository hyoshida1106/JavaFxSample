import javafx.application.Application
import javafx.event.EventHandler
import javafx.scene.Scene
import javafx.scene.control.Button
import javafx.scene.layout.StackPane
import javafx.stage.Stage

class Sample: Application() {
	override fun start(primaryStage: Stage) {
		val greet = "Hello, World!"
		val btn = Button()
		btn.text = "Say $greet"
		btn.onAction = EventHandler { println(greet) }
		val root = StackPane()
		root.children.add(btn)
		val scene = Scene(root, 300.0, 250.0)
		primaryStage.title = greet
		primaryStage.scene = scene
		primaryStage.show()
	}
}

fun main(args: Array<String>) {
	Application.launch(Sample::class.java, *args)
}