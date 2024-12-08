
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
    "boards",
    "orgs"
})
@Generated("jsonschema2pojo")
public class Limits {

    @JsonProperty("boards")
    private Boards boards;
    @JsonProperty("orgs")
    private Orgs orgs;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    @JsonProperty("boards")
    public Boards getBoards() {
        return boards;
    }

    @JsonProperty("boards")
    public void setBoards(Boards boards) {
        this.boards = boards;
    }

    @JsonProperty("orgs")
    public Orgs getOrgs() {
        return orgs;
    }

    @JsonProperty("orgs")
    public void setOrgs(Orgs orgs) {
        this.orgs = orgs;
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
        sb.append(Limits.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("boards");
        sb.append('=');
        sb.append(((this.boards == null)?"<null>":this.boards));
        sb.append(',');
        sb.append("orgs");
        sb.append('=');
        sb.append(((this.orgs == null)?"<null>":this.orgs));
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
        result = ((result* 31)+((this.boards == null)? 0 :this.boards.hashCode()));
        result = ((result* 31)+((this.orgs == null)? 0 :this.orgs.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Limits) == false) {
            return false;
        }
        Limits rhs = ((Limits) other);
        return ((((this.boards == rhs.boards)||((this.boards!= null)&&this.boards.equals(rhs.boards)))&&((this.orgs == rhs.orgs)||((this.orgs!= null)&&this.orgs.equals(rhs.orgs))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))));
    }

}
