
package beans.member;

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
    "id",
    "aaId",
    "activityBlocked",
    "avatarHash",
    "avatarUrl",
    "bio",
    "bioData",
    "confirmed",
    "fullName",
    "idEnterprise",
    "idEnterprisesDeactivated",
    "idMemberReferrer",
    "idPremOrgsAdmin",
    "initials",
    "memberType",
    "nonPublic",
    "nonPublicAvailable",
    "products",
    "url",
    "username",
    "status",
    "aaBlockSyncUntil",
    "aaEmail",
    "aaEnrolledDate",
    "avatarSource",
    "credentialsRemovedCount",
    "dateLastImpression",
    "dateLastActive",
    "domainClaimed",
    "email",
    "gravatarHash",
    "idBoards",
    "idOrganizations",
    "idEnterprisesAdmin",
    "limits",
    "loginTypes",
    "marketingOptIn",
    "messagesDismissed",
    "nodeId",
    "oneTimeMessagesDismissed",
    "sessionType",
    "prefs",
    "trophies",
    "uploadedAvatarHash",
    "uploadedAvatarUrl",
    "premiumFeatures",
    "isAaMastered",
    "ixUpdate"
})
@Generated("jsonschema2pojo")
public class Member {

    @JsonProperty("id")
    private String id;
    @JsonProperty("aaId")
    private String aaId;
    @JsonProperty("activityBlocked")
    private Boolean activityBlocked;
    @JsonProperty("avatarHash")
    private String avatarHash;
    @JsonProperty("avatarUrl")
    private String avatarUrl;
    @JsonProperty("bio")
    private String bio;
    @JsonProperty("bioData")
    private BioData bioData;
    @JsonProperty("confirmed")
    private Boolean confirmed;
    @JsonProperty("fullName")
    private String fullName;
    @JsonProperty("idEnterprise")
    private Object idEnterprise;
    @JsonProperty("idEnterprisesDeactivated")
    private List<Object> idEnterprisesDeactivated = new ArrayList<Object>();
    @JsonProperty("idMemberReferrer")
    private Object idMemberReferrer;
    @JsonProperty("idPremOrgsAdmin")
    private List<Object> idPremOrgsAdmin = new ArrayList<Object>();
    @JsonProperty("initials")
    private String initials;
    @JsonProperty("memberType")
    private String memberType;
    @JsonProperty("nonPublic")
    private NonPublic nonPublic;
    @JsonProperty("nonPublicAvailable")
    private Boolean nonPublicAvailable;
    @JsonProperty("products")
    private List<Object> products = new ArrayList<Object>();
    @JsonProperty("url")
    private String url;
    @JsonProperty("username")
    private String username;
    @JsonProperty("status")
    private String status;
    @JsonProperty("aaBlockSyncUntil")
    private Object aaBlockSyncUntil;
    @JsonProperty("aaEmail")
    private Object aaEmail;
    @JsonProperty("aaEnrolledDate")
    private Object aaEnrolledDate;
    @JsonProperty("avatarSource")
    private String avatarSource;
    @JsonProperty("credentialsRemovedCount")
    private Integer credentialsRemovedCount;
    @JsonProperty("dateLastImpression")
    private String dateLastImpression;
    @JsonProperty("dateLastActive")
    private String dateLastActive;
    @JsonProperty("domainClaimed")
    private Object domainClaimed;
    @JsonProperty("email")
    private String email;
    @JsonProperty("gravatarHash")
    private String gravatarHash;
    @JsonProperty("idBoards")
    private List<Object> idBoards = new ArrayList<Object>();
    @JsonProperty("idOrganizations")
    private List<String> idOrganizations = new ArrayList<String>();
    @JsonProperty("idEnterprisesAdmin")
    private List<Object> idEnterprisesAdmin = new ArrayList<Object>();
    @JsonProperty("limits")
    private Limits limits;
    @JsonProperty("loginTypes")
    private List<String> loginTypes = new ArrayList<String>();
    @JsonProperty("marketingOptIn")
    private MarketingOptIn marketingOptIn;
    @JsonProperty("messagesDismissed")
    private List<MessagesDismissed> messagesDismissed = new ArrayList<MessagesDismissed>();
    @JsonProperty("nodeId")
    private String nodeId;
    @JsonProperty("oneTimeMessagesDismissed")
    private List<String> oneTimeMessagesDismissed = new ArrayList<String>();
    @JsonProperty("sessionType")
    private Object sessionType;
    @JsonProperty("prefs")
    private Prefs prefs;
    @JsonProperty("trophies")
    private List<Object> trophies = new ArrayList<Object>();
    @JsonProperty("uploadedAvatarHash")
    private Object uploadedAvatarHash;
    @JsonProperty("uploadedAvatarUrl")
    private Object uploadedAvatarUrl;
    @JsonProperty("premiumFeatures")
    private List<Object> premiumFeatures = new ArrayList<Object>();
    @JsonProperty("isAaMastered")
    private Boolean isAaMastered;
    @JsonProperty("ixUpdate")
    private String ixUpdate;
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

