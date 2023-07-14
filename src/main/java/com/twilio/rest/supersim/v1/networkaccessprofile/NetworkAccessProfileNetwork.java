/*
 * This code was generated by
 * ___ _ _ _ _ _    _ ____    ____ ____ _    ____ ____ _  _ ____ ____ ____ ___ __   __
 *  |  | | | | |    | |  | __ |  | |__| | __ | __ |___ |\ | |___ |__/ |__|  | |  | |__/
 *  |  |_|_| | |___ | |__|    |__| |  | |    |__] |___ | \| |___ |  \ |  |  | |__| |  \
 *
 * Twilio - Supersim
 * This is the public Twilio REST API.
 *
 * NOTE: This class is auto generated by OpenAPI Generator.
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.twilio.rest.supersim.v1.networkaccessprofile;

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
import java.net.URI;
import java.util.List;
import java.util.Map;
import java.util.Map;
import java.util.Objects;
import lombok.ToString;
import lombok.ToString;

@JsonIgnoreProperties(ignoreUnknown = true)
@ToString
public class NetworkAccessProfileNetwork extends Resource {

    private static final long serialVersionUID = 187162547019967L;

    public static NetworkAccessProfileNetworkCreator creator(
        final String pathNetworkAccessProfileSid,
        final String network
    ) {
        return new NetworkAccessProfileNetworkCreator(
            pathNetworkAccessProfileSid,
            network
        );
    }

    public static NetworkAccessProfileNetworkDeleter deleter(
        final String pathNetworkAccessProfileSid,
        final String pathSid
    ) {
        return new NetworkAccessProfileNetworkDeleter(
            pathNetworkAccessProfileSid,
            pathSid
        );
    }

    public static NetworkAccessProfileNetworkFetcher fetcher(
        final String pathNetworkAccessProfileSid,
        final String pathSid
    ) {
        return new NetworkAccessProfileNetworkFetcher(
            pathNetworkAccessProfileSid,
            pathSid
        );
    }

    public static NetworkAccessProfileNetworkReader reader(
        final String pathNetworkAccessProfileSid
    ) {
        return new NetworkAccessProfileNetworkReader(
            pathNetworkAccessProfileSid
        );
    }

    /**
     * Converts a JSON String into a NetworkAccessProfileNetwork object using the provided ObjectMapper.
     *
     * @param json Raw JSON String
     * @param objectMapper Jackson ObjectMapper
     * @return NetworkAccessProfileNetwork object represented by the provided JSON
     */
    public static NetworkAccessProfileNetwork fromJson(
        final String json,
        final ObjectMapper objectMapper
    ) {
        // Convert all checked exceptions to Runtime
        try {
            return objectMapper.readValue(
                json,
                NetworkAccessProfileNetwork.class
            );
        } catch (final JsonMappingException | JsonParseException e) {
            throw new ApiException(e.getMessage(), e);
        } catch (final IOException e) {
            throw new ApiConnectionException(e.getMessage(), e);
        }
    }

    /**
     * Converts a JSON InputStream into a NetworkAccessProfileNetwork object using the provided
     * ObjectMapper.
     *
     * @param json Raw JSON InputStream
     * @param objectMapper Jackson ObjectMapper
     * @return NetworkAccessProfileNetwork object represented by the provided JSON
     */
    public static NetworkAccessProfileNetwork fromJson(
        final InputStream json,
        final ObjectMapper objectMapper
    ) {
        // Convert all checked exceptions to Runtime
        try {
            return objectMapper.readValue(
                json,
                NetworkAccessProfileNetwork.class
            );
        } catch (final JsonMappingException | JsonParseException e) {
            throw new ApiException(e.getMessage(), e);
        } catch (final IOException e) {
            throw new ApiConnectionException(e.getMessage(), e);
        }
    }

    private final String sid;
    private final String networkAccessProfileSid;
    private final String friendlyName;
    private final String isoCountry;
    private final List<Map<String, Object>> identifiers;
    private final URI url;

    @JsonCreator
    private NetworkAccessProfileNetwork(
        @JsonProperty("sid") final String sid,
        @JsonProperty(
            "network_access_profile_sid"
        ) final String networkAccessProfileSid,
        @JsonProperty("friendly_name") final String friendlyName,
        @JsonProperty("iso_country") final String isoCountry,
        @JsonProperty(
            "identifiers"
        ) final List<Map<String, Object>> identifiers,
        @JsonProperty("url") final URI url
    ) {
        this.sid = sid;
        this.networkAccessProfileSid = networkAccessProfileSid;
        this.friendlyName = friendlyName;
        this.isoCountry = isoCountry;
        this.identifiers = identifiers;
        this.url = url;
    }

    public final String getSid() {
        return this.sid;
    }

    public final String getNetworkAccessProfileSid() {
        return this.networkAccessProfileSid;
    }

    public final String getFriendlyName() {
        return this.friendlyName;
    }

    public final String getIsoCountry() {
        return this.isoCountry;
    }

    public final List<Map<String, Object>> getIdentifiers() {
        return this.identifiers;
    }

    public final URI getUrl() {
        return this.url;
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }

        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        NetworkAccessProfileNetwork other = (NetworkAccessProfileNetwork) o;

        return (
            Objects.equals(sid, other.sid) &&
            Objects.equals(
                networkAccessProfileSid,
                other.networkAccessProfileSid
            ) &&
            Objects.equals(friendlyName, other.friendlyName) &&
            Objects.equals(isoCountry, other.isoCountry) &&
            Objects.equals(identifiers, other.identifiers) &&
            Objects.equals(url, other.url)
        );
    }

    @Override
    public int hashCode() {
        return Objects.hash(
            sid,
            networkAccessProfileSid,
            friendlyName,
            isoCountry,
            identifiers,
            url
        );
    }
}
