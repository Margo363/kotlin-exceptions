data class Reposts(
    val count: Int = 0,
    val userReposted: Boolean = false
    )

//  Информация о репостах записи («Рассказать друзьям»), объект с полями:
//              count (integer) — число пользователей, скопировавших запись;
//              user_reposted* (integer) — наличие репоста от текущего пользователя (1 — есть, 0 — нет).