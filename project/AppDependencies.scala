import play.core.PlayVersion
import play.sbt.PlayImport._
import sbt._

object AppDependencies {

  val compile = Seq(
    ws,
    "uk.gov.hmrc" %% "play-reactivemongo" % "6.0.0",
    "uk.gov.hmrc" %% "logback-json-logger" % "3.1.0",
    "uk.gov.hmrc" %% "govuk-template" % "5.3.0",
    "uk.gov.hmrc" %% "play-health" % "2.1.0",
    "uk.gov.hmrc" %% "play-ui" % "7.4.0",
    "uk.gov.hmrc" %% "http-caching-client" % "7.0.0",
    "uk.gov.hmrc" %% "play-conditional-form-mapping" % "0.2.0",
    "uk.gov.hmrc" %% "bootstrap-play-25" % "1.4.0",
    "uk.gov.hmrc" %% "play-language" % "3.4.0",
    "com.thoughtworks.xstream" % "xstream" % "1.4.10"
  )

  val test = Seq(
    "uk.gov.hmrc" %% "hmrctest" % "3.0.0" % "test",
    "org.scalatest" %% "scalatest" % "3.0.4" % "test",
    "org.scalatestplus.play" %% "scalatestplus-play" % "2.0.1" % "test",
    "org.pegdown" % "pegdown" % "1.6.0" % "test",
    "org.jsoup" % "jsoup" % "1.10.3" % "test",
    "com.typesafe.play" %% "play-test" % PlayVersion.current % "test",
    "org.mockito" % "mockito-all" % "1.10.19" % "test",
    "org.scalacheck" %% "scalacheck" % "1.13.4" % "test"
  )

  def apply() = compile ++ test
}
