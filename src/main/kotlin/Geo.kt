class Geo(
    val type: String,
    val coordinstes: String,
    val place: Place
    )

class Place(
    val id: Int, //Идентификатор места.
    val title: String, //Название места.
    val latitude: Int, //Географическая широта, заданная в градусах (от -90 до 90).
    val longitude: Int, //Географическая широта, заданная в градусах (от -90 до 90).
    val created: Int, //Дата создания места в Unixtime.
    val icon: String, //Иконка места, URL изображения.
    val checkins: Int, //Число отметок в этом месте.
    val updated: Int, //Дата обновления места в Unixtime.
    val type: Int, //Тип места.
    val country: Int, //Идентификатор страны.
    val city: Int, //Идентификатор города.
    val address: String, //Адрес места.
)

//Информация о местоположении, содержит поля:
// type (string) — тип места;
//coordinates (string) — координаты места;
//place (object) — описание места (если оно добавлено). Объект места.


//Место
//Объект, описывающий место, содержит следующие поля:
//
//id
//integer
//Идентификатор места.
//
//title
//string
//Иазвание места.
//
//latitude
//integer
//Географическая широта, заданная в градусах (от -90 до 90).
//
//longitude
//integer
//Географическая широта, заданная в градусах (от -90 до 90).
//
//created
//integer
//Дата создания места в Unixtime.
//
//icon
//string
//Иконка места, URL изображения.
//
//checkins
//integer
//Число отметок в этом месте.
//
//updated
//integer
//Дата обновления места в Unixtime.
//
//type
//integer
//Тип места.
//
//country
//integer
//Идентификатор страны.
//
//city
//integer
//Идентификатор города.
//
//address
//string
//Адрес места.