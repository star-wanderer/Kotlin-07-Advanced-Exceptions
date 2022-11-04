package ru.netology

object WallService {
    private var posts = emptyArray<Post>()

    fun clear(){
        posts = emptyArray()
    }

    fun add(post: Post): Post {
        posts += post.copy(id =  if (posts.isEmpty()) 0x0001 else posts.last().id + 1 )
        return posts.last()
    }

    fun update(post: Post): Boolean {
        for ((index,postOnWall) in posts.withIndex()){
            if (postOnWall.id == post.id) {
                posts[index] = posts[index].copy( id = post.id,
                                                  ownerId = post.ownerId,
                                                  // fromId  -> Excluding as per task
                                                  // createdBy -> Excluding as per task
                                                  // date -> Excluding as per task
                                                  text = post.text,
                                                  replyOwnerId = post.replyOwnerId,
                                                  replyPostId = post.replyPostId,
                                                  friendsOnly = post.friendsOnly,
                                                  likes = post.likes,
                                                  comments = post.comments)
                return true
            }
        }
        return false
    }
}