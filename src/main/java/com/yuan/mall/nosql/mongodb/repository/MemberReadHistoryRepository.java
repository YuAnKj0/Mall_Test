package com.yuan.mall.nosql.mongodb.repository;

import com.yuan.mall.nosql.mongodb.document.MemberReadHistory;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

/**
 * @author Ykj
 * @date 2023/2/13/10:39
 * @apiNote
 */
public interface MemberReadHistoryRepository extends MongoRepository<MemberReadHistory,String>  {
   
   List<MemberReadHistory> findByMemberIdOrderByCreateTimeDesc(Long id);
}