    @JsonProperty("aaId")
    public String getAaId() {
        return aaId;
    }

    @JsonProperty("aaId")
    public void setAaId(String aaId) {
        this.aaId = aaId;
    }

    @JsonProperty("activityBlocked")
    public Boolean getActivityBlocked() {
        return activityBlocked;
    }

    @JsonProperty("activityBlocked")
    public void setActivityBlocked(Boolean activityBlocked) {
        this.activityBlocked = activityBlocked;
    }

    @JsonProperty("avatarHash")
    public String getAvatarHash() {
        return avatarHash;
    }

    @JsonProperty("avatarHash")
    public void setAvatarHash(String avatarHash) {
        this.avatarHash = avatarHash;
    }

    @JsonProperty("avatarUrl")
    public String getAvatarUrl() {
        return avatarUrl;
    }

    @JsonProperty("avatarUrl")
    public void setAvatarUrl(String avatarUrl) {
        this.avatarUrl = avatarUrl;
    }

    @JsonProperty("bio")
    public String getBio() {
        return bio;
    }

    @JsonProperty("bio")
    public void setBio(String bio) {
        this.bio = bio;
    }

    @JsonProperty("bioData")
    public BioData getBioData() {
        return bioData;
    }

    @JsonProperty("bioData")
    public void setBioData(BioData bioData) {
        this.bioData = bioData;
    }

    @JsonProperty("confirmed")
    public Boolean getConfirmed() {
        return confirmed;
    }

    @JsonProperty("confirmed")
    public void setConfirmed(Boolean confirmed) {
        this.confirmed = confirmed;
    }

    @JsonProperty("fullName")
    public String getFullName() {
        return fullName;
    }

    @JsonProperty("fullName")
    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    @JsonProperty("idEnterprise")
    public Object getIdEnterprise() {
        return idEnterprise;
    }

    @JsonProperty("idEnterprise")
    public void setIdEnterprise(Object idEnterprise) {
        this.idEnterprise = idEnterprise;
    }

    @JsonProperty("idEnterprisesDeactivated")
    public List<Object> getIdEnterprisesDeactivated() {
        return idEnterprisesDeactivated;
    }

    @JsonProperty("idEnterprisesDeactivated")
    public void setIdEnterprisesDeactivated(List<Object> idEnterprisesDeactivated) {
        this.idEnterprisesDeactivated = idEnterprisesDeactivated;
    }

    @JsonProperty("idMemberReferrer")
    public Object getIdMemberReferrer() {
        return idMemberReferrer;
    }

    @JsonProperty("idMemberReferrer")
    public void setIdMemberReferrer(Object idMemberReferrer) {
        this.idMemberReferrer = idMemberReferrer;
    }

    @JsonProperty("idPremOrgsAdmin")
    public List<Object> getIdPremOrgsAdmin() {
        return idPremOrgsAdmin;
    }

    @JsonProperty("idPremOrgsAdmin")
    public void setIdPremOrgsAdmin(List<Object> idPremOrgsAdmin) {
        this.idPremOrgsAdmin = idPremOrgsAdmin;
    }

    @JsonProperty("initials")
    public String getInitials() {
        return initials;
    }

    @JsonProperty("initials")
    public void setInitials(String initials) {
        this.initials = initials;
    }

    @JsonProperty("memberType")
    public String getMemberType() {
        return memberType;
    }

    @JsonProperty("memberType")
    public void setMemberType(String memberType) {
        this.memberType = memberType;
    }

    @JsonProperty("nonPublic")
    public NonPublic getNonPublic() {
        return nonPublic;
    }

    @JsonProperty("nonPublic")
    public void setNonPublic(NonPublic nonPublic) {
        this.nonPublic = nonPublic;
    }

    @JsonProperty("nonPublicAvailable")
    public Boolean getNonPublicAvailable() {
        return nonPublicAvailable;
    }

    @JsonProperty("nonPublicAvailable")
    public void setNonPublicAvailable(Boolean nonPublicAvailable) {
        this.nonPublicAvailable = nonPublicAvailable;
    }

    @JsonProperty("products")
    public List<Object> getProducts() {
        return products;
    }

    @JsonProperty("products")
    public void setProducts(List<Object> products) {
        this.products = products;
    }

    @JsonProperty("url")
    public String getUrl() {
        return url;
    }

    @JsonProperty("url")
    public void setUrl(String url) {
        this.url = url;
    }

    @JsonProperty("username")
    public String getUsername() {
        return username;
    }

    @JsonProperty("username")
    public void setUsername(String username) {
        this.username = username;
    }

    @JsonProperty("status")
    public String getStatus() {
        return status;
    }

    @JsonProperty("status")
    public void setStatus(String status) {
        this.status = status;
    }

    @JsonProperty("aaBlockSyncUntil")
    public Object getAaBlockSyncUntil() {
        return aaBlockSyncUntil;
    }

    @JsonProperty("aaBlockSyncUntil")
    public void setAaBlockSyncUntil(Object aaBlockSyncUntil) {
        this.aaBlockSyncUntil = aaBlockSyncUntil;
    }

    @JsonProperty("aaEmail")
    public Object getAaEmail() {
        return aaEmail;
    }

    @JsonProperty("aaEmail")
    public void setAaEmail(Object aaEmail) {
        this.aaEmail = aaEmail;
    }

    @JsonProperty("aaEnrolledDate")
    public Object getAaEnrolledDate() {
        return aaEnrolledDate;
    }

    @JsonProperty("aaEnrolledDate")
    public void setAaEnrolledDate(Object aaEnrolledDate) {
        this.aaEnrolledDate = aaEnrolledDate;
    }

    @JsonProperty("avatarSource")
    public String getAvatarSource() {
        return avatarSource;
    }

    @JsonProperty("avatarSource")
    public void setAvatarSource(String avatarSource) {
        this.avatarSource = avatarSource;
    }

    @JsonProperty("credentialsRemovedCount")
    public Integer getCredentialsRemovedCount() {
        return credentialsRemovedCount;
    }

    @JsonProperty("credentialsRemovedCount")
    public void setCredentialsRemovedCount(Integer credentialsRemovedCount) {
        this.credentialsRemovedCount = credentialsRemovedCount;
    }

    @JsonProperty("dateLastImpression")
    public String getDateLastImpression() {
        return dateLastImpression;
    }

    @JsonProperty("dateLastImpression")
    public void setDateLastImpression(String dateLastImpression) {
        this.dateLastImpression = dateLastImpression;
    }

    @JsonProperty("dateLastActive")
    public String getDateLastActive() {
        return dateLastActive;
    }

    @JsonProperty("dateLastActive")
    public void setDateLastActive(String dateLastActive) {
        this.dateLastActive = dateLastActive;
    }

    @JsonProperty("domainClaimed")
    public Object getDomainClaimed() {
        return domainClaimed;
    }

    @JsonProperty("domainClaimed")
    public void setDomainClaimed(Object domainClaimed) {
        this.domainClaimed = domainClaimed;
    }

    @JsonProperty("email")
    public String getEmail() {
        return email;
    }

    @JsonProperty("email")
    public void setEmail(String email) {
        this.email = email;
    }

    @JsonProperty("gravatarHash")
    public String getGravatarHash() {
        return gravatarHash;
    }

    @JsonProperty("gravatarHash")
    public void setGravatarHash(String gravatarHash) {
        this.gravatarHash = gravatarHash;
    }

    @JsonProperty("idBoards")
    public List<Object> getIdBoards() {
        return idBoards;
    }

    @JsonProperty("idBoards")
    public void setIdBoards(List<Object> idBoards) {
        this.idBoards = idBoards;
    }

    @JsonProperty("idOrganizations")
    public List<String> getIdOrganizations() {
        return idOrganizations;
    }

    @JsonProperty("idOrganizations")
    public void setIdOrganizations(List<String> idOrganizations) {
        this.idOrganizations = idOrganizations;
    }

    @JsonProperty("idEnterprisesAdmin")
    public List<Object> getIdEnterprisesAdmin() {
        return idEnterprisesAdmin;
    }

    @JsonProperty("idEnterprisesAdmin")
    public void setIdEnterprisesAdmin(List<Object> idEnterprisesAdmin) {
        this.idEnterprisesAdmin = idEnterprisesAdmin;
    }

    @JsonProperty("limits")
    public Limits getLimits() {
        return limits;
    }

    @JsonProperty("limits")
    public void setLimits(Limits limits) {
        this.limits = limits;
    }

    @JsonProperty("loginTypes")
    public List<String> getLoginTypes() {
        return loginTypes;
    }

    @JsonProperty("loginTypes")
    public void setLoginTypes(List<String> loginTypes) {
        this.loginTypes = loginTypes;
    }

    @JsonProperty("marketingOptIn")
    public MarketingOptIn getMarketingOptIn() {
        return marketingOptIn;
    }

    @JsonProperty("marketingOptIn")
    public void setMarketingOptIn(MarketingOptIn marketingOptIn) {
        this.marketingOptIn = marketingOptIn;
    }

    @JsonProperty("messagesDismissed")
    public List<MessagesDismissed> getMessagesDismissed() {
        return messagesDismissed;
    }

    @JsonProperty("messagesDismissed")
    public void setMessagesDismissed(List<MessagesDismissed> messagesDismissed) {
        this.messagesDismissed = messagesDismissed;
    }

    @JsonProperty("nodeId")
    public String getNodeId() {
        return nodeId;
    }

    @JsonProperty("nodeId")
    public void setNodeId(String nodeId) {
        this.nodeId = nodeId;
    }

    @JsonProperty("oneTimeMessagesDismissed")
    public List<String> getOneTimeMessagesDismissed() {
        return oneTimeMessagesDismissed;
    }

    @JsonProperty("oneTimeMessagesDismissed")
    public void setOneTimeMessagesDismissed(List<String> oneTimeMessagesDismissed) {
        this.oneTimeMessagesDismissed = oneTimeMessagesDismissed;
    }

    @JsonProperty("sessionType")
    public Object getSessionType() {
        return sessionType;
    }

    @JsonProperty("sessionType")
    public void setSessionType(Object sessionType) {
        this.sessionType = sessionType;
    }

    @JsonProperty("prefs")
    public Prefs getPrefs() {
        return prefs;
    }

    @JsonProperty("prefs")
    public void setPrefs(Prefs prefs) {
        this.prefs = prefs;
    }

    @JsonProperty("trophies")
    public List<Object> getTrophies() {
        return trophies;
    }

    @JsonProperty("trophies")
    public void setTrophies(List<Object> trophies) {
        this.trophies = trophies;
    }

    @JsonProperty("uploadedAvatarHash")
    public Object getUploadedAvatarHash() {
        return uploadedAvatarHash;
    }

    @JsonProperty("uploadedAvatarHash")
    public void setUploadedAvatarHash(Object uploadedAvatarHash) {
        this.uploadedAvatarHash = uploadedAvatarHash;
    }

    @JsonProperty("uploadedAvatarUrl")
    public Object getUploadedAvatarUrl() {
        return uploadedAvatarUrl;
    }

    @JsonProperty("uploadedAvatarUrl")
    public void setUploadedAvatarUrl(Object uploadedAvatarUrl) {
        this.uploadedAvatarUrl = uploadedAvatarUrl;
    }

    @JsonProperty("premiumFeatures")
    public List<Object> getPremiumFeatures() {
        return premiumFeatures;
    }

    @JsonProperty("premiumFeatures")
    public void setPremiumFeatures(List<Object> premiumFeatures) {
        this.premiumFeatures = premiumFeatures;
    }

    @JsonProperty("isAaMastered")
    public Boolean getIsAaMastered() {
        return isAaMastered;
    }

    @JsonProperty("isAaMastered")
    public void setIsAaMastered(Boolean isAaMastered) {
        this.isAaMastered = isAaMastered;
    }

    @JsonProperty("ixUpdate")
    public String getIxUpdate() {
        return ixUpdate;
    }

    @JsonProperty("ixUpdate")
    public void setIxUpdate(String ixUpdate) {
        this.ixUpdate = ixUpdate;
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
        sb.append(Member.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("aaId");
        sb.append('=');
        sb.append(((this.aaId == null)?"<null>":this.aaId));
        sb.append(',');
        sb.append("activityBlocked");
        sb.append('=');
        sb.append(((this.activityBlocked == null)?"<null>":this.activityBlocked));
        sb.append(',');
        sb.append("avatarHash");
        sb.append('=');
        sb.append(((this.avatarHash == null)?"<null>":this.avatarHash));
        sb.append(',');
        sb.append("avatarUrl");
        sb.append('=');
        sb.append(((this.avatarUrl == null)?"<null>":this.avatarUrl));
        sb.append(',');
        sb.append("bio");
        sb.append('=');
        sb.append(((this.bio == null)?"<null>":this.bio));
        sb.append(',');
        sb.append("bioData");
        sb.append('=');
        sb.append(((this.bioData == null)?"<null>":this.bioData));
        sb.append(',');
        sb.append("confirmed");
        sb.append('=');
        sb.append(((this.confirmed == null)?"<null>":this.confirmed));
        sb.append(',');
        sb.append("fullName");
        sb.append('=');
        sb.append(((this.fullName == null)?"<null>":this.fullName));
        sb.append(',');
        sb.append("idEnterprise");
        sb.append('=');
        sb.append(((this.idEnterprise == null)?"<null>":this.idEnterprise));
        sb.append(',');
        sb.append("idEnterprisesDeactivated");
        sb.append('=');
        sb.append(((this.idEnterprisesDeactivated == null)?"<null>":this.idEnterprisesDeactivated));
        sb.append(',');
        sb.append("idMemberReferrer");
        sb.append('=');
        sb.append(((this.idMemberReferrer == null)?"<null>":this.idMemberReferrer));
        sb.append(',');
        sb.append("idPremOrgsAdmin");
        sb.append('=');
        sb.append(((this.idPremOrgsAdmin == null)?"<null>":this.idPremOrgsAdmin));
        sb.append(',');
        sb.append("initials");
        sb.append('=');
        sb.append(((this.initials == null)?"<null>":this.initials));
        sb.append(',');
        sb.append("memberType");
        sb.append('=');
        sb.append(((this.memberType == null)?"<null>":this.memberType));
        sb.append(',');
        sb.append("nonPublic");
        sb.append('=');
        sb.append(((this.nonPublic == null)?"<null>":this.nonPublic));
        sb.append(',');
        sb.append("nonPublicAvailable");
        sb.append('=');
        sb.append(((this.nonPublicAvailable == null)?"<null>":this.nonPublicAvailable));
        sb.append(',');
        sb.append("products");
        sb.append('=');
        sb.append(((this.products == null)?"<null>":this.products));
        sb.append(',');
        sb.append("url");
        sb.append('=');
        sb.append(((this.url == null)?"<null>":this.url));
        sb.append(',');
        sb.append("username");
        sb.append('=');
        sb.append(((this.username == null)?"<null>":this.username));
        sb.append(',');
        sb.append("status");
        sb.append('=');
        sb.append(((this.status == null)?"<null>":this.status));
        sb.append(',');
        sb.append("aaBlockSyncUntil");
        sb.append('=');
        sb.append(((this.aaBlockSyncUntil == null)?"<null>":this.aaBlockSyncUntil));
        sb.append(',');
        sb.append("aaEmail");
        sb.append('=');
        sb.append(((this.aaEmail == null)?"<null>":this.aaEmail));
        sb.append(',');
        sb.append("aaEnrolledDate");
        sb.append('=');
        sb.append(((this.aaEnrolledDate == null)?"<null>":this.aaEnrolledDate));
        sb.append(',');
        sb.append("avatarSource");
        sb.append('=');
        sb.append(((this.avatarSource == null)?"<null>":this.avatarSource));
        sb.append(',');
        sb.append("credentialsRemovedCount");
        sb.append('=');
        sb.append(((this.credentialsRemovedCount == null)?"<null>":this.credentialsRemovedCount));
        sb.append(',');
        sb.append("dateLastImpression");
        sb.append('=');
        sb.append(((this.dateLastImpression == null)?"<null>":this.dateLastImpression));
        sb.append(',');
        sb.append("dateLastActive");
        sb.append('=');
        sb.append(((this.dateLastActive == null)?"<null>":this.dateLastActive));
        sb.append(',');
        sb.append("domainClaimed");
        sb.append('=');
        sb.append(((this.domainClaimed == null)?"<null>":this.domainClaimed));
        sb.append(',');
        sb.append("email");
        sb.append('=');
        sb.append(((this.email == null)?"<null>":this.email));
        sb.append(',');
        sb.append("gravatarHash");
        sb.append('=');
        sb.append(((this.gravatarHash == null)?"<null>":this.gravatarHash));
        sb.append(',');
        sb.append("idBoards");
        sb.append('=');
        sb.append(((this.idBoards == null)?"<null>":this.idBoards));
        sb.append(',');
        sb.append("idOrganizations");
        sb.append('=');
        sb.append(((this.idOrganizations == null)?"<null>":this.idOrganizations));
        sb.append(',');
        sb.append("idEnterprisesAdmin");
        sb.append('=');
        sb.append(((this.idEnterprisesAdmin == null)?"<null>":this.idEnterprisesAdmin));
        sb.append(',');
        sb.append("limits");
        sb.append('=');
        sb.append(((this.limits == null)?"<null>":this.limits));
        sb.append(',');
        sb.append("loginTypes");
        sb.append('=');
        sb.append(((this.loginTypes == null)?"<null>":this.loginTypes));
        sb.append(',');
        sb.append("marketingOptIn");
        sb.append('=');
        sb.append(((this.marketingOptIn == null)?"<null>":this.marketingOptIn));
        sb.append(',');
        sb.append("messagesDismissed");
        sb.append('=');
        sb.append(((this.messagesDismissed == null)?"<null>":this.messagesDismissed));
        sb.append(',');
        sb.append("nodeId");
        sb.append('=');
        sb.append(((this.nodeId == null)?"<null>":this.nodeId));
        sb.append(',');
        sb.append("oneTimeMessagesDismissed");
        sb.append('=');
        sb.append(((this.oneTimeMessagesDismissed == null)?"<null>":this.oneTimeMessagesDismissed));
        sb.append(',');
        sb.append("sessionType");
        sb.append('=');
        sb.append(((this.sessionType == null)?"<null>":this.sessionType));
        sb.append(',');
        sb.append("prefs");
        sb.append('=');
        sb.append(((this.prefs == null)?"<null>":this.prefs));
        sb.append(',');
        sb.append("trophies");
        sb.append('=');
        sb.append(((this.trophies == null)?"<null>":this.trophies));
        sb.append(',');
        sb.append("uploadedAvatarHash");
        sb.append('=');
        sb.append(((this.uploadedAvatarHash == null)?"<null>":this.uploadedAvatarHash));
        sb.append(',');
        sb.append("uploadedAvatarUrl");
        sb.append('=');
        sb.append(((this.uploadedAvatarUrl == null)?"<null>":this.uploadedAvatarUrl));
        sb.append(',');
        sb.append("premiumFeatures");
        sb.append('=');
        sb.append(((this.premiumFeatures == null)?"<null>":this.premiumFeatures));
        sb.append(',');
        sb.append("isAaMastered");
        sb.append('=');
        sb.append(((this.isAaMastered == null)?"<null>":this.isAaMastered));
        sb.append(',');
        sb.append("ixUpdate");
        sb.append('=');
        sb.append(((this.ixUpdate == null)?"<null>":this.ixUpdate));
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
        result = ((result* 31)+((this.aaEnrolledDate == null)? 0 :this.aaEnrolledDate.hashCode()));
        result = ((result* 31)+((this.idMemberReferrer == null)? 0 :this.idMemberReferrer.hashCode()));
        result = ((result* 31)+((this.bio == null)? 0 :this.bio.hashCode()));
        result = ((result* 31)+((this.avatarSource == null)? 0 :this.avatarSource.hashCode()));
        result = ((result* 31)+((this.nonPublic == null)? 0 :this.nonPublic.hashCode()));
        result = ((result* 31)+((this.uploadedAvatarHash == null)? 0 :this.uploadedAvatarHash.hashCode()));
        result = ((result* 31)+((this.id == null)? 0 :this.id.hashCode()));
        result = ((result* 31)+((this.aaEmail == null)? 0 :this.aaEmail.hashCode()));
        result = ((result* 31)+((this.trophies == null)? 0 :this.trophies.hashCode()));
        result = ((result* 31)+((this.idEnterprisesAdmin == null)? 0 :this.idEnterprisesAdmin.hashCode()));
        result = ((result* 31)+((this.avatarUrl == null)? 0 :this.avatarUrl.hashCode()));
        result = ((result* 31)+((this.initials == null)? 0 :this.initials.hashCode()));
        result = ((result* 31)+((this.domainClaimed == null)? 0 :this.domainClaimed.hashCode()));
        result = ((result* 31)+((this.oneTimeMessagesDismissed == null)? 0 :this.oneTimeMessagesDismissed.hashCode()));
        result = ((result* 31)+((this.nonPublicAvailable == null)? 0 :this.nonPublicAvailable.hashCode()));
        result = ((result* 31)+((this.premiumFeatures == null)? 0 :this.premiumFeatures.hashCode()));
        result = ((result* 31)+((this.loginTypes == null)? 0 :this.loginTypes.hashCode()));
        result = ((result* 31)+((this.idPremOrgsAdmin == null)? 0 :this.idPremOrgsAdmin.hashCode()));
        result = ((result* 31)+((this.additionalProperties == null)? 0 :this.additionalProperties.hashCode()));
        result = ((result* 31)+((this.nodeId == null)? 0 :this.nodeId.hashCode()));
        result = ((result* 31)+((this.status == null)? 0 :this.status.hashCode()));
        result = ((result* 31)+((this.idEnterprisesDeactivated == null)? 0 :this.idEnterprisesDeactivated.hashCode()));
        result = ((result* 31)+((this.dateLastActive == null)? 0 :this.dateLastActive.hashCode()));
        result = ((result* 31)+((this.confirmed == null)? 0 :this.confirmed.hashCode()));
        result = ((result* 31)+((this.products == null)? 0 :this.products.hashCode()));
        result = ((result* 31)+((this.activityBlocked == null)? 0 :this.activityBlocked.hashCode()));
        result = ((result* 31)+((this.aaBlockSyncUntil == null)? 0 :this.aaBlockSyncUntil.hashCode()));
        result = ((result* 31)+((this.sessionType == null)? 0 :this.sessionType.hashCode()));
        result = ((result* 31)+((this.idOrganizations == null)? 0 :this.idOrganizations.hashCode()));
        result = ((result* 31)+((this.bioData == null)? 0 :this.bioData.hashCode()));
        result = ((result* 31)+((this.email == null)? 0 :this.email.hashCode()));
        result = ((result* 31)+((this.limits == null)? 0 :this.limits.hashCode()));
        result = ((result* 31)+((this.uploadedAvatarUrl == null)? 0 :this.uploadedAvatarUrl.hashCode()));
        result = ((result* 31)+((this.messagesDismissed == null)? 0 :this.messagesDismissed.hashCode()));
        result = ((result* 31)+((this.credentialsRemovedCount == null)? 0 :this.credentialsRemovedCount.hashCode()));
        result = ((result* 31)+((this.fullName == null)? 0 :this.fullName.hashCode()));
        result = ((result* 31)+((this.url == null)? 0 :this.url.hashCode()));
        result = ((result* 31)+((this.marketingOptIn == null)? 0 :this.marketingOptIn.hashCode()));
        result = ((result* 31)+((this.prefs == null)? 0 :this.prefs.hashCode()));
        result = ((result* 31)+((this.gravatarHash == null)? 0 :this.gravatarHash.hashCode()));
        result = ((result* 31)+((this.ixUpdate == null)? 0 :this.ixUpdate.hashCode()));
        result = ((result* 31)+((this.avatarHash == null)? 0 :this.avatarHash.hashCode()));
        result = ((result* 31)+((this.aaId == null)? 0 :this.aaId.hashCode()));
        result = ((result* 31)+((this.idEnterprise == null)? 0 :this.idEnterprise.hashCode()));
        result = ((result* 31)+((this.isAaMastered == null)? 0 :this.isAaMastered.hashCode()));
        result = ((result* 31)+((this.memberType == null)? 0 :this.memberType.hashCode()));
        result = ((result* 31)+((this.idBoards == null)? 0 :this.idBoards.hashCode()));
        result = ((result* 31)+((this.dateLastImpression == null)? 0 :this.dateLastImpression.hashCode()));
        result = ((result* 31)+((this.username == null)? 0 :this.username.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Member) == false) {
            return false;
        }
        Member rhs = ((Member) other);
        return ((((((((((((((((((((((((((((((((((((((((((((((((((this.aaEnrolledDate == rhs.aaEnrolledDate)||((this.aaEnrolledDate!= null)&&this.aaEnrolledDate.equals(rhs.aaEnrolledDate)))&&((this.idMemberReferrer == rhs.idMemberReferrer)||((this.idMemberReferrer!= null)&&this.idMemberReferrer.equals(rhs.idMemberReferrer))))&&((this.bio == rhs.bio)||((this.bio!= null)&&this.bio.equals(rhs.bio))))&&((this.avatarSource == rhs.avatarSource)||((this.avatarSource!= null)&&this.avatarSource.equals(rhs.avatarSource))))&&((this.nonPublic == rhs.nonPublic)||((this.nonPublic!= null)&&this.nonPublic.equals(rhs.nonPublic))))&&((this.uploadedAvatarHash == rhs.uploadedAvatarHash)||((this.uploadedAvatarHash!= null)&&this.uploadedAvatarHash.equals(rhs.uploadedAvatarHash))))&&((this.id == rhs.id)||((this.id!= null)&&this.id.equals(rhs.id))))&&((this.aaEmail == rhs.aaEmail)||((this.aaEmail!= null)&&this.aaEmail.equals(rhs.aaEmail))))&&((this.trophies == rhs.trophies)||((this.trophies!= null)&&this.trophies.equals(rhs.trophies))))&&((this.idEnterprisesAdmin == rhs.idEnterprisesAdmin)||((this.idEnterprisesAdmin!= null)&&this.idEnterprisesAdmin.equals(rhs.idEnterprisesAdmin))))&&((this.avatarUrl == rhs.avatarUrl)||((this.avatarUrl!= null)&&this.avatarUrl.equals(rhs.avatarUrl))))&&((this.initials == rhs.initials)||((this.initials!= null)&&this.initials.equals(rhs.initials))))&&((this.domainClaimed == rhs.domainClaimed)||((this.domainClaimed!= null)&&this.domainClaimed.equals(rhs.domainClaimed))))&&((this.oneTimeMessagesDismissed == rhs.oneTimeMessagesDismissed)||((this.oneTimeMessagesDismissed!= null)&&this.oneTimeMessagesDismissed.equals(rhs.oneTimeMessagesDismissed))))&&((this.nonPublicAvailable == rhs.nonPublicAvailable)||((this.nonPublicAvailable!= null)&&this.nonPublicAvailable.equals(rhs.nonPublicAvailable))))&&((this.premiumFeatures == rhs.premiumFeatures)||((this.premiumFeatures!= null)&&this.premiumFeatures.equals(rhs.premiumFeatures))))&&((this.loginTypes == rhs.loginTypes)||((this.loginTypes!= null)&&this.loginTypes.equals(rhs.loginTypes))))&&((this.idPremOrgsAdmin == rhs.idPremOrgsAdmin)||((this.idPremOrgsAdmin!= null)&&this.idPremOrgsAdmin.equals(rhs.idPremOrgsAdmin))))&&((this.additionalProperties == rhs.additionalProperties)||((this.additionalProperties!= null)&&this.additionalProperties.equals(rhs.additionalProperties))))&&((this.nodeId == rhs.nodeId)||((this.nodeId!= null)&&this.nodeId.equals(rhs.nodeId))))&&((this.status == rhs.status)||((this.status!= null)&&this.status.equals(rhs.status))))&&((this.idEnterprisesDeactivated == rhs.idEnterprisesDeactivated)||((this.idEnterprisesDeactivated!= null)&&this.idEnterprisesDeactivated.equals(rhs.idEnterprisesDeactivated))))&&((this.dateLastActive == rhs.dateLastActive)||((this.dateLastActive!= null)&&this.dateLastActive.equals(rhs.dateLastActive))))&&((this.confirmed == rhs.confirmed)||((this.confirmed!= null)&&this.confirmed.equals(rhs.confirmed))))&&((this.products == rhs.products)||((this.products!= null)&&this.products.equals(rhs.products))))&&((this.activityBlocked == rhs.activityBlocked)||((this.activityBlocked!= null)&&this.activityBlocked.equals(rhs.activityBlocked))))&&((this.aaBlockSyncUntil == rhs.aaBlockSyncUntil)||((this.aaBlockSyncUntil!= null)&&this.aaBlockSyncUntil.equals(rhs.aaBlockSyncUntil))))&&((this.sessionType == rhs.sessionType)||((this.sessionType!= null)&&this.sessionType.equals(rhs.sessionType))))&&((this.idOrganizations == rhs.idOrganizations)||((this.idOrganizations!= null)&&this.idOrganizations.equals(rhs.idOrganizations))))&&((this.bioData == rhs.bioData)||((this.bioData!= null)&&this.bioData.equals(rhs.bioData))))&&((this.email == rhs.email)||((this.email!= null)&&this.email.equals(rhs.email))))&&((this.limits == rhs.limits)||((this.limits!= null)&&this.limits.equals(rhs.limits))))&&((this.uploadedAvatarUrl == rhs.uploadedAvatarUrl)||((this.uploadedAvatarUrl!= null)&&this.uploadedAvatarUrl.equals(rhs.uploadedAvatarUrl))))&&((this.messagesDismissed == rhs.messagesDismissed)||((this.messagesDismissed!= null)&&this.messagesDismissed.equals(rhs.messagesDismissed))))&&((this.credentialsRemovedCount == rhs.credentialsRemovedCount)||((this.credentialsRemovedCount!= null)&&this.credentialsRemovedCount.equals(rhs.credentialsRemovedCount))))&&((this.fullName == rhs.fullName)||((this.fullName!= null)&&this.fullName.equals(rhs.fullName))))&&((this.url == rhs.url)||((this.url!= null)&&this.url.equals(rhs.url))))&&((this.marketingOptIn == rhs.marketingOptIn)||((this.marketingOptIn!= null)&&this.marketingOptIn.equals(rhs.marketingOptIn))))&&((this.prefs == rhs.prefs)||((this.prefs!= null)&&this.prefs.equals(rhs.prefs))))&&((this.gravatarHash == rhs.gravatarHash)||((this.gravatarHash!= null)&&this.gravatarHash.equals(rhs.gravatarHash))))&&((this.ixUpdate == rhs.ixUpdate)||((this.ixUpdate!= null)&&this.ixUpdate.equals(rhs.ixUpdate))))&&((this.avatarHash == rhs.avatarHash)||((this.avatarHash!= null)&&this.avatarHash.equals(rhs.avatarHash))))&&((this.aaId == rhs.aaId)||((this.aaId!= null)&&this.aaId.equals(rhs.aaId))))&&((this.idEnterprise == rhs.idEnterprise)||((this.idEnterprise!= null)&&this.idEnterprise.equals(rhs.idEnterprise))))&&((this.isAaMastered == rhs.isAaMastered)||((this.isAaMastered!= null)&&this.isAaMastered.equals(rhs.isAaMastered))))&&((this.memberType == rhs.memberType)||((this.memberType!= null)&&this.memberType.equals(rhs.memberType))))&&((this.idBoards == rhs.idBoards)||((this.idBoards!= null)&&this.idBoards.equals(rhs.idBoards))))&&((this.dateLastImpression == rhs.dateLastImpression)||((this.dateLastImpression!= null)&&this.dateLastImpression.equals(rhs.dateLastImpression))))&&((this.username == rhs.username)||((this.username!= null)&&this.username.equals(rhs.username))));
    }

}
