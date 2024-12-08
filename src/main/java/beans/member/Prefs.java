
package beans.member;

import java.util.LinkedHashMap;
import java.util.Map;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "sendSummaries",
    "minutesBetweenSummaries",
    "minutesBeforeDeadlineToNotify",
    "colorBlind",
    "locale",
    "privacy"
})
@Generated("jsonschema2pojo")
public class Prefs {

    @JsonProperty("sendSummaries")
    private Boolean sendSummaries;
    @JsonProperty("minutesBetweenSummaries")
    private Integer minutesBetweenSummaries;
    @JsonProperty("minutesBeforeDeadlineToNotify")
    private Integer minutesBeforeDeadlineToNotify;
    @JsonProperty("colorBlind")
    private Boolean colorBlind;
    @JsonProperty("locale")
    private String locale;
    @JsonProperty("privacy")
    private Privacy privacy;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    @JsonProperty("sendSummaries")
    public Boolean getSendSummaries() {
        return sendSummaries;
    }

    @JsonProperty("sendSummaries")
    public void setSendSummaries(Boolean sendSummaries) {
        this.sendSummaries = sendSummaries;
    }

    @JsonProperty("minutesBetweenSummaries")
    public Integer getMinutesBetweenSummaries() {
        return minutesBetweenSummaries;
    }

    @JsonProperty("minutesBetweenSummaries")
    public void setMinutesBetweenSummaries(Integer minutesBetweenSummaries) {
        this.minutesBetweenSummaries = minutesBetweenSummaries;
    }

    @JsonProperty("minutesBeforeDeadlineToNotify")
    public Integer getMinutesBeforeDeadlineToNotify() {
        return minutesBeforeDeadlineToNotify;
    }

    @JsonProperty("minutesBeforeDeadlineToNotify")
    public void setMinutesBeforeDeadlineToNotify(Integer minutesBeforeDeadlineToNotify) {
        this.minutesBeforeDeadlineToNotify = minutesBeforeDeadlineToNotify;
    }

    @JsonProperty("colorBlind")
    public Boolean getColorBlind() {
        return colorBlind;
    }

    @JsonProperty("colorBlind")
    public void setColorBlind(Boolean colorBlind) {
        this.colorBlind = colorBlind;
    }

    @JsonProperty("locale")
    public String getLocale() {
        return locale;
    }

    @JsonProperty("locale")
    public void setLocale(String locale) {
        this.locale = locale;
    }

    @JsonProperty("privacy")
    public Privacy getPrivacy() {
        return privacy;
    }

    @JsonProperty("privacy")
    public void setPrivacy(Privacy privacy) {
        this.privacy = privacy;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Prefs.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("sendSummaries");
        sb.append('=');
        sb.append(((this.sendSummaries == null)?"<null>":this.sendSummaries));
        sb.append(',');
        sb.append("minutesBetweenSummaries");
        sb.append('=');
        sb.append(((this.minutesBetweenSummaries == null)?"<null>":this.minutesBetweenSummaries));
        sb.append(',');
        sb.append("minutesBeforeDeadlineToNotify");
        sb.append('=');
        sb.append(((this.minutesBeforeDeadlineToNotify == null)?"<null>":this.minutesBeforeDeadlineToNotify));
        sb.append(',');
        sb.append("colorBlind");
        sb.append('=');
        sb.append(((this.colorBlind == null)?"<null>":this.colorBlind));
        sb.append(',');
        sb.append("locale");
        sb.append('=');
        sb.append(((this.locale == null)?"<null>":this.locale));
        sb.append(',');
        sb.append("privacy");
        sb.append('=');
        sb.append(((this.privacy == null)?"<null>":this.privacy));
        sb.append(',');
        sb.append("additionalProperties");
        sb.append('=');
        sb.append(((this.additionalProperties == null)?"<null>":this.additionalProperties));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

    @Override
    public int hashCode() {
        int result = 1;
        result = ((result* 31)+((this.colorBlind == null)? 0 :this.colorBlind.hashCode()));
        result = ((result* 31)+((this.minutesBetweenSummaries == null)? 0 :this.minutesBetweenSummaries.hashCode()));
        result = ((result* 31)+((this.sendSummaries == null)? 0 :this.sendSummaries.hashCode()));
        result = ((result* 31)+((this.minutesBeforeDeadlineToNotify == null)? 0 :this.minutesBeforeDeadlineToNotify.hashCode()));
        result = ((result* 31)+((this.privacy == null)? 0 :this.privacy.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.locale == null)? 0 :this.locale.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Prefs) == false) {
            return false;
        }
        Prefs rhs = ((Prefs) other);
        return ((((((((this.colorBlind == rhs.colorBlind)||((this.colorBlind!= null)&&this.colorBlind.equals(rhs.colorBlind)))&&((this.minutesBetweenSummaries == rhs.minutesBetweenSummaries)||((this.minutesBetweenSummaries!= null)&&this.minutesBetweenSummaries.equals(rhs.minutesBetweenSummaries))))&&((this.sendSummaries == rhs.sendSummaries)||((this.sendSummaries!= null)&&this.sendSummaries.equals(rhs.sendSummaries))))&&((this.minutesBeforeDeadlineToNotify == rhs.minutesBeforeDeadlineToNotify)||((this.minutesBeforeDeadlineToNotify!= null)&&this.minutesBeforeDeadlineToNotify.equals(rhs.minutesBeforeDeadlineToNotify))))&&((this.privacy == rhs.privacy)||((this.privacy!= null)&&this.privacy.equals(rhs.privacy))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.locale == rhs.locale)||((this.locale!= null)&&this.locale.equals(rhs.locale))));
    }

}
