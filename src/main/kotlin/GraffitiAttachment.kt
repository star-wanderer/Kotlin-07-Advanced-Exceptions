package ru.netology

class GraffitiAttachment (
    override val type: String = "graffiti",
    val graffiti: Graffiti = Graffiti()
): Attachment (type)

class Graffiti (
    var id: Int = 0x0000,
    var ownerId: Int = 0x0000,
    var photo130: String = "enter URL to preview image with 130 px in width here",
    var photo604: String = "enter URL to preview image with 604 px in width here"
)