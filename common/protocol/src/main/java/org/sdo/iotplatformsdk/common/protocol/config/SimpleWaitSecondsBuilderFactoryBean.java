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

package org.sdo.iotplatformsdk.common.protocol.config;

import java.time.Duration;

import org.springframework.beans.factory.FactoryBean;

public class SimpleWaitSecondsBuilderFactoryBean implements FactoryBean<WaitSecondsBuilder> {

  private Duration waitSeconds = Duration.ofHours(1);

  @Override
  public WaitSecondsBuilder getObject() throws Exception {

    SimpleWaitSecondsBuilder builder = new SimpleWaitSecondsBuilder();
    builder.setWaitSeconds(getWaitSeconds());
    return builder;
  }

  @Override
  public Class<?> getObjectType() {
    return WaitSecondsBuilder.class;
  }

  public Duration getWaitSeconds() {
    return waitSeconds;
  }

  public void setWaitSeconds(Duration waitSeconds) {
    this.waitSeconds = waitSeconds;
  }
}
