/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package com.aliyuncs.fc.request;

import com.aliyuncs.fc.constants.Const;
import com.aliyuncs.fc.exceptions.ClientException;
import com.aliyuncs.fc.http.FormatType;
import com.aliyuncs.fc.http.HttpRequest;
import com.aliyuncs.fc.model.Code;
import com.aliyuncs.fc.response.CreateFunctionResponse;
import com.aliyuncs.fc.utils.ParameterHelper;

import com.google.common.base.Strings;
import com.google.gson.annotations.SerializedName;
import java.util.Map;

public class ListVpcBindingsRequest extends HttpRequest {

    @SerializedName("serviceName")
    private String serviceName;

    public String getSetviceName() {
        return this.serviceName;
    }

    public ListVpcBindingsRequest setServiceName(String serviceName) {
        this.serviceName = serviceName;
        return this;
    }

   public Map<String, String> getQueryParams() {
        return null;
    }

    public byte[] getPayload() {
        return null;
    }

    public FormatType getFormat() {
        return FormatType.JSON;
    }

    public String getPath() {
        return String.format(Const.LIST_VPC_BINDINGS_PATH, Const.API_VERSION, this.serviceName);
    }

    public void validate() throws ClientException {
        if (Strings.isNullOrEmpty(this.serviceName)) {
            throw new ClientException("Service name cannot be blank");
        }
    }
}
