/*******************************************************************************
 * Copyright 2020 Intel Corporation
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *******************************************************************************/

package org.sdo.iotplatformsdk.common.protocol.types;

public class To0HelloAck {

  public static final Integer ID = 21;

  private Nonce n3;

  public To0HelloAck(Nonce n3) {
    setN3(n3);
  }

  public Nonce getN3() {
    return n3;
  }

  public void setN3(Nonce n3) {
    this.n3 = n3;
  }
}
