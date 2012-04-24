/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 * 
 *   http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package org.apache.uima.resource;

import org.apache.uima.resource.metadata.ResourceMetaData;

/**
 * A stub that calls a remote AnalysisEngine service.
 * 
 * 
 */
public interface ResourceServiceStub {
  /**
   * Performs service call to retreive resource meta data.
   * 
   * @return metadata for the Resource
   */
  public ResourceMetaData callGetMetaData() throws ResourceServiceException;

  /**
   * Called when this stub is no longer needed, so any open connections can be closed.
   */
  public void destroy();
}