package core;

import beans.board.Board;
import core.boardBuilder.createBoard.CreateBoard;
import core.boardBuilder.getBoard.GetBoard;
import core.boardBuilder.updateBoard.UpdateBoard;
import io.restassured.http.Method;
import io.restassured.response.Response;
import lombok.Data;

import java.nio.charset.StandardCharsets;

import static core.TrelloRequest.connectToTrello;
import static io.restassured.RestAssured.with;
import static io.restassured.http.ContentType.TEXT;
import static io.restassured.http.ContentType.URLENC;

@Data
public class BoardObj {

    public static Board createBoard(CreateBoard board) {
        TrelloRequest request = TrelloRequest
                .builder()
                .httpMethod(Method.POST)
                .path("/1/boards/")
                .parameters(board.getParameters())
                .build();
        return sendBoardRequest(request);
    }

    public static Board getBoard(GetBoard board) {
        TrelloRequest request = TrelloRequest
                .builder()
                .httpMethod(Method.GET)
                .path("/1/boards/" + board.getId())
                .parameters(board.getParameters())
                .build();
        return sendBoardRequest(request);
    }

    public static void deleteBoard(String idBoard) {
        TrelloRequest request = TrelloRequest
                .builder()
                .httpMethod(Method.DELETE)
                .path("/1/boards/" + idBoard)
                .build();
        sendBoardRequest(request);
    }

    public static Board updateBoard(UpdateBoard board){
        TrelloRequest request = TrelloRequest
                .builder()
                .httpMethod(Method.PUT)
                .path("/1/boards/" + board.getId())
                .parameters(board.getParameters())
                .build();
        return sendBoardRequest(request);
    }

    private static Board sendBoardRequest(TrelloRequest request) {
        Response response = with()
                .spec(connectToTrello())
                .contentType(URLENC.withCharset(StandardCharsets.UTF_8))
                .queryParams(request.getParameters())
                .request(request.getHttpMethod(), request.getPath());
        return response.as(Board.class);
    }
}
