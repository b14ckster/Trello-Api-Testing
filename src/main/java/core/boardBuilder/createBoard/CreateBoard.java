package core.boardBuilder.createBoard;

import lombok.Builder;
import lombok.Data;

import java.util.HashMap;
import java.util.Map;

import static core.boardBuilder.createBoard.ECreateBoard.*;

@Data
@Builder
public class CreateBoard {

    Map<String, Object> parameters;

    public static class CreateBoardBuilder implements ICreateBoard<CreateBoardBuilder> {

        Map<String, Object> parameters = new HashMap<>();

        @Override
        public CreateBoardBuilder name(String name) {
            parameters.put(NAME.toString(), name);
            return this;
        }

        @Override
        public CreateBoardBuilder defaultLabels(Boolean defaultLabels) {
            parameters.put(DEFAULT_LABELS.toString(), defaultLabels);
            return this;
        }

        @Override
        public CreateBoardBuilder defaultLists(Boolean defaultLists) {
            parameters.put(DEFAULT_LISTS.toString(), defaultLists);
            return this;
        }

        @Override
        public CreateBoardBuilder desc(String desc) {
            parameters.put(DESC.toString(), desc);
            return this;
        }

        @Override
        public CreateBoardBuilder idOrganization(String idOrganization) {
            parameters.put(ID_ORGANISATION.toString(), idOrganization);
            return this;
        }

        @Override
        public CreateBoardBuilder idBoardSource(String idBoardSource) {
            parameters.put(ID_BOARD_SOURCE.toString(), idBoardSource);
            return this;
        }

        @Override
        public CreateBoardBuilder keepFromSource(String keepFromSource) {
            parameters.put(KEEP_FROM_SOURCE.toString(), keepFromSource);
            return this;
        }

        @Override
        public CreateBoardBuilder powerUps(String powerUps) {
            parameters.put(POWER_UPS.toString(), powerUps);
            return this;
        }

        @Override
        public CreateBoardBuilder prefs_permissionLevel(String prefs_permissionLevel) {
            parameters.put(PREFS_PERMISSION_LEVEL.toString(), prefs_permissionLevel);
            return this;
        }

        @Override
        public CreateBoardBuilder prefs_voting(String prefs_voting) {
            parameters.put(PREFS_VOTING.toString(), prefs_voting);
            return this;
        }

        @Override
        public CreateBoardBuilder prefs_comments(String prefs_comments) {
            parameters.put(PREFS_COMMENTS.toString(), prefs_comments);
            return this;
        }

        @Override
        public CreateBoardBuilder prefs_invitations(String prefs_invitations) {
            parameters.put(PREFS_INVITATIONS.toString(), prefs_invitations);
            return this;
        }

        @Override
        public CreateBoardBuilder prefs_selfJoin(Boolean prefs_selfJoin) {
            parameters.put(PREFS_SELF_JOIN.toString(), prefs_selfJoin);
            return this;
        }

        @Override
        public CreateBoardBuilder prefs_cardCovers(Boolean prefs_cardCovers) {
            parameters.put(PREFS_CARD_COVERS.toString(), prefs_cardCovers);
            return this;
        }

        @Override
        public CreateBoardBuilder prefs_background(String prefs_background) {
            parameters.put(PREFS_BACKGROUND.toString(), prefs_background);
            return this;
        }

        @Override
        public CreateBoardBuilder prefs_cardAging(String prefs_cardAging) {
            parameters.put(PREFS_CARD_AGING.toString(), prefs_cardAging);
            return this;
        }
    }
}
