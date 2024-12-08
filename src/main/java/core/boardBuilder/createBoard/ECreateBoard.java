package core.boardBuilder.createBoard;

public enum ECreateBoard {

    /**
     * Required. The new name for the board.
     * <p>
     * String, length = [1, 16384]
     */
    NAME("name"),

    /**
     * Determines whether to use the default set of labels.
     * <p>
     * Boolean, default: true
     */
    DEFAULT_LABELS("defaultLabels"),

    /**
     * Determines whether to add the default set of lists to a board (To Do, Doing, Done). It is ignored if [idBoardSource] is provided.
     * <p>
     * Boolean, default: true
     */
    DEFAULT_LISTS("defaultLists"),

    /**
     * A new description for the board
     * <p>
     * String, length = [1, 16384]
     */
    DESC("desc"),

    /**
     * The id or name of the Workspace the board should belong to.
     * <p>
     * TrelloID, ^[0-9a-fA-F]{24}$
     */
    ID_ORGANISATION("idOrganization"),

    /**
     * The id of a board to copy into the new board.
     * <p>
     * TrelloID, ^[0-9a-fA-F]{24}$
     */
    ID_BOARD_SOURCE("idBoardSource"),

    /**
     * To keep cards from the original board pass in the value
     * <p>
     * Default: none
     * <p>
     * Valid values: cards, none
     */
    KEEP_FROM_SOURCE("keepFromSource"),

    /**
     * The Power-Ups that should be enabled on the new board. One of: [all], [calendar], [cardAging], [recap], [voting].
     * <p>
     * Valid values: all, calendar, cardAging, recap, voting
     */
    POWER_UPS("powerUps"),

    /**
     * The permissions level of the board. One of: [org], [private], [public]
     * <p>
     * Default: private
     * <p>
     * Valid values: [org], [private], [public].
     */
    PREFS_PERMISSION_LEVEL("prefs_permissionLevel"),

    /**
     * Who can vote on this board. One of [disabled], [members], [observers], [org], [public].
     * <p>
     * Default: disabled
     * <p>
     * Valid values: [disabled], [members], [observers], [org], [public]
     */
    PREFS_VOTING("prefs_voting"),

    /**
     * Who can comment on cards on this board. One of: [disabled], [members], [observers], [org], [public].
     * <p>
     * Default: members
     * <p>
     * Valid values: [disabled], [members], [observers], [org], [public]
     */
    PREFS_COMMENTS("prefs_comments"),

    /**
     * Determines what types of members can invite users to join. One of: [admins], [members].
     * <p>
     * Default: members
     * <p>
     * Valid values: [members], [admins]
     */
    PREFS_INVITATIONS("prefs_invitations"),

    /**
     * Determines whether users can join the boards themselves or whether they have to be invited.
     * <p>
     * Default: true
     */
    PREFS_SELF_JOIN("prefs_selfJoin"),

    /**
     * Determines whether card covers are enabled.
     * <p>
     * Default: true
     */
    PREFS_CARD_COVERS("prefs_cardCovers"),

    /**
     * The id of a custom background or one of: [blue], [orange], [green], [red], [purple], [pink], [lime], [sky], [grey].
     * <p>
     * Default: blue
     * <p>
     * Valid values: [blue], [orange], [green], [red], [purple], [pink], [lime], [sky], [grey]
     */
    PREFS_BACKGROUND("prefs_background"),

    /**
     * Determines the type of card aging that should take place on the board if card aging is enabled. One of: [pirate], [regular].
     * <p>
     * Default: regular
     * <p>
     * Valid values: [pirate], [regular]
     */
    PREFS_CARD_AGING("prefs_cardAging");


    final String parameterName;

    ECreateBoard(String parameterName) {
        this.parameterName = parameterName;
    }

    public String toString() {
        return this.parameterName;
    }
}
