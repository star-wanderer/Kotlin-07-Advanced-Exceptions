package ru.netology

data class Post(
    val id: Int = 0x0000,
    val ownerId: Int = 0x0000,
    val fromId: Int = 0x0000,
    val createdBy: Int = 0x0000,
    val date: Int = (System.currentTimeMillis()/1000).toInt(),
    val text: String = "",
    val replyOwnerId: Int = 0x0000,
    val replyPostId: Int = 0x0000,
    val friendsOnly: Int = 0,
    val likes: Likes = Likes(),
    val comments: Comments = Comments(),
    val reposts: Reposts? = null,
    val postType: String = "post",
    val postSource: PostSource? = null,
    val geo: Geo? = null,
    val signerId: Int = 0x0000,
    val copyHistory: Array<Post>? = null,
    val canPin: Boolean = true,
    val canDelete: Boolean = true,
    val canEdit: Boolean = true,
    val isPinned: Boolean = false,
    val markedAsAdds: Boolean = false,
    val isFavorite: Boolean = false,
    val attachment: Array<Attachment> = emptyArray<Attachment>()
)