package core.boardBuilder.updateBoard;

public enum EUpdateBoard {

    NAME("name"),
    DESC("desc"),
    CLOSED("closed"),
    SUBSCRIBED("subscribed"),
    ID_ORGANISATION("idOrganization"),

    PREFS("prefs"),
    PERMISSION_LEVEL(PREFS + "/permissionLevel"),
    SELF_JOIN(PREFS + "/selfJoin"),
    CARD_COVERS(PREFS + "/cardCovers"),
    HIDE_VOTES(PREFS + "/hideVotes"),
    INVITATIONS(PREFS + "/invitations");

    final String parameterName;

    EUpdateBoard(String parameterName) {
        this.parameterName = parameterName;
    }

    public String toString() {
        return this.parameterName;
    }
}
