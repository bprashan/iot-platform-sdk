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

package org.sdo.iotplatformsdk.ocs.fsimpl.credsmanager;

import java.security.Provider;
import java.security.Security;
import java.util.function.Supplier;

import org.bouncycastle.jce.provider.BouncyCastleProvider;

public class BouncyCastleSupplier implements Supplier<Provider> {

  private static Provider provider;

  /**
   * Loads the Bouncy Castle JCE provider.
   *
   * <p>This method is idempotent, and may be called repeatedly without side
   * effect.
   *
   * @return The Bouncy Castle JCE provider.
   */
  public static Provider load() {
    if (provider == null) {
      provider = new BouncyCastleProvider(); // dynamic registration requried
    }

    // BouncyCastleProvider.PROVIDER_NAME
    final Provider bcProvider = Security.getProvider(provider.getName());
    if (bcProvider == null) {
      Security.insertProviderAt(provider, 1);
    }

    return provider;
  }

  @Override
  public Provider get() {
    return load();
  }
}