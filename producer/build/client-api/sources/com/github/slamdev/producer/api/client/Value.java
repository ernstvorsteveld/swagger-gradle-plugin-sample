/**
 * Main spec
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: 0.0.1
 */

package com.github.slamdev.producer.api.client;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.github.slamdev.producer.api.client.Name;
import java.math.BigDecimal;
import java.time.Instant;
import java.util.UUID;
import lombok.*;
import java.io.Serializable;
import static java.util.Collections.emptyList;
/**
 * Value
 */
@Data
@Builder
@AllArgsConstructor
@javax.annotation.Generated(value = "com.github.slamdev.swagger.CustomJavaCodegen", date = "2017-05-22T11:39:56.688+02:00")
public final class Value  implements Serializable {

  private static final long serialVersionUID = 1L;

  @JsonProperty("name")
  @Builder.Default
  private Name name = null;

  @JsonProperty("value")
  @Builder.Default
  private String value = null;

  @JsonProperty("created")
  @Builder.Default
  private Instant created = null;

  @JsonProperty("num")
  @Builder.Default
  private BigDecimal num = null;

  @JsonProperty("uuid")
  @Builder.Default
  private UUID uuid = null;

  /**
   * Event Type
   */
  public enum EventType {
    A("A"),
    
    B("B"),
    
    C("C");

    private String value;

    EventType(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static EventType fromValue(String text) {
      for (EventType b : EventType.values()) {
          if (String.valueOf(b.value).equals(text)) {
              return b;
          }
      }
      return null;
    }
  }

  @JsonProperty("eventType")
  @Builder.Default
  private EventType eventType = null;

  public Value() {
    name = null;
    value = null;
    created = null;
    num = null;
    uuid = null;
    eventType = null;
  }
}

