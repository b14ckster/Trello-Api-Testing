
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
    "id",
    "name",
    "desc",
    "descData",
    "closed",
    "idMemberCreator",
    "idOrganization",
    "pinned",
    "url",
    "shortUrl",
    "prefs",
    "labelNames",
    "limits",
    "starred",
    "memberships",
    "shortLink",
    "subscribed",
    "powerUps",
    "dateLastActivity",
    "dateLastView",
    "idTags",
    "datePluginDisable",
    "creationMethod",
    "ixUpdate",
    "templateGallery",
    "enterpriseOwned"
})
@Generated("jsonschema2pojo")
public class Board {

    @JsonProperty("id")
    private String id;
    @JsonProperty("name")
    private String name;
    @JsonProperty("desc")
    private String desc;
    @JsonProperty("descData")
    private DescData descData;
    @JsonProperty("closed")
    private Boolean closed;
    @JsonProperty("idMemberCreator")
    private String idMemberCreator;
    @JsonProperty("idOrganization")
    private String idOrganization;
    @JsonProperty("pinned")
    private Boolean pinned;
    @JsonProperty("url")
    private String url;
    @JsonProperty("shortUrl")
    private String shortUrl;
    @JsonProperty("prefs")
    private Prefs prefs;
    @JsonProperty("labelNames")
    private LabelNames labelNames;
    @JsonProperty("limits")
    private Limits limits;
    @JsonProperty("starred")
    private Boolean starred;
    @JsonProperty("memberships")
    private String memberships;
    @JsonProperty("shortLink")
    private String shortLink;
    @JsonProperty("subscribed")
    private Boolean subscribed;
    @JsonProperty("powerUps")
    private String powerUps;
    @JsonProperty("dateLastActivity")
    private String dateLastActivity;
    @JsonProperty("dateLastView")
    private String dateLastView;
    @JsonProperty("idTags")
    private String idTags;
    @JsonProperty("datePluginDisable")
    private String datePluginDisable;
    @JsonProperty("creationMethod")
    private String creationMethod;
    @JsonProperty("ixUpdate")
    private Integer ixUpdate;
    @JsonProperty("templateGallery")
    private String templateGallery;
    @JsonProperty("enterpriseOwned")
    private Boolean enterpriseOwned;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    @JsonProperty("id")
    public String getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("desc")
    public String getDesc() {
        return desc;
    }

    @JsonProperty("desc")
    public void setDesc(String desc) {
        this.desc = desc;
    }

    @JsonProperty("descData")
    public DescData getDescData() {
        return descData;
    }

    @JsonProperty("descData")
    public void setDescData(DescData descData) {
        this.descData = descData;
    }

    @JsonProperty("closed")
    public Boolean getClosed() {
        return closed;
    }

    @JsonProperty("closed")
    public void setClosed(Boolean closed) {
        this.closed = closed;
    }

    @JsonProperty("idMemberCreator")
    public String getIdMemberCreator() {
        return idMemberCreator;
    }

    @JsonProperty("idMemberCreator")
    public void setIdMemberCreator(String idMemberCreator) {
        this.idMemberCreator = idMemberCreator;
    }

    @JsonProperty("idOrganization")
    public String getIdOrganization() {
        return idOrganization;
    }

    @JsonProperty("idOrganization")
    public void setIdOrganization(String idOrganization) {
        this.idOrganization = idOrganization;
    }

    @JsonProperty("pinned")
    public Boolean getPinned() {
        return pinned;
    }

    @JsonProperty("pinned")
    public void setPinned(Boolean pinned) {
        this.pinned = pinned;
    }

    @JsonProperty("url")
    public String getUrl() {
        return url;
    }

    @JsonProperty("url")
    public void setUrl(String url) {
        this.url = url;
    }

    @JsonProperty("shortUrl")
    public String getShortUrl() {
        return shortUrl;
    }

    @JsonProperty("shortUrl")
    public void setShortUrl(String shortUrl) {
        this.shortUrl = shortUrl;
    }

    @JsonProperty("prefs")
    public Prefs getPrefs() {
        return prefs;
    }

    @JsonProperty("prefs")
    public void setPrefs(Prefs prefs) {
        this.prefs = prefs;
    }

    @JsonProperty("labelNames")
    public LabelNames getLabelNames() {
        return labelNames;
    }

