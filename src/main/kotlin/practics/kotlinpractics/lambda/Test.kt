package practics.kotlinpractics.lambda

import kotlin.random.Random


fun main() {
    val posts = listOf(
        InstagramPost(0, Picture(generateRandomData(256)), ::pictureDownLoader),
        InstagramPost(
            1, listOf(Picture(generateRandomData(256)), Picture(generateRandomData(256)))
        ) {picture ->
            picture
                .map( ::pictureDownLoader )
                .fold(byteArrayOf()) { acc, item -> acc + item }
        },
        InstagramPost(2, Video(generateRandomData(1024)), ::videoDownLoader )
    )
    println(posts)
    val downLoadedContent = posts.map { post -> post.download() }.map { it.size }
    println(downLoadedContent)
}
fun pictureDownLoader(pic: Picture): ByteArray = pic.data
fun videoDownLoader(video: Video): ByteArray = video.data

fun generateRandomData(length: Int): ByteArray = Random.nextBytes(length)
