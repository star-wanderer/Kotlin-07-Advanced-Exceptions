package ru.netology

import kotlin.math.abs

class NoteAttachment (
    override val type: String = "note",
    val note: Note = Note()
): Attachment (type)

class Note (
    id: Int = 0x0000,
    userId: Int = 0x0000,
    var title: String = "enter title here",
    var text: String = "enter text here",
    date: Int = 0,
    comments: Int = 0,
    val readComments: Int = 0
) {
    var id: Int = abs(id)
        set (value) {
            field = abs(value)
        }
    var userId: Int = abs(userId)
        set (value) {
            field = abs(value)
        }
    var date: Int = abs(date)
        set (value) {
            field = abs(value)
        }
    var comments: Int = abs(comments)
        set (value) {
            field = abs(value)
        }
}
