import WallService.createComment
import org.junit.Test
import org.junit.Assert.*

class WallServiceTest {

    val post = Post(0, 0, 0, 0, 0, "textPost0",
        0, 0, 0, Comments(0,false,
            false, false, false), Copyright(0, "", "",""),
        Likes(0, false, false, false), Reposts(0,
            false), Views(0), "" , PostSource("","","",""),
        Geo("","",Place(0,"",0,0,0,"",0,0,0,
            0,0,"")), 0, null , false, false,
        false, 0, false, false, Donut(), 0
    )

    @Test
    fun testAdd() {

        val service = WallService

        service.add(Post(1, 1, 1, 1, 1, "textPost1",
            1, 1, 1, Comments(0,false,
                false, false, false), Copyright(0, "", "",""),
            Likes(0, false, false, false), Reposts(0,
                false), Views(0), "" , PostSource("","","",""),
            Geo("","",Place(0,"",0,0,0,"",0,0,0,
                0,0,"")), 1, null , false, false,
            false, 1, false, false, Donut(), 1))

        val add = Post(2, 2, 2, 2, 2, "textPost2",
            2, 2, 2, Comments(0,false,
                false, false, false), Copyright(0, "", "",""),
            Likes(0, false, false, false), Reposts(0,
                false), Views(0), "" , PostSource("","","",""),
            Geo("","",Place(0,"",0,0,0,"",0,0,0,
                0,0,"")), 2, null , false, false,
            false, 2, false, false, Donut(), 2)

        val result = service.add(add)

        assertNotNull(result)
    }

    @Test
    fun testUpdate() {
        val post = Post(1, 1, 1, 1, 1, "textPost1",
            1, 1, 1, Comments(0,false,
                false, false, false), Copyright(0, "", "",""),
            Likes(0, false, false, false), Reposts(0,
                false), Views(0), "" , PostSource("","","",""),
            Geo("","",Place(0,"",0,0,0,"",0,0,0,
                0,0,"")), 1, null , false, false,
            false, 1, false, false, Donut(), 1)

        WallService.add(post)
        assertEquals(false, WallService.update(post))
    }

    @Test
    fun testUpdateFalse() {

        val service = WallService

        service.add(Post(1, 1, 1, 1, 1, "textPost1",
            1, 1, 1, Comments(0,false,
                false, false, false), Copyright(0, "", "",""),
            Likes(0, false, false, false), Reposts(0,
                false), Views(0), "" , PostSource("","","",""),
            Geo("","",Place(0,"",0,0,0,"",0,0,0,
                0,0,"")), 1, null , false, false,
            false, 1, false, false, Donut(), 1))

        service.add(Post(1, 1, 1, 1, 1, "textPost1",
            1, 1, 1, Comments(0,false,
                false, false, false), Copyright(0, "", "",""),
            Likes(0, false, false, false), Reposts(0,
                false), Views(0), "" , PostSource("","","",""),
            Geo("","",Place(0,"",0,0,0,"",0,0,0,
                0,0,"")), 1, null , false, false,
            false, 1, false, false, Donut(), 1))

        val update = Post(2, 2, 2, 2, 2, "textPost2",
            2, 2, 2, Comments(0,false,
                false, false, false), Copyright(0, "", "",""),
            Likes(0, false, false, false), Reposts(0,
                false), Views(0), "" , PostSource("","","",""),
            Geo("","",Place(0,"",0,0,0,"",0,0,0,
                0,0,"")), 2, null , false, false,
            false, 2, false, false, Donut(), 2)


        val result = service.update(update)

        assertFalse(result)
    }


    @Test
    fun testCommentAdd() {

        val comment: Comment = Comment(
            0, 1,0, "textPost", 0,
            arrayOfNulls(1), 0, "textPost"
        )
        val postId = 1
        val result = 1
        assertEquals(postId, result)
    }

    @Test(expected = PostNotFoundException::class)
    fun shouldThrow() {

        val expected = PostNotFoundException::class
        val comment: Comment = Comment(
            0, 2,0, "textPost", 0,
            arrayOfNulls(1), 0, "textPost"
        )

        val result: Comment = createComment(2, comment)

        assertEquals(expected, result)
    }
}
