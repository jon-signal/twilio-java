/*
 * This code was generated by
 * ___ _ _ _ _ _    _ ____    ____ ____ _    ____ ____ _  _ ____ ____ ____ ___ __   __
 *  |  | | | | |    | |  | __ |  | |__| | __ | __ |___ |\ | |___ |__/ |__|  | |  | |__/
 *  |  |_|_| | |___ | |__|    |__| |  | |    |__] |___ | \| |___ |  \ |  |  | |__| |  \
 *
 * Twilio - Events
 * This is the public Twilio REST API.
 *
 * NOTE: This class is auto generated by OpenAPI Generator.
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.twilio.rest.events.v1;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.twilio.base.Resource;
import com.twilio.converter.DateConverter;
import com.twilio.exception.ApiConnectionException;
import com.twilio.exception.ApiException;
import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.time.ZonedDateTime;
import java.util.Map;
import java.util.Map;
import java.util.Objects;
import lombok.ToString;
import lombok.ToString;

@JsonIgnoreProperties(ignoreUnknown = true)
@ToString
public class EventType extends Resource {

    private static final long serialVersionUID = 236822326358907L;

    public static EventTypeFetcher fetcher(final String pathType) {
        return new EventTypeFetcher(pathType);
    }

    public static EventTypeReader reader() {
        return new EventTypeReader();
    }

    /**
     * Converts a JSON String into a EventType object using the provided ObjectMapper.
     *
     * @param json Raw JSON String
     * @param objectMapper Jackson ObjectMapper
     * @return EventType object represented by the provided JSON
     */
    public static EventType fromJson(
        final String json,
        final ObjectMapper objectMapper
    ) {
        // Convert all checked exceptions to Runtime
        try {
            return objectMapper.readValue(json, EventType.class);
        } catch (final JsonMappingException | JsonParseException e) {
            throw new ApiException(e.getMessage(), e);
        } catch (final IOException e) {
            throw new ApiConnectionException(e.getMessage(), e);
        }
    }

    /**
     * Converts a JSON InputStream into a EventType object using the provided
     * ObjectMapper.
     *
     * @param json Raw JSON InputStream
     * @param objectMapper Jackson ObjectMapper
     * @return EventType object represented by the provided JSON
     */
    public static EventType fromJson(
        final InputStream json,
        final ObjectMapper objectMapper
    ) {
        // Convert all checked exceptions to Runtime
        try {
            return objectMapper.readValue(json, EventType.class);
        } catch (final JsonMappingException | JsonParseException e) {
            throw new ApiException(e.getMessage(), e);
        } catch (final IOException e) {
            throw new ApiConnectionException(e.getMessage(), e);
        }
    }

    private final String type;
    private final String schemaId;
    private final ZonedDateTime dateCreated;
    private final ZonedDateTime dateUpdated;
    private final String description;
    private final URI url;
    private final Map<String, String> links;

    @JsonCreator
    private EventType(
        @JsonProperty("type") final String type,
        @JsonProperty("schema_id") final String schemaId,
        @JsonProperty("date_created") final String dateCreated,
        @JsonProperty("date_updated") final String dateUpdated,
        @JsonProperty("description") final String description,
        @JsonProperty("url") final URI url,
        @JsonProperty("links") final Map<String, String> links
    ) {
        this.type = type;
        this.schemaId = schemaId;
        this.dateCreated = DateConverter.iso8601DateTimeFromString(dateCreated);
        this.dateUpdated = DateConverter.iso8601DateTimeFromString(dateUpdated);
        this.description = description;
        this.url = url;
        this.links = links;
    }

    public final String getType() {
        return this.type;
    }

    public final String getSchemaId() {
        return this.schemaId;
    }

    public final ZonedDateTime getDateCreated() {
        return this.dateCreated;
    }

    public final ZonedDateTime getDateUpdated() {
        return this.dateUpdated;
    }

    public final String getDescription() {
        return this.description;
    }

    public final URI getUrl() {
        return this.url;
    }

    public final Map<String, String> getLinks() {
        return this.links;
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }

        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        EventType other = (EventType) o;

        return (
            Objects.equals(type, other.type) &&
            Objects.equals(schemaId, other.schemaId) &&
            Objects.equals(dateCreated, other.dateCreated) &&
            Objects.equals(dateUpdated, other.dateUpdated) &&
            Objects.equals(description, other.description) &&
            Objects.equals(url, other.url) &&
            Objects.equals(links, other.links)
        );
    }

    @Override
    public int hashCode() {
        return Objects.hash(
            type,
            schemaId,
            dateCreated,
            dateUpdated,
            description,
            url,
            links
        );
    }
}
