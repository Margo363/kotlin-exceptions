object WallService {
    var posts = emptyArray<Post>()
    var comments = emptyArray<Comment>()

    fun add(post: Post): Post {
        posts += post.copy(id = posts.size)
        return posts.last()
    }

    fun update(post: Post): Boolean {

        for((index, post) in posts.withIndex()) {
            var id = null
            if(post.id == id) {
                val nextPost = post.copy(id = post.id, date = post.date)
                posts[index] = nextPost
                return true
            }
        }
        return false
    }

    fun createComment(postId: Int, comment: Comment): Comment {
        for ((index, post) in posts.withIndex()) {
            if (post.id == comment.postId) {
                comments += comment.copy(message = comment.message)
                return comments.last()
            }
        }
        throw PostNotFoundException("Пост с данным id не существует!")
    }
}

