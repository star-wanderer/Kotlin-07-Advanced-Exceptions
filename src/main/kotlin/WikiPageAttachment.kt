package ru.netology

class WikiPageAttachment (
    override val type: String = "wikipage",
    val wikiPage: WikiPage = WikiPage()
): Attachment (type)

class WikiPage (
    var id: Int = 0x0000,
    var groupId: Int = 0x0000,
    var title: String = "enter new title here",
)