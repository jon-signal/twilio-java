/**
 * This code was generated by
 * \ / _    _  _|   _  _
 *  | (_)\/(_)(_|\/| |(/_  v1.0.0
 *       /       /       
 */

package com.twilio.sdk.deleter.api.v2010.account;

import com.twilio.sdk.client.TwilioRestClient;
import com.twilio.sdk.deleter.Deleter;
import com.twilio.sdk.exception.ApiConnectionException;
import com.twilio.sdk.exception.ApiException;
import com.twilio.sdk.http.HttpMethod;
import com.twilio.sdk.http.Request;
import com.twilio.sdk.http.Response;
import com.twilio.sdk.resource.RestException;
import com.twilio.sdk.resource.api.v2010.account.SigningKey;

public class SigningKeyDeleter extends Deleter<SigningKey> {
    private String accountSid;
    private final String sid;

    /**
     * Construct a new SigningKeyDeleter.
     * 
     * @param sid The sid
     */
    public SigningKeyDeleter(final String sid) {
        this.sid = sid;
    }

    /**
     * Construct a new SigningKeyDeleter.
     * 
     * @param accountSid The account_sid
     * @param sid The sid
     */
    public SigningKeyDeleter(final String accountSid, 
                             final String sid) {
        this.accountSid = accountSid;
        this.sid = sid;
    }

    /**
     * Make the request to the Twilio API to perform the delete.
     * 
     * @param client TwilioRestClient with which to make the request
     */
    @Override
    @SuppressWarnings("checkstyle:linelength")
    public boolean execute(final TwilioRestClient client) {
        this.accountSid = this.accountSid == null ? client.getAccountSid() : this.accountSid;
        Request request = new Request(
            HttpMethod.DELETE,
            TwilioRestClient.Domains.API,
            "/2010-04-01/Accounts/" + this.accountSid + "/SigningKeys/" + this.sid + ".json",
            client.getAccountSid()
        );
        
        Response response = client.request(request);
        
        if (response == null) {
            throw new ApiConnectionException("SigningKey delete failed: Unable to connect to server");
        } else if (!TwilioRestClient.SUCCESS.apply(response.getStatusCode())) {
            RestException restException = RestException.fromJson(response.getStream(), client.getObjectMapper());
            if (restException == null) {
                throw new ApiException("Server Error, no content");
            }
        
            throw new ApiException(
                restException.getMessage(),
                restException.getCode(),
                restException.getMoreInfo(),
                restException.getStatus(),
                null
            );
        }
        
        return response.getStatusCode() == 204;
    }
}