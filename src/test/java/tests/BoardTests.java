package tests;

import beans.board.Board;
import core.BoardObj;
import core.boardBuilder.createBoard.CreateBoard;
import core.boardBuilder.getBoard.GetBoard;
import core.boardBuilder.updateBoard.UpdateBoard;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Тесты, связанные со взаимодействием с Board (Доской)")
public class BoardTests {

    static Board board1;
    static Board board2;

    @Test
    @DisplayName("Проверка создания доски")
    public void createBoardTest() {
        Assertions.assertThat(board1.getName()).isEqualTo("Autotest Board");
        Assertions.assertThat(board1.getDesc()).isEqualTo("Эта доска создана автотестом");
        Assertions.assertThat(board1.getClosed()).isEqualTo(false);
        Assertions.assertThat(board1.getPrefs().getPermissionLevel()).isEqualTo("private");
        Assertions.assertThat(board1.getPrefs().getBackground()).isEqualTo("blue");
    }

    @Test
    @DisplayName("Проверка получения данных о доске")
    public void getBoardTest() {
        board2 = BoardObj.getBoard(GetBoard
                .builder()
                .id(board1.getId())
                .build());

        Assertions.assertThat(board2.getName()).isEqualTo("Autotest Board");
        Assertions.assertThat(board2.getDesc()).isEqualTo("Эта доска создана автотестом");
        Assertions.assertThat(board2.getClosed()).isEqualTo(false);
        Assertions.assertThat(board2.getPrefs().getPermissionLevel()).isEqualTo("private");
        Assertions.assertThat(board2.getPrefs().getBackground()).isEqualTo("blue");
    }

    @Test
    @DisplayName("Проверка обновления данных доски")
    public void updateBoardTest() {
        Assertions.assertThat(board1.getName()).isEqualTo("Autotest Board");
        Assertions.assertThat(board1.getDesc()).isEqualTo("Эта доска создана автотестом");

        board1 = BoardObj.updateBoard(UpdateBoard
                .builder()
                .id(board1.getId())
                .name("PIZZA")
                .desc("NO WAY")
                .build());

        Assertions.assertThat(board1.getName()).isEqualTo("PIZZA");
        Assertions.assertThat(board1.getDesc()).isEqualTo("NO WAY");
    }

    /**
     * Чтобы тесты были независимы - создаем доску для каждого теста
     */
    @BeforeEach
    @DisplayName("Создать доску")
    public void createBoard(){
        board1 = BoardObj.createBoard(CreateBoard
                .builder()
                .name("Autotest Board")
                .desc("Эта доска создана автотестом")
                .build());
    }

    /**
     * После прохождения теста необходимо убрать тестовою доску, чтобы не засорять пространство.
     */
    @AfterEach
    @DisplayName("Удалить доску")
    public void deleteBoard() {
        BoardObj.deleteBoard(board1.getId());
    }
}
