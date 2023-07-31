#language:es

@Regresion
Característica: Api Demo Testing Members
  Yo como QA candidato
  Quiero ejecutar los servicios en repo automatizado
  Para demostrar que se automatizar servicios rest

  @Regresion  @Api_Members_Pos
  Escenario: Api Members Post

    Dado que QA cuenta con las credenciales del servicio
    Cuando se ejecuta el servicio para crear un nuevo miembro
    Entonces se puede ver el miembro nuevo en la respuesta

  @Regresion  @Api_Members_Get
  Escenario: Api Members Get

    Dado que QA cuenta con las credenciales del servicio
    Cuando se ejecuta el servicio que obtiene listado de miembros
    Entonces se puede ver listado de miembros del api

  @Regresion  @Api_Members_Put
  Escenario: Api Members Put

    Dado que QA cuenta con las credenciales del servicio
    Cuando se ejecuta el servicio para actualizar un nuevo miembro
    Entonces se puede ver el miembro con datos actualizados

  @Regresion  @Api_Members_Delete
  Escenario: Api Members Delete

    Dado que QA cuenta con las credenciales del servicio
    Cuando se ejecuta el servicio para borrar un nuevo miembro
    Entonces se puede ver fue borrado de manera exitosa




