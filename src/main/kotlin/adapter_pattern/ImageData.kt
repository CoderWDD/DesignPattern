package adapter_pattern

class ImageData constructor(imageURL: String) {
    var imageUrl: String
    var imageDescription: String

    init {
        imageUrl = imageURL
        imageDescription = "the image url is $imageUrl"
    }
}
