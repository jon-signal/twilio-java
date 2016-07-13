/**
 * This code was generated by
 * \ / _    _  _|   _  _
 *  | (_)\/(_)(_|\/| |(/_  v1.0.0
 *       /       /       
 */

package com.twilio.sdk.updater.api.v2010.account.call;

import com.twilio.sdk.client.TwilioRestClient;
import com.twilio.sdk.converter.Promoter;
import com.twilio.sdk.exception.ApiConnectionException;
import com.twilio.sdk.exception.ApiException;
import com.twilio.sdk.http.HttpMethod;
import com.twilio.sdk.http.Request;
import com.twilio.sdk.http.Response;
import com.twilio.sdk.resource.RestException;
import com.twilio.sdk.resource.api.v2010.account.call.Feedback;
import com.twilio.sdk.updater.Updater;

import java.util.List;

public class FeedbackUpdater extends Updater<Feedback> {
    private String accountSid;
    private final String callSid;
    private final Integer qualityScore;
    private List<Feedback.Issues> issue;

    /**
     * Construct a new FeedbackUpdater.
     * 
     * @param callSid The call_sid
     * @param qualityScore An integer from 1 to 5
     */
    public FeedbackUpdater(final String callSid, 
                           final Integer qualityScore) {
        this.callSid = callSid;
        this.qualityScore = qualityScore;
    }

    /**
     * Construct a new FeedbackUpdater.
     * 
     * @param accountSid The account_sid
     * @param callSid The call_sid
     * @param qualityScore An integer from 1 to 5
     */
    public FeedbackUpdater(final String accountSid, 
                           final String callSid, 
                           final Integer qualityScore) {
        this.accountSid = accountSid;
        this.callSid = callSid;
        this.qualityScore = qualityScore;
    }

    /**
     * One or more of the issues experienced during the call.
     * 
     * @param issue Issues experienced during the call
     * @return this
     */
    public FeedbackUpdater setIssue(final List<Feedback.Issues> issue) {
        this.issue = issue;
        return this;
    }

    /**
     * One or more of the issues experienced during the call.
     * 
     * @param issue Issues experienced during the call
     * @return this
     */
    public FeedbackUpdater setIssue(final Feedback.Issues issue) {
        return setIssue(Promoter.listOfOne(issue));
    }

    /**
     * Make the request to the Twilio API to perform the update.
     * 
     * @param client TwilioRestClient with which to make the request
     * @return Updated Feedback
     */
    @Override
    @SuppressWarnings("checkstyle:linelength")
    public Feedback execute(final TwilioRestClient client) {
        this.accountSid = this.accountSid == null ? client.getAccountSid() : this.accountSid;
        Request request = new Request(
            HttpMethod.POST,
            TwilioRestClient.Domains.API,
            "/2010-04-01/Accounts/" + this.accountSid + "/Calls/" + this.callSid + "/Feedback.json",
            client.getAccountSid()
        );
        
        addPostParams(request);
        Response response = client.request(request);
        
        if (response == null) {
            throw new ApiConnectionException("Feedback update failed: Unable to connect to server");
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
        
        return Feedback.fromJson(response.getStream(), client.getObjectMapper());
    }

    /**
     * Add the requested post parameters to the Request.
     * 
     * @param request Request to add post params to
     */
    private void addPostParams(final Request request) {
        if (qualityScore != null) {
            request.addPostParam("QualityScore", qualityScore.toString());
        }
        
        if (issue != null) {
            for (Object prop : issue) {
                request.addPostParam("Issue", prop.toString());
            }
        }
    }
}