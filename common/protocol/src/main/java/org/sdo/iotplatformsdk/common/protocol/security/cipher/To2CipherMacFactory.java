/*******************************************************************************
 * Copyright 2020 Intel Corporation
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 *******************************************************************************/

package org.sdo.iotplatformsdk.common.protocol.security.cipher;

import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;

import javax.crypto.Mac;

import org.sdo.iotplatformsdk.common.protocol.rest.SdoConstants;
import org.sdo.iotplatformsdk.common.protocol.types.MacType;

public class To2CipherMacFactory {

  private MacType macType;

  public To2CipherMacFactory(MacType macType) {
    this.setMacType(macType);
  }

  public Mac build() throws NoSuchAlgorithmException, NoSuchProviderException {
    return Mac.getInstance(getMacType().getJceName(), SdoConstants.SECURITY_PROVIDER);
  }

  public MacType getMacType() {
    return macType;
  }

  public void setMacType(MacType macType) {
    this.macType = macType;
  }
}
