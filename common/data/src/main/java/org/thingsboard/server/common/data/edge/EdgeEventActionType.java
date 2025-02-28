/**
 * Copyright © 2016-2022 The Thingsboard Authors
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
package org.thingsboard.server.common.data.edge;

public enum EdgeEventActionType {
    ADDED,
    DELETED,
    UPDATED,
    POST_ATTRIBUTES,
    ATTRIBUTES_UPDATED,
    ATTRIBUTES_DELETED,
    TIMESERIES_UPDATED,
    CREDENTIALS_UPDATED,
    ASSIGNED_TO_CUSTOMER,
    UNASSIGNED_FROM_CUSTOMER,
    RELATION_ADD_OR_UPDATE,
    RELATION_DELETED,
    RPC_CALL,
    ALARM_ACK,
    ALARM_CLEAR,
    ASSIGNED_TO_EDGE,
    UNASSIGNED_FROM_EDGE,
    CREDENTIALS_REQUEST,
    ENTITY_MERGE_REQUEST,
    ATTRIBUTES_REQUEST,
    RULE_CHAIN_METADATA_REQUEST,
    RELATION_REQUEST,
    WIDGET_BUNDLE_TYPES_REQUEST,
    ENTITY_VIEW_REQUEST,
    DEVICE_PROFILE_DEVICES_REQUEST; // DEPRECATED
}