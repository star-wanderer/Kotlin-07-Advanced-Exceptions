package ru.netology

import org.junit.Test
import org.junit.Assert.*
import org.junit.Before

class WallServiceTest {

    @Before
    fun ClearBeforeTest(){
        WallService.clear()
    }

    @Test
    fun addNewPost() {

        // Arrange
        val postIdOfFirstPost = 0x0001
        // Act -> Adding first post to the Wall
        var myPost = WallService.add(Post(text = "This is my FIRST post"))
        // Assert -> Checking id of Post after adding it to the Wall
        assertTrue(myPost.id == postIdOfFirstPost)
    }

    @Test
    fun updateExistingPostSuccess() {

        // Arrange
        WallService.add(Post(text = "This is my FIRST post"))
        val myPost = WallService.add(Post(text = "This is my SECOND post"))
        WallService.add(Post(text = "This is my THIRD post"))

        // Act -> Adding third post to the Wall
        var postUpdatePassed = WallService.update(myPost.copy(text = "This is my SECOND post and there will be more" ))

        // Assert -> Checking existing post updates passed
        assertTrue(postUpdatePassed)
    }

    @Test
    fun updateNonExistingPostFailure() {

        // Arrange
        WallService.add(Post(text = "This is my FIRST post"))
        WallService.add(Post(text = "This is my SECOND post"))
        WallService.add(Post(text = "This is my THIRD post"))

        // Act -> Adding third post to the Wall
        var postUpdateFailed = WallService.update(Post(text = "This is my FOURTH post") )

        // Assert -> Checking non-existing post updates failed
        assertFalse(postUpdateFailed)
    }

    @Test
    fun checkVideoDurationWhen_LiveVideoOn() {

        // Arrange -> create video attachment
        val videoAttachment = VideoAttachment(video=Video(live = 1, duration = 0x64))

        // Act & Assert -> check duration
         assertEquals(0x00, videoAttachment.video.duration)
    }

    @Test
    fun checkVideoDurationWhen_LiveVideoOff() {

        // Arrange -> create video attachment
        val videoAttachment = VideoAttachment(video = Video(live = 0, duration = 0x64))

        // Act & Assert -> check duration
        assertEquals(0x64, videoAttachment.video.duration)
    }

    @Test
    fun checkVideoUpcomingWhen_LiveVideoOn() {

        // Arrange -> create video attachment
        val videoAttachment = VideoAttachment(video=Video(live = 1))

        // Act & Assert -> check upcoming value
        assertEquals(0x01, videoAttachment.video.upcoming)
    }

    @Test
    fun checkVideoUpcomingWhen_LiveVideoOff() {

        // Arrange -> create video attachment
        val videoAttachment = VideoAttachment(video=Video(live = 0))

        // Assert -> check upcoming value
        assertEquals(-0x01, videoAttachment.video.upcoming)
    }

    @Test
    fun checkSetWikiPageAttachmentProperty() {

        // Arrange -> create wiki page attachment
        val wikiPageAttachment = WikiPageAttachment()

        // Act & Assert -> check property
        assertEquals(true, wikiPageAttachment.wikiPage is WikiPage)
    }

    @Test
    fun checkPostAttachmentsQuantity() {

        // Arrange -> create wiki page attachment
        var post = Post(text = "Just a post with 4 attachments",
                        attachment = arrayOf(WikiPageAttachment(),VideoAttachment(),AudioAttachement(),NoteAttachment()))

        // Act & Assert -> check array size
        assertEquals(4, post.attachment.size)
    }
}