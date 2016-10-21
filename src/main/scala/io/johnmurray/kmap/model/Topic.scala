package io.johnmurray.kmap.model

/**
  * A collection of bits under a single umbrella
  *
  * @param id     A synthetic ID to uniquely identify the topic
  * @param title  The name of the topic
  * @param bits   The set of bits within the topic
  */
case class Topic(id: Int, title: String, bits: Set[Bit])
