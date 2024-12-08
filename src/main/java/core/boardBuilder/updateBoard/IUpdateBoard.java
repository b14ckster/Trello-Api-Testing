package core.boardBuilder.updateBoard;

public interface IUpdateBoard<UbdateBoardBuilder> {

    UbdateBoardBuilder name(String name);

    UbdateBoardBuilder desc(String desc);

    UbdateBoardBuilder closed(Boolean closed);

    UbdateBoardBuilder subscribed(String subscribed);

    UbdateBoardBuilder idOrganization(String idOrganization);

    UbdateBoardBuilder prefs_permissionLevel(String prefs_permissionLevel);

    UbdateBoardBuilder prefs_selfJoin(Boolean prefs_selfJoin);

    UbdateBoardBuilder prefs_cardCovers(Boolean prefs_cardCovers);

    UbdateBoardBuilder prefs_hideVotes(Boolean prefs_hideVotes);

    UbdateBoardBuilder prefs_invitations(String prefs_invitations);
}
