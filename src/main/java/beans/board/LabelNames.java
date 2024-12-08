
package beans.board;

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
    "green",
    "yellow",
    "orange",
    "red",
    "purple",
    "blue",
    "sky",
    "lime",
    "pink",
    "black"
})
@Generated("jsonschema2pojo")
public class LabelNames {

    @JsonProperty("green")
    private String green;
    @JsonProperty("yellow")
    private String yellow;
    @JsonProperty("orange")
    private String orange;
    @JsonProperty("red")
    private String red;
    @JsonProperty("purple")
    private String purple;
    @JsonProperty("blue")
    private String blue;
    @JsonProperty("sky")
    private String sky;
    @JsonProperty("lime")
    private String lime;
    @JsonProperty("pink")
    private String pink;
    @JsonProperty("black")
    private String black;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    @JsonProperty("green")
    public String getGreen() {
        return green;
    }

    @JsonProperty("green")
    public void setGreen(String green) {
        this.green = green;
    }

    @JsonProperty("yellow")
    public String getYellow() {
        return yellow;
    }

    @JsonProperty("yellow")
    public void setYellow(String yellow) {
        this.yellow = yellow;
    }

    @JsonProperty("orange")
    public String getOrange() {
        return orange;
    }

    @JsonProperty("orange")
    public void setOrange(String orange) {
        this.orange = orange;
    }

    @JsonProperty("red")
    public String getRed() {
        return red;
    }

    @JsonProperty("red")
    public void setRed(String red) {
        this.red = red;
    }

    @JsonProperty("purple")
    public String getPurple() {
        return purple;
    }

    @JsonProperty("purple")
    public void setPurple(String purple) {
        this.purple = purple;
    }

    @JsonProperty("blue")
    public String getBlue() {
        return blue;
    }

    @JsonProperty("blue")
    public void setBlue(String blue) {
        this.blue = blue;
    }

    @JsonProperty("sky")
    public String getSky() {
        return sky;
    }

    @JsonProperty("sky")
    public void setSky(String sky) {
        this.sky = sky;
    }

    @JsonProperty("lime")
    public String getLime() {
        return lime;
    }

    @JsonProperty("lime")
    public void setLime(String lime) {
        this.lime = lime;
    }

    @JsonProperty("pink")
    public String getPink() {
        return pink;
    }

    @JsonProperty("pink")
    public void setPink(String pink) {
        this.pink = pink;
    }

    @JsonProperty("black")
    public String getBlack() {
        return black;
    }

    @JsonProperty("black")
    public void setBlack(String black) {
        this.black = black;
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
        sb.append(LabelNames.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("green");
        sb.append('=');
        sb.append(((this.green == null)?"<null>":this.green));
        sb.append(',');
        sb.append("yellow");
        sb.append('=');
        sb.append(((this.yellow == null)?"<null>":this.yellow));
        sb.append(',');
        sb.append("orange");
        sb.append('=');
        sb.append(((this.orange == null)?"<null>":this.orange));
        sb.append(',');
        sb.append("red");
        sb.append('=');
        sb.append(((this.red == null)?"<null>":this.red));
        sb.append(',');
        sb.append("purple");
        sb.append('=');
        sb.append(((this.purple == null)?"<null>":this.purple));
        sb.append(',');
        sb.append("blue");
        sb.append('=');
        sb.append(((this.blue == null)?"<null>":this.blue));
        sb.append(',');
        sb.append("sky");
        sb.append('=');
        sb.append(((this.sky == null)?"<null>":this.sky));
        sb.append(',');
        sb.append("lime");
        sb.append('=');
        sb.append(((this.lime == null)?"<null>":this.lime));
        sb.append(',');
        sb.append("pink");
        sb.append('=');
        sb.append(((this.pink == null)?"<null>":this.pink));
        sb.append(',');
        sb.append("black");
        sb.append('=');
        sb.append(((this.black == null)?"<null>":this.black));
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
        result = ((result* 31)+((this.orange == null)? 0 :this.orange.hashCode()));
        result = ((result* 31)+((this.red == null)? 0 :this.red.hashCode()));
        result = ((result* 31)+((this.sky == null)? 0 :this.sky.hashCode()));
        result = ((result* 31)+((this.pink == null)? 0 :this.pink.hashCode()));
        result = ((result* 31)+((this.green == null)? 0 :this.green.hashCode()));
        result = ((result* 31)+((this.blue == null)? 0 :this.blue.hashCode()));
        result = ((result* 31)+((this.lime == null)? 0 :this.lime.hashCode()));
        result = ((result* 31)+((this.yellow == null)? 0 :this.yellow.hashCode()));
        result = ((result* 31)+((this.black == null)? 0 :this.black.hashCode()));
        result = ((result* 31)+((this.purple == null)? 0 :this.purple.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof LabelNames) == false) {
            return false;
        }
        LabelNames rhs = ((LabelNames) other);
        return ((((((((((((this.orange == rhs.orange)||((this.orange!= null)&&this.orange.equals(rhs.orange)))&&((this.red == rhs.red)||((this.red!= null)&&this.red.equals(rhs.red))))&&((this.sky == rhs.sky)||((this.sky!= null)&&this.sky.equals(rhs.sky))))&&((this.pink == rhs.pink)||((this.pink!= null)&&this.pink.equals(rhs.pink))))&&((this.green == rhs.green)||((this.green!= null)&&this.green.equals(rhs.green))))&&((this.blue == rhs.blue)||((this.blue!= null)&&this.blue.equals(rhs.blue))))&&((this.lime == rhs.lime)||((this.lime!= null)&&this.lime.equals(rhs.lime))))&&((this.yellow == rhs.yellow)||((this.yellow!= null)&&this.yellow.equals(rhs.yellow))))&&((this.black == rhs.black)||((this.black!= null)&&this.black.equals(rhs.black))))&&((this.purple == rhs.purple)||((this.purple!= null)&&this.purple.equals(rhs.purple))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))));
    }

}
