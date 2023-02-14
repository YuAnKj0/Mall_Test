package com.yuan.mall.service.impl;

import com.yuan.mall.nosql.mongodb.document.MemberReadHistory;
import com.yuan.mall.nosql.mongodb.repository.MemberReadHistoryRepository;
import com.yuan.mall.service.MemberReadHistoryService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @author Ykj
 * @date 2023/2/13/10:42
 * @apiNote
 */
public class MemberReadHistoryServiceImpl implements MemberReadHistoryService {
   @Autowired
   private MemberReadHistoryRepository memberReadHistoryRepository;
   
   /**
    * 生成浏览记录
    *
    * @param memberReadHistory
    */
   @Override
   public int create(MemberReadHistory memberReadHistory) {
      memberReadHistory.setId(null);
      memberReadHistory.setCreateTime(new Date());
      memberReadHistoryRepository.save(memberReadHistory);     
      return 1;
      
   }
   
   /**
    * 批量删除浏览记录
    *
    * @param ids
    */
   @Override
   public int delete(List<String> ids) {
      List<MemberReadHistory> deleteList=new ArrayList<>();
      for (String id : ids) {
         MemberReadHistory memberReadHistory=new MemberReadHistory();
         memberReadHistory.setId(id);
         deleteList.add(memberReadHistory);
      }
      memberReadHistoryRepository.deleteAll(deleteList);
      return ids.size();
   }
   /**
    * 获取用户浏览历史记录
    *
    * @param memberId
    */
   @Override
   public List<MemberReadHistory> list(Long memberId) {
      return memberReadHistoryRepository.findByMemberIdOrderByCreateTimeDesc(memberId);
   }
}
