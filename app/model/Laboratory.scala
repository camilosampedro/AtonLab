package model

import play.api.libs.json.{Json, Writes}

/**
  * POJO with the basic Laboratory information (Used by the Laboratory DAO, Service and Controller)
  */
case class Laboratory(
                       id: Long,
                       name: String,
                       location: Option[String],
                       administration: Option[String]
                     )