import factory_pattern.JobCategory
import factory_pattern.WorkerFactory
import org.junit.Test

class FactoryPatternTest {
    @Test
    /*
    output:
        I am a cleaner. I am working.
        I am a programmer. I am working.
        I am a manager. I am working.
     */
    fun factoryTest(){
        val workerFactory = WorkerFactory()
        // 通过工厂，用不同的参数，获取不同的对象，而不关心对象是创建细节，只关心其具有的功能
        val cleaner = workerFactory.getWork(JobCategory.Cleaner)
        cleaner.work()

        val programmer = workerFactory.getWork(JobCategory.Programmer)
        programmer.work()

        val manager = workerFactory.getWork(JobCategory.Manager)
        manager.work()
    }
}