package core.boardBuilder.getBoard;

public enum EGetBoard {

    /**
     * Required. TrelloID of a board
     * <p>
     * Pattern: ^[0-9a-fA-F]{24}$
     */
    ID("id"),

    /**
     * Valid values are one of: mine or none.
     * <p>
     * Default: none
     */
    BOARD_STARS("boardStars"),

    /**
     * Default: none
     */
    CARDS("cards"),

    /**
     * Use with the cards param to include card pluginData with the response
     * <p>
     * Default: false
     */
    CARD_PLUGIN_DATA("card_pluginData"),

    /**
     * Default: none
     */
    CHECKLISTS("checklists"),

    /**
     * Default: false
     */
    CUSTOM_FIELDS("customFields"),

    /**
     * The fields of the board to be included in the response.
     * <p>
     * Valid values: all or a comma-separated list of: closed, dateLastActivity, dateLastView, desc, descData,
     * idMemberCreator, idOrganization, invitations, invited, labelNames, memberships, name, pinned, powerUps, prefs,
     * shortLink, shortUrl, starred, subscribed, url
     * <p>
     * Default: name,desc,descData,closed,idOrganization,pinned,url,shortUrl,prefs,labelNames
     */
    FIELDS("fields"),

    /**
     *
     */
    LABELS("labels"),

    /**
     * Default: open
     */
    LISTS("lists"),

    /**
     * Default: none
     */
    MEMBERS("members"),

    /**
     * Default: none
     */
    MEMBERSHIPS("memberships"),

    /**
     * Determines whether the pluginData for this board should be returned. Valid values: true or false.
     * <p>
     * Default: false
     */
    PLUGIN_DATA("pluginData"),

    /**
     * Default: false
     */
    ORGANIZATION("organization"),

    /**
     * Use with the organization param to include organization pluginData with the response
     * <p>
     * Default: false
     */
    ORGANIZATION_PLUGIN_DATA("organization_pluginData"),

    /**
     * Default: false
     */
    MY_PREFS("myPrefs"),

    /**
     * Also known as collections, tags, refer to the collection(s) that a Board belongs to.
     * <p>
     * Default: false
     */
    TAGS("tags");

    final String parameterName;

    EGetBoard(String parameterName) {
        this.parameterName = parameterName;
    }

    public String toString() {
        return this.parameterName;
    }
}