    @JsonProperty("labelNames")
    public void setLabelNames(LabelNames labelNames) {
        this.labelNames = labelNames;
    }

    @JsonProperty("limits")
    public Limits getLimits() {
        return limits;
    }

    @JsonProperty("limits")
    public void setLimits(Limits limits) {
        this.limits = limits;
    }

    @JsonProperty("starred")
    public Boolean getStarred() {
        return starred;
    }

    @JsonProperty("starred")
    public void setStarred(Boolean starred) {
        this.starred = starred;
    }

    @JsonProperty("memberships")
    public String getMemberships() {
        return memberships;
    }

    @JsonProperty("memberships")
    public void setMemberships(String memberships) {
        this.memberships = memberships;
    }

    @JsonProperty("shortLink")
    public String getShortLink() {
        return shortLink;
    }

    @JsonProperty("shortLink")
    public void setShortLink(String shortLink) {
        this.shortLink = shortLink;
    }

    @JsonProperty("subscribed")
    public Boolean getSubscribed() {
        return subscribed;
    }

    @JsonProperty("subscribed")
    public void setSubscribed(Boolean subscribed) {
        this.subscribed = subscribed;
    }

    @JsonProperty("powerUps")
    public String getPowerUps() {
        return powerUps;
    }

    @JsonProperty("powerUps")
    public void setPowerUps(String powerUps) {
        this.powerUps = powerUps;
    }

    @JsonProperty("dateLastActivity")
    public String getDateLastActivity() {
        return dateLastActivity;
    }

    @JsonProperty("dateLastActivity")
    public void setDateLastActivity(String dateLastActivity) {
        this.dateLastActivity = dateLastActivity;
    }

    @JsonProperty("dateLastView")
    public String getDateLastView() {
        return dateLastView;
    }

    @JsonProperty("dateLastView")
    public void setDateLastView(String dateLastView) {
        this.dateLastView = dateLastView;
    }

    @JsonProperty("idTags")
    public String getIdTags() {
        return idTags;
    }

    @JsonProperty("idTags")
    public void setIdTags(String idTags) {
        this.idTags = idTags;
    }

    @JsonProperty("datePluginDisable")
    public String getDatePluginDisable() {
        return datePluginDisable;
    }

    @JsonProperty("datePluginDisable")
    public void setDatePluginDisable(String datePluginDisable) {
        this.datePluginDisable = datePluginDisable;
    }

    @JsonProperty("creationMethod")
    public String getCreationMethod() {
        return creationMethod;
    }

    @JsonProperty("creationMethod")
    public void setCreationMethod(String creationMethod) {
        this.creationMethod = creationMethod;
    }

    @JsonProperty("ixUpdate")
    public Integer getIxUpdate() {
        return ixUpdate;
    }

    @JsonProperty("ixUpdate")
    public void setIxUpdate(Integer ixUpdate) {
        this.ixUpdate = ixUpdate;
    }

    @JsonProperty("templateGallery")
    public String getTemplateGallery() {
        return templateGallery;
    }

    @JsonProperty("templateGallery")
    public void setTemplateGallery(String templateGallery) {
        this.templateGallery = templateGallery;
    }

    @JsonProperty("enterpriseOwned")
    public Boolean getEnterpriseOwned() {
        return enterpriseOwned;
    }

