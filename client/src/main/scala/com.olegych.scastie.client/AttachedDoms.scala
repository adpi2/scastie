package com.olegych.scastie.client

import org.scalajs.dom.HTMLElement

case class AttachedDoms(v: Map[String, HTMLElement]) {
  def get(key: String): Option[HTMLElement] = v.get(key)
}
