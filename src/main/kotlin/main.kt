fun main(args: Array<String>) {
    val video1: VideoAttachments = VideoAttachments(Video(1, "first video",
        11111111, "description for the video_1"))
    val video2: VideoAttachments = VideoAttachments(Video(2, "second video",
        22222222, "description for the video_2"))
    val video3: VideoAttachments = VideoAttachments(Video(3, "third video",
        33333333, "description for the video_3"))

    val audio1: AudioAttachments = AudioAttachments(Audio(4, "first audio",
        11111112, "description for audio"))

    val photo1: PhotoAttachments = PhotoAttachments(Photo(5, "first photo",
        11111155, "photo description"))

    val document1: DocumentAttachments = DocumentAttachments(Document(6, "first document",
        11111678, "document description"))

//    val comment1: CommentAttachments = CommentAttachments(Comment(6, "first comment",
//    11111663, "attachment comments"))


    val attachments = arrayOf(video1, video2, video3, audio1, photo1, document1)

    for(attachment in attachments) {
        println(attachment)
    }

}

