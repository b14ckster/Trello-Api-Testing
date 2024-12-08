package core.boardBuilder.getBoard;

import lombok.Builder;
import lombok.Data;

import java.util.HashMap;
import java.util.Map;

import static core.boardBuilder.getBoard.EGetBoard.*;

@Data
@Builder
public class GetBoard {

    String id;
    Map<String, Object> parameters;

    public static class GetBoardBuilder implements IGetBoard<GetBoardBuilder> {

        Map<String, Object> parameters = new HashMap<>();

        @Override
        public GetBoardBuilder boardStars(String boardStars) {
            parameters.put(BOARD_STARS.toString(), boardStars);
            return this;
        }

        @Override
        public GetBoardBuilder cards(String cards) {
            parameters.put(CARDS.toString(), cards);
            return this;
        }

        @Override
        public GetBoardBuilder card_pluginData(Boolean card_pluginData) {
            parameters.put(CARD_PLUGIN_DATA.toString(), card_pluginData);
            return this;
        }

        @Override
        public GetBoardBuilder checklists(String checklists) {
            parameters.put(CHECKLISTS.toString(), checklists);
            return this;
        }

        @Override
        public GetBoardBuilder customFields(Boolean customFields) {
            parameters.put(CUSTOM_FIELDS.toString(), customFields);
            return this;
        }

        @Override
        public GetBoardBuilder fields(String fields) {
            parameters.put(FIELDS.toString(), fields);
            return this;
        }

        @Override
        public GetBoardBuilder labels(String labels) {
            parameters.put(LABELS.toString(), labels);
            return this;
        }

        @Override
        public GetBoardBuilder lists(String lists) {
            parameters.put(LISTS.toString(), lists);
            return this;
        }

        @Override
        public GetBoardBuilder members(String members) {
            parameters.put(MEMBERS.toString(), members);
            return this;
        }

        @Override
        public GetBoardBuilder memberships(String memberships) {
            parameters.put(MEMBERSHIPS.toString(), memberships);
            return this;
        }

        @Override
        public GetBoardBuilder pluginData(Boolean pluginData) {
            parameters.put(PLUGIN_DATA.toString(), pluginData);
            return this;
        }

        @Override
        public GetBoardBuilder organization(Boolean organization) {
            parameters.put(ORGANIZATION.toString(), organization);
            return this;
        }

        @Override
        public GetBoardBuilder organization_pluginData(Boolean organization_pluginData) {
            parameters.put(ORGANIZATION_PLUGIN_DATA.toString(), organization_pluginData);
            return this;
        }

        @Override
        public GetBoardBuilder myPrefs(Boolean myPrefs) {
            parameters.put(MY_PREFS.toString(), myPrefs);
            return this;
        }

        @Override
        public GetBoardBuilder tags(Boolean tags) {
            parameters.put(TAGS.toString(), tags);
            return this;
        }
    }
}
