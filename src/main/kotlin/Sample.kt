import javafx.application.Application
import javafx.scene.Scene
import javafx.stage.Stage
import jfxtras.styles.jmetro.JMetro
import jfxtras.styles.jmetro.Style

class Sample: Application() {
	override fun start(primaryStage: Stage) {
		val hello = HelloWindow()
		val scene = Scene(hello.root, 300.0, 250.0)

		val jMetro = JMetro(Style.LIGHT)
		jMetro.scene = scene
		hello.controller.jMetro = jMetro

		primaryStage.title = "Hello, World!"
		primaryStage.scene = scene
		primaryStage.show()
	}
}

fun main(args: Array<String>) {
	Application.launch(Sample::class.java, *args)
}