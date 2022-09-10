package adapter_pattern

class ItemAdapter constructor(itemDate: CustomerItemData): ListItem {
    private var mTitle: String
    private var mImage: ImageData
    override fun getTitle() = mTitle

    override fun getImage() = mImage

    init {
        mTitle = itemDate.mTitle
        mImage = ImageData(itemDate.mImage)
    }
}