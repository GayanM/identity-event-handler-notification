/*
 * Copyright (c) 2016, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
 *
 * WSO2 Inc. licenses this file to you under the Apache License,
 *  Version 2.0 (the "License"); you may not use this file except
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

package org.wso2.carbon.identity.event.handler.email.util;

public class EmailNotification implements Notification {

    private String sendTo;
    private String sendFrom;
    private String subject;
    private String body;
    private String footer;
    private String contentType;

    @Override
    public String getSendTo() {
        return this.sendTo;
    }

    @Override
    public void setSendTo(String sendTo) {
        this.sendTo = sendTo;
    }

    @Override
    public String getSendFrom() {
        return this.sendFrom;
    }

    @Override
    public void setSendFrom(String sendFrom) {
        this.sendFrom = sendFrom;
    }

    @Override
    public String getSubject() {
        return this.subject;
    }

    @Override
    public void setSubject(String subject) {
        this.subject = subject;
    }

    @Override
    public String getBody() {
        return this.body;
    }

    @Override
    public void setBody(String body) {
        this.body = body;
    }

    @Override
    public String getFooter() {
        return this.footer;
    }

    @Override
    public void setFooter(String footer) {
        this.footer = footer;
    }

    public String getContentType() {
        return contentType;
    }

    public void setContentType(String type) {
        this.contentType = type;
    }
}