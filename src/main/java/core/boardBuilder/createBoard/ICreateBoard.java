package core.boardBuilder.createBoard;

public interface ICreateBoard<CreateBoardBuilder> {

    CreateBoardBuilder name(String name);

    CreateBoardBuilder defaultLabels(Boolean defaultLabels);

    CreateBoardBuilder defaultLists(Boolean defaultLists);

    CreateBoardBuilder desc(String desc);

    CreateBoardBuilder idOrganization(String idOrganization);

    CreateBoardBuilder idBoardSource(String idBoardSource);

    CreateBoardBuilder keepFromSource(String keepFromSource);

    CreateBoardBuilder powerUps(String powerUps);

    CreateBoardBuilder prefs_permissionLevel(String prefs_permissionLevel);

    CreateBoardBuilder prefs_voting(String prefs_voting);

    CreateBoardBuilder prefs_comments(String prefs_comments);

    CreateBoardBuilder prefs_invitations(String prefs_invitations);

    CreateBoardBuilder prefs_selfJoin(Boolean prefs_selfJoin);

    CreateBoardBuilder prefs_cardCovers(Boolean prefs_cardCovers);

    CreateBoardBuilder prefs_background(String prefs_background);

    CreateBoardBuilder prefs_cardAging(String prefs_cardAging);
}
