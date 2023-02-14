package com.yuan.mall.service;

import com.yuan.mall.nosql.mongodb.document.MemberReadHistory;

import java.util.List;

/**
 * @author Ykj
 * @date 2023/2/13/10:42
 * @apiNote  会员浏览记录管理Service
 */
public interface MemberReadHistoryService {
   /**
    * 生成浏览记录
    */
   int create(MemberReadHistory memberReadHistory);
   
   /**
    * 批量删除浏览记录
    */
   int delete(List<String> ids);
   
   /**
    * 获取用户浏览历史记录
    */
   List<MemberReadHistory> list(Long memberId);
}
