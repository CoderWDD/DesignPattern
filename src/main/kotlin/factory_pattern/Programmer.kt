package factory_pattern

// 实现 Worker 接口
class Programmer: Worker {
    override fun work() {
        println("I am a programmer. I am working.")
    }
}