package core.boardBuilder.getBoard;

public interface IGetBoard<GetBoardBuilder> {

    GetBoardBuilder id(String id);

    GetBoardBuilder boardStars(String boardStars);

    GetBoardBuilder cards(String cards);

    GetBoardBuilder card_pluginData(Boolean card_pluginData);

    GetBoardBuilder checklists(String checklists);

    GetBoardBuilder customFields(Boolean customFields);

    GetBoardBuilder fields(String fields);

    GetBoardBuilder labels(String labels);

    GetBoardBuilder lists(String lists);

    GetBoardBuilder members(String members);

    GetBoardBuilder memberships(String memberships);

    GetBoardBuilder pluginData(Boolean pluginData);

    GetBoardBuilder organization(Boolean organization);

    GetBoardBuilder organization_pluginData(Boolean organization_pluginData);

    GetBoardBuilder myPrefs(Boolean myPrefs);

    GetBoardBuilder tags(Boolean tags);
}
