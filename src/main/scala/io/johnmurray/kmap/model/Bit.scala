package io.johnmurray.kmap.model

/**
  * A single piece of information. This is the basis for any system that
  * organizes information and is a very simple model. It has a title and
  * some content that is represented in markdown.
  *
  * @param id        A synthetic ID for uniquely storing a Bit
  * @param title     The title of the Bit
  * @param markdown  The content (body) of the bit, in markdown
  * @param topic     The topic that contains this Bit (all Bits must be
  *                  defined within a topic)
  */
case class Bit(id: Int, title: String, markdown: String, topic: Topic)
