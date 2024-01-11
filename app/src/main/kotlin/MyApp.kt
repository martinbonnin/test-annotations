fun main() {

    val clazz = MyLib::class.java

    clazz.declaredAnnotations.forEach {
        println("Annotation: $it")
    }
}