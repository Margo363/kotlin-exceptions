import org.jetbrains.annotations.Nullable

data class Comment (
    @Nullable
    val ownerId: Int,
    val postId: Int,
    val fromGroup: Int = 0,
    val message: String,
    val replyToComment: Int?,
    var attachmentOfComment: Array<AttachmentsСommentAbstract?>,
    var stickerId: Int,
    val guid: String
)