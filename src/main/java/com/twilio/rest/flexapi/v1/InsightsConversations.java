/*
 * This code was generated by
 * ___ _ _ _ _ _    _ ____    ____ ____ _    ____ ____ _  _ ____ ____ ____ ___ __   __
 *  |  | | | | |    | |  | __ |  | |__| | __ | __ |___ |\ | |___ |__/ |__|  | |  | |__/
 *  |  |_|_| | |___ | |__|    |__| |  | |    |__] |___ | \| |___ |  \ |  |  | |__| |  \
 *
 * Twilio - Flex
 * This is the public Twilio REST API.
 *
 * NOTE: This class is auto generated by OpenAPI Generator.
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.twilio.rest.flexapi.v1;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.twilio.base.Resource;
import com.twilio.exception.ApiConnectionException;
import com.twilio.exception.ApiException;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.Map;
import java.util.Map;
import java.util.Objects;
import lombok.ToString;
import lombok.ToString;

@JsonIgnoreProperties(ignoreUnknown = true)
@ToString
public class InsightsConversations extends Resource {

    private static final long serialVersionUID = 172863414006149L;

    public static InsightsConversationsReader reader() {
        return new InsightsConversationsReader();
    }

    /**
     * Converts a JSON String into a InsightsConversations object using the provided ObjectMapper.
     *
     * @param json Raw JSON String
     * @param objectMapper Jackson ObjectMapper
     * @return InsightsConversations object represented by the provided JSON
     */
    public static InsightsConversations fromJson(
        final String json,
        final ObjectMapper objectMapper
    ) {
        // Convert all checked exceptions to Runtime
        try {
            return objectMapper.readValue(json, InsightsConversations.class);
        } catch (final JsonMappingException | JsonParseException e) {
            throw new ApiException(e.getMessage(), e);
        } catch (final IOException e) {
            throw new ApiConnectionException(e.getMessage(), e);
        }
    }

    /**
     * Converts a JSON InputStream into a InsightsConversations object using the provided
     * ObjectMapper.
     *
     * @param json Raw JSON InputStream
     * @param objectMapper Jackson ObjectMapper
     * @return InsightsConversations object represented by the provided JSON
     */
    public static InsightsConversations fromJson(
        final InputStream json,
        final ObjectMapper objectMapper
    ) {
        // Convert all checked exceptions to Runtime
        try {
            return objectMapper.readValue(json, InsightsConversations.class);
        } catch (final JsonMappingException | JsonParseException e) {
            throw new ApiException(e.getMessage(), e);
        } catch (final IOException e) {
            throw new ApiConnectionException(e.getMessage(), e);
        }
    }

    private final String accountId;
    private final String conversationId;
    private final Integer segmentCount;
    private final List<Map<String, Object>> segments;

    @JsonCreator
    private InsightsConversations(
        @JsonProperty("account_id") final String accountId,
        @JsonProperty("conversation_id") final String conversationId,
        @JsonProperty("segment_count") final Integer segmentCount,
        @JsonProperty("segments") final List<Map<String, Object>> segments
    ) {
        this.accountId = accountId;
        this.conversationId = conversationId;
        this.segmentCount = segmentCount;
        this.segments = segments;
    }

    public final String getAccountId() {
        return this.accountId;
    }

    public final String getConversationId() {
        return this.conversationId;
    }

    public final Integer getSegmentCount() {
        return this.segmentCount;
    }

    public final List<Map<String, Object>> getSegments() {
        return this.segments;
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }

        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        InsightsConversations other = (InsightsConversations) o;

        return (
            Objects.equals(accountId, other.accountId) &&
            Objects.equals(conversationId, other.conversationId) &&
            Objects.equals(segmentCount, other.segmentCount) &&
            Objects.equals(segments, other.segments)
        );
    }

    @Override
    public int hashCode() {
        return Objects.hash(accountId, conversationId, segmentCount, segments);
    }
}
