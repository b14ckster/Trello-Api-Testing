
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
    "status",
    "disableAt",
    "warnAt"
})
@Generated("jsonschema2pojo")
public class TotalPerMember {

    @JsonProperty("status")
    private String status;
    @JsonProperty("disableAt")
    private Integer disableAt;
    @JsonProperty("warnAt")
    private Integer warnAt;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    @JsonProperty("status")
    public String getStatus() {
        return status;
    }

    @JsonProperty("status")
    public void setStatus(String status) {
        this.status = status;
    }

    @JsonProperty("disableAt")
    public Integer getDisableAt() {
        return disableAt;
    }

    @JsonProperty("disableAt")
    public void setDisableAt(Integer disableAt) {
        this.disableAt = disableAt;
    }

    @JsonProperty("warnAt")
    public Integer getWarnAt() {
        return warnAt;
    }

    @JsonProperty("warnAt")
    public void setWarnAt(Integer warnAt) {
        this.warnAt = warnAt;
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
        sb.append(TotalPerMember.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("status");
        sb.append('=');
        sb.append(((this.status == null)?"<null>":this.status));
        sb.append(',');
        sb.append("disableAt");
        sb.append('=');
        sb.append(((this.disableAt == null)?"<null>":this.disableAt));
        sb.append(',');
        sb.append("warnAt");
        sb.append('=');
        sb.append(((this.warnAt == null)?"<null>":this.warnAt));
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
        result = ((result* 31)+((this.disableAt == null)? 0 :this.disableAt.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.warnAt == null)? 0 :this.warnAt.hashCode()));
        result = ((result* 31)+((this.status == null)? 0 :this.status.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof TotalPerMember) == false) {
            return false;
        }
        TotalPerMember rhs = ((TotalPerMember) other);
        return (((((this.disableAt == rhs.disableAt)||((this.disableAt!= null)&&this.disableAt.equals(rhs.disableAt)))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.warnAt == rhs.warnAt)||((this.warnAt!= null)&&this.warnAt.equals(rhs.warnAt))))&&((this.status == rhs.status)||((this.status!= null)&&this.status.equals(rhs.status))));
    }

}
