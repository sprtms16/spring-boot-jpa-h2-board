package com.sprtms16.board.board.repository

import com.sprtms16.board.board.domain.Board
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.jpa.repository.JpaSpecificationExecutor

interface BoardRepository : JpaRepository<Board, Long>, JpaSpecificationExecutor<Board>
