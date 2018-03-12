package com.cjj.domain.model;

import java.util.Date;
import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class UserModel {

  private Long userId;

  private Long deptId;

  private Long purchaserId;

  private Long companyId;

  private Long costCenterId;

  private Long userLevelId;

  private String username;

  private String password;

  private String employeeNo;

  private String sex;

  private Date birthday;

  private Long nationality;

  private String nameCn;

  private String pinyinFirst;

  private String pinyinFull;

  private String nameEnLast;

  private String nameEnMiddle;

  private String nameEnFirst;

  private String phone;

  private String fax;

  private String mobilephone;

  private String position;

  private String job;

  private String email;

  private String idcName;

  private String idcType;

  private String idcNo;

  private String idcValidityDate;

  private String idcName2;

  private String idcType2;

  private String idcNo2;

  private String idcValidityDate2;

  private String idcName3;

  private String idcType3;

  private String idcNo3;

  private String idcValidityDate3;

  private String state;

  private Integer visitNum;

  private Date lastVisitTime;

  private String userType;

  private Long createUser;

  private Date createTime;

  private Long modifyUser;

  private Date modifyTime;

  private String remark;

  private Date lastLoginTime;

  private Integer loginFalseCount;

  private String tempPassword;

  private Date tempValidTime;

  private String payPassword;

  private String tempPayPassword;

  private Date tempValidPayTime;

  private String invCode;

  private Date invCreateTime;

  private Short isInvUsed;

  private String identifyCode;

  private Date identifyCreateTime;

  private Short identifyCount;

  private Long superiorUserId;

  private String bankId;

  private Date lastPrebookTime;

  private String authorize;

  private String roles;

  private Long levelId;

  private String thirdEmpNumber;

}
