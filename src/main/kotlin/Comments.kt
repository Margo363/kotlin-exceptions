data class Comments(
    val count: Int = 0,
    val canPost: Boolean = false,
    val groupsCanPost: Boolean = false,
    val canClose: Boolean = false,
    val canOpen: Boolean = false
    )

//  Информация о комментариях к записи, объект с полями:
//              count (integer) — количество комментариев;
//              can_post* (integer) — информация о том, может ли текущий пользователь комментировать запись (1 — может, 0 — не может);
//              groups_can_post (integer) — информация о том, могут ли сообщества комментировать запись;
//              can_close(boolean) — может ли текущий пользователь закрыть комментарии к записи;
//              can_open(boolean) — может ли текущий пользователь открыть комментарии к записи.