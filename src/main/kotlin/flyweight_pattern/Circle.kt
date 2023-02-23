package flyweight_pattern

class Circle(private val radius: Int): Shape {
    override fun draw(x: Int, y: Int, color: String) {
        println("Drawing Circle of radius $radius at ($x, $y) in color $color")
    }
}