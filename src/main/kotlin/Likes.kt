data class Likes(
    val count: Int = 0,
    val userLikes: Boolean = false,
    val canLike: Boolean = false,
    val canPublish: Boolean = false
    )

//  Информация о лайках к записи, объект с полями:
//              count (integer) — число пользователей, которым понравилась запись;
//              user_likes* (integer) — наличие отметки «Мне нравится» от текущего пользователя (1 — есть, 0 — нет);
//              can_like* (integer) — информация о том, может ли текущий пользователь поставить отметку «Мне нравится» (1 — может, 0 — не может);
//              can_publish* (integer) — информация о том, может ли текущий пользователь сделать репост записи (1 — может, 0 — не может).