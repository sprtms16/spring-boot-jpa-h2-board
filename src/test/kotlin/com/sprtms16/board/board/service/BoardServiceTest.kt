package com.sprtms16.board.board.service

import com.sprtms16.board.board.domain.Board
import com.sprtms16.board.board.repository.BoardRepository
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.annotation.Rollback
import org.springframework.transaction.annotation.Transactional


@SpringBootTest
@Rollback(false)
@Transactional
class BoardServiceTest @Autowired constructor(
    val boardRepository: BoardRepository
) {

    @Test
    fun saveBoardTest() {
        //given
        val board = Board()
        board.apply {
            this.content = """
                <p> hello </p>
            """.trimIndent()
            this.title = "제목 테스트"
            this.password = "1111"
            this.writer = "sprtms16"
        }
        boardRepository.save(board)
        boardRepository.findAll().forEach {
            println("board = $it")
        }
    }
}
