package com.sprtms16.board.board.repository

import com.sprtms16.board.board.domain.Comment
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.jpa.repository.JpaSpecificationExecutor

interface CommentRepository : JpaRepository<Comment, Long>, JpaSpecificationExecutor<Comment>
