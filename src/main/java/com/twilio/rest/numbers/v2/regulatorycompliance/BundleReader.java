/**
 * This code was generated by
 * \ / _    _  _|   _  _
 *  | (_)\/(_)(_|\/| |(/_  v1.0.0
 *       /       /
 */

package com.twilio.rest.numbers.v2.regulatorycompliance;

import com.twilio.base.Page;
import com.twilio.base.Reader;
import com.twilio.base.ResourceSet;
import com.twilio.converter.DateConverter;
import com.twilio.exception.ApiConnectionException;
import com.twilio.exception.ApiException;
import com.twilio.exception.RestException;
import com.twilio.http.HttpMethod;
import com.twilio.http.Request;
import com.twilio.http.Response;
import com.twilio.http.TwilioRestClient;
import com.twilio.rest.Domains;

import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class BundleReader extends Reader<Bundle> {
    private Bundle.Status status;
    private String friendlyName;
    private String regulationSid;
    private String isoCountry;
    private String numberType;
    private Boolean hasValidUntilDate;
    private Bundle.SortBy sortBy;
    private Bundle.SortDirection sortDirection;
    private ZonedDateTime validUntilDate;
    private ZonedDateTime validUntilDateBefore;
    private ZonedDateTime validUntilDateAfter;

    /**
     * The verification status of the Bundle resource. Please refer to <a
     * href="https://www.twilio.com/docs/phone-numbers/regulatory/api/bundles#bundle-statuses">Bundle
     * Statuses</a> for more details..
     *
     * @param status The verification status of the Bundle resource
     * @return this
     */
    public BundleReader setStatus(final Bundle.Status status) {
        this.status = status;
        return this;
    }

    /**
     * The string that you assigned to describe the resource. The column can contain
     * 255 variable characters..
     *
     * @param friendlyName The string that you assigned to describe the resource
     * @return this
     */
    public BundleReader setFriendlyName(final String friendlyName) {
        this.friendlyName = friendlyName;
        return this;
    }

    /**
     * The unique string of a <a
     * href="https://www.twilio.com/docs/phone-numbers/regulatory/api/regulations">Regulation
     * resource</a> that is associated to the Bundle resource..
     *
     * @param regulationSid The unique string of a regulation.
     * @return this
     */
    public BundleReader setRegulationSid(final String regulationSid) {
        this.regulationSid = regulationSid;
        return this;
    }

    /**
     * The 2-digit <a href="https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2">ISO
     * country code</a> of the Bundle's phone number country ownership request..
     *
     * @param isoCountry The ISO country code of the country
     * @return this
     */
    public BundleReader setIsoCountry(final String isoCountry) {
        this.isoCountry = isoCountry;
        return this;
    }

    /**
     * The type of phone number of the Bundle's ownership request. Can be `local`,
     * `mobile`, `national`, or `tollfree`..
     *
     * @param numberType The type of phone number
     * @return this
     */
    public BundleReader setNumberType(final String numberType) {
        this.numberType = numberType;
        return this;
    }

    /**
     * Indicates that the Bundle is a valid Bundle until a specified expiration
     * date..
     *
     * @param hasValidUntilDate Indicates that the Bundle is a valid Bundle until a
     *                          specified expiration date.
     * @return this
     */
    public BundleReader setHasValidUntilDate(final Boolean hasValidUntilDate) {
        this.hasValidUntilDate = hasValidUntilDate;
        return this;
    }

    /**
     * Can be `ValidUntilDate` or `DateUpdated`. Defaults to `DateCreated`.
     *
     * @param sortBy Can be `ValidUntilDate` or `DateUpdated`. Defaults to
     *               `DateCreated`
     * @return this
     */
    public BundleReader setSortBy(final Bundle.SortBy sortBy) {
        this.sortBy = sortBy;
        return this;
    }

    /**
     * Default is `DESC`. Can be `ASC` or `DESC`..
     *
     * @param sortDirection Default is `DESC`. Can be `ASC` or `DESC`.
     * @return this
     */
    public BundleReader setSortDirection(final Bundle.SortDirection sortDirection) {
        this.sortDirection = sortDirection;
        return this;
    }

    /**
     * Date to filter Bundles having their `valid_until_date` before or after the
     * specified date. Can be `ValidUntilDate&gt;=` or `ValidUntilDate&lt;=`. Both
     * can be used in conjunction as well. <a
     * href="https://en.wikipedia.org/wiki/ISO_8601">ISO 8601</a> is the acceptable
     * date format..
     *
     * @param validUntilDate Date to filter Bundles having their `valid_until_date`
     *                       before or after the specified date. Can be
     *                       `ValidUntilDate&gt;=` or `ValidUntilDate&lt;=`. Both
     *                       can be used in conjunction as well.
     * @return this
     */
    public BundleReader setValidUntilDate(final ZonedDateTime validUntilDate) {
        this.validUntilDateBefore = null;
        this.validUntilDateAfter = null;
        this.validUntilDate = validUntilDate;
        return this;
    }

    /**
     * Date to filter Bundles having their `valid_until_date` before or after the
     * specified date. Can be `ValidUntilDate&gt;=` or `ValidUntilDate&lt;=`. Both
     * can be used in conjunction as well. <a
     * href="https://en.wikipedia.org/wiki/ISO_8601">ISO 8601</a> is the acceptable
     * date format..
     *
     * @param validUntilDateBefore Date to filter Bundles having their
     *                             `valid_until_date` before or after the specified
     *                             date. Can be `ValidUntilDate&gt;=` or
     *                             `ValidUntilDate&lt;=`. Both can be used in
     *                             conjunction as well.
     * @return this
     */
    public BundleReader setValidUntilDateBefore(final ZonedDateTime validUntilDateBefore) {
        this.validUntilDate = null;
        this.validUntilDateBefore = validUntilDateBefore;
        return this;
    }

    /**
     * Date to filter Bundles having their `valid_until_date` before or after the
     * specified date. Can be `ValidUntilDate&gt;=` or `ValidUntilDate&lt;=`. Both
     * can be used in conjunction as well. <a
     * href="https://en.wikipedia.org/wiki/ISO_8601">ISO 8601</a> is the acceptable
     * date format..
     *
     * @param validUntilDateAfter Date to filter Bundles having their
     *                            `valid_until_date` before or after the specified
     *                            date. Can be `ValidUntilDate&gt;=` or
     *                            `ValidUntilDate&lt;=`. Both can be used in
     *                            conjunction as well.
     * @return this
     */
    public BundleReader setValidUntilDateAfter(final ZonedDateTime validUntilDateAfter) {
        this.validUntilDate = null;
        this.validUntilDateAfter = validUntilDateAfter;
        return this;
    }

    /**
     * Make the request to the Twilio API to perform the read.
     *
     * @param client TwilioRestClient with which to make the request
     * @return Bundle ResourceSet
     */
    @Override
    public ResourceSet<Bundle> read(final TwilioRestClient client) {
        return new ResourceSet<>(this, client, firstPage(client));
    }

    /**
     * Make the request to the Twilio API to perform the read.
     *
     * @param client TwilioRestClient with which to make the request
     * @return Bundle ResourceSet
     */
    @Override
    @SuppressWarnings("checkstyle:linelength")
    public Page<Bundle> firstPage(final TwilioRestClient client) {
        Request request = new Request(
            HttpMethod.GET,
            Domains.NUMBERS.toString(),
            "/v2/RegulatoryCompliance/Bundles"
        );

        addQueryParams(request);
        return pageForRequest(client, request);
    }

    /**
     * Retrieve the target page from the Twilio API.
     *
     * @param targetUrl API-generated URL for the requested results page
     * @param client TwilioRestClient with which to make the request
     * @return Bundle ResourceSet
     */
    @Override
    @SuppressWarnings("checkstyle:linelength")
    public Page<Bundle> getPage(final String targetUrl, final TwilioRestClient client) {
        Request request = new Request(
            HttpMethod.GET,
            targetUrl
        );

        return pageForRequest(client, request);
    }

    /**
     * Retrieve the next page from the Twilio API.
     *
     * @param page current page
     * @param client TwilioRestClient with which to make the request
     * @return Next Page
     */
    @Override
    public Page<Bundle> nextPage(final Page<Bundle> page,
                                 final TwilioRestClient client) {
        Request request = new Request(
            HttpMethod.GET,
            page.getNextPageUrl(Domains.NUMBERS.toString())
        );
        return pageForRequest(client, request);
    }

    /**
     * Retrieve the previous page from the Twilio API.
     *
     * @param page current page
     * @param client TwilioRestClient with which to make the request
     * @return Previous Page
     */
    @Override
    public Page<Bundle> previousPage(final Page<Bundle> page,
                                     final TwilioRestClient client) {
        Request request = new Request(
            HttpMethod.GET,
            page.getPreviousPageUrl(Domains.NUMBERS.toString())
        );
        return pageForRequest(client, request);
    }

    /**
     * Generate a Page of Bundle Resources for a given request.
     *
     * @param client TwilioRestClient with which to make the request
     * @param request Request to generate a page for
     * @return Page for the Request
     */
    private Page<Bundle> pageForRequest(final TwilioRestClient client, final Request request) {
        Response response = client.request(request);

        if (response == null) {
            throw new ApiConnectionException("Bundle read failed: Unable to connect to server");
        } else if (!TwilioRestClient.SUCCESS.test(response.getStatusCode())) {
            RestException restException = RestException.fromJson(response.getStream(), client.getObjectMapper());
            if (restException == null) {
                throw new ApiException("Server Error, no content");
            }
           throw new ApiException(restException);
        }

        return Page.fromJson(
            "results",
            response.getContent(),
            Bundle.class,
            client.getObjectMapper()
        );
    }

    /**
     * Add the requested query string arguments to the Request.
     *
     * @param request Request to add query string arguments to
     */
    private void addQueryParams(final Request request) {
        if (status != null) {
            request.addQueryParam("Status", status.toString());
        }

        if (friendlyName != null) {
            request.addQueryParam("FriendlyName", friendlyName);
        }

        if (regulationSid != null) {
            request.addQueryParam("RegulationSid", regulationSid);
        }

        if (isoCountry != null) {
            request.addQueryParam("IsoCountry", isoCountry);
        }

        if (numberType != null) {
            request.addQueryParam("NumberType", numberType);
        }

        if (hasValidUntilDate != null) {
            request.addQueryParam("HasValidUntilDate", hasValidUntilDate.toString());
        }

        if (sortBy != null) {
            request.addQueryParam("SortBy", sortBy.toString());
        }

        if (sortDirection != null) {
            request.addQueryParam("SortDirection", sortDirection.toString());
        }

        if (validUntilDate != null) {
            request.addQueryParam("ValidUntilDate", validUntilDate.format(DateTimeFormatter.ofPattern(Request.QUERY_STRING_DATE_TIME_FORMAT)));
        } else if (validUntilDateAfter != null || validUntilDateBefore != null) {
            request.addQueryDateTimeRange("ValidUntilDate", validUntilDateAfter, validUntilDateBefore);
        }

        if (getPageSize() != null) {
            request.addQueryParam("PageSize", Integer.toString(getPageSize()));
        }
    }
}