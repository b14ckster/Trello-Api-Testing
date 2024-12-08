package core.boardBuilder.updateBoard;

import lombok.Builder;
import lombok.Data;

import java.util.HashMap;
import java.util.Map;

import static core.boardBuilder.updateBoard.EUpdateBoard.*;

@Data
@Builder
public class UpdateBoard {

    String id;
    Map<String, Object> parameters;

    public static class UpdateBoardBuilder implements IUpdateBoard<UpdateBoardBuilder> {

        Map<String, Object> parameters = new HashMap<>();

        @Override
        public UpdateBoardBuilder name(String name) {
            parameters.put(NAME.toString(), name);
            return this;
        }

        @Override
        public UpdateBoardBuilder desc(String desc) {
            parameters.put(DESC.toString(), desc);
            return this;
        }

        @Override
        public UpdateBoardBuilder closed(Boolean closed) {
            parameters.put(CLOSED.toString(), closed);
            return this;
        }

        @Override
        public UpdateBoardBuilder subscribed(String subscribed) {
            parameters.put(SUBSCRIBED.toString(), subscribed);
            return this;
        }

        @Override
        public UpdateBoardBuilder idOrganization(String idOrganization) {
            parameters.put(ID_ORGANISATION.toString(), idOrganization);
            return this;
        }

        @Override
        public UpdateBoardBuilder prefs_permissionLevel(String prefs_permissionLevel) {
            parameters.put(PERMISSION_LEVEL.toString(), prefs_permissionLevel);
            return this;
        }

        @Override
        public UpdateBoardBuilder prefs_selfJoin(Boolean prefs_selfJoin) {
            parameters.put(SELF_JOIN.toString(), prefs_selfJoin);
            return this;
        }

        @Override
        public UpdateBoardBuilder prefs_cardCovers(Boolean prefs_cardCovers) {
            parameters.put(CARD_COVERS.toString(), prefs_cardCovers);
            return this;
        }

        @Override
        public UpdateBoardBuilder prefs_hideVotes(Boolean prefs_hideVotes) {
            parameters.put(HIDE_VOTES.toString(), prefs_hideVotes);
            return this;
        }

        @Override
        public UpdateBoardBuilder prefs_invitations(String prefs_invitations) {
            parameters.put(INVITATIONS.toString(), prefs_invitations);
            return this;
        }
    }
}