    @JsonProperty("enterpriseOwned")
    public void setEnterpriseOwned(Boolean enterpriseOwned) {
        this.enterpriseOwned = enterpriseOwned;
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
        sb.append(Board.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("name");
        sb.append('=');
        sb.append(((this.name == null)?"<null>":this.name));
        sb.append(',');
        sb.append("desc");
        sb.append('=');
        sb.append(((this.desc == null)?"<null>":this.desc));
        sb.append(',');
        sb.append("descData");
        sb.append('=');
        sb.append(((this.descData == null)?"<null>":this.descData));
        sb.append(',');
        sb.append("closed");
        sb.append('=');
        sb.append(((this.closed == null)?"<null>":this.closed));
        sb.append(',');
        sb.append("idMemberCreator");
        sb.append('=');
        sb.append(((this.idMemberCreator == null)?"<null>":this.idMemberCreator));
        sb.append(',');
        sb.append("idOrganization");
        sb.append('=');
        sb.append(((this.idOrganization == null)?"<null>":this.idOrganization));
        sb.append(',');
        sb.append("pinned");
        sb.append('=');
        sb.append(((this.pinned == null)?"<null>":this.pinned));
        sb.append(',');
        sb.append("url");
        sb.append('=');
        sb.append(((this.url == null)?"<null>":this.url));
        sb.append(',');
        sb.append("shortUrl");
        sb.append('=');
        sb.append(((this.shortUrl == null)?"<null>":this.shortUrl));
        sb.append(',');
        sb.append("prefs");
        sb.append('=');
        sb.append(((this.prefs == null)?"<null>":this.prefs));
        sb.append(',');
        sb.append("labelNames");
        sb.append('=');
        sb.append(((this.labelNames == null)?"<null>":this.labelNames));
        sb.append(',');
        sb.append("limits");
        sb.append('=');
        sb.append(((this.limits == null)?"<null>":this.limits));
        sb.append(',');
        sb.append("starred");
        sb.append('=');
        sb.append(((this.starred == null)?"<null>":this.starred));
        sb.append(',');
        sb.append("memberships");
        sb.append('=');
        sb.append(((this.memberships == null)?"<null>":this.memberships));
        sb.append(',');
        sb.append("shortLink");
        sb.append('=');
        sb.append(((this.shortLink == null)?"<null>":this.shortLink));
        sb.append(',');
        sb.append("subscribed");
        sb.append('=');
        sb.append(((this.subscribed == null)?"<null>":this.subscribed));
        sb.append(',');
        sb.append("powerUps");
        sb.append('=');
        sb.append(((this.powerUps == null)?"<null>":this.powerUps));
        sb.append(',');
        sb.append("dateLastActivity");
        sb.append('=');
        sb.append(((this.dateLastActivity == null)?"<null>":this.dateLastActivity));
        sb.append(',');
        sb.append("dateLastView");
        sb.append('=');
        sb.append(((this.dateLastView == null)?"<null>":this.dateLastView));
        sb.append(',');
        sb.append("idTags");
        sb.append('=');
        sb.append(((this.idTags == null)?"<null>":this.idTags));
        sb.append(',');
        sb.append("datePluginDisable");
        sb.append('=');
        sb.append(((this.datePluginDisable == null)?"<null>":this.datePluginDisable));
        sb.append(',');
        sb.append("creationMethod");
        sb.append('=');
        sb.append(((this.creationMethod == null)?"<null>":this.creationMethod));
        sb.append(',');
        sb.append("ixUpdate");
        sb.append('=');
        sb.append(((this.ixUpdate == null)?"<null>":this.ixUpdate));
        sb.append(',');
        sb.append("templateGallery");
        sb.append('=');
        sb.append(((this.templateGallery == null)?"<null>":this.templateGallery));
        sb.append(',');
        sb.append("enterpriseOwned");
        sb.append('=');
        sb.append(((this.enterpriseOwned == null)?"<null>":this.enterpriseOwned));
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
        result = ((result* 31)+((this.descData == null)? 0 :this.descData.hashCode()));
        result = ((result* 31)+((this.idTags == null)? 0 :this.idTags.hashCode()));
        result = ((result* 31)+((this.pinned == null)? 0 :this.pinned.hashCode()));
        result = ((result* 31)+((this.labelNames == null)? 0 :this.labelNames.hashCode()));
        result = ((result* 31)+((this.shortUrl == null)? 0 :this.shortUrl.hashCode()));
        result = ((result* 31)+((this.dateLastActivity == null)? 0 :this.dateLastActivity.hashCode()));
        result = ((result* 31)+((this.datePluginDisable == null)? 0 :this.datePluginDisable.hashCode()));
        result = ((result* 31)+((this.shortLink == null)? 0 :this.shortLink.hashCode()));
        result = ((result* 31)+((this.memberships == null)? 0 :this.memberships.hashCode()));
        result = ((result* 31)+((this.creationMethod == null)? 0 :this.creationMethod.hashCode()));
        result = ((result* 31)+((this.subscribed == null)? 0 :this.subscribed.hashCode()));
        result = ((result* 31)+((this.starred == null)? 0 :this.starred.hashCode()));
        result = ((result* 31)+((this.idOrganization == null)? 0 :this.idOrganization.hashCode()));
        result = ((result* 31)+((this.dateLastView == null)? 0 :this.dateLastView.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.limits == null)? 0 :this.limits.hashCode()));
        result = ((result* 31)+((this.powerUps == null)? 0 :this.powerUps.hashCode()));
        result = ((result* 31)+((this.templateGallery == null)? 0 :this.templateGallery.hashCode()));
        result = ((result* 31)+((this.url == null)? 0 :this.url.hashCode()));
        result = ((result* 31)+((this.prefs == null)? 0 :this.prefs.hashCode()));
        result = ((result* 31)+((this.enterpriseOwned == null)? 0 :this.enterpriseOwned.hashCode()));
        result = ((result* 31)+((this.ixUpdate == null)? 0 :this.ixUpdate.hashCode()));
        result = ((result* 31)+((this.name == null)? 0 :this.name.hashCode()));
        result = ((result* 31)+((this.closed == null)? 0 :this.closed.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.idMemberCreator == null)? 0 :this.idMemberCreator.hashCode()));
        result = ((result* 31)+((this.desc == null)? 0 :this.desc.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Board) == false) {
            return false;
        }
        Board rhs = ((Board) other);
        return ((((((((((((((((((((((((((((this.descData == rhs.descData)||((this.descData!= null)&&this.descData.equals(rhs.descData)))&&((this.idTags == rhs.idTags)||((this.idTags!= null)&&this.idTags.equals(rhs.idTags))))&&((this.pinned == rhs.pinned)||((this.pinned!= null)&&this.pinned.equals(rhs.pinned))))&&((this.labelNames == rhs.labelNames)||((this.labelNames!= null)&&this.labelNames.equals(rhs.labelNames))))&&((this.shortUrl == rhs.shortUrl)||((this.shortUrl!= null)&&this.shortUrl.equals(rhs.shortUrl))))&&((this.dateLastActivity == rhs.dateLastActivity)||((this.dateLastActivity!= null)&&this.dateLastActivity.equals(rhs.dateLastActivity))))&&((this.datePluginDisable == rhs.datePluginDisable)||((this.datePluginDisable!= null)&&this.datePluginDisable.equals(rhs.datePluginDisable))))&&((this.shortLink == rhs.shortLink)||((this.shortLink!= null)&&this.shortLink.equals(rhs.shortLink))))&&((this.memberships == rhs.memberships)||((this.memberships!= null)&&this.memberships.equals(rhs.memberships))))&&((this.creationMethod == rhs.creationMethod)||((this.creationMethod!= null)&&this.creationMethod.equals(rhs.creationMethod))))&&((this.subscribed == rhs.subscribed)||((this.subscribed!= null)&&this.subscribed.equals(rhs.subscribed))))&&((this.starred == rhs.starred)||((this.starred!= null)&&this.starred.equals(rhs.starred))))&&((this.idOrganization == rhs.idOrganization)||((this.idOrganization!= null)&&this.idOrganization.equals(rhs.idOrganization))))&&((this.dateLastView == rhs.dateLastView)||((this.dateLastView!= null)&&this.dateLastView.equals(rhs.dateLastView))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.limits == rhs.limits)||((this.limits!= null)&&this.limits.equals(rhs.limits))))&&((this.powerUps == rhs.powerUps)||((this.powerUps!= null)&&this.powerUps.equals(rhs.powerUps))))&&((this.templateGallery == rhs.templateGallery)||((this.templateGallery!= null)&&this.templateGallery.equals(rhs.templateGallery))))&&((this.url == rhs.url)||((this.url!= null)&&this.url.equals(rhs.url))))&&((this.prefs == rhs.prefs)||((this.prefs!= null)&&this.prefs.equals(rhs.prefs))))&&((this.enterpriseOwned == rhs.enterpriseOwned)||((this.enterpriseOwned!= null)&&this.enterpriseOwned.equals(rhs.enterpriseOwned))))&&((this.ixUpdate == rhs.ixUpdate)||((this.ixUpdate!= null)&&this.ixUpdate.equals(rhs.ixUpdate))))&&((this.name == rhs.name)||((this.name!= null)&&this.name.equals(rhs.name))))&&((this.closed == rhs.closed)||((this.closed!= null)&&this.closed.equals(rhs.closed))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.idMemberCreator == rhs.idMemberCreator)||((this.idMemberCreator!= null)&&this.idMemberCreator.equals(rhs.idMemberCreator))))&&((this.desc == rhs.desc)||((this.desc!= null)&&this.desc.equals(rhs.desc))));
    }

}
