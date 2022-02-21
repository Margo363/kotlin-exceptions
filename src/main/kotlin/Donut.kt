data class Donut(
    val isDonut: Boolean = false,
    val paidDuration: Int = 0,
    val canPublishFreeCopy: Boolean = false,
    val editMode: String = " "
    )

//  Информация о записи VK Donut:
//              is_donut (boolean) — запись доступна только платным подписчикам VK Donut;
//              paid_duration (integer) — время, в течение которого запись будет доступна только платным подписчикам VK Donut;
//              placeholder (object) — заглушка для пользователей, которые не оформили подписку VK Donut. Отображается вместо содержимого записи.
//              can_publish_free_copy (boolean) — можно ли открыть запись для всех пользователей, а не только подписчиков VK Donut;
//              edit_mode (string) — информация о том, какие значения VK Donut можно изменить в записи. Возможные значения:
//                          all — всю информацию о VK Donut.
//                          duration — время, в течение которого запись будет доступна только платным подписчикам VK Donut.