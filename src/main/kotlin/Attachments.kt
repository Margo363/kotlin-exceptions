abstract class Attachments {
    abstract val typeAttachment: String  // тип вложения
//    abstract val idAttachment: Int  //  id вложения
//    abstract val titleAttachment: String  // название вложения
//    abstract val dataAttachment: Int  // дата создания вложения в формате Unixtime
//    abstract val descriptionAttachment: String  // текст описания вложения

//    fun info () {
//        println("attachment type: $typeAttachment")
//    }

}
class Video(
    val idAttachment: Int,
    val titleAttachment: String,
    val dataAttachment: Int,
    val descriptionAttachment: String
    )

class VideoAttachments(val video: Video): Attachments() {
    override val typeAttachment = "video"
//    override val idAttachment = 1
//    override val titleAttachment = "first video"
//    override val dataAttachment = 11111111
//    override val descriptionAttachment = "description for the video"

    override fun toString(): String {
        return "Attachment type: $typeAttachment"
    }
}

class Audio(
    val idAttachment: Int,
    val titleAttachment: String,
    val dataAttachment: Int,
    val descriptionAttachment: String
)

class AudioAttachments(val audio: Audio): Attachments() {
    override val typeAttachment = "audio"
//    override val idAttachment = 2
//    override val titleAttachment = "first audio"
//    override val dataAttachment = 11111112
//    override val descriptionAttachment = "description for audio"

    override fun toString(): String {
        return "Attachment type: $typeAttachment"
    }
}

class Photo(
    val idAttachment: Int,
    val titleAttachment: String,
    val dataAttachment: Int,
    val descriptionAttachment: String
)

class PhotoAttachments(val photo: Photo): Attachments() {
    override val typeAttachment = "photo"
//    override val idAttachment = 3
//    override val titleAttachment = "first photo"
//    override val dataAttachment = 11111113
//    override val descriptionAttachment = "photo description"

    override fun toString(): String {
        return "Attachment type: $typeAttachment"
    }
}

class Document (
    val idAttachment: Int,
    val titleAttachment: String,
    val dataAttachment: Int,
    val descriptionAttachment: String
)

class DocumentAttachments(val document: Document): Attachments(){
    override val typeAttachment = "document"
//    override val idAttachment = 5
//    override val titleAttachment = "first document"
//    override val dataAttachment = 11111115
//    override val descriptionAttachment = "document description"

    override fun toString(): String {
        return "Attachment type: $typeAttachment"
    }
}


//class Comment (
//    val idAttachment: Int,
//    val titleAttachment: String,
//    val dataAttachment: Int,
//    val descriptionAttachment: String
//)

//class CommentAttachments(val comment: Comment): Attachments() {
//    override val typeAttachment = "comment"
////    override val idAttachment = 4
////    override val titleAttachment = "first comment"
////    override val dataAttachment = 11111114
////    override val descriptionAttachment = "attachment comments"
//
//    override fun toString(): String {
//        return "Attachment type: $typeAttachment"
//    }
//}

//attachments
//array
//Медиавложения записи (фотографии, ссылки и т.п.). Описание массива attachments находится на отдельной странице.

//id
//integer
//Идентификатор видеозаписи.
//
//
//owner_id
//integer
//Идентификатор владельца видеозаписи.
//
//
//title
//string
//Название видеозаписи.
//
//
//description
//string
//Текст описания видеозаписи.
//
//
//duration
//integer
//Длительность ролика в секундах.
//
//
//image
//array
//Изображение обложки. Содержит массив объектов с полями:
    //height (integer) — Высота изображения.
    //url (string) — Ссылка на изображение.
    //width (integer) — Ширина изображение.
    //with_padding (integer) — Поле возвращается, если изображение с отбивкой, всегда содержит 1.
//
//
//first_frame
//array
//Изображение первого кадра. Содержит массив объектов с полями:
    //height (integer) — Высота изображения.
    //url (string) — Ссылка на изображение.
    //width (integer) — Ширина изображение.
//
//
//date
//integer
//Дата создания видеозаписи в формате Unixtime.
//
//
//adding_date
//integer
//Дата добавления видеозаписи пользователем или группой в формате Unixtime.
//
//
//views
//integer
//Количество просмотров видеозаписи.
//
//
//local_views
//integer
//Если видео внешнее, количество просмотров в ВК.
//
//
//comments
//integer
//Количество комментариев к видеозаписи.
//
//
//player
//string
//URL страницы с плеером, который можно использовать для воспроизведения ролика в браузере. Поддерживается flash и HTML5, плеер всегда масштабируется по размеру окна.
//
//
//platform
//string
//Название платформы (для видеозаписей, добавленных с внешних сайтов).
//
//
//can_add
//integer
//Может ли пользователь добавить видеозапись к себе.
//0 — Не может добавить.
//1 — Может добавить.
//
//
//is_private
//integer
//Поле возвращается, если видеозапись приватная (например, была загружена в личное сообщение), всегда содержит 1.
//
//
//access_key
//string
//Ключ доступа к объекту. Подробнее см. Ключ доступа к данным access_key.
//
//
//processing
//integer
//Поле возвращается в том случае, если видеоролик находится в процессе обработки, всегда содержит 1.
//
//is_favorite
//boolean
//true, если объект добавлен в закладки у текущего пользователя.
//
//can_comment
//integer
//Может ли пользователь комментировать видео.
//0 — Не может комментировать.
//1 — Может комментировать.
//
//can_edit
//integer
//Может ли пользователь редактировать видео.
//0 — Не может редактировать.
//1 — Может редактировать.
//
//can_like
//integer
//Может ли пользователь добавить видео в список <<Мне нравится>>.
//0 — Не может добавить.
//1 — Может добавить.
//
//can_repost
//integer
//Может ли пользователь сделать репост видео.
//0 — Не может сделать репост.
//1 — Может сделать репост.
//
//can_subscribe
//integer
//Может ли пользователь подписаться на автора видео.
//0 — Не может подписаться.
//1 — Может подписаться.
//
//can_add_to_faves
//integer
//Может ли пользователь добавить видео в избранное.
//0 — Не может добавить.
//1 — Может добавить.
//
//can_attach_link
//integer
//Может ли пользователь прикрепить кнопку действия к видео.
//0 — Не может прикрепить.
//1 — Может прикрепить.
//
//width
//integer
//Ширина видео.
//
//height
//integer
//Высота видео.
//
//user_id
//integer
//Идентификатор пользователя, загрузившего видео, если оно было загружено в группу одним из участников.
//
//converting
//integer
//Конвертируется ли видео.
//0 — Не конвертируется.
//1 — Конвертируется.
//
//added
//integer
//Добавлено ли видео в альбомы пользователя.
//0 — Не добавлено.
//1 — Добавлено.
//
//is_subscribed
//integer
//Подписан ли пользователь на автора видео.
//0 — Не подписан.
//1 — Подписан.
//
//repeat
//integer
//Поле возвращается в том случае, если видео зациклено, всегда содержит 1
//
//type
//string
//Тип видеозаписи. Может принимать значения: video, music_video, movie.
//
//balance
//integer
//Баланс донатов в прямой трансляции.
//
//live_status
//string
//Статус прямой трансляции. Может принимать значения: waiting, started, finished, failed, upcoming.
//
//live
//integer
//Поле возвращается в том случае, если видеозапись является прямой трансляцией, всегда содержит 1. Обратите внимание, в этом случае в поле duration содержится значение 0.
//
//upcoming
//integer
//Поле свидетельствует о том, что трансляция скоро начнётся. Для live =1.
//
//spectators
//integer
//Количество зрителей прямой трансляции.
//
//likes
//object
//Содержит объект отметки <<Мне нравится>>.
    //count (integer) — Количество лайков.
    //user_likes (integer) — Добавлено ли видео в список <<Мне нравится>> текущего пользователя.
        //0 — Не добавлено.
        //1 — Добавлено.
//
//reposts
//object
//Содержит объект репоста.
    //count (integer) — Счетчик общего количества репостов. Содержит сумму репостов на стену и в личные сообщения.
    //wall_count (integer) — Счетчик репостов на стену.
    //mail_count (integer) — Счетчик репостов в личные сообщения.
    //user_reposted (integer) — Информация о том, сделал ли текущий пользователь репост этого видео.