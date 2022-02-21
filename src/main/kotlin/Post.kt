import org.jetbrains.annotations.Nullable

data class Post(
    @Nullable
    var id: Int,
    val ownerId: Int = 0,
    val fromId: Int = 0,
    val createdBy: Int = 0,
    val date: Int = 0,
    val text: String = "textPost",
    val replyOwnerId: Int = 0,
    val replyPostId: Int = 0,
    val friendsOnly: Int = 0,
    val comments: Comments,
    val copyright: Copyright?,
    val likes: Likes,
    val reposts: Reposts,
    val views: Views,
    val postType: String?,
    val postSource: PostSource,
    val geo: Geo?,
    val signerId: Int = 0,
    val copyHistory: Array<Any?>?,
    val canPin: Boolean = false,
    val canDelete: Boolean = false,
    val canEdit: Boolean = false,
    val isPinned: Int = 0,
    val markedAsAds: Boolean = false,
    val isFavorite: Boolean = false,
    val donut: Donut,
    val postponedId: Int? = 0
    )

//    val id - id записи
//    val ownerId - id владельца стены (toId)
//    val fromId - id автора записи
//    val createdBy - id администратора, кот-й опубликовал запись
//    val date - время публикации записи в формате unixtime
//    val text - текст записи
//    val replyOwnerId - id владельца записи, в ответ на которую была оставлена текущая
//    val replyPostId - id записи, в ответ на которую была оставлена текущая
//    val friendsOnly - 0,1, если запись была создана с опцией "Только для друзей"
//    val comments - Информация о комментариях к записи, объект с полями:
//              count (integer) — количество комментариев;
//              can_post* (integer) — информация о том, может ли текущий пользователь комментировать запись (1 — может, 0 — не может);
//              groups_can_post (integer) — информация о том, могут ли сообщества комментировать запись;
//              can_close(boolean) — может ли текущий пользователь закрыть комментарии к записи;
//              can_open(boolean) — может ли текущий пользователь открыть комментарии к записи.
//    val copyright - Источник материала, объект с полями:
//              id (integer);
//              link* (string);
//              name* (string);
//              type* (string).
//    val likes - Информация о лайках к записи, объект с полями:
//              count (integer) — число пользователей, которым понравилась запись;
//              user_likes* (integer) — наличие отметки «Мне нравится» от текущего пользователя (1 — есть, 0 — нет);
//              can_like* (integer) — информация о том, может ли текущий пользователь поставить отметку «Мне нравится» (1 — может, 0 — не может);
//              can_publish* (integer) — информация о том, может ли текущий пользователь сделать репост записи (1 — может, 0 — не может).
//    val reposts - Информация о репостах записи («Рассказать друзьям»), объект с полями:
//              count (integer) — число пользователей, скопировавших запись;
//              user_reposted* (integer) — наличие репоста от текущего пользователя (1 — есть, 0 — нет).
//    val views - Информация о просмотрах записи. Объект с единственным полем:
//              count (integer) — число просмотров записи.
//    val postType - Тип записи, может принимать следующие значения: post, copy, reply, postpone, suggest
//    val signerId - Идентификатор автора, если запись была опубликована от имени сообщества и подписана пользователем
//    val canPin - Информация о том, может ли текущий пользователь закрепить запись (1 — может, 0 — не может)
//    val canDelete - Информация о том, может ли текущий пользователь удалить запись (1 — может, 0 — не может)
//    val canEdit - Информация о том, может ли текущий пользователь редактировать запись (1 — может, 0 — не может)
//    val isPinned - Информация о том, что запись закреплена
//    val markedAsAds - Информация о том, содержит ли запись отметку «реклама» (1 — да, 0 — нет)
//    val isFavorite - false / true, если объект добавлен в закладки у текущего пользователя
//    val donut - Информация о записи VK Donut:
//              is_donut (boolean) — запись доступна только платным подписчикам VK Donut;
//              paid_duration (integer) — время, в течение которого запись будет доступна только платным подписчикам VK Donut;
//              placeholder (object) — заглушка для пользователей, которые не оформили подписку VK Donut. Отображается вместо содержимого записи.
//              can_publish_free_copy (boolean) — можно ли открыть запись для всех пользователей, а не только подписчиков VK Donut;
//              edit_mode (string) — информация о том, какие значения VK Donut можно изменить в записи. Возможные значения:
//                          all — всю информацию о VK Donut.
//                          duration — время, в течение которого запись будет доступна только платным подписчикам VK Donut.
//    val postponedId - Идентификатор отложенной записи. Это поле возвращается тогда, когда запись стояла на таймере