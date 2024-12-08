
package beans.board;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
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
    "permissionLevel",
    "hideVotes",
    "voting",
    "comments",
    "selfJoin",
    "cardCovers",
    "isTemplate",
    "cardAging",
    "calendarFeedEnabled",
    "background",
    "backgroundImage",
    "backgroundImageScaled",
    "backgroundTile",
    "backgroundBrightness",
    "backgroundBottomColor",
    "backgroundTopColor",
    "canBePublic",
    "canBeEnterprise",
    "canBeOrg",
    "canBePrivate",
    "canInvite"
})
@Generated("jsonschema2pojo")
public class Prefs {

    @JsonProperty("permissionLevel")
    private String permissionLevel;
    @JsonProperty("hideVotes")
    private Boolean hideVotes;
    @JsonProperty("voting")
    private String voting;
    @JsonProperty("comments")
    private String comments;
    @JsonProperty("selfJoin")
    private Boolean selfJoin;
    @JsonProperty("cardCovers")
    private Boolean cardCovers;
    @JsonProperty("isTemplate")
    private Boolean isTemplate;
    @JsonProperty("cardAging")
    private String cardAging;
    @JsonProperty("calendarFeedEnabled")
    private Boolean calendarFeedEnabled;
    @JsonProperty("background")
    private String background;
    @JsonProperty("backgroundImage")
    private String backgroundImage;
    @JsonProperty("backgroundImageScaled")
    private List<BackgroundImageScaled> backgroundImageScaled = new ArrayList<BackgroundImageScaled>();
    @JsonProperty("backgroundTile")
    private Boolean backgroundTile;
    @JsonProperty("backgroundBrightness")
    private String backgroundBrightness;
    @JsonProperty("backgroundBottomColor")
    private String backgroundBottomColor;
    @JsonProperty("backgroundTopColor")
    private String backgroundTopColor;
    @JsonProperty("canBePublic")
    private Boolean canBePublic;
    @JsonProperty("canBeEnterprise")
    private Boolean canBeEnterprise;
    @JsonProperty("canBeOrg")
    private Boolean canBeOrg;
    @JsonProperty("canBePrivate")
    private Boolean canBePrivate;
    @JsonProperty("canInvite")
    private Boolean canInvite;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    @JsonProperty("permissionLevel")
    public String getPermissionLevel() {
        return permissionLevel;
    }

    @JsonProperty("permissionLevel")
    public void setPermissionLevel(String permissionLevel) {
        this.permissionLevel = permissionLevel;
    }

    @JsonProperty("hideVotes")
    public Boolean getHideVotes() {
        return hideVotes;
    }

    @JsonProperty("hideVotes")
    public void setHideVotes(Boolean hideVotes) {
        this.hideVotes = hideVotes;
    }

    @JsonProperty("voting")
    public String getVoting() {
        return voting;
    }

    @JsonProperty("voting")
    public void setVoting(String voting) {
        this.voting = voting;
    }

    @JsonProperty("comments")
    public String getComments() {
        return comments;
    }

    @JsonProperty("comments")
    public void setComments(String comments) {
        this.comments = comments;
    }

    @JsonProperty("selfJoin")
    public Boolean getSelfJoin() {
        return selfJoin;
    }

    @JsonProperty("selfJoin")
    public void setSelfJoin(Boolean selfJoin) {
        this.selfJoin = selfJoin;
    }

    @JsonProperty("cardCovers")
    public Boolean getCardCovers() {
        return cardCovers;
    }

    @JsonProperty("cardCovers")
    public void setCardCovers(Boolean cardCovers) {
        this.cardCovers = cardCovers;
    }

    @JsonProperty("isTemplate")
    public Boolean getIsTemplate() {
        return isTemplate;
    }

    @JsonProperty("isTemplate")
    public void setIsTemplate(Boolean isTemplate) {
        this.isTemplate = isTemplate;
    }

    @JsonProperty("cardAging")
    public String getCardAging() {
        return cardAging;
    }

    @JsonProperty("cardAging")
    public void setCardAging(String cardAging) {
        this.cardAging = cardAging;
    }

    @JsonProperty("calendarFeedEnabled")
    public Boolean getCalendarFeedEnabled() {
        return calendarFeedEnabled;
    }

    @JsonProperty("calendarFeedEnabled")
    public void setCalendarFeedEnabled(Boolean calendarFeedEnabled) {
        this.calendarFeedEnabled = calendarFeedEnabled;
    }

    @JsonProperty("background")
    public String getBackground() {
        return background;
    }

    @JsonProperty("background")
    public void setBackground(String background) {
        this.background = background;
    }

    @JsonProperty("backgroundImage")
    public String getBackgroundImage() {
        return backgroundImage;
    }

    @JsonProperty("backgroundImage")
    public void setBackgroundImage(String backgroundImage) {
        this.backgroundImage = backgroundImage;
    }

    @JsonProperty("backgroundImageScaled")
    public List<BackgroundImageScaled> getBackgroundImageScaled() {
        return backgroundImageScaled;
    }

    @JsonProperty("backgroundImageScaled")
    public void setBackgroundImageScaled(List<BackgroundImageScaled> backgroundImageScaled) {
        this.backgroundImageScaled = backgroundImageScaled;
    }

    @JsonProperty("backgroundTile")
    public Boolean getBackgroundTile() {
        return backgroundTile;
    }

    @JsonProperty("backgroundTile")
    public void setBackgroundTile(Boolean backgroundTile) {
        this.backgroundTile = backgroundTile;
    }

    @JsonProperty("backgroundBrightness")
    public String getBackgroundBrightness() {
        return backgroundBrightness;
    }

    @JsonProperty("backgroundBrightness")
    public void setBackgroundBrightness(String backgroundBrightness) {
        this.backgroundBrightness = backgroundBrightness;
    }

    @JsonProperty("backgroundBottomColor")
    public String getBackgroundBottomColor() {
        return backgroundBottomColor;
    }

    @JsonProperty("backgroundBottomColor")
    public void setBackgroundBottomColor(String backgroundBottomColor) {
        this.backgroundBottomColor = backgroundBottomColor;
    }

    @JsonProperty("backgroundTopColor")
    public String getBackgroundTopColor() {
        return backgroundTopColor;
    }

    @JsonProperty("backgroundTopColor")
    public void setBackgroundTopColor(String backgroundTopColor) {
        this.backgroundTopColor = backgroundTopColor;
    }

    @JsonProperty("canBePublic")
    public Boolean getCanBePublic() {
        return canBePublic;
    }

    @JsonProperty("canBePublic")
    public void setCanBePublic(Boolean canBePublic) {
        this.canBePublic = canBePublic;
    }

    @JsonProperty("canBeEnterprise")
    public Boolean getCanBeEnterprise() {
        return canBeEnterprise;
    }

    @JsonProperty("canBeEnterprise")
    public void setCanBeEnterprise(Boolean canBeEnterprise) {
        this.canBeEnterprise = canBeEnterprise;
    }

    @JsonProperty("canBeOrg")
    public Boolean getCanBeOrg() {
        return canBeOrg;
    }

    @JsonProperty("canBeOrg")
    public void setCanBeOrg(Boolean canBeOrg) {
        this.canBeOrg = canBeOrg;
    }

    @JsonProperty("canBePrivate")
    public Boolean getCanBePrivate() {
        return canBePrivate;
    }

    @JsonProperty("canBePrivate")
    public void setCanBePrivate(Boolean canBePrivate) {
        this.canBePrivate = canBePrivate;
    }

    @JsonProperty("canInvite")
    public Boolean getCanInvite() {
        return canInvite;
    }

    @JsonProperty("canInvite")
    public void setCanInvite(Boolean canInvite) {
        this.canInvite = canInvite;
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
        sb.append("permissionLevel");
        sb.append('=');
        sb.append(((this.permissionLevel == null)?"<null>":this.permissionLevel));
        sb.append(',');
        sb.append("hideVotes");
        sb.append('=');
        sb.append(((this.hideVotes == null)?"<null>":this.hideVotes));
        sb.append(',');
        sb.append("voting");
        sb.append('=');
        sb.append(((this.voting == null)?"<null>":this.voting));
        sb.append(',');
        sb.append("comments");
        sb.append('=');
        sb.append(((this.comments == null)?"<null>":this.comments));
        sb.append(',');
        sb.append("selfJoin");
        sb.append('=');
        sb.append(((this.selfJoin == null)?"<null>":this.selfJoin));
        sb.append(',');
        sb.append("cardCovers");
        sb.append('=');
        sb.append(((this.cardCovers == null)?"<null>":this.cardCovers));
        sb.append(',');
        sb.append("isTemplate");
        sb.append('=');
        sb.append(((this.isTemplate == null)?"<null>":this.isTemplate));
        sb.append(',');
        sb.append("cardAging");
        sb.append('=');
        sb.append(((this.cardAging == null)?"<null>":this.cardAging));
        sb.append(',');
        sb.append("calendarFeedEnabled");
        sb.append('=');
        sb.append(((this.calendarFeedEnabled == null)?"<null>":this.calendarFeedEnabled));
        sb.append(',');
        sb.append("background");
        sb.append('=');
        sb.append(((this.background == null)?"<null>":this.background));
        sb.append(',');
        sb.append("backgroundImage");
        sb.append('=');
        sb.append(((this.backgroundImage == null)?"<null>":this.backgroundImage));
        sb.append(',');
        sb.append("backgroundImageScaled");
        sb.append('=');
        sb.append(((this.backgroundImageScaled == null)?"<null>":this.backgroundImageScaled));
        sb.append(',');
        sb.append("backgroundTile");
        sb.append('=');
        sb.append(((this.backgroundTile == null)?"<null>":this.backgroundTile));
        sb.append(',');
        sb.append("backgroundBrightness");
        sb.append('=');
        sb.append(((this.backgroundBrightness == null)?"<null>":this.backgroundBrightness));
        sb.append(',');
        sb.append("backgroundBottomColor");
        sb.append('=');
        sb.append(((this.backgroundBottomColor == null)?"<null>":this.backgroundBottomColor));
        sb.append(',');
        sb.append("backgroundTopColor");
        sb.append('=');
        sb.append(((this.backgroundTopColor == null)?"<null>":this.backgroundTopColor));
        sb.append(',');
        sb.append("canBePublic");
        sb.append('=');
        sb.append(((this.canBePublic == null)?"<null>":this.canBePublic));
        sb.append(',');
        sb.append("canBeEnterprise");
        sb.append('=');
        sb.append(((this.canBeEnterprise == null)?"<null>":this.canBeEnterprise));
        sb.append(',');
        sb.append("canBeOrg");
        sb.append('=');
        sb.append(((this.canBeOrg == null)?"<null>":this.canBeOrg));
        sb.append(',');
        sb.append("canBePrivate");
        sb.append('=');
        sb.append(((this.canBePrivate == null)?"<null>":this.canBePrivate));
        sb.append(',');
        sb.append("canInvite");
        sb.append('=');
        sb.append(((this.canInvite == null)?"<null>":this.canInvite));
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
        result = ((result* 31)+((this.backgroundBrightness == null)? 0 :this.backgroundBrightness.hashCode()));
        result = ((result* 31)+((this.comments == null)? 0 :this.comments.hashCode()));
        result = ((result* 31)+((this.backgroundTopColor == null)? 0 :this.backgroundTopColor.hashCode()));
        result = ((result* 31)+((this.canBeEnterprise == null)? 0 :this.canBeEnterprise.hashCode()));
        result = ((result* 31)+((this.hideVotes == null)? 0 :this.hideVotes.hashCode()));
        result = ((result* 31)+((this.backgroundImage == null)? 0 :this.backgroundImage.hashCode()));
        result = ((result* 31)+((this.canBeOrg == null)? 0 :this.canBeOrg.hashCode()));
        result = ((result* 31)+((this.backgroundBottomColor == null)? 0 :this.backgroundBottomColor.hashCode()));
        result = ((result* 31)+((this.voting == null)? 0 :this.voting.hashCode()));
        result = ((result* 31)+((this.calendarFeedEnabled == null)? 0 :this.calendarFeedEnabled.hashCode()));
        result = ((result* 31)+((this.backgroundTile == null)? 0 :this.backgroundTile.hashCode()));
        result = ((result* 31)+((this.canBePublic == null)? 0 :this.canBePublic.hashCode()));
        result = ((result* 31)+((this.canBePrivate == null)? 0 :this.canBePrivate.hashCode()));
        result = ((result* 31)+((this.backgroundImageScaled == null)? 0 :this.backgroundImageScaled.hashCode()));
        result = ((result* 31)+((this.permissionLevel == null)? 0 :this.permissionLevel.hashCode()));
        result = ((result* 31)+((this.cardAging == null)? 0 :this.cardAging.hashCode()));
        result = ((result* 31)+((this.canInvite == null)? 0 :this.canInvite.hashCode()));
        result = ((result* 31)+((this.isTemplate == null)? 0 :this.isTemplate.hashCode()));
        result = ((result* 31)+((this.background == null)? 0 :this.background.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.cardCovers == null)? 0 :this.cardCovers.hashCode()));
        result = ((result* 31)+((this.selfJoin == null)? 0 :this.selfJoin.hashCode()));
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
        return (((((((((((((((((((((((this.backgroundBrightness == rhs.backgroundBrightness)||((this.backgroundBrightness!= null)&&this.backgroundBrightness.equals(rhs.backgroundBrightness)))&&((this.comments == rhs.comments)||((this.comments!= null)&&this.comments.equals(rhs.comments))))&&((this.backgroundTopColor == rhs.backgroundTopColor)||((this.backgroundTopColor!= null)&&this.backgroundTopColor.equals(rhs.backgroundTopColor))))&&((this.canBeEnterprise == rhs.canBeEnterprise)||((this.canBeEnterprise!= null)&&this.canBeEnterprise.equals(rhs.canBeEnterprise))))&&((this.hideVotes == rhs.hideVotes)||((this.hideVotes!= null)&&this.hideVotes.equals(rhs.hideVotes))))&&((this.backgroundImage == rhs.backgroundImage)||((this.backgroundImage!= null)&&this.backgroundImage.equals(rhs.backgroundImage))))&&((this.canBeOrg == rhs.canBeOrg)||((this.canBeOrg!= null)&&this.canBeOrg.equals(rhs.canBeOrg))))&&((this.backgroundBottomColor == rhs.backgroundBottomColor)||((this.backgroundBottomColor!= null)&&this.backgroundBottomColor.equals(rhs.backgroundBottomColor))))&&((this.voting == rhs.voting)||((this.voting!= null)&&this.voting.equals(rhs.voting))))&&((this.calendarFeedEnabled == rhs.calendarFeedEnabled)||((this.calendarFeedEnabled!= null)&&this.calendarFeedEnabled.equals(rhs.calendarFeedEnabled))))&&((this.backgroundTile == rhs.backgroundTile)||((this.backgroundTile!= null)&&this.backgroundTile.equals(rhs.backgroundTile))))&&((this.canBePublic == rhs.canBePublic)||((this.canBePublic!= null)&&this.canBePublic.equals(rhs.canBePublic))))&&((this.canBePrivate == rhs.canBePrivate)||((this.canBePrivate!= null)&&this.canBePrivate.equals(rhs.canBePrivate))))&&((this.backgroundImageScaled == rhs.backgroundImageScaled)||((this.backgroundImageScaled!= null)&&this.backgroundImageScaled.equals(rhs.backgroundImageScaled))))&&((this.permissionLevel == rhs.permissionLevel)||((this.permissionLevel!= null)&&this.permissionLevel.equals(rhs.permissionLevel))))&&((this.cardAging == rhs.cardAging)||((this.cardAging!= null)&&this.cardAging.equals(rhs.cardAging))))&&((this.canInvite == rhs.canInvite)||((this.canInvite!= null)&&this.canInvite.equals(rhs.canInvite))))&&((this.isTemplate == rhs.isTemplate)||((this.isTemplate!= null)&&this.isTemplate.equals(rhs.isTemplate))))&&((this.background == rhs.background)||((this.background!= null)&&this.background.equals(rhs.background))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.cardCovers == rhs.cardCovers)||((this.cardCovers!= null)&&this.cardCovers.equals(rhs.cardCovers))))&&((this.selfJoin == rhs.selfJoin)||((this.selfJoin!= null)&&this.selfJoin.equals(rhs.selfJoin))));
    }

}
