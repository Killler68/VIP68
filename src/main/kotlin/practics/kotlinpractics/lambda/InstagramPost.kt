package practics.kotlinpractics.lambda

import SOLID.D.classes.ImageDownloader

class InstagramPost<T>(val id: Long, val content: T, val downloader: (T) -> ByteArray) {
    override fun toString(): String {
        return "InstagramPost(id=$id, content=$content)"
    }
    fun download(): ByteArray = downloader(content)

}