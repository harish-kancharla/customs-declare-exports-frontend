/*
 * Copyright 2018 HM Revenue & Customs
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package models.declaration

import org.scalatest.WordSpec
import org.scalatest.Matchers._

class DeclarationSpec extends WordSpec {

  "Declaration" should{

    "produce declarant id as XML" in {
      val freightForwarder = Declarant("ZZ123456789000")
      val declaration = Declaration(freightForwarder)
      declaration.toXml shouldEqual "<Declaration><Declarant><ID>ZZ123456789000</ID></Declarant></Declaration>"
    }
  }
}
