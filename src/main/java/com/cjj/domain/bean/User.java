package com.cjj.domain.bean;

import java.io.Serializable;
import java.util.Date;

public class User implements Serializable {
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

    private static final long serialVersionUID = 1L;

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Long getDeptId() {
        return deptId;
    }

    public void setDeptId(Long deptId) {
        this.deptId = deptId;
    }

    public Long getPurchaserId() {
        return purchaserId;
    }

    public void setPurchaserId(Long purchaserId) {
        this.purchaserId = purchaserId;
    }

    public Long getCompanyId() {
        return companyId;
    }

    public void setCompanyId(Long companyId) {
        this.companyId = companyId;
    }

    public Long getCostCenterId() {
        return costCenterId;
    }

    public void setCostCenterId(Long costCenterId) {
        this.costCenterId = costCenterId;
    }

    public Long getUserLevelId() {
        return userLevelId;
    }

    public void setUserLevelId(Long userLevelId) {
        this.userLevelId = userLevelId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getEmployeeNo() {
        return employeeNo;
    }

    public void setEmployeeNo(String employeeNo) {
        this.employeeNo = employeeNo == null ? null : employeeNo.trim();
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex == null ? null : sex.trim();
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public Long getNationality() {
        return nationality;
    }

    public void setNationality(Long nationality) {
        this.nationality = nationality;
    }

    public String getNameCn() {
        return nameCn;
    }

    public void setNameCn(String nameCn) {
        this.nameCn = nameCn == null ? null : nameCn.trim();
    }

    public String getPinyinFirst() {
        return pinyinFirst;
    }

    public void setPinyinFirst(String pinyinFirst) {
        this.pinyinFirst = pinyinFirst == null ? null : pinyinFirst.trim();
    }

    public String getPinyinFull() {
        return pinyinFull;
    }

    public void setPinyinFull(String pinyinFull) {
        this.pinyinFull = pinyinFull == null ? null : pinyinFull.trim();
    }

    public String getNameEnLast() {
        return nameEnLast;
    }

    public void setNameEnLast(String nameEnLast) {
        this.nameEnLast = nameEnLast == null ? null : nameEnLast.trim();
    }

    public String getNameEnMiddle() {
        return nameEnMiddle;
    }

    public void setNameEnMiddle(String nameEnMiddle) {
        this.nameEnMiddle = nameEnMiddle == null ? null : nameEnMiddle.trim();
    }

    public String getNameEnFirst() {
        return nameEnFirst;
    }

    public void setNameEnFirst(String nameEnFirst) {
        this.nameEnFirst = nameEnFirst == null ? null : nameEnFirst.trim();
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax == null ? null : fax.trim();
    }

    public String getMobilephone() {
        return mobilephone;
    }

    public void setMobilephone(String mobilephone) {
        this.mobilephone = mobilephone == null ? null : mobilephone.trim();
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position == null ? null : position.trim();
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job == null ? null : job.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public String getIdcName() {
        return idcName;
    }

    public void setIdcName(String idcName) {
        this.idcName = idcName == null ? null : idcName.trim();
    }

    public String getIdcType() {
        return idcType;
    }

    public void setIdcType(String idcType) {
        this.idcType = idcType == null ? null : idcType.trim();
    }

    public String getIdcNo() {
        return idcNo;
    }

    public void setIdcNo(String idcNo) {
        this.idcNo = idcNo == null ? null : idcNo.trim();
    }

    public String getIdcValidityDate() {
        return idcValidityDate;
    }

    public void setIdcValidityDate(String idcValidityDate) {
        this.idcValidityDate = idcValidityDate == null ? null : idcValidityDate.trim();
    }

    public String getIdcName2() {
        return idcName2;
    }

    public void setIdcName2(String idcName2) {
        this.idcName2 = idcName2 == null ? null : idcName2.trim();
    }

    public String getIdcType2() {
        return idcType2;
    }

    public void setIdcType2(String idcType2) {
        this.idcType2 = idcType2 == null ? null : idcType2.trim();
    }

    public String getIdcNo2() {
        return idcNo2;
    }

    public void setIdcNo2(String idcNo2) {
        this.idcNo2 = idcNo2 == null ? null : idcNo2.trim();
    }

    public String getIdcValidityDate2() {
        return idcValidityDate2;
    }

    public void setIdcValidityDate2(String idcValidityDate2) {
        this.idcValidityDate2 = idcValidityDate2 == null ? null : idcValidityDate2.trim();
    }

    public String getIdcName3() {
        return idcName3;
    }

    public void setIdcName3(String idcName3) {
        this.idcName3 = idcName3 == null ? null : idcName3.trim();
    }

    public String getIdcType3() {
        return idcType3;
    }

    public void setIdcType3(String idcType3) {
        this.idcType3 = idcType3 == null ? null : idcType3.trim();
    }

    public String getIdcNo3() {
        return idcNo3;
    }

    public void setIdcNo3(String idcNo3) {
        this.idcNo3 = idcNo3 == null ? null : idcNo3.trim();
    }

    public String getIdcValidityDate3() {
        return idcValidityDate3;
    }

    public void setIdcValidityDate3(String idcValidityDate3) {
        this.idcValidityDate3 = idcValidityDate3 == null ? null : idcValidityDate3.trim();
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state == null ? null : state.trim();
    }

    public Integer getVisitNum() {
        return visitNum;
    }

    public void setVisitNum(Integer visitNum) {
        this.visitNum = visitNum;
    }

    public Date getLastVisitTime() {
        return lastVisitTime;
    }

    public void setLastVisitTime(Date lastVisitTime) {
        this.lastVisitTime = lastVisitTime;
    }

    public String getUserType() {
        return userType;
    }

    public void setUserType(String userType) {
        this.userType = userType == null ? null : userType.trim();
    }

    public Long getCreateUser() {
        return createUser;
    }

    public void setCreateUser(Long createUser) {
        this.createUser = createUser;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Long getModifyUser() {
        return modifyUser;
    }

    public void setModifyUser(Long modifyUser) {
        this.modifyUser = modifyUser;
    }

    public Date getModifyTime() {
        return modifyTime;
    }

    public void setModifyTime(Date modifyTime) {
        this.modifyTime = modifyTime;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public Date getLastLoginTime() {
        return lastLoginTime;
    }

    public void setLastLoginTime(Date lastLoginTime) {
        this.lastLoginTime = lastLoginTime;
    }

    public Integer getLoginFalseCount() {
        return loginFalseCount;
    }

    public void setLoginFalseCount(Integer loginFalseCount) {
        this.loginFalseCount = loginFalseCount;
    }

    public String getTempPassword() {
        return tempPassword;
    }

    public void setTempPassword(String tempPassword) {
        this.tempPassword = tempPassword == null ? null : tempPassword.trim();
    }

    public Date getTempValidTime() {
        return tempValidTime;
    }

    public void setTempValidTime(Date tempValidTime) {
        this.tempValidTime = tempValidTime;
    }

    public String getPayPassword() {
        return payPassword;
    }

    public void setPayPassword(String payPassword) {
        this.payPassword = payPassword == null ? null : payPassword.trim();
    }

    public String getTempPayPassword() {
        return tempPayPassword;
    }

    public void setTempPayPassword(String tempPayPassword) {
        this.tempPayPassword = tempPayPassword == null ? null : tempPayPassword.trim();
    }

    public Date getTempValidPayTime() {
        return tempValidPayTime;
    }

    public void setTempValidPayTime(Date tempValidPayTime) {
        this.tempValidPayTime = tempValidPayTime;
    }

    public String getInvCode() {
        return invCode;
    }

    public void setInvCode(String invCode) {
        this.invCode = invCode == null ? null : invCode.trim();
    }

    public Date getInvCreateTime() {
        return invCreateTime;
    }

    public void setInvCreateTime(Date invCreateTime) {
        this.invCreateTime = invCreateTime;
    }

    public Short getIsInvUsed() {
        return isInvUsed;
    }

    public void setIsInvUsed(Short isInvUsed) {
        this.isInvUsed = isInvUsed;
    }

    public String getIdentifyCode() {
        return identifyCode;
    }

    public void setIdentifyCode(String identifyCode) {
        this.identifyCode = identifyCode == null ? null : identifyCode.trim();
    }

    public Date getIdentifyCreateTime() {
        return identifyCreateTime;
    }

    public void setIdentifyCreateTime(Date identifyCreateTime) {
        this.identifyCreateTime = identifyCreateTime;
    }

    public Short getIdentifyCount() {
        return identifyCount;
    }

    public void setIdentifyCount(Short identifyCount) {
        this.identifyCount = identifyCount;
    }

    public Long getSuperiorUserId() {
        return superiorUserId;
    }

    public void setSuperiorUserId(Long superiorUserId) {
        this.superiorUserId = superiorUserId;
    }

    public String getBankId() {
        return bankId;
    }

    public void setBankId(String bankId) {
        this.bankId = bankId == null ? null : bankId.trim();
    }

    public Date getLastPrebookTime() {
        return lastPrebookTime;
    }

    public void setLastPrebookTime(Date lastPrebookTime) {
        this.lastPrebookTime = lastPrebookTime;
    }

    public String getAuthorize() {
        return authorize;
    }

    public void setAuthorize(String authorize) {
        this.authorize = authorize == null ? null : authorize.trim();
    }

    public String getRoles() {
        return roles;
    }

    public void setRoles(String roles) {
        this.roles = roles == null ? null : roles.trim();
    }

    public Long getLevelId() {
        return levelId;
    }

    public void setLevelId(Long levelId) {
        this.levelId = levelId;
    }

    public String getThirdEmpNumber() {
        return thirdEmpNumber;
    }

    public void setThirdEmpNumber(String thirdEmpNumber) {
        this.thirdEmpNumber = thirdEmpNumber == null ? null : thirdEmpNumber.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", userId=").append(userId);
        sb.append(", deptId=").append(deptId);
        sb.append(", purchaserId=").append(purchaserId);
        sb.append(", companyId=").append(companyId);
        sb.append(", costCenterId=").append(costCenterId);
        sb.append(", userLevelId=").append(userLevelId);
        sb.append(", username=").append(username);
        sb.append(", password=").append(password);
        sb.append(", employeeNo=").append(employeeNo);
        sb.append(", sex=").append(sex);
        sb.append(", birthday=").append(birthday);
        sb.append(", nationality=").append(nationality);
        sb.append(", nameCn=").append(nameCn);
        sb.append(", pinyinFirst=").append(pinyinFirst);
        sb.append(", pinyinFull=").append(pinyinFull);
        sb.append(", nameEnLast=").append(nameEnLast);
        sb.append(", nameEnMiddle=").append(nameEnMiddle);
        sb.append(", nameEnFirst=").append(nameEnFirst);
        sb.append(", phone=").append(phone);
        sb.append(", fax=").append(fax);
        sb.append(", mobilephone=").append(mobilephone);
        sb.append(", position=").append(position);
        sb.append(", job=").append(job);
        sb.append(", email=").append(email);
        sb.append(", idcName=").append(idcName);
        sb.append(", idcType=").append(idcType);
        sb.append(", idcNo=").append(idcNo);
        sb.append(", idcValidityDate=").append(idcValidityDate);
        sb.append(", idcName2=").append(idcName2);
        sb.append(", idcType2=").append(idcType2);
        sb.append(", idcNo2=").append(idcNo2);
        sb.append(", idcValidityDate2=").append(idcValidityDate2);
        sb.append(", idcName3=").append(idcName3);
        sb.append(", idcType3=").append(idcType3);
        sb.append(", idcNo3=").append(idcNo3);
        sb.append(", idcValidityDate3=").append(idcValidityDate3);
        sb.append(", state=").append(state);
        sb.append(", visitNum=").append(visitNum);
        sb.append(", lastVisitTime=").append(lastVisitTime);
        sb.append(", userType=").append(userType);
        sb.append(", createUser=").append(createUser);
        sb.append(", createTime=").append(createTime);
        sb.append(", modifyUser=").append(modifyUser);
        sb.append(", modifyTime=").append(modifyTime);
        sb.append(", remark=").append(remark);
        sb.append(", lastLoginTime=").append(lastLoginTime);
        sb.append(", loginFalseCount=").append(loginFalseCount);
        sb.append(", tempPassword=").append(tempPassword);
        sb.append(", tempValidTime=").append(tempValidTime);
        sb.append(", payPassword=").append(payPassword);
        sb.append(", tempPayPassword=").append(tempPayPassword);
        sb.append(", tempValidPayTime=").append(tempValidPayTime);
        sb.append(", invCode=").append(invCode);
        sb.append(", invCreateTime=").append(invCreateTime);
        sb.append(", isInvUsed=").append(isInvUsed);
        sb.append(", identifyCode=").append(identifyCode);
        sb.append(", identifyCreateTime=").append(identifyCreateTime);
        sb.append(", identifyCount=").append(identifyCount);
        sb.append(", superiorUserId=").append(superiorUserId);
        sb.append(", bankId=").append(bankId);
        sb.append(", lastPrebookTime=").append(lastPrebookTime);
        sb.append(", authorize=").append(authorize);
        sb.append(", roles=").append(roles);
        sb.append(", levelId=").append(levelId);
        sb.append(", thirdEmpNumber=").append(thirdEmpNumber);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}