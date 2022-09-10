import adapter_pattern.CustomerItemData
import adapter_pattern.ItemAdapter
import org.testng.annotations.Test

class AdapterPatternTest {
    @Test
    fun adapterTest(){
        val itemData = CustomerItemData(mTitle = "item 1", mImage = "image url 1")
        val adapter = ItemAdapter(itemData)
        println(adapter.getImage().imageDescription)
    }
}