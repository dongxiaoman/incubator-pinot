/**
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
package org.apache.pinot.core.auth;

/**
 * Container for authentication workflow info for the Pinot UI. May be extended by implementations.
 *
 * Auth workflow info hold any configuration necessary to execute a UI workflow. We currently foresee supporting NONE
 * (auth disabled) and BASIC (basic auth with username and password)
 */
public class AuthWorkflowInfo {
  String _workflow;

  public AuthWorkflowInfo(String workflow) {
    _workflow = workflow;
  }

  public String getWorkflow() {
    return _workflow;
  }

  public void setWorkflow(String workflow) {
    _workflow = workflow;
  }
}
