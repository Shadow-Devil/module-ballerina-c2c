/*
 * Copyright (c) 2020, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
 *
 * WSO2 Inc. licenses this file to you under the Apache License,
 * Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package org.ballerina.c2c.models;

import lombok.Data;
import lombok.EqualsAndHashCode;
import org.ballerina.c2c.KubernetesConstants;

import java.util.HashMap;

/**
 * Kubernetes service annotations model class.
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class ServiceModel extends KubernetesModel {
    private String serviceType;
    private int port;
    private int nodePort;
    private int targetPort;
    private String selector;
    private String sessionAffinity;
    private String portName;
    private String protocol;

    public ServiceModel() {
        serviceType = KubernetesConstants.ServiceType.ClusterIP.name();
        labels = new HashMap<>();
        port = -1;
        targetPort = -1;
        nodePort = -1;
    }

    public void addLabel(String key, String value) {
        this.labels.put(key, value);
    }
}
