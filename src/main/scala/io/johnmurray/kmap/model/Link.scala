package io.johnmurray.kmap.model

/**
  * Trait to hold all of the possible links between Bits
  */
sealed trait Link

/**
  * Links Bits that do not necessarily rely on each other but are co-related. Meaning
  * that there is no strict ordering between the two Bits.
  */
case class CoLink(one: Bit, two: Bit) extends Link

/**
  * Describes a link that point to a Bit which's base is another Bit. Base in this context
  * describes an ordering in which the base Bit comes first.
  * @param base
  * @param forward
  */
case class ForwardLink(base: Bit, forward: Bit) extends Link
