/*
 * Copyright Terracotta, Inc.
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

package org.ehcache.core;

import org.ehcache.spi.ServiceProvider;
import org.ehcache.core.spi.service.CacheManagerProviderService;

/**
 * @author Mathieu Carbou
 */
public class DefaultCacheManagerProviderService implements CacheManagerProviderService {

  private final EhcacheManager ehcacheManager;

  public DefaultCacheManagerProviderService(EhcacheManager ehcacheManager) {
    this.ehcacheManager = ehcacheManager;
  }

  @Override
  public EhcacheManager getCacheManager() {
    return ehcacheManager;
  }

  @Override
  public void start(ServiceProvider serviceProvider) {

  }

  @Override
  public void stop() {

  }
}