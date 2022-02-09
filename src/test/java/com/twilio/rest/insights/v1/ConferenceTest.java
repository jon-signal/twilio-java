/**
 * This code was generated by
 * \ / _    _  _|   _  _
 *  | (_)\/(_)(_|\/| |(/_  v1.0.0
 *       /       /
 */

package com.twilio.rest.insights.v1;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.twilio.Twilio;
import com.twilio.converter.DateConverter;
import com.twilio.converter.Promoter;
import com.twilio.exception.TwilioException;
import com.twilio.http.HttpMethod;
import com.twilio.http.Request;
import com.twilio.http.Response;
import com.twilio.http.TwilioRestClient;
import com.twilio.rest.Domains;
import mockit.Mocked;
import mockit.NonStrictExpectations;
import org.junit.Before;
import org.junit.Test;

import java.net.URI;

import static com.twilio.TwilioTest.serialize;
import static org.junit.Assert.*;

public class ConferenceTest {
    @Mocked
    private TwilioRestClient twilioRestClient;

    @Before
    public void setUp() throws Exception {
        Twilio.init("AC123", "AUTH TOKEN");
    }

    @Test
    public void testFetchRequest() {
        new NonStrictExpectations() {{
            Request request = new Request(HttpMethod.GET,
                                          Domains.INSIGHTS.toString(),
                                          "/v1/Conferences/CFXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");

            twilioRestClient.request(request);
            times = 1;
            result = new Response("", 500);
            twilioRestClient.getAccountSid();
            result = "AC123";
        }};

        try {
            Conference.fetcher("CFXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX").fetch();
            fail("Expected TwilioException to be thrown for 500");
        } catch (TwilioException e) {}
    }

    @Test
    public void testFetchResponse() {
        new NonStrictExpectations() {{
            twilioRestClient.request((Request) any);
            result = new Response("{\"conference_sid\": \"CFaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"account_sid\": \"ACaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"friendly_name\": \"conference1\",\"start_time\": \"2021-10-08T02:58:51Z\",\"create_time\": \"2021-10-08T02:58:47Z\",\"end_time\": \"2021-10-08T03:00:02Z\",\"duration_seconds\": 76,\"connect_duration_seconds\": 72,\"status\": \"completed\",\"max_participants\": 250,\"max_concurrent_participants\": 4,\"unique_participants\": 4,\"end_reason\": \"last_participant_left\",\"ended_by\": \"CAaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"mixer_region\": \"us1\",\"mixer_region_requested\": \"us1\",\"recording_enabled\": false,\"processing_state\": \"complete\",\"detected_issues\": {\"call_quality\": 1,\"region_configuration\": 0,\"participant_behavior\": 3},\"tags\": [\"duplicate_identity\",\"detected_silence\",\"participant_behavior_issues\"],\"tag_info\": {\"duplicate_identity\": [{\"participant_identity\": \"client:+10000000000\",\"participant_sids\": [\"CPaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"CPaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaab\"]}]},\"url\": \"https://insights.twilio.com/v1/Conferences/CFaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"links\": {\"conference_participants\": \"https://insights.twilio.com/v1/Conferences/CFaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/Participants\"}}", TwilioRestClient.HTTP_STATUS_CODE_OK);
            twilioRestClient.getObjectMapper();
            result = new ObjectMapper();
        }};

        assertNotNull(Conference.fetcher("CFXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX").fetch());
    }

    @Test
    public void testReadRequest() {
        new NonStrictExpectations() {{
            Request request = new Request(HttpMethod.GET,
                                          Domains.INSIGHTS.toString(),
                                          "/v1/Conferences");

            twilioRestClient.request(request);
            times = 1;
            result = new Response("", 500);
            twilioRestClient.getAccountSid();
            result = "AC123";
        }};

        try {
            Conference.reader().read();
            fail("Expected TwilioException to be thrown for 500");
        } catch (TwilioException e) {}
    }

    @Test
    public void testReadFullResponse() {
        new NonStrictExpectations() {{
            twilioRestClient.request((Request) any);
            result = new Response("{\"meta\": {\"page\": 0,\"page_size\": 25,\"first_page_url\": \"https://insights.twilio.com/v1/Conferences?CreatedAfter=2021-10-09T17%3A20%3A53Z&CreatedBefore=2021-10-12T18%3A37%3A53Z&PageSize=25&Page=0\",\"previous_page_url\": null,\"url\": \"https://insights.twilio.com/v1/Conferences?CreatedAfter=2021-10-09T17%3A20%3A53Z&CreatedBefore=2021-10-12T18%3A37%3A53Z&PageSize=25&Page=0\",\"next_page_url\": null,\"key\": \"conferences\"},\"conferences\": [{\"conference_sid\": \"CFaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"account_sid\": \"ACaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"friendly_name\": \"conference 1\",\"start_time\": \"2021-10-12T18:11:10Z\",\"create_time\": \"2021-10-12T18:11:09Z\",\"end_time\": \"2021-10-12T18:11:15Z\",\"duration_seconds\": 7,\"connect_duration_seconds\": 5,\"status\": \"completed\",\"max_participants\": 250,\"max_concurrent_participants\": 2,\"unique_participants\": 2,\"end_reason\": \"last_participant_left\",\"ended_by\": \"CAaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"mixer_region\": \"us1\",\"mixer_region_requested\": null,\"recording_enabled\": false,\"processing_state\": \"complete\",\"detected_issues\": {\"call_quality\": 1,\"region_configuration\": 0,\"participant_behavior\": 0},\"tags\": null,\"tag_info\": null,\"url\": \"https://insights.twilio.com/v1/Conferences/CFaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"links\": {\"conference_participants\": \"https://insights.twilio.com/v1/Conferences/CFaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/Participants\"}},{\"conference_sid\": \"CFaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaab\",\"account_sid\": \"ACaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"friendly_name\": \"conference 2\",\"start_time\": null,\"create_time\": \"2021-10-12T18:09:21Z\",\"end_time\": \"2021-10-12T18:09:21Z\",\"duration_seconds\": 1,\"connect_duration_seconds\": 0,\"status\": \"completed\",\"max_participants\": 250,\"max_concurrent_participants\": 2,\"unique_participants\": 3,\"end_reason\": \"last_participant_left\",\"ended_by\": \"CAaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaab\",\"mixer_region\": \"us1\",\"mixer_region_requested\": null,\"recording_enabled\": false,\"processing_state\": \"complete\",\"detected_issues\": {\"call_quality\": 1,\"region_configuration\": 0,\"participant_behavior\": 0},\"tags\": [\"detected_silence\",\"participant_behavior_issues\"],\"tag_info\": null,\"url\": \"https://insights.twilio.com/v1/Conferences/CFaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaab\",\"links\": {\"conference_participants\": \"https://insights.twilio.com/v1/Conferences/CFaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaab/Participants\"}}]}", TwilioRestClient.HTTP_STATUS_CODE_OK);
            twilioRestClient.getObjectMapper();
            result = new ObjectMapper();
        }};

        assertNotNull(Conference.reader().read());
    }

    @Test
    public void testReadWithRegionResponse() {
        new NonStrictExpectations() {{
            twilioRestClient.request((Request) any);
            result = new Response("{\"meta\": {\"page\": 0,\"page_size\": 25,\"first_page_url\": \"https://insights.twilio.com/v1/Conferences?MixerRegion=au1&Status=completed&PageSize=25&Page=0\",\"previous_page_url\": null,\"url\": \"https://insights.twilio.com/v1/Conferences?MixerRegion=au1&Status=completed&PageSize=25&Page=0\",\"next_page_url\": null,\"key\": \"conferences\"},\"conferences\": [{\"conference_sid\": \"CFaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"account_sid\": \"ACaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"friendly_name\": \"conference 1\",\"start_time\": \"2021-10-12T18:19:10Z\",\"create_time\": \"2021-10-12T18:19:09Z\",\"end_time\": \"2021-10-12T18:20:17Z\",\"duration_seconds\": 7,\"connect_duration_seconds\": 5,\"status\": \"completed\",\"max_participants\": 250,\"max_concurrent_participants\": 2,\"unique_participants\": 2,\"end_reason\": \"participant_with_end_conference_on_exit_kicked\",\"ended_by\": \"CAaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"mixer_region\": \"au1\",\"mixer_region_requested\": \"au1\",\"recording_enabled\": true,\"processing_state\": \"complete\",\"detected_issues\": {\"call_quality\": 0,\"region_configuration\": 2,\"participant_behavior\": 0},\"tags\": [\"region_configuration_issues\"],\"tag_info\": null,\"url\": \"https://insights.twilio.com/v1/Conferences/CFaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"links\": {\"conference_participants\": \"https://insights.twilio.com/v1/Conferences/CFaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/Participants\"}},{\"conference_sid\": \"CFaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaab\",\"account_sid\": \"ACaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"friendly_name\": \"conference 2\",\"start_time\": \"2021-10-12T18:16:53Z\",\"create_time\": \"2021-10-12T18:16:51Z\",\"end_time\": \"2021-10-12T18:17:20Z\",\"duration_seconds\": 30,\"connect_duration_seconds\": 27,\"status\": \"completed\",\"max_participants\": 250,\"max_concurrent_participants\": 2,\"unique_participants\": 2,\"end_reason\": \"last_participant_left\",\"ended_by\": \"CAaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaab\",\"mixer_region\": \"au1\",\"mixer_region_requested\": null,\"recording_enabled\": false,\"processing_state\": \"complete\",\"detected_issues\": {\"call_quality\": 0,\"region_configuration\": 2,\"participant_behavior\": 3},\"tags\": [\"detected_silence\",\"region_configuration_issues\",\"participant_behavior_issues\"],\"tag_info\": null,\"url\": \"https://insights.twilio.com/v1/Conferences/CFaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaab\",\"links\": {\"conference_participants\": \"https://insights.twilio.com/v1/Conferences/CFaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaab/Participants\"}}]}", TwilioRestClient.HTTP_STATUS_CODE_OK);
            twilioRestClient.getObjectMapper();
            result = new ObjectMapper();
        }};

        assertNotNull(Conference.reader().read());
    }

    @Test
    public void testReadWithFriendlynameStartfailureResponse() {
        new NonStrictExpectations() {{
            twilioRestClient.request((Request) any);
            result = new Response("{\"meta\": {\"page\": 0,\"page_size\": 25,\"first_page_url\": \"https://insights.twilio.com/v1/Conferences?FriendlyName=outboundConfCallTransferThrice_1&Status=not_started&PageSize=25&Page=0\",\"previous_page_url\": null,\"url\": \"https://insights.twilio.com/v1/Conferences?FriendlyName=outboundConfCallTransferThrice_1&Status=not_started&PageSize=25&Page=0\",\"next_page_url\": null,\"key\": \"conferences\"},\"conferences\": [{\"conference_sid\": \"CFaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"account_sid\": \"ACaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"friendly_name\": \"outboundConfCallTransferThrice_1\",\"start_time\": null,\"create_time\": \"2021-11-18T00:09:09Z\",\"end_time\": \"2021-11-18T00:09:52Z\",\"duration_seconds\": 7,\"connect_duration_seconds\": 0,\"status\": \"not_started\",\"max_participants\": 250,\"max_concurrent_participants\": 1,\"unique_participants\": 1,\"end_reason\": \"last_participant_left\",\"ended_by\": \"CAaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"mixer_region\": null,\"mixer_region_requested\": null,\"recording_enabled\": false,\"processing_state\": \"complete\",\"detected_issues\": {\"call_quality\": 0,\"region_configuration\": 0,\"participant_behavior\": 0},\"tags\": [\"participant_behavior_issues\",\"start_failure\"],\"tag_info\": {\"start_failure\": {\"reason\": \"no_concurrent_participants\"}},\"url\": \"https://insights.twilio.com/v1/Conferences/CFaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"links\": {\"conference_participants\": \"https://insights.twilio.com/v1/Conferences/CFaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/Participants\"}}]}", TwilioRestClient.HTTP_STATUS_CODE_OK);
            twilioRestClient.getObjectMapper();
            result = new ObjectMapper();
        }};

        assertNotNull(Conference.reader().read());
    }

    @Test
    public void testReadWithDuplicateIdentityResponse() {
        new NonStrictExpectations() {{
            twilioRestClient.request((Request) any);
            result = new Response("{\"meta\": {\"page\": 0,\"page_size\": 25,\"first_page_url\": \"https://insights.twilio.com/v1/Conferences?Tags=duplicate_identity&PageSize=25&Page=0\",\"previous_page_url\": null,\"url\": \"https://insights.twilio.com/v1/Conferences?Tags=duplicate_identity&PageSize=25&Page=0\",\"next_page_url\": null,\"key\": \"conferences\"},\"conferences\": [{\"conference_sid\": \"CFaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"account_sid\": \"ACaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"friendly_name\": \"conference 1\",\"start_time\": \"2021-11-17T16:21:45Z\",\"create_time\": \"2021-11-17T16:21:40Z\",\"end_time\": \"2021-11-17T16:22:11Z\",\"duration_seconds\": 32,\"connect_duration_seconds\": 27,\"status\": \"not_started\",\"max_participants\": 250,\"max_concurrent_participants\": 3,\"unique_participants\": 4,\"end_reason\": \"last_participant_left\",\"ended_by\": \"CAaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"mixer_region\": \"us1\",\"mixer_region_requested\": null,\"recording_enabled\": false,\"processing_state\": \"complete\",\"detected_issues\": {\"call_quality\": 0,\"region_configuration\": 0,\"participant_behavior\": 0},\"tags\": [\"duplicate_identity\",\"detected_silence\",\"participant_behavior_issues\"],\"tag_info\": {\"duplicate_identity\": [{\"participant_identity\": \"client:+10000000000\",\"participant_sids\": [\"CPaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"CPaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaab\"]}]},\"url\": \"https://insights.twilio.com/v1/Conferences/CFaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"links\": {\"conference_participants\": \"https://insights.twilio.com/v1/Conferences/CFaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/Participants\"}}]}", TwilioRestClient.HTTP_STATUS_CODE_OK);
            twilioRestClient.getObjectMapper();
            result = new ObjectMapper();
        }};

        assertNotNull(Conference.reader().read());
    }

    @Test
    public void testReadWithDetectedIssueEndreasonResponse() {
        new NonStrictExpectations() {{
            twilioRestClient.request((Request) any);
            result = new Response("{\"meta\": {\"page\": 0,\"page_size\": 25,\"first_page_url\": \"https://insights.twilio.com/v1/Conferences?DetectedIssues=call_quality&EndReason=participant_with_end_conference_on_exit_left&PageSize=25&Page=0\",\"previous_page_url\": null,\"url\": \"https://insights.twilio.com/v1/Conferences?DetectedIssues=call_quality&EndReason=participant_with_end_conference_on_exit_left&PageSize=25&Page=0\",\"next_page_url\": null,\"key\": \"conferences\"},\"conferences\": [{\"conference_sid\": \"CFaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"account_sid\": \"ACaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"friendly_name\": \"conference 1\",\"start_time\": \"2021-11-17T16:21:45Z\",\"create_time\": \"2021-11-17T16:21:40Z\",\"end_time\": \"2021-11-17T16:22:11Z\",\"duration_seconds\": 32,\"connect_duration_seconds\": 27,\"status\": \"not_started\",\"max_participants\": 250,\"max_concurrent_participants\": 3,\"unique_participants\": 3,\"end_reason\": \"participant_with_end_conference_on_exit_left\",\"ended_by\": \"CAaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"mixer_region\": \"us1\",\"mixer_region_requested\": null,\"recording_enabled\": false,\"processing_state\": \"complete\",\"detected_issues\": {\"call_quality\": 3,\"region_configuration\": 0,\"participant_behavior\": 1},\"tags\": [\"high_packet_loss\",\"low_mos\",\"participant_behavior_issues\",\"quality_warnings\",\"high_jitter\",\"detected_silence\"],\"tag_info\": null,\"url\": \"https://insights.twilio.com/v1/Conferences/CFaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"links\": {\"conference_participants\": \"https://insights.twilio.com/v1/Conferences/CFaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa/Participants\"}}]}", TwilioRestClient.HTTP_STATUS_CODE_OK);
            twilioRestClient.getObjectMapper();
            result = new ObjectMapper();
        }};

        assertNotNull(Conference.reader().read());
    }
}