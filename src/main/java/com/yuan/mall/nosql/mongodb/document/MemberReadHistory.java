package com.yuan.mall.nosql.mongodb.document;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

/**
 * @author Ykj
 * @date 2023/2/13/10:37
 * @apiNote
 */
@Document
@Data
public class MemberReadHistory {
   
   @Id
   private String id;
   @Indexed
   private Long memberId;
   private String memberNickname;
   private String memberIcon;
   @Indexed
   private Long productId;
   private String productName;
   private String productPic;
   private String productSubTitle;
   private String productPrice;
   private Date createTime;
}
