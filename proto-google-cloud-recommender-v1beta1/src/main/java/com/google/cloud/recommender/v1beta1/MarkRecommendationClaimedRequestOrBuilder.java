/*
 * Copyright 2019 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/recommender/v1beta1/recommender_service.proto

package com.google.cloud.recommender.v1beta1;

public interface MarkRecommendationClaimedRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.recommender.v1beta1.MarkRecommendationClaimedRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Name of the recommendation.
   * </pre>
   *
   * <code>string name = 1;</code>
   */
  java.lang.String getName();
  /**
   *
   *
   * <pre>
   * Name of the recommendation.
   * </pre>
   *
   * <code>string name = 1;</code>
   */
  com.google.protobuf.ByteString getNameBytes();

  /**
   *
   *
   * <pre>
   * State properties to include with this state. Overwrites any existing
   * `state_metadata`.
   * </pre>
   *
   * <code>map&lt;string, string&gt; state_metadata = 2;</code>
   */
  int getStateMetadataCount();
  /**
   *
   *
   * <pre>
   * State properties to include with this state. Overwrites any existing
   * `state_metadata`.
   * </pre>
   *
   * <code>map&lt;string, string&gt; state_metadata = 2;</code>
   */
  boolean containsStateMetadata(java.lang.String key);
  /** Use {@link #getStateMetadataMap()} instead. */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, java.lang.String> getStateMetadata();
  /**
   *
   *
   * <pre>
   * State properties to include with this state. Overwrites any existing
   * `state_metadata`.
   * </pre>
   *
   * <code>map&lt;string, string&gt; state_metadata = 2;</code>
   */
  java.util.Map<java.lang.String, java.lang.String> getStateMetadataMap();
  /**
   *
   *
   * <pre>
   * State properties to include with this state. Overwrites any existing
   * `state_metadata`.
   * </pre>
   *
   * <code>map&lt;string, string&gt; state_metadata = 2;</code>
   */
  java.lang.String getStateMetadataOrDefault(java.lang.String key, java.lang.String defaultValue);
  /**
   *
   *
   * <pre>
   * State properties to include with this state. Overwrites any existing
   * `state_metadata`.
   * </pre>
   *
   * <code>map&lt;string, string&gt; state_metadata = 2;</code>
   */
  java.lang.String getStateMetadataOrThrow(java.lang.String key);

  /**
   *
   *
   * <pre>
   * Fingerprint of the Recommendation. Provides optimistic locking.
   * </pre>
   *
   * <code>string etag = 3;</code>
   */
  java.lang.String getEtag();
  /**
   *
   *
   * <pre>
   * Fingerprint of the Recommendation. Provides optimistic locking.
   * </pre>
   *
   * <code>string etag = 3;</code>
   */
  com.google.protobuf.ByteString getEtagBytes();
}