package com.yuan.mall.service;

import com.yuan.mall.dto.OssCallbackResult;
import com.yuan.mall.dto.OssPolicyResult;

import javax.servlet.http.HttpServletRequest;

/**
 * @author Ykj
 * @date 2023/2/13/16:24
 * @apiNote oss上传管理Service
 */
public interface OssService {
   /**
    * oss上传策略生成
    */
   OssPolicyResult policy();
   
   /**
    * oss上传成功回调
    */
   OssCallbackResult callback(HttpServletRequest request);
}
