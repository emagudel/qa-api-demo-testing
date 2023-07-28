#language:es

@Regresion
Característica: Api Demo Testing
  Yo como QA candidato
  Quiero ejecutar los servicios en repo automatizado
  Para demostrar que se automatizar servicios rest

  @Regresion  @Api_Members_Get
  Escenario: Api Members

    Dado que QA cuenta con las credenciales para obtener los miembros
    Cuando se ejecuta el servicio que obtiene listado de miembros
    Entonces se puede ver listado de miembros del api

