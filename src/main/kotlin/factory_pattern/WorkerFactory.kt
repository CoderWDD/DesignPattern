package factory_pattern

class WorkerFactory {
    fun getWork(jobCategory: JobCategory): Worker{
        return when (jobCategory){
            is JobCategory.Cleaner -> Cleaner()
            is JobCategory.Manager -> Manager()
            is JobCategory.Programmer -> Programmer()
        }
    }
}

sealed class JobCategory{
    object Programmer : JobCategory()
    object Manager : JobCategory()
    object Cleaner : JobCategory()
}