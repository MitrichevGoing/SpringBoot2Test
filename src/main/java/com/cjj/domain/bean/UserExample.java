package com.cjj.domain.bean;

import com.cjj.utils.page.Page;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class UserExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected Page page;

    public UserExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    public void setPage(Page page) {
        this.page=page;
    }

    public Page getPage() {
        return page;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andUserIdIsNull() {
            addCriterion("USER_ID is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("USER_ID is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(Long value) {
            addCriterion("USER_ID =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(Long value) {
            addCriterion("USER_ID <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(Long value) {
            addCriterion("USER_ID >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(Long value) {
            addCriterion("USER_ID >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(Long value) {
            addCriterion("USER_ID <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(Long value) {
            addCriterion("USER_ID <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<Long> values) {
            addCriterion("USER_ID in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<Long> values) {
            addCriterion("USER_ID not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(Long value1, Long value2) {
            addCriterion("USER_ID between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(Long value1, Long value2) {
            addCriterion("USER_ID not between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andDeptIdIsNull() {
            addCriterion("DEPT_ID is null");
            return (Criteria) this;
        }

        public Criteria andDeptIdIsNotNull() {
            addCriterion("DEPT_ID is not null");
            return (Criteria) this;
        }

        public Criteria andDeptIdEqualTo(Long value) {
            addCriterion("DEPT_ID =", value, "deptId");
            return (Criteria) this;
        }

        public Criteria andDeptIdNotEqualTo(Long value) {
            addCriterion("DEPT_ID <>", value, "deptId");
            return (Criteria) this;
        }

        public Criteria andDeptIdGreaterThan(Long value) {
            addCriterion("DEPT_ID >", value, "deptId");
            return (Criteria) this;
        }

        public Criteria andDeptIdGreaterThanOrEqualTo(Long value) {
            addCriterion("DEPT_ID >=", value, "deptId");
            return (Criteria) this;
        }

        public Criteria andDeptIdLessThan(Long value) {
            addCriterion("DEPT_ID <", value, "deptId");
            return (Criteria) this;
        }

        public Criteria andDeptIdLessThanOrEqualTo(Long value) {
            addCriterion("DEPT_ID <=", value, "deptId");
            return (Criteria) this;
        }

        public Criteria andDeptIdIn(List<Long> values) {
            addCriterion("DEPT_ID in", values, "deptId");
            return (Criteria) this;
        }

        public Criteria andDeptIdNotIn(List<Long> values) {
            addCriterion("DEPT_ID not in", values, "deptId");
            return (Criteria) this;
        }

        public Criteria andDeptIdBetween(Long value1, Long value2) {
            addCriterion("DEPT_ID between", value1, value2, "deptId");
            return (Criteria) this;
        }

        public Criteria andDeptIdNotBetween(Long value1, Long value2) {
            addCriterion("DEPT_ID not between", value1, value2, "deptId");
            return (Criteria) this;
        }

        public Criteria andPurchaserIdIsNull() {
            addCriterion("PURCHASER_ID is null");
            return (Criteria) this;
        }

        public Criteria andPurchaserIdIsNotNull() {
            addCriterion("PURCHASER_ID is not null");
            return (Criteria) this;
        }

        public Criteria andPurchaserIdEqualTo(Long value) {
            addCriterion("PURCHASER_ID =", value, "purchaserId");
            return (Criteria) this;
        }

        public Criteria andPurchaserIdNotEqualTo(Long value) {
            addCriterion("PURCHASER_ID <>", value, "purchaserId");
            return (Criteria) this;
        }

        public Criteria andPurchaserIdGreaterThan(Long value) {
            addCriterion("PURCHASER_ID >", value, "purchaserId");
            return (Criteria) this;
        }

        public Criteria andPurchaserIdGreaterThanOrEqualTo(Long value) {
            addCriterion("PURCHASER_ID >=", value, "purchaserId");
            return (Criteria) this;
        }

        public Criteria andPurchaserIdLessThan(Long value) {
            addCriterion("PURCHASER_ID <", value, "purchaserId");
            return (Criteria) this;
        }

        public Criteria andPurchaserIdLessThanOrEqualTo(Long value) {
            addCriterion("PURCHASER_ID <=", value, "purchaserId");
            return (Criteria) this;
        }

        public Criteria andPurchaserIdIn(List<Long> values) {
            addCriterion("PURCHASER_ID in", values, "purchaserId");
            return (Criteria) this;
        }

        public Criteria andPurchaserIdNotIn(List<Long> values) {
            addCriterion("PURCHASER_ID not in", values, "purchaserId");
            return (Criteria) this;
        }

        public Criteria andPurchaserIdBetween(Long value1, Long value2) {
            addCriterion("PURCHASER_ID between", value1, value2, "purchaserId");
            return (Criteria) this;
        }

        public Criteria andPurchaserIdNotBetween(Long value1, Long value2) {
            addCriterion("PURCHASER_ID not between", value1, value2, "purchaserId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdIsNull() {
            addCriterion("COMPANY_ID is null");
            return (Criteria) this;
        }

        public Criteria andCompanyIdIsNotNull() {
            addCriterion("COMPANY_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyIdEqualTo(Long value) {
            addCriterion("COMPANY_ID =", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdNotEqualTo(Long value) {
            addCriterion("COMPANY_ID <>", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdGreaterThan(Long value) {
            addCriterion("COMPANY_ID >", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdGreaterThanOrEqualTo(Long value) {
            addCriterion("COMPANY_ID >=", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdLessThan(Long value) {
            addCriterion("COMPANY_ID <", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdLessThanOrEqualTo(Long value) {
            addCriterion("COMPANY_ID <=", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdIn(List<Long> values) {
            addCriterion("COMPANY_ID in", values, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdNotIn(List<Long> values) {
            addCriterion("COMPANY_ID not in", values, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdBetween(Long value1, Long value2) {
            addCriterion("COMPANY_ID between", value1, value2, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdNotBetween(Long value1, Long value2) {
            addCriterion("COMPANY_ID not between", value1, value2, "companyId");
            return (Criteria) this;
        }

        public Criteria andCostCenterIdIsNull() {
            addCriterion("COST_CENTER_ID is null");
            return (Criteria) this;
        }

        public Criteria andCostCenterIdIsNotNull() {
            addCriterion("COST_CENTER_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCostCenterIdEqualTo(Long value) {
            addCriterion("COST_CENTER_ID =", value, "costCenterId");
            return (Criteria) this;
        }

        public Criteria andCostCenterIdNotEqualTo(Long value) {
            addCriterion("COST_CENTER_ID <>", value, "costCenterId");
            return (Criteria) this;
        }

        public Criteria andCostCenterIdGreaterThan(Long value) {
            addCriterion("COST_CENTER_ID >", value, "costCenterId");
            return (Criteria) this;
        }

        public Criteria andCostCenterIdGreaterThanOrEqualTo(Long value) {
            addCriterion("COST_CENTER_ID >=", value, "costCenterId");
            return (Criteria) this;
        }

        public Criteria andCostCenterIdLessThan(Long value) {
            addCriterion("COST_CENTER_ID <", value, "costCenterId");
            return (Criteria) this;
        }

        public Criteria andCostCenterIdLessThanOrEqualTo(Long value) {
            addCriterion("COST_CENTER_ID <=", value, "costCenterId");
            return (Criteria) this;
        }

        public Criteria andCostCenterIdIn(List<Long> values) {
            addCriterion("COST_CENTER_ID in", values, "costCenterId");
            return (Criteria) this;
        }

        public Criteria andCostCenterIdNotIn(List<Long> values) {
            addCriterion("COST_CENTER_ID not in", values, "costCenterId");
            return (Criteria) this;
        }

        public Criteria andCostCenterIdBetween(Long value1, Long value2) {
            addCriterion("COST_CENTER_ID between", value1, value2, "costCenterId");
            return (Criteria) this;
        }

        public Criteria andCostCenterIdNotBetween(Long value1, Long value2) {
            addCriterion("COST_CENTER_ID not between", value1, value2, "costCenterId");
            return (Criteria) this;
        }

        public Criteria andUserLevelIdIsNull() {
            addCriterion("USER_LEVEL_ID is null");
            return (Criteria) this;
        }

        public Criteria andUserLevelIdIsNotNull() {
            addCriterion("USER_LEVEL_ID is not null");
            return (Criteria) this;
        }

        public Criteria andUserLevelIdEqualTo(Long value) {
            addCriterion("USER_LEVEL_ID =", value, "userLevelId");
            return (Criteria) this;
        }

        public Criteria andUserLevelIdNotEqualTo(Long value) {
            addCriterion("USER_LEVEL_ID <>", value, "userLevelId");
            return (Criteria) this;
        }

        public Criteria andUserLevelIdGreaterThan(Long value) {
            addCriterion("USER_LEVEL_ID >", value, "userLevelId");
            return (Criteria) this;
        }

        public Criteria andUserLevelIdGreaterThanOrEqualTo(Long value) {
            addCriterion("USER_LEVEL_ID >=", value, "userLevelId");
            return (Criteria) this;
        }

        public Criteria andUserLevelIdLessThan(Long value) {
            addCriterion("USER_LEVEL_ID <", value, "userLevelId");
            return (Criteria) this;
        }

        public Criteria andUserLevelIdLessThanOrEqualTo(Long value) {
            addCriterion("USER_LEVEL_ID <=", value, "userLevelId");
            return (Criteria) this;
        }

        public Criteria andUserLevelIdIn(List<Long> values) {
            addCriterion("USER_LEVEL_ID in", values, "userLevelId");
            return (Criteria) this;
        }

        public Criteria andUserLevelIdNotIn(List<Long> values) {
            addCriterion("USER_LEVEL_ID not in", values, "userLevelId");
            return (Criteria) this;
        }

        public Criteria andUserLevelIdBetween(Long value1, Long value2) {
            addCriterion("USER_LEVEL_ID between", value1, value2, "userLevelId");
            return (Criteria) this;
        }

        public Criteria andUserLevelIdNotBetween(Long value1, Long value2) {
            addCriterion("USER_LEVEL_ID not between", value1, value2, "userLevelId");
            return (Criteria) this;
        }

        public Criteria andUsernameIsNull() {
            addCriterion("USERNAME is null");
            return (Criteria) this;
        }

        public Criteria andUsernameIsNotNull() {
            addCriterion("USERNAME is not null");
            return (Criteria) this;
        }

        public Criteria andUsernameEqualTo(String value) {
            addCriterion("USERNAME =", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotEqualTo(String value) {
            addCriterion("USERNAME <>", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameGreaterThan(String value) {
            addCriterion("USERNAME >", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameGreaterThanOrEqualTo(String value) {
            addCriterion("USERNAME >=", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLessThan(String value) {
            addCriterion("USERNAME <", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLessThanOrEqualTo(String value) {
            addCriterion("USERNAME <=", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLike(String value) {
            addCriterion("USERNAME like", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotLike(String value) {
            addCriterion("USERNAME not like", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameIn(List<String> values) {
            addCriterion("USERNAME in", values, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotIn(List<String> values) {
            addCriterion("USERNAME not in", values, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameBetween(String value1, String value2) {
            addCriterion("USERNAME between", value1, value2, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotBetween(String value1, String value2) {
            addCriterion("USERNAME not between", value1, value2, "username");
            return (Criteria) this;
        }

        public Criteria andPasswordIsNull() {
            addCriterion("PASSWORD is null");
            return (Criteria) this;
        }

        public Criteria andPasswordIsNotNull() {
            addCriterion("PASSWORD is not null");
            return (Criteria) this;
        }

        public Criteria andPasswordEqualTo(String value) {
            addCriterion("PASSWORD =", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotEqualTo(String value) {
            addCriterion("PASSWORD <>", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordGreaterThan(String value) {
            addCriterion("PASSWORD >", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("PASSWORD >=", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLessThan(String value) {
            addCriterion("PASSWORD <", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLessThanOrEqualTo(String value) {
            addCriterion("PASSWORD <=", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLike(String value) {
            addCriterion("PASSWORD like", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotLike(String value) {
            addCriterion("PASSWORD not like", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordIn(List<String> values) {
            addCriterion("PASSWORD in", values, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotIn(List<String> values) {
            addCriterion("PASSWORD not in", values, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordBetween(String value1, String value2) {
            addCriterion("PASSWORD between", value1, value2, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotBetween(String value1, String value2) {
            addCriterion("PASSWORD not between", value1, value2, "password");
            return (Criteria) this;
        }

        public Criteria andEmployeeNoIsNull() {
            addCriterion("EMPLOYEE_NO is null");
            return (Criteria) this;
        }

        public Criteria andEmployeeNoIsNotNull() {
            addCriterion("EMPLOYEE_NO is not null");
            return (Criteria) this;
        }

        public Criteria andEmployeeNoEqualTo(String value) {
            addCriterion("EMPLOYEE_NO =", value, "employeeNo");
            return (Criteria) this;
        }

        public Criteria andEmployeeNoNotEqualTo(String value) {
            addCriterion("EMPLOYEE_NO <>", value, "employeeNo");
            return (Criteria) this;
        }

        public Criteria andEmployeeNoGreaterThan(String value) {
            addCriterion("EMPLOYEE_NO >", value, "employeeNo");
            return (Criteria) this;
        }

        public Criteria andEmployeeNoGreaterThanOrEqualTo(String value) {
            addCriterion("EMPLOYEE_NO >=", value, "employeeNo");
            return (Criteria) this;
        }

        public Criteria andEmployeeNoLessThan(String value) {
            addCriterion("EMPLOYEE_NO <", value, "employeeNo");
            return (Criteria) this;
        }

        public Criteria andEmployeeNoLessThanOrEqualTo(String value) {
            addCriterion("EMPLOYEE_NO <=", value, "employeeNo");
            return (Criteria) this;
        }

        public Criteria andEmployeeNoLike(String value) {
            addCriterion("EMPLOYEE_NO like", value, "employeeNo");
            return (Criteria) this;
        }

        public Criteria andEmployeeNoNotLike(String value) {
            addCriterion("EMPLOYEE_NO not like", value, "employeeNo");
            return (Criteria) this;
        }

        public Criteria andEmployeeNoIn(List<String> values) {
            addCriterion("EMPLOYEE_NO in", values, "employeeNo");
            return (Criteria) this;
        }

        public Criteria andEmployeeNoNotIn(List<String> values) {
            addCriterion("EMPLOYEE_NO not in", values, "employeeNo");
            return (Criteria) this;
        }

        public Criteria andEmployeeNoBetween(String value1, String value2) {
            addCriterion("EMPLOYEE_NO between", value1, value2, "employeeNo");
            return (Criteria) this;
        }

        public Criteria andEmployeeNoNotBetween(String value1, String value2) {
            addCriterion("EMPLOYEE_NO not between", value1, value2, "employeeNo");
            return (Criteria) this;
        }

        public Criteria andSexIsNull() {
            addCriterion("SEX is null");
            return (Criteria) this;
        }

        public Criteria andSexIsNotNull() {
            addCriterion("SEX is not null");
            return (Criteria) this;
        }

        public Criteria andSexEqualTo(String value) {
            addCriterion("SEX =", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotEqualTo(String value) {
            addCriterion("SEX <>", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexGreaterThan(String value) {
            addCriterion("SEX >", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexGreaterThanOrEqualTo(String value) {
            addCriterion("SEX >=", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLessThan(String value) {
            addCriterion("SEX <", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLessThanOrEqualTo(String value) {
            addCriterion("SEX <=", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLike(String value) {
            addCriterion("SEX like", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotLike(String value) {
            addCriterion("SEX not like", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexIn(List<String> values) {
            addCriterion("SEX in", values, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotIn(List<String> values) {
            addCriterion("SEX not in", values, "sex");
            return (Criteria) this;
        }

        public Criteria andSexBetween(String value1, String value2) {
            addCriterion("SEX between", value1, value2, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotBetween(String value1, String value2) {
            addCriterion("SEX not between", value1, value2, "sex");
            return (Criteria) this;
        }

        public Criteria andBirthdayIsNull() {
            addCriterion("BIRTHDAY is null");
            return (Criteria) this;
        }

        public Criteria andBirthdayIsNotNull() {
            addCriterion("BIRTHDAY is not null");
            return (Criteria) this;
        }

        public Criteria andBirthdayEqualTo(Date value) {
            addCriterion("BIRTHDAY =", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayNotEqualTo(Date value) {
            addCriterion("BIRTHDAY <>", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayGreaterThan(Date value) {
            addCriterion("BIRTHDAY >", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayGreaterThanOrEqualTo(Date value) {
            addCriterion("BIRTHDAY >=", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayLessThan(Date value) {
            addCriterion("BIRTHDAY <", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayLessThanOrEqualTo(Date value) {
            addCriterion("BIRTHDAY <=", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayIn(List<Date> values) {
            addCriterion("BIRTHDAY in", values, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayNotIn(List<Date> values) {
            addCriterion("BIRTHDAY not in", values, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayBetween(Date value1, Date value2) {
            addCriterion("BIRTHDAY between", value1, value2, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayNotBetween(Date value1, Date value2) {
            addCriterion("BIRTHDAY not between", value1, value2, "birthday");
            return (Criteria) this;
        }

        public Criteria andNationalityIsNull() {
            addCriterion("NATIONALITY is null");
            return (Criteria) this;
        }

        public Criteria andNationalityIsNotNull() {
            addCriterion("NATIONALITY is not null");
            return (Criteria) this;
        }

        public Criteria andNationalityEqualTo(Long value) {
            addCriterion("NATIONALITY =", value, "nationality");
            return (Criteria) this;
        }

        public Criteria andNationalityNotEqualTo(Long value) {
            addCriterion("NATIONALITY <>", value, "nationality");
            return (Criteria) this;
        }

        public Criteria andNationalityGreaterThan(Long value) {
            addCriterion("NATIONALITY >", value, "nationality");
            return (Criteria) this;
        }

        public Criteria andNationalityGreaterThanOrEqualTo(Long value) {
            addCriterion("NATIONALITY >=", value, "nationality");
            return (Criteria) this;
        }

        public Criteria andNationalityLessThan(Long value) {
            addCriterion("NATIONALITY <", value, "nationality");
            return (Criteria) this;
        }

        public Criteria andNationalityLessThanOrEqualTo(Long value) {
            addCriterion("NATIONALITY <=", value, "nationality");
            return (Criteria) this;
        }

        public Criteria andNationalityIn(List<Long> values) {
            addCriterion("NATIONALITY in", values, "nationality");
            return (Criteria) this;
        }

        public Criteria andNationalityNotIn(List<Long> values) {
            addCriterion("NATIONALITY not in", values, "nationality");
            return (Criteria) this;
        }

        public Criteria andNationalityBetween(Long value1, Long value2) {
            addCriterion("NATIONALITY between", value1, value2, "nationality");
            return (Criteria) this;
        }

        public Criteria andNationalityNotBetween(Long value1, Long value2) {
            addCriterion("NATIONALITY not between", value1, value2, "nationality");
            return (Criteria) this;
        }

        public Criteria andNameCnIsNull() {
            addCriterion("NAME_CN is null");
            return (Criteria) this;
        }

        public Criteria andNameCnIsNotNull() {
            addCriterion("NAME_CN is not null");
            return (Criteria) this;
        }

        public Criteria andNameCnEqualTo(String value) {
            addCriterion("NAME_CN =", value, "nameCn");
            return (Criteria) this;
        }

        public Criteria andNameCnNotEqualTo(String value) {
            addCriterion("NAME_CN <>", value, "nameCn");
            return (Criteria) this;
        }

        public Criteria andNameCnGreaterThan(String value) {
            addCriterion("NAME_CN >", value, "nameCn");
            return (Criteria) this;
        }

        public Criteria andNameCnGreaterThanOrEqualTo(String value) {
            addCriterion("NAME_CN >=", value, "nameCn");
            return (Criteria) this;
        }

        public Criteria andNameCnLessThan(String value) {
            addCriterion("NAME_CN <", value, "nameCn");
            return (Criteria) this;
        }

        public Criteria andNameCnLessThanOrEqualTo(String value) {
            addCriterion("NAME_CN <=", value, "nameCn");
            return (Criteria) this;
        }

        public Criteria andNameCnLike(String value) {
            addCriterion("NAME_CN like", value, "nameCn");
            return (Criteria) this;
        }

        public Criteria andNameCnNotLike(String value) {
            addCriterion("NAME_CN not like", value, "nameCn");
            return (Criteria) this;
        }

        public Criteria andNameCnIn(List<String> values) {
            addCriterion("NAME_CN in", values, "nameCn");
            return (Criteria) this;
        }

        public Criteria andNameCnNotIn(List<String> values) {
            addCriterion("NAME_CN not in", values, "nameCn");
            return (Criteria) this;
        }

        public Criteria andNameCnBetween(String value1, String value2) {
            addCriterion("NAME_CN between", value1, value2, "nameCn");
            return (Criteria) this;
        }

        public Criteria andNameCnNotBetween(String value1, String value2) {
            addCriterion("NAME_CN not between", value1, value2, "nameCn");
            return (Criteria) this;
        }

        public Criteria andPinyinFirstIsNull() {
            addCriterion("PINYIN_FIRST is null");
            return (Criteria) this;
        }

        public Criteria andPinyinFirstIsNotNull() {
            addCriterion("PINYIN_FIRST is not null");
            return (Criteria) this;
        }

        public Criteria andPinyinFirstEqualTo(String value) {
            addCriterion("PINYIN_FIRST =", value, "pinyinFirst");
            return (Criteria) this;
        }

        public Criteria andPinyinFirstNotEqualTo(String value) {
            addCriterion("PINYIN_FIRST <>", value, "pinyinFirst");
            return (Criteria) this;
        }

        public Criteria andPinyinFirstGreaterThan(String value) {
            addCriterion("PINYIN_FIRST >", value, "pinyinFirst");
            return (Criteria) this;
        }

        public Criteria andPinyinFirstGreaterThanOrEqualTo(String value) {
            addCriterion("PINYIN_FIRST >=", value, "pinyinFirst");
            return (Criteria) this;
        }

        public Criteria andPinyinFirstLessThan(String value) {
            addCriterion("PINYIN_FIRST <", value, "pinyinFirst");
            return (Criteria) this;
        }

        public Criteria andPinyinFirstLessThanOrEqualTo(String value) {
            addCriterion("PINYIN_FIRST <=", value, "pinyinFirst");
            return (Criteria) this;
        }

        public Criteria andPinyinFirstLike(String value) {
            addCriterion("PINYIN_FIRST like", value, "pinyinFirst");
            return (Criteria) this;
        }

        public Criteria andPinyinFirstNotLike(String value) {
            addCriterion("PINYIN_FIRST not like", value, "pinyinFirst");
            return (Criteria) this;
        }

        public Criteria andPinyinFirstIn(List<String> values) {
            addCriterion("PINYIN_FIRST in", values, "pinyinFirst");
            return (Criteria) this;
        }

        public Criteria andPinyinFirstNotIn(List<String> values) {
            addCriterion("PINYIN_FIRST not in", values, "pinyinFirst");
            return (Criteria) this;
        }

        public Criteria andPinyinFirstBetween(String value1, String value2) {
            addCriterion("PINYIN_FIRST between", value1, value2, "pinyinFirst");
            return (Criteria) this;
        }

        public Criteria andPinyinFirstNotBetween(String value1, String value2) {
            addCriterion("PINYIN_FIRST not between", value1, value2, "pinyinFirst");
            return (Criteria) this;
        }

        public Criteria andPinyinFullIsNull() {
            addCriterion("PINYIN_FULL is null");
            return (Criteria) this;
        }

        public Criteria andPinyinFullIsNotNull() {
            addCriterion("PINYIN_FULL is not null");
            return (Criteria) this;
        }

        public Criteria andPinyinFullEqualTo(String value) {
            addCriterion("PINYIN_FULL =", value, "pinyinFull");
            return (Criteria) this;
        }

        public Criteria andPinyinFullNotEqualTo(String value) {
            addCriterion("PINYIN_FULL <>", value, "pinyinFull");
            return (Criteria) this;
        }

        public Criteria andPinyinFullGreaterThan(String value) {
            addCriterion("PINYIN_FULL >", value, "pinyinFull");
            return (Criteria) this;
        }

        public Criteria andPinyinFullGreaterThanOrEqualTo(String value) {
            addCriterion("PINYIN_FULL >=", value, "pinyinFull");
            return (Criteria) this;
        }

        public Criteria andPinyinFullLessThan(String value) {
            addCriterion("PINYIN_FULL <", value, "pinyinFull");
            return (Criteria) this;
        }

        public Criteria andPinyinFullLessThanOrEqualTo(String value) {
            addCriterion("PINYIN_FULL <=", value, "pinyinFull");
            return (Criteria) this;
        }

        public Criteria andPinyinFullLike(String value) {
            addCriterion("PINYIN_FULL like", value, "pinyinFull");
            return (Criteria) this;
        }

        public Criteria andPinyinFullNotLike(String value) {
            addCriterion("PINYIN_FULL not like", value, "pinyinFull");
            return (Criteria) this;
        }

        public Criteria andPinyinFullIn(List<String> values) {
            addCriterion("PINYIN_FULL in", values, "pinyinFull");
            return (Criteria) this;
        }

        public Criteria andPinyinFullNotIn(List<String> values) {
            addCriterion("PINYIN_FULL not in", values, "pinyinFull");
            return (Criteria) this;
        }

        public Criteria andPinyinFullBetween(String value1, String value2) {
            addCriterion("PINYIN_FULL between", value1, value2, "pinyinFull");
            return (Criteria) this;
        }

        public Criteria andPinyinFullNotBetween(String value1, String value2) {
            addCriterion("PINYIN_FULL not between", value1, value2, "pinyinFull");
            return (Criteria) this;
        }

        public Criteria andNameEnLastIsNull() {
            addCriterion("NAME_EN_LAST is null");
            return (Criteria) this;
        }

        public Criteria andNameEnLastIsNotNull() {
            addCriterion("NAME_EN_LAST is not null");
            return (Criteria) this;
        }

        public Criteria andNameEnLastEqualTo(String value) {
            addCriterion("NAME_EN_LAST =", value, "nameEnLast");
            return (Criteria) this;
        }

        public Criteria andNameEnLastNotEqualTo(String value) {
            addCriterion("NAME_EN_LAST <>", value, "nameEnLast");
            return (Criteria) this;
        }

        public Criteria andNameEnLastGreaterThan(String value) {
            addCriterion("NAME_EN_LAST >", value, "nameEnLast");
            return (Criteria) this;
        }

        public Criteria andNameEnLastGreaterThanOrEqualTo(String value) {
            addCriterion("NAME_EN_LAST >=", value, "nameEnLast");
            return (Criteria) this;
        }

        public Criteria andNameEnLastLessThan(String value) {
            addCriterion("NAME_EN_LAST <", value, "nameEnLast");
            return (Criteria) this;
        }

        public Criteria andNameEnLastLessThanOrEqualTo(String value) {
            addCriterion("NAME_EN_LAST <=", value, "nameEnLast");
            return (Criteria) this;
        }

        public Criteria andNameEnLastLike(String value) {
            addCriterion("NAME_EN_LAST like", value, "nameEnLast");
            return (Criteria) this;
        }

        public Criteria andNameEnLastNotLike(String value) {
            addCriterion("NAME_EN_LAST not like", value, "nameEnLast");
            return (Criteria) this;
        }

        public Criteria andNameEnLastIn(List<String> values) {
            addCriterion("NAME_EN_LAST in", values, "nameEnLast");
            return (Criteria) this;
        }

        public Criteria andNameEnLastNotIn(List<String> values) {
            addCriterion("NAME_EN_LAST not in", values, "nameEnLast");
            return (Criteria) this;
        }

        public Criteria andNameEnLastBetween(String value1, String value2) {
            addCriterion("NAME_EN_LAST between", value1, value2, "nameEnLast");
            return (Criteria) this;
        }

        public Criteria andNameEnLastNotBetween(String value1, String value2) {
            addCriterion("NAME_EN_LAST not between", value1, value2, "nameEnLast");
            return (Criteria) this;
        }

        public Criteria andNameEnMiddleIsNull() {
            addCriterion("NAME_EN_MIDDLE is null");
            return (Criteria) this;
        }

        public Criteria andNameEnMiddleIsNotNull() {
            addCriterion("NAME_EN_MIDDLE is not null");
            return (Criteria) this;
        }

        public Criteria andNameEnMiddleEqualTo(String value) {
            addCriterion("NAME_EN_MIDDLE =", value, "nameEnMiddle");
            return (Criteria) this;
        }

        public Criteria andNameEnMiddleNotEqualTo(String value) {
            addCriterion("NAME_EN_MIDDLE <>", value, "nameEnMiddle");
            return (Criteria) this;
        }

        public Criteria andNameEnMiddleGreaterThan(String value) {
            addCriterion("NAME_EN_MIDDLE >", value, "nameEnMiddle");
            return (Criteria) this;
        }

        public Criteria andNameEnMiddleGreaterThanOrEqualTo(String value) {
            addCriterion("NAME_EN_MIDDLE >=", value, "nameEnMiddle");
            return (Criteria) this;
        }

        public Criteria andNameEnMiddleLessThan(String value) {
            addCriterion("NAME_EN_MIDDLE <", value, "nameEnMiddle");
            return (Criteria) this;
        }

        public Criteria andNameEnMiddleLessThanOrEqualTo(String value) {
            addCriterion("NAME_EN_MIDDLE <=", value, "nameEnMiddle");
            return (Criteria) this;
        }

        public Criteria andNameEnMiddleLike(String value) {
            addCriterion("NAME_EN_MIDDLE like", value, "nameEnMiddle");
            return (Criteria) this;
        }

        public Criteria andNameEnMiddleNotLike(String value) {
            addCriterion("NAME_EN_MIDDLE not like", value, "nameEnMiddle");
            return (Criteria) this;
        }

        public Criteria andNameEnMiddleIn(List<String> values) {
            addCriterion("NAME_EN_MIDDLE in", values, "nameEnMiddle");
            return (Criteria) this;
        }

        public Criteria andNameEnMiddleNotIn(List<String> values) {
            addCriterion("NAME_EN_MIDDLE not in", values, "nameEnMiddle");
            return (Criteria) this;
        }

        public Criteria andNameEnMiddleBetween(String value1, String value2) {
            addCriterion("NAME_EN_MIDDLE between", value1, value2, "nameEnMiddle");
            return (Criteria) this;
        }

        public Criteria andNameEnMiddleNotBetween(String value1, String value2) {
            addCriterion("NAME_EN_MIDDLE not between", value1, value2, "nameEnMiddle");
            return (Criteria) this;
        }

        public Criteria andNameEnFirstIsNull() {
            addCriterion("NAME_EN_FIRST is null");
            return (Criteria) this;
        }

        public Criteria andNameEnFirstIsNotNull() {
            addCriterion("NAME_EN_FIRST is not null");
            return (Criteria) this;
        }

        public Criteria andNameEnFirstEqualTo(String value) {
            addCriterion("NAME_EN_FIRST =", value, "nameEnFirst");
            return (Criteria) this;
        }

        public Criteria andNameEnFirstNotEqualTo(String value) {
            addCriterion("NAME_EN_FIRST <>", value, "nameEnFirst");
            return (Criteria) this;
        }

        public Criteria andNameEnFirstGreaterThan(String value) {
            addCriterion("NAME_EN_FIRST >", value, "nameEnFirst");
            return (Criteria) this;
        }

        public Criteria andNameEnFirstGreaterThanOrEqualTo(String value) {
            addCriterion("NAME_EN_FIRST >=", value, "nameEnFirst");
            return (Criteria) this;
        }

        public Criteria andNameEnFirstLessThan(String value) {
            addCriterion("NAME_EN_FIRST <", value, "nameEnFirst");
            return (Criteria) this;
        }

        public Criteria andNameEnFirstLessThanOrEqualTo(String value) {
            addCriterion("NAME_EN_FIRST <=", value, "nameEnFirst");
            return (Criteria) this;
        }

        public Criteria andNameEnFirstLike(String value) {
            addCriterion("NAME_EN_FIRST like", value, "nameEnFirst");
            return (Criteria) this;
        }

        public Criteria andNameEnFirstNotLike(String value) {
            addCriterion("NAME_EN_FIRST not like", value, "nameEnFirst");
            return (Criteria) this;
        }

        public Criteria andNameEnFirstIn(List<String> values) {
            addCriterion("NAME_EN_FIRST in", values, "nameEnFirst");
            return (Criteria) this;
        }

        public Criteria andNameEnFirstNotIn(List<String> values) {
            addCriterion("NAME_EN_FIRST not in", values, "nameEnFirst");
            return (Criteria) this;
        }

        public Criteria andNameEnFirstBetween(String value1, String value2) {
            addCriterion("NAME_EN_FIRST between", value1, value2, "nameEnFirst");
            return (Criteria) this;
        }

        public Criteria andNameEnFirstNotBetween(String value1, String value2) {
            addCriterion("NAME_EN_FIRST not between", value1, value2, "nameEnFirst");
            return (Criteria) this;
        }

        public Criteria andPhoneIsNull() {
            addCriterion("PHONE is null");
            return (Criteria) this;
        }

        public Criteria andPhoneIsNotNull() {
            addCriterion("PHONE is not null");
            return (Criteria) this;
        }

        public Criteria andPhoneEqualTo(String value) {
            addCriterion("PHONE =", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotEqualTo(String value) {
            addCriterion("PHONE <>", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThan(String value) {
            addCriterion("PHONE >", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("PHONE >=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThan(String value) {
            addCriterion("PHONE <", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThanOrEqualTo(String value) {
            addCriterion("PHONE <=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLike(String value) {
            addCriterion("PHONE like", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotLike(String value) {
            addCriterion("PHONE not like", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneIn(List<String> values) {
            addCriterion("PHONE in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotIn(List<String> values) {
            addCriterion("PHONE not in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneBetween(String value1, String value2) {
            addCriterion("PHONE between", value1, value2, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotBetween(String value1, String value2) {
            addCriterion("PHONE not between", value1, value2, "phone");
            return (Criteria) this;
        }

        public Criteria andFaxIsNull() {
            addCriterion("FAX is null");
            return (Criteria) this;
        }

        public Criteria andFaxIsNotNull() {
            addCriterion("FAX is not null");
            return (Criteria) this;
        }

        public Criteria andFaxEqualTo(String value) {
            addCriterion("FAX =", value, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxNotEqualTo(String value) {
            addCriterion("FAX <>", value, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxGreaterThan(String value) {
            addCriterion("FAX >", value, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxGreaterThanOrEqualTo(String value) {
            addCriterion("FAX >=", value, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxLessThan(String value) {
            addCriterion("FAX <", value, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxLessThanOrEqualTo(String value) {
            addCriterion("FAX <=", value, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxLike(String value) {
            addCriterion("FAX like", value, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxNotLike(String value) {
            addCriterion("FAX not like", value, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxIn(List<String> values) {
            addCriterion("FAX in", values, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxNotIn(List<String> values) {
            addCriterion("FAX not in", values, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxBetween(String value1, String value2) {
            addCriterion("FAX between", value1, value2, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxNotBetween(String value1, String value2) {
            addCriterion("FAX not between", value1, value2, "fax");
            return (Criteria) this;
        }

        public Criteria andMobilephoneIsNull() {
            addCriterion("MOBILEPHONE is null");
            return (Criteria) this;
        }

        public Criteria andMobilephoneIsNotNull() {
            addCriterion("MOBILEPHONE is not null");
            return (Criteria) this;
        }

        public Criteria andMobilephoneEqualTo(String value) {
            addCriterion("MOBILEPHONE =", value, "mobilephone");
            return (Criteria) this;
        }

        public Criteria andMobilephoneNotEqualTo(String value) {
            addCriterion("MOBILEPHONE <>", value, "mobilephone");
            return (Criteria) this;
        }

        public Criteria andMobilephoneGreaterThan(String value) {
            addCriterion("MOBILEPHONE >", value, "mobilephone");
            return (Criteria) this;
        }

        public Criteria andMobilephoneGreaterThanOrEqualTo(String value) {
            addCriterion("MOBILEPHONE >=", value, "mobilephone");
            return (Criteria) this;
        }

        public Criteria andMobilephoneLessThan(String value) {
            addCriterion("MOBILEPHONE <", value, "mobilephone");
            return (Criteria) this;
        }

        public Criteria andMobilephoneLessThanOrEqualTo(String value) {
            addCriterion("MOBILEPHONE <=", value, "mobilephone");
            return (Criteria) this;
        }

        public Criteria andMobilephoneLike(String value) {
            addCriterion("MOBILEPHONE like", value, "mobilephone");
            return (Criteria) this;
        }

        public Criteria andMobilephoneNotLike(String value) {
            addCriterion("MOBILEPHONE not like", value, "mobilephone");
            return (Criteria) this;
        }

        public Criteria andMobilephoneIn(List<String> values) {
            addCriterion("MOBILEPHONE in", values, "mobilephone");
            return (Criteria) this;
        }

        public Criteria andMobilephoneNotIn(List<String> values) {
            addCriterion("MOBILEPHONE not in", values, "mobilephone");
            return (Criteria) this;
        }

        public Criteria andMobilephoneBetween(String value1, String value2) {
            addCriterion("MOBILEPHONE between", value1, value2, "mobilephone");
            return (Criteria) this;
        }

        public Criteria andMobilephoneNotBetween(String value1, String value2) {
            addCriterion("MOBILEPHONE not between", value1, value2, "mobilephone");
            return (Criteria) this;
        }

        public Criteria andPositionIsNull() {
            addCriterion("POSITION is null");
            return (Criteria) this;
        }

        public Criteria andPositionIsNotNull() {
            addCriterion("POSITION is not null");
            return (Criteria) this;
        }

        public Criteria andPositionEqualTo(String value) {
            addCriterion("POSITION =", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionNotEqualTo(String value) {
            addCriterion("POSITION <>", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionGreaterThan(String value) {
            addCriterion("POSITION >", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionGreaterThanOrEqualTo(String value) {
            addCriterion("POSITION >=", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionLessThan(String value) {
            addCriterion("POSITION <", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionLessThanOrEqualTo(String value) {
            addCriterion("POSITION <=", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionLike(String value) {
            addCriterion("POSITION like", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionNotLike(String value) {
            addCriterion("POSITION not like", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionIn(List<String> values) {
            addCriterion("POSITION in", values, "position");
            return (Criteria) this;
        }

        public Criteria andPositionNotIn(List<String> values) {
            addCriterion("POSITION not in", values, "position");
            return (Criteria) this;
        }

        public Criteria andPositionBetween(String value1, String value2) {
            addCriterion("POSITION between", value1, value2, "position");
            return (Criteria) this;
        }

        public Criteria andPositionNotBetween(String value1, String value2) {
            addCriterion("POSITION not between", value1, value2, "position");
            return (Criteria) this;
        }

        public Criteria andJobIsNull() {
            addCriterion("JOB is null");
            return (Criteria) this;
        }

        public Criteria andJobIsNotNull() {
            addCriterion("JOB is not null");
            return (Criteria) this;
        }

        public Criteria andJobEqualTo(String value) {
            addCriterion("JOB =", value, "job");
            return (Criteria) this;
        }

        public Criteria andJobNotEqualTo(String value) {
            addCriterion("JOB <>", value, "job");
            return (Criteria) this;
        }

        public Criteria andJobGreaterThan(String value) {
            addCriterion("JOB >", value, "job");
            return (Criteria) this;
        }

        public Criteria andJobGreaterThanOrEqualTo(String value) {
            addCriterion("JOB >=", value, "job");
            return (Criteria) this;
        }

        public Criteria andJobLessThan(String value) {
            addCriterion("JOB <", value, "job");
            return (Criteria) this;
        }

        public Criteria andJobLessThanOrEqualTo(String value) {
            addCriterion("JOB <=", value, "job");
            return (Criteria) this;
        }

        public Criteria andJobLike(String value) {
            addCriterion("JOB like", value, "job");
            return (Criteria) this;
        }

        public Criteria andJobNotLike(String value) {
            addCriterion("JOB not like", value, "job");
            return (Criteria) this;
        }

        public Criteria andJobIn(List<String> values) {
            addCriterion("JOB in", values, "job");
            return (Criteria) this;
        }

        public Criteria andJobNotIn(List<String> values) {
            addCriterion("JOB not in", values, "job");
            return (Criteria) this;
        }

        public Criteria andJobBetween(String value1, String value2) {
            addCriterion("JOB between", value1, value2, "job");
            return (Criteria) this;
        }

        public Criteria andJobNotBetween(String value1, String value2) {
            addCriterion("JOB not between", value1, value2, "job");
            return (Criteria) this;
        }

        public Criteria andEmailIsNull() {
            addCriterion("EMAIL is null");
            return (Criteria) this;
        }

        public Criteria andEmailIsNotNull() {
            addCriterion("EMAIL is not null");
            return (Criteria) this;
        }

        public Criteria andEmailEqualTo(String value) {
            addCriterion("EMAIL =", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotEqualTo(String value) {
            addCriterion("EMAIL <>", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThan(String value) {
            addCriterion("EMAIL >", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThanOrEqualTo(String value) {
            addCriterion("EMAIL >=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThan(String value) {
            addCriterion("EMAIL <", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThanOrEqualTo(String value) {
            addCriterion("EMAIL <=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLike(String value) {
            addCriterion("EMAIL like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotLike(String value) {
            addCriterion("EMAIL not like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailIn(List<String> values) {
            addCriterion("EMAIL in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotIn(List<String> values) {
            addCriterion("EMAIL not in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailBetween(String value1, String value2) {
            addCriterion("EMAIL between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotBetween(String value1, String value2) {
            addCriterion("EMAIL not between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andIdcNameIsNull() {
            addCriterion("IDC_NAME is null");
            return (Criteria) this;
        }

        public Criteria andIdcNameIsNotNull() {
            addCriterion("IDC_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andIdcNameEqualTo(String value) {
            addCriterion("IDC_NAME =", value, "idcName");
            return (Criteria) this;
        }

        public Criteria andIdcNameNotEqualTo(String value) {
            addCriterion("IDC_NAME <>", value, "idcName");
            return (Criteria) this;
        }

        public Criteria andIdcNameGreaterThan(String value) {
            addCriterion("IDC_NAME >", value, "idcName");
            return (Criteria) this;
        }

        public Criteria andIdcNameGreaterThanOrEqualTo(String value) {
            addCriterion("IDC_NAME >=", value, "idcName");
            return (Criteria) this;
        }

        public Criteria andIdcNameLessThan(String value) {
            addCriterion("IDC_NAME <", value, "idcName");
            return (Criteria) this;
        }

        public Criteria andIdcNameLessThanOrEqualTo(String value) {
            addCriterion("IDC_NAME <=", value, "idcName");
            return (Criteria) this;
        }

        public Criteria andIdcNameLike(String value) {
            addCriterion("IDC_NAME like", value, "idcName");
            return (Criteria) this;
        }

        public Criteria andIdcNameNotLike(String value) {
            addCriterion("IDC_NAME not like", value, "idcName");
            return (Criteria) this;
        }

        public Criteria andIdcNameIn(List<String> values) {
            addCriterion("IDC_NAME in", values, "idcName");
            return (Criteria) this;
        }

        public Criteria andIdcNameNotIn(List<String> values) {
            addCriterion("IDC_NAME not in", values, "idcName");
            return (Criteria) this;
        }

        public Criteria andIdcNameBetween(String value1, String value2) {
            addCriterion("IDC_NAME between", value1, value2, "idcName");
            return (Criteria) this;
        }

        public Criteria andIdcNameNotBetween(String value1, String value2) {
            addCriterion("IDC_NAME not between", value1, value2, "idcName");
            return (Criteria) this;
        }

        public Criteria andIdcTypeIsNull() {
            addCriterion("IDC_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andIdcTypeIsNotNull() {
            addCriterion("IDC_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andIdcTypeEqualTo(String value) {
            addCriterion("IDC_TYPE =", value, "idcType");
            return (Criteria) this;
        }

        public Criteria andIdcTypeNotEqualTo(String value) {
            addCriterion("IDC_TYPE <>", value, "idcType");
            return (Criteria) this;
        }

        public Criteria andIdcTypeGreaterThan(String value) {
            addCriterion("IDC_TYPE >", value, "idcType");
            return (Criteria) this;
        }

        public Criteria andIdcTypeGreaterThanOrEqualTo(String value) {
            addCriterion("IDC_TYPE >=", value, "idcType");
            return (Criteria) this;
        }

        public Criteria andIdcTypeLessThan(String value) {
            addCriterion("IDC_TYPE <", value, "idcType");
            return (Criteria) this;
        }

        public Criteria andIdcTypeLessThanOrEqualTo(String value) {
            addCriterion("IDC_TYPE <=", value, "idcType");
            return (Criteria) this;
        }

        public Criteria andIdcTypeLike(String value) {
            addCriterion("IDC_TYPE like", value, "idcType");
            return (Criteria) this;
        }

        public Criteria andIdcTypeNotLike(String value) {
            addCriterion("IDC_TYPE not like", value, "idcType");
            return (Criteria) this;
        }

        public Criteria andIdcTypeIn(List<String> values) {
            addCriterion("IDC_TYPE in", values, "idcType");
            return (Criteria) this;
        }

        public Criteria andIdcTypeNotIn(List<String> values) {
            addCriterion("IDC_TYPE not in", values, "idcType");
            return (Criteria) this;
        }

        public Criteria andIdcTypeBetween(String value1, String value2) {
            addCriterion("IDC_TYPE between", value1, value2, "idcType");
            return (Criteria) this;
        }

        public Criteria andIdcTypeNotBetween(String value1, String value2) {
            addCriterion("IDC_TYPE not between", value1, value2, "idcType");
            return (Criteria) this;
        }

        public Criteria andIdcNoIsNull() {
            addCriterion("IDC_NO is null");
            return (Criteria) this;
        }

        public Criteria andIdcNoIsNotNull() {
            addCriterion("IDC_NO is not null");
            return (Criteria) this;
        }

        public Criteria andIdcNoEqualTo(String value) {
            addCriterion("IDC_NO =", value, "idcNo");
            return (Criteria) this;
        }

        public Criteria andIdcNoNotEqualTo(String value) {
            addCriterion("IDC_NO <>", value, "idcNo");
            return (Criteria) this;
        }

        public Criteria andIdcNoGreaterThan(String value) {
            addCriterion("IDC_NO >", value, "idcNo");
            return (Criteria) this;
        }

        public Criteria andIdcNoGreaterThanOrEqualTo(String value) {
            addCriterion("IDC_NO >=", value, "idcNo");
            return (Criteria) this;
        }

        public Criteria andIdcNoLessThan(String value) {
            addCriterion("IDC_NO <", value, "idcNo");
            return (Criteria) this;
        }

        public Criteria andIdcNoLessThanOrEqualTo(String value) {
            addCriterion("IDC_NO <=", value, "idcNo");
            return (Criteria) this;
        }

        public Criteria andIdcNoLike(String value) {
            addCriterion("IDC_NO like", value, "idcNo");
            return (Criteria) this;
        }

        public Criteria andIdcNoNotLike(String value) {
            addCriterion("IDC_NO not like", value, "idcNo");
            return (Criteria) this;
        }

        public Criteria andIdcNoIn(List<String> values) {
            addCriterion("IDC_NO in", values, "idcNo");
            return (Criteria) this;
        }

        public Criteria andIdcNoNotIn(List<String> values) {
            addCriterion("IDC_NO not in", values, "idcNo");
            return (Criteria) this;
        }

        public Criteria andIdcNoBetween(String value1, String value2) {
            addCriterion("IDC_NO between", value1, value2, "idcNo");
            return (Criteria) this;
        }

        public Criteria andIdcNoNotBetween(String value1, String value2) {
            addCriterion("IDC_NO not between", value1, value2, "idcNo");
            return (Criteria) this;
        }

        public Criteria andIdcValidityDateIsNull() {
            addCriterion("IDC_VALIDITY_DATE is null");
            return (Criteria) this;
        }

        public Criteria andIdcValidityDateIsNotNull() {
            addCriterion("IDC_VALIDITY_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andIdcValidityDateEqualTo(String value) {
            addCriterion("IDC_VALIDITY_DATE =", value, "idcValidityDate");
            return (Criteria) this;
        }

        public Criteria andIdcValidityDateNotEqualTo(String value) {
            addCriterion("IDC_VALIDITY_DATE <>", value, "idcValidityDate");
            return (Criteria) this;
        }

        public Criteria andIdcValidityDateGreaterThan(String value) {
            addCriterion("IDC_VALIDITY_DATE >", value, "idcValidityDate");
            return (Criteria) this;
        }

        public Criteria andIdcValidityDateGreaterThanOrEqualTo(String value) {
            addCriterion("IDC_VALIDITY_DATE >=", value, "idcValidityDate");
            return (Criteria) this;
        }

        public Criteria andIdcValidityDateLessThan(String value) {
            addCriterion("IDC_VALIDITY_DATE <", value, "idcValidityDate");
            return (Criteria) this;
        }

        public Criteria andIdcValidityDateLessThanOrEqualTo(String value) {
            addCriterion("IDC_VALIDITY_DATE <=", value, "idcValidityDate");
            return (Criteria) this;
        }

        public Criteria andIdcValidityDateLike(String value) {
            addCriterion("IDC_VALIDITY_DATE like", value, "idcValidityDate");
            return (Criteria) this;
        }

        public Criteria andIdcValidityDateNotLike(String value) {
            addCriterion("IDC_VALIDITY_DATE not like", value, "idcValidityDate");
            return (Criteria) this;
        }

        public Criteria andIdcValidityDateIn(List<String> values) {
            addCriterion("IDC_VALIDITY_DATE in", values, "idcValidityDate");
            return (Criteria) this;
        }

        public Criteria andIdcValidityDateNotIn(List<String> values) {
            addCriterion("IDC_VALIDITY_DATE not in", values, "idcValidityDate");
            return (Criteria) this;
        }

        public Criteria andIdcValidityDateBetween(String value1, String value2) {
            addCriterion("IDC_VALIDITY_DATE between", value1, value2, "idcValidityDate");
            return (Criteria) this;
        }

        public Criteria andIdcValidityDateNotBetween(String value1, String value2) {
            addCriterion("IDC_VALIDITY_DATE not between", value1, value2, "idcValidityDate");
            return (Criteria) this;
        }

        public Criteria andIdcName2IsNull() {
            addCriterion("IDC_NAME2 is null");
            return (Criteria) this;
        }

        public Criteria andIdcName2IsNotNull() {
            addCriterion("IDC_NAME2 is not null");
            return (Criteria) this;
        }

        public Criteria andIdcName2EqualTo(String value) {
            addCriterion("IDC_NAME2 =", value, "idcName2");
            return (Criteria) this;
        }

        public Criteria andIdcName2NotEqualTo(String value) {
            addCriterion("IDC_NAME2 <>", value, "idcName2");
            return (Criteria) this;
        }

        public Criteria andIdcName2GreaterThan(String value) {
            addCriterion("IDC_NAME2 >", value, "idcName2");
            return (Criteria) this;
        }

        public Criteria andIdcName2GreaterThanOrEqualTo(String value) {
            addCriterion("IDC_NAME2 >=", value, "idcName2");
            return (Criteria) this;
        }

        public Criteria andIdcName2LessThan(String value) {
            addCriterion("IDC_NAME2 <", value, "idcName2");
            return (Criteria) this;
        }

        public Criteria andIdcName2LessThanOrEqualTo(String value) {
            addCriterion("IDC_NAME2 <=", value, "idcName2");
            return (Criteria) this;
        }

        public Criteria andIdcName2Like(String value) {
            addCriterion("IDC_NAME2 like", value, "idcName2");
            return (Criteria) this;
        }

        public Criteria andIdcName2NotLike(String value) {
            addCriterion("IDC_NAME2 not like", value, "idcName2");
            return (Criteria) this;
        }

        public Criteria andIdcName2In(List<String> values) {
            addCriterion("IDC_NAME2 in", values, "idcName2");
            return (Criteria) this;
        }

        public Criteria andIdcName2NotIn(List<String> values) {
            addCriterion("IDC_NAME2 not in", values, "idcName2");
            return (Criteria) this;
        }

        public Criteria andIdcName2Between(String value1, String value2) {
            addCriterion("IDC_NAME2 between", value1, value2, "idcName2");
            return (Criteria) this;
        }

        public Criteria andIdcName2NotBetween(String value1, String value2) {
            addCriterion("IDC_NAME2 not between", value1, value2, "idcName2");
            return (Criteria) this;
        }

        public Criteria andIdcType2IsNull() {
            addCriterion("IDC_TYPE2 is null");
            return (Criteria) this;
        }

        public Criteria andIdcType2IsNotNull() {
            addCriterion("IDC_TYPE2 is not null");
            return (Criteria) this;
        }

        public Criteria andIdcType2EqualTo(String value) {
            addCriterion("IDC_TYPE2 =", value, "idcType2");
            return (Criteria) this;
        }

        public Criteria andIdcType2NotEqualTo(String value) {
            addCriterion("IDC_TYPE2 <>", value, "idcType2");
            return (Criteria) this;
        }

        public Criteria andIdcType2GreaterThan(String value) {
            addCriterion("IDC_TYPE2 >", value, "idcType2");
            return (Criteria) this;
        }

        public Criteria andIdcType2GreaterThanOrEqualTo(String value) {
            addCriterion("IDC_TYPE2 >=", value, "idcType2");
            return (Criteria) this;
        }

        public Criteria andIdcType2LessThan(String value) {
            addCriterion("IDC_TYPE2 <", value, "idcType2");
            return (Criteria) this;
        }

        public Criteria andIdcType2LessThanOrEqualTo(String value) {
            addCriterion("IDC_TYPE2 <=", value, "idcType2");
            return (Criteria) this;
        }

        public Criteria andIdcType2Like(String value) {
            addCriterion("IDC_TYPE2 like", value, "idcType2");
            return (Criteria) this;
        }

        public Criteria andIdcType2NotLike(String value) {
            addCriterion("IDC_TYPE2 not like", value, "idcType2");
            return (Criteria) this;
        }

        public Criteria andIdcType2In(List<String> values) {
            addCriterion("IDC_TYPE2 in", values, "idcType2");
            return (Criteria) this;
        }

        public Criteria andIdcType2NotIn(List<String> values) {
            addCriterion("IDC_TYPE2 not in", values, "idcType2");
            return (Criteria) this;
        }

        public Criteria andIdcType2Between(String value1, String value2) {
            addCriterion("IDC_TYPE2 between", value1, value2, "idcType2");
            return (Criteria) this;
        }

        public Criteria andIdcType2NotBetween(String value1, String value2) {
            addCriterion("IDC_TYPE2 not between", value1, value2, "idcType2");
            return (Criteria) this;
        }

        public Criteria andIdcNo2IsNull() {
            addCriterion("IDC_NO2 is null");
            return (Criteria) this;
        }

        public Criteria andIdcNo2IsNotNull() {
            addCriterion("IDC_NO2 is not null");
            return (Criteria) this;
        }

        public Criteria andIdcNo2EqualTo(String value) {
            addCriterion("IDC_NO2 =", value, "idcNo2");
            return (Criteria) this;
        }

        public Criteria andIdcNo2NotEqualTo(String value) {
            addCriterion("IDC_NO2 <>", value, "idcNo2");
            return (Criteria) this;
        }

        public Criteria andIdcNo2GreaterThan(String value) {
            addCriterion("IDC_NO2 >", value, "idcNo2");
            return (Criteria) this;
        }

        public Criteria andIdcNo2GreaterThanOrEqualTo(String value) {
            addCriterion("IDC_NO2 >=", value, "idcNo2");
            return (Criteria) this;
        }

        public Criteria andIdcNo2LessThan(String value) {
            addCriterion("IDC_NO2 <", value, "idcNo2");
            return (Criteria) this;
        }

        public Criteria andIdcNo2LessThanOrEqualTo(String value) {
            addCriterion("IDC_NO2 <=", value, "idcNo2");
            return (Criteria) this;
        }

        public Criteria andIdcNo2Like(String value) {
            addCriterion("IDC_NO2 like", value, "idcNo2");
            return (Criteria) this;
        }

        public Criteria andIdcNo2NotLike(String value) {
            addCriterion("IDC_NO2 not like", value, "idcNo2");
            return (Criteria) this;
        }

        public Criteria andIdcNo2In(List<String> values) {
            addCriterion("IDC_NO2 in", values, "idcNo2");
            return (Criteria) this;
        }

        public Criteria andIdcNo2NotIn(List<String> values) {
            addCriterion("IDC_NO2 not in", values, "idcNo2");
            return (Criteria) this;
        }

        public Criteria andIdcNo2Between(String value1, String value2) {
            addCriterion("IDC_NO2 between", value1, value2, "idcNo2");
            return (Criteria) this;
        }

        public Criteria andIdcNo2NotBetween(String value1, String value2) {
            addCriterion("IDC_NO2 not between", value1, value2, "idcNo2");
            return (Criteria) this;
        }

        public Criteria andIdcValidityDate2IsNull() {
            addCriterion("IDC_VALIDITY_DATE2 is null");
            return (Criteria) this;
        }

        public Criteria andIdcValidityDate2IsNotNull() {
            addCriterion("IDC_VALIDITY_DATE2 is not null");
            return (Criteria) this;
        }

        public Criteria andIdcValidityDate2EqualTo(String value) {
            addCriterion("IDC_VALIDITY_DATE2 =", value, "idcValidityDate2");
            return (Criteria) this;
        }

        public Criteria andIdcValidityDate2NotEqualTo(String value) {
            addCriterion("IDC_VALIDITY_DATE2 <>", value, "idcValidityDate2");
            return (Criteria) this;
        }

        public Criteria andIdcValidityDate2GreaterThan(String value) {
            addCriterion("IDC_VALIDITY_DATE2 >", value, "idcValidityDate2");
            return (Criteria) this;
        }

        public Criteria andIdcValidityDate2GreaterThanOrEqualTo(String value) {
            addCriterion("IDC_VALIDITY_DATE2 >=", value, "idcValidityDate2");
            return (Criteria) this;
        }

        public Criteria andIdcValidityDate2LessThan(String value) {
            addCriterion("IDC_VALIDITY_DATE2 <", value, "idcValidityDate2");
            return (Criteria) this;
        }

        public Criteria andIdcValidityDate2LessThanOrEqualTo(String value) {
            addCriterion("IDC_VALIDITY_DATE2 <=", value, "idcValidityDate2");
            return (Criteria) this;
        }

        public Criteria andIdcValidityDate2Like(String value) {
            addCriterion("IDC_VALIDITY_DATE2 like", value, "idcValidityDate2");
            return (Criteria) this;
        }

        public Criteria andIdcValidityDate2NotLike(String value) {
            addCriterion("IDC_VALIDITY_DATE2 not like", value, "idcValidityDate2");
            return (Criteria) this;
        }

        public Criteria andIdcValidityDate2In(List<String> values) {
            addCriterion("IDC_VALIDITY_DATE2 in", values, "idcValidityDate2");
            return (Criteria) this;
        }

        public Criteria andIdcValidityDate2NotIn(List<String> values) {
            addCriterion("IDC_VALIDITY_DATE2 not in", values, "idcValidityDate2");
            return (Criteria) this;
        }

        public Criteria andIdcValidityDate2Between(String value1, String value2) {
            addCriterion("IDC_VALIDITY_DATE2 between", value1, value2, "idcValidityDate2");
            return (Criteria) this;
        }

        public Criteria andIdcValidityDate2NotBetween(String value1, String value2) {
            addCriterion("IDC_VALIDITY_DATE2 not between", value1, value2, "idcValidityDate2");
            return (Criteria) this;
        }

        public Criteria andIdcName3IsNull() {
            addCriterion("IDC_NAME3 is null");
            return (Criteria) this;
        }

        public Criteria andIdcName3IsNotNull() {
            addCriterion("IDC_NAME3 is not null");
            return (Criteria) this;
        }

        public Criteria andIdcName3EqualTo(String value) {
            addCriterion("IDC_NAME3 =", value, "idcName3");
            return (Criteria) this;
        }

        public Criteria andIdcName3NotEqualTo(String value) {
            addCriterion("IDC_NAME3 <>", value, "idcName3");
            return (Criteria) this;
        }

        public Criteria andIdcName3GreaterThan(String value) {
            addCriterion("IDC_NAME3 >", value, "idcName3");
            return (Criteria) this;
        }

        public Criteria andIdcName3GreaterThanOrEqualTo(String value) {
            addCriterion("IDC_NAME3 >=", value, "idcName3");
            return (Criteria) this;
        }

        public Criteria andIdcName3LessThan(String value) {
            addCriterion("IDC_NAME3 <", value, "idcName3");
            return (Criteria) this;
        }

        public Criteria andIdcName3LessThanOrEqualTo(String value) {
            addCriterion("IDC_NAME3 <=", value, "idcName3");
            return (Criteria) this;
        }

        public Criteria andIdcName3Like(String value) {
            addCriterion("IDC_NAME3 like", value, "idcName3");
            return (Criteria) this;
        }

        public Criteria andIdcName3NotLike(String value) {
            addCriterion("IDC_NAME3 not like", value, "idcName3");
            return (Criteria) this;
        }

        public Criteria andIdcName3In(List<String> values) {
            addCriterion("IDC_NAME3 in", values, "idcName3");
            return (Criteria) this;
        }

        public Criteria andIdcName3NotIn(List<String> values) {
            addCriterion("IDC_NAME3 not in", values, "idcName3");
            return (Criteria) this;
        }

        public Criteria andIdcName3Between(String value1, String value2) {
            addCriterion("IDC_NAME3 between", value1, value2, "idcName3");
            return (Criteria) this;
        }

        public Criteria andIdcName3NotBetween(String value1, String value2) {
            addCriterion("IDC_NAME3 not between", value1, value2, "idcName3");
            return (Criteria) this;
        }

        public Criteria andIdcType3IsNull() {
            addCriterion("IDC_TYPE3 is null");
            return (Criteria) this;
        }

        public Criteria andIdcType3IsNotNull() {
            addCriterion("IDC_TYPE3 is not null");
            return (Criteria) this;
        }

        public Criteria andIdcType3EqualTo(String value) {
            addCriterion("IDC_TYPE3 =", value, "idcType3");
            return (Criteria) this;
        }

        public Criteria andIdcType3NotEqualTo(String value) {
            addCriterion("IDC_TYPE3 <>", value, "idcType3");
            return (Criteria) this;
        }

        public Criteria andIdcType3GreaterThan(String value) {
            addCriterion("IDC_TYPE3 >", value, "idcType3");
            return (Criteria) this;
        }

        public Criteria andIdcType3GreaterThanOrEqualTo(String value) {
            addCriterion("IDC_TYPE3 >=", value, "idcType3");
            return (Criteria) this;
        }

        public Criteria andIdcType3LessThan(String value) {
            addCriterion("IDC_TYPE3 <", value, "idcType3");
            return (Criteria) this;
        }

        public Criteria andIdcType3LessThanOrEqualTo(String value) {
            addCriterion("IDC_TYPE3 <=", value, "idcType3");
            return (Criteria) this;
        }

        public Criteria andIdcType3Like(String value) {
            addCriterion("IDC_TYPE3 like", value, "idcType3");
            return (Criteria) this;
        }

        public Criteria andIdcType3NotLike(String value) {
            addCriterion("IDC_TYPE3 not like", value, "idcType3");
            return (Criteria) this;
        }

        public Criteria andIdcType3In(List<String> values) {
            addCriterion("IDC_TYPE3 in", values, "idcType3");
            return (Criteria) this;
        }

        public Criteria andIdcType3NotIn(List<String> values) {
            addCriterion("IDC_TYPE3 not in", values, "idcType3");
            return (Criteria) this;
        }

        public Criteria andIdcType3Between(String value1, String value2) {
            addCriterion("IDC_TYPE3 between", value1, value2, "idcType3");
            return (Criteria) this;
        }

        public Criteria andIdcType3NotBetween(String value1, String value2) {
            addCriterion("IDC_TYPE3 not between", value1, value2, "idcType3");
            return (Criteria) this;
        }

        public Criteria andIdcNo3IsNull() {
            addCriterion("IDC_NO3 is null");
            return (Criteria) this;
        }

        public Criteria andIdcNo3IsNotNull() {
            addCriterion("IDC_NO3 is not null");
            return (Criteria) this;
        }

        public Criteria andIdcNo3EqualTo(String value) {
            addCriterion("IDC_NO3 =", value, "idcNo3");
            return (Criteria) this;
        }

        public Criteria andIdcNo3NotEqualTo(String value) {
            addCriterion("IDC_NO3 <>", value, "idcNo3");
            return (Criteria) this;
        }

        public Criteria andIdcNo3GreaterThan(String value) {
            addCriterion("IDC_NO3 >", value, "idcNo3");
            return (Criteria) this;
        }

        public Criteria andIdcNo3GreaterThanOrEqualTo(String value) {
            addCriterion("IDC_NO3 >=", value, "idcNo3");
            return (Criteria) this;
        }

        public Criteria andIdcNo3LessThan(String value) {
            addCriterion("IDC_NO3 <", value, "idcNo3");
            return (Criteria) this;
        }

        public Criteria andIdcNo3LessThanOrEqualTo(String value) {
            addCriterion("IDC_NO3 <=", value, "idcNo3");
            return (Criteria) this;
        }

        public Criteria andIdcNo3Like(String value) {
            addCriterion("IDC_NO3 like", value, "idcNo3");
            return (Criteria) this;
        }

        public Criteria andIdcNo3NotLike(String value) {
            addCriterion("IDC_NO3 not like", value, "idcNo3");
            return (Criteria) this;
        }

        public Criteria andIdcNo3In(List<String> values) {
            addCriterion("IDC_NO3 in", values, "idcNo3");
            return (Criteria) this;
        }

        public Criteria andIdcNo3NotIn(List<String> values) {
            addCriterion("IDC_NO3 not in", values, "idcNo3");
            return (Criteria) this;
        }

        public Criteria andIdcNo3Between(String value1, String value2) {
            addCriterion("IDC_NO3 between", value1, value2, "idcNo3");
            return (Criteria) this;
        }

        public Criteria andIdcNo3NotBetween(String value1, String value2) {
            addCriterion("IDC_NO3 not between", value1, value2, "idcNo3");
            return (Criteria) this;
        }

        public Criteria andIdcValidityDate3IsNull() {
            addCriterion("IDC_VALIDITY_DATE3 is null");
            return (Criteria) this;
        }

        public Criteria andIdcValidityDate3IsNotNull() {
            addCriterion("IDC_VALIDITY_DATE3 is not null");
            return (Criteria) this;
        }

        public Criteria andIdcValidityDate3EqualTo(String value) {
            addCriterion("IDC_VALIDITY_DATE3 =", value, "idcValidityDate3");
            return (Criteria) this;
        }

        public Criteria andIdcValidityDate3NotEqualTo(String value) {
            addCriterion("IDC_VALIDITY_DATE3 <>", value, "idcValidityDate3");
            return (Criteria) this;
        }

        public Criteria andIdcValidityDate3GreaterThan(String value) {
            addCriterion("IDC_VALIDITY_DATE3 >", value, "idcValidityDate3");
            return (Criteria) this;
        }

        public Criteria andIdcValidityDate3GreaterThanOrEqualTo(String value) {
            addCriterion("IDC_VALIDITY_DATE3 >=", value, "idcValidityDate3");
            return (Criteria) this;
        }

        public Criteria andIdcValidityDate3LessThan(String value) {
            addCriterion("IDC_VALIDITY_DATE3 <", value, "idcValidityDate3");
            return (Criteria) this;
        }

        public Criteria andIdcValidityDate3LessThanOrEqualTo(String value) {
            addCriterion("IDC_VALIDITY_DATE3 <=", value, "idcValidityDate3");
            return (Criteria) this;
        }

        public Criteria andIdcValidityDate3Like(String value) {
            addCriterion("IDC_VALIDITY_DATE3 like", value, "idcValidityDate3");
            return (Criteria) this;
        }

        public Criteria andIdcValidityDate3NotLike(String value) {
            addCriterion("IDC_VALIDITY_DATE3 not like", value, "idcValidityDate3");
            return (Criteria) this;
        }

        public Criteria andIdcValidityDate3In(List<String> values) {
            addCriterion("IDC_VALIDITY_DATE3 in", values, "idcValidityDate3");
            return (Criteria) this;
        }

        public Criteria andIdcValidityDate3NotIn(List<String> values) {
            addCriterion("IDC_VALIDITY_DATE3 not in", values, "idcValidityDate3");
            return (Criteria) this;
        }

        public Criteria andIdcValidityDate3Between(String value1, String value2) {
            addCriterion("IDC_VALIDITY_DATE3 between", value1, value2, "idcValidityDate3");
            return (Criteria) this;
        }

        public Criteria andIdcValidityDate3NotBetween(String value1, String value2) {
            addCriterion("IDC_VALIDITY_DATE3 not between", value1, value2, "idcValidityDate3");
            return (Criteria) this;
        }

        public Criteria andStateIsNull() {
            addCriterion("STATE is null");
            return (Criteria) this;
        }

        public Criteria andStateIsNotNull() {
            addCriterion("STATE is not null");
            return (Criteria) this;
        }

        public Criteria andStateEqualTo(String value) {
            addCriterion("STATE =", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotEqualTo(String value) {
            addCriterion("STATE <>", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThan(String value) {
            addCriterion("STATE >", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThanOrEqualTo(String value) {
            addCriterion("STATE >=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThan(String value) {
            addCriterion("STATE <", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThanOrEqualTo(String value) {
            addCriterion("STATE <=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLike(String value) {
            addCriterion("STATE like", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotLike(String value) {
            addCriterion("STATE not like", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateIn(List<String> values) {
            addCriterion("STATE in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotIn(List<String> values) {
            addCriterion("STATE not in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateBetween(String value1, String value2) {
            addCriterion("STATE between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotBetween(String value1, String value2) {
            addCriterion("STATE not between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andVisitNumIsNull() {
            addCriterion("VISIT_NUM is null");
            return (Criteria) this;
        }

        public Criteria andVisitNumIsNotNull() {
            addCriterion("VISIT_NUM is not null");
            return (Criteria) this;
        }

        public Criteria andVisitNumEqualTo(Integer value) {
            addCriterion("VISIT_NUM =", value, "visitNum");
            return (Criteria) this;
        }

        public Criteria andVisitNumNotEqualTo(Integer value) {
            addCriterion("VISIT_NUM <>", value, "visitNum");
            return (Criteria) this;
        }

        public Criteria andVisitNumGreaterThan(Integer value) {
            addCriterion("VISIT_NUM >", value, "visitNum");
            return (Criteria) this;
        }

        public Criteria andVisitNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("VISIT_NUM >=", value, "visitNum");
            return (Criteria) this;
        }

        public Criteria andVisitNumLessThan(Integer value) {
            addCriterion("VISIT_NUM <", value, "visitNum");
            return (Criteria) this;
        }

        public Criteria andVisitNumLessThanOrEqualTo(Integer value) {
            addCriterion("VISIT_NUM <=", value, "visitNum");
            return (Criteria) this;
        }

        public Criteria andVisitNumIn(List<Integer> values) {
            addCriterion("VISIT_NUM in", values, "visitNum");
            return (Criteria) this;
        }

        public Criteria andVisitNumNotIn(List<Integer> values) {
            addCriterion("VISIT_NUM not in", values, "visitNum");
            return (Criteria) this;
        }

        public Criteria andVisitNumBetween(Integer value1, Integer value2) {
            addCriterion("VISIT_NUM between", value1, value2, "visitNum");
            return (Criteria) this;
        }

        public Criteria andVisitNumNotBetween(Integer value1, Integer value2) {
            addCriterion("VISIT_NUM not between", value1, value2, "visitNum");
            return (Criteria) this;
        }

        public Criteria andLastVisitTimeIsNull() {
            addCriterion("LAST_VISIT_TIME is null");
            return (Criteria) this;
        }

        public Criteria andLastVisitTimeIsNotNull() {
            addCriterion("LAST_VISIT_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andLastVisitTimeEqualTo(Date value) {
            addCriterion("LAST_VISIT_TIME =", value, "lastVisitTime");
            return (Criteria) this;
        }

        public Criteria andLastVisitTimeNotEqualTo(Date value) {
            addCriterion("LAST_VISIT_TIME <>", value, "lastVisitTime");
            return (Criteria) this;
        }

        public Criteria andLastVisitTimeGreaterThan(Date value) {
            addCriterion("LAST_VISIT_TIME >", value, "lastVisitTime");
            return (Criteria) this;
        }

        public Criteria andLastVisitTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("LAST_VISIT_TIME >=", value, "lastVisitTime");
            return (Criteria) this;
        }

        public Criteria andLastVisitTimeLessThan(Date value) {
            addCriterion("LAST_VISIT_TIME <", value, "lastVisitTime");
            return (Criteria) this;
        }

        public Criteria andLastVisitTimeLessThanOrEqualTo(Date value) {
            addCriterion("LAST_VISIT_TIME <=", value, "lastVisitTime");
            return (Criteria) this;
        }

        public Criteria andLastVisitTimeIn(List<Date> values) {
            addCriterion("LAST_VISIT_TIME in", values, "lastVisitTime");
            return (Criteria) this;
        }

        public Criteria andLastVisitTimeNotIn(List<Date> values) {
            addCriterion("LAST_VISIT_TIME not in", values, "lastVisitTime");
            return (Criteria) this;
        }

        public Criteria andLastVisitTimeBetween(Date value1, Date value2) {
            addCriterion("LAST_VISIT_TIME between", value1, value2, "lastVisitTime");
            return (Criteria) this;
        }

        public Criteria andLastVisitTimeNotBetween(Date value1, Date value2) {
            addCriterion("LAST_VISIT_TIME not between", value1, value2, "lastVisitTime");
            return (Criteria) this;
        }

        public Criteria andUserTypeIsNull() {
            addCriterion("USER_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andUserTypeIsNotNull() {
            addCriterion("USER_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andUserTypeEqualTo(String value) {
            addCriterion("USER_TYPE =", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeNotEqualTo(String value) {
            addCriterion("USER_TYPE <>", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeGreaterThan(String value) {
            addCriterion("USER_TYPE >", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeGreaterThanOrEqualTo(String value) {
            addCriterion("USER_TYPE >=", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeLessThan(String value) {
            addCriterion("USER_TYPE <", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeLessThanOrEqualTo(String value) {
            addCriterion("USER_TYPE <=", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeLike(String value) {
            addCriterion("USER_TYPE like", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeNotLike(String value) {
            addCriterion("USER_TYPE not like", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeIn(List<String> values) {
            addCriterion("USER_TYPE in", values, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeNotIn(List<String> values) {
            addCriterion("USER_TYPE not in", values, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeBetween(String value1, String value2) {
            addCriterion("USER_TYPE between", value1, value2, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeNotBetween(String value1, String value2) {
            addCriterion("USER_TYPE not between", value1, value2, "userType");
            return (Criteria) this;
        }

        public Criteria andCreateUserIsNull() {
            addCriterion("CREATE_USER is null");
            return (Criteria) this;
        }

        public Criteria andCreateUserIsNotNull() {
            addCriterion("CREATE_USER is not null");
            return (Criteria) this;
        }

        public Criteria andCreateUserEqualTo(Long value) {
            addCriterion("CREATE_USER =", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserNotEqualTo(Long value) {
            addCriterion("CREATE_USER <>", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserGreaterThan(Long value) {
            addCriterion("CREATE_USER >", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserGreaterThanOrEqualTo(Long value) {
            addCriterion("CREATE_USER >=", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserLessThan(Long value) {
            addCriterion("CREATE_USER <", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserLessThanOrEqualTo(Long value) {
            addCriterion("CREATE_USER <=", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserIn(List<Long> values) {
            addCriterion("CREATE_USER in", values, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserNotIn(List<Long> values) {
            addCriterion("CREATE_USER not in", values, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserBetween(Long value1, Long value2) {
            addCriterion("CREATE_USER between", value1, value2, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserNotBetween(Long value1, Long value2) {
            addCriterion("CREATE_USER not between", value1, value2, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("CREATE_TIME is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("CREATE_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("CREATE_TIME =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("CREATE_TIME <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("CREATE_TIME >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("CREATE_TIME >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("CREATE_TIME <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("CREATE_TIME <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("CREATE_TIME in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("CREATE_TIME not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("CREATE_TIME between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("CREATE_TIME not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andModifyUserIsNull() {
            addCriterion("MODIFY_USER is null");
            return (Criteria) this;
        }

        public Criteria andModifyUserIsNotNull() {
            addCriterion("MODIFY_USER is not null");
            return (Criteria) this;
        }

        public Criteria andModifyUserEqualTo(Long value) {
            addCriterion("MODIFY_USER =", value, "modifyUser");
            return (Criteria) this;
        }

        public Criteria andModifyUserNotEqualTo(Long value) {
            addCriterion("MODIFY_USER <>", value, "modifyUser");
            return (Criteria) this;
        }

        public Criteria andModifyUserGreaterThan(Long value) {
            addCriterion("MODIFY_USER >", value, "modifyUser");
            return (Criteria) this;
        }

        public Criteria andModifyUserGreaterThanOrEqualTo(Long value) {
            addCriterion("MODIFY_USER >=", value, "modifyUser");
            return (Criteria) this;
        }

        public Criteria andModifyUserLessThan(Long value) {
            addCriterion("MODIFY_USER <", value, "modifyUser");
            return (Criteria) this;
        }

        public Criteria andModifyUserLessThanOrEqualTo(Long value) {
            addCriterion("MODIFY_USER <=", value, "modifyUser");
            return (Criteria) this;
        }

        public Criteria andModifyUserIn(List<Long> values) {
            addCriterion("MODIFY_USER in", values, "modifyUser");
            return (Criteria) this;
        }

        public Criteria andModifyUserNotIn(List<Long> values) {
            addCriterion("MODIFY_USER not in", values, "modifyUser");
            return (Criteria) this;
        }

        public Criteria andModifyUserBetween(Long value1, Long value2) {
            addCriterion("MODIFY_USER between", value1, value2, "modifyUser");
            return (Criteria) this;
        }

        public Criteria andModifyUserNotBetween(Long value1, Long value2) {
            addCriterion("MODIFY_USER not between", value1, value2, "modifyUser");
            return (Criteria) this;
        }

        public Criteria andModifyTimeIsNull() {
            addCriterion("MODIFY_TIME is null");
            return (Criteria) this;
        }

        public Criteria andModifyTimeIsNotNull() {
            addCriterion("MODIFY_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andModifyTimeEqualTo(Date value) {
            addCriterion("MODIFY_TIME =", value, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeNotEqualTo(Date value) {
            addCriterion("MODIFY_TIME <>", value, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeGreaterThan(Date value) {
            addCriterion("MODIFY_TIME >", value, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("MODIFY_TIME >=", value, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeLessThan(Date value) {
            addCriterion("MODIFY_TIME <", value, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeLessThanOrEqualTo(Date value) {
            addCriterion("MODIFY_TIME <=", value, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeIn(List<Date> values) {
            addCriterion("MODIFY_TIME in", values, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeNotIn(List<Date> values) {
            addCriterion("MODIFY_TIME not in", values, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeBetween(Date value1, Date value2) {
            addCriterion("MODIFY_TIME between", value1, value2, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeNotBetween(Date value1, Date value2) {
            addCriterion("MODIFY_TIME not between", value1, value2, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNull() {
            addCriterion("REMARK is null");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("REMARK is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("REMARK =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("REMARK <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("REMARK >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("REMARK >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("REMARK <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("REMARK <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("REMARK like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("REMARK not like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("REMARK in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("REMARK not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("REMARK between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("REMARK not between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andLastLoginTimeIsNull() {
            addCriterion("LAST_LOGIN_TIME is null");
            return (Criteria) this;
        }

        public Criteria andLastLoginTimeIsNotNull() {
            addCriterion("LAST_LOGIN_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andLastLoginTimeEqualTo(Date value) {
            addCriterion("LAST_LOGIN_TIME =", value, "lastLoginTime");
            return (Criteria) this;
        }

        public Criteria andLastLoginTimeNotEqualTo(Date value) {
            addCriterion("LAST_LOGIN_TIME <>", value, "lastLoginTime");
            return (Criteria) this;
        }

        public Criteria andLastLoginTimeGreaterThan(Date value) {
            addCriterion("LAST_LOGIN_TIME >", value, "lastLoginTime");
            return (Criteria) this;
        }

        public Criteria andLastLoginTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("LAST_LOGIN_TIME >=", value, "lastLoginTime");
            return (Criteria) this;
        }

        public Criteria andLastLoginTimeLessThan(Date value) {
            addCriterion("LAST_LOGIN_TIME <", value, "lastLoginTime");
            return (Criteria) this;
        }

        public Criteria andLastLoginTimeLessThanOrEqualTo(Date value) {
            addCriterion("LAST_LOGIN_TIME <=", value, "lastLoginTime");
            return (Criteria) this;
        }

        public Criteria andLastLoginTimeIn(List<Date> values) {
            addCriterion("LAST_LOGIN_TIME in", values, "lastLoginTime");
            return (Criteria) this;
        }

        public Criteria andLastLoginTimeNotIn(List<Date> values) {
            addCriterion("LAST_LOGIN_TIME not in", values, "lastLoginTime");
            return (Criteria) this;
        }

        public Criteria andLastLoginTimeBetween(Date value1, Date value2) {
            addCriterion("LAST_LOGIN_TIME between", value1, value2, "lastLoginTime");
            return (Criteria) this;
        }

        public Criteria andLastLoginTimeNotBetween(Date value1, Date value2) {
            addCriterion("LAST_LOGIN_TIME not between", value1, value2, "lastLoginTime");
            return (Criteria) this;
        }

        public Criteria andLoginFalseCountIsNull() {
            addCriterion("LOGIN_FALSE_COUNT is null");
            return (Criteria) this;
        }

        public Criteria andLoginFalseCountIsNotNull() {
            addCriterion("LOGIN_FALSE_COUNT is not null");
            return (Criteria) this;
        }

        public Criteria andLoginFalseCountEqualTo(Integer value) {
            addCriterion("LOGIN_FALSE_COUNT =", value, "loginFalseCount");
            return (Criteria) this;
        }

        public Criteria andLoginFalseCountNotEqualTo(Integer value) {
            addCriterion("LOGIN_FALSE_COUNT <>", value, "loginFalseCount");
            return (Criteria) this;
        }

        public Criteria andLoginFalseCountGreaterThan(Integer value) {
            addCriterion("LOGIN_FALSE_COUNT >", value, "loginFalseCount");
            return (Criteria) this;
        }

        public Criteria andLoginFalseCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("LOGIN_FALSE_COUNT >=", value, "loginFalseCount");
            return (Criteria) this;
        }

        public Criteria andLoginFalseCountLessThan(Integer value) {
            addCriterion("LOGIN_FALSE_COUNT <", value, "loginFalseCount");
            return (Criteria) this;
        }

        public Criteria andLoginFalseCountLessThanOrEqualTo(Integer value) {
            addCriterion("LOGIN_FALSE_COUNT <=", value, "loginFalseCount");
            return (Criteria) this;
        }

        public Criteria andLoginFalseCountIn(List<Integer> values) {
            addCriterion("LOGIN_FALSE_COUNT in", values, "loginFalseCount");
            return (Criteria) this;
        }

        public Criteria andLoginFalseCountNotIn(List<Integer> values) {
            addCriterion("LOGIN_FALSE_COUNT not in", values, "loginFalseCount");
            return (Criteria) this;
        }

        public Criteria andLoginFalseCountBetween(Integer value1, Integer value2) {
            addCriterion("LOGIN_FALSE_COUNT between", value1, value2, "loginFalseCount");
            return (Criteria) this;
        }

        public Criteria andLoginFalseCountNotBetween(Integer value1, Integer value2) {
            addCriterion("LOGIN_FALSE_COUNT not between", value1, value2, "loginFalseCount");
            return (Criteria) this;
        }

        public Criteria andTempPasswordIsNull() {
            addCriterion("TEMP_PASSWORD is null");
            return (Criteria) this;
        }

        public Criteria andTempPasswordIsNotNull() {
            addCriterion("TEMP_PASSWORD is not null");
            return (Criteria) this;
        }

        public Criteria andTempPasswordEqualTo(String value) {
            addCriterion("TEMP_PASSWORD =", value, "tempPassword");
            return (Criteria) this;
        }

        public Criteria andTempPasswordNotEqualTo(String value) {
            addCriterion("TEMP_PASSWORD <>", value, "tempPassword");
            return (Criteria) this;
        }

        public Criteria andTempPasswordGreaterThan(String value) {
            addCriterion("TEMP_PASSWORD >", value, "tempPassword");
            return (Criteria) this;
        }

        public Criteria andTempPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("TEMP_PASSWORD >=", value, "tempPassword");
            return (Criteria) this;
        }

        public Criteria andTempPasswordLessThan(String value) {
            addCriterion("TEMP_PASSWORD <", value, "tempPassword");
            return (Criteria) this;
        }

        public Criteria andTempPasswordLessThanOrEqualTo(String value) {
            addCriterion("TEMP_PASSWORD <=", value, "tempPassword");
            return (Criteria) this;
        }

        public Criteria andTempPasswordLike(String value) {
            addCriterion("TEMP_PASSWORD like", value, "tempPassword");
            return (Criteria) this;
        }

        public Criteria andTempPasswordNotLike(String value) {
            addCriterion("TEMP_PASSWORD not like", value, "tempPassword");
            return (Criteria) this;
        }

        public Criteria andTempPasswordIn(List<String> values) {
            addCriterion("TEMP_PASSWORD in", values, "tempPassword");
            return (Criteria) this;
        }

        public Criteria andTempPasswordNotIn(List<String> values) {
            addCriterion("TEMP_PASSWORD not in", values, "tempPassword");
            return (Criteria) this;
        }

        public Criteria andTempPasswordBetween(String value1, String value2) {
            addCriterion("TEMP_PASSWORD between", value1, value2, "tempPassword");
            return (Criteria) this;
        }

        public Criteria andTempPasswordNotBetween(String value1, String value2) {
            addCriterion("TEMP_PASSWORD not between", value1, value2, "tempPassword");
            return (Criteria) this;
        }

        public Criteria andTempValidTimeIsNull() {
            addCriterion("TEMP_VALID_TIME is null");
            return (Criteria) this;
        }

        public Criteria andTempValidTimeIsNotNull() {
            addCriterion("TEMP_VALID_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andTempValidTimeEqualTo(Date value) {
            addCriterion("TEMP_VALID_TIME =", value, "tempValidTime");
            return (Criteria) this;
        }

        public Criteria andTempValidTimeNotEqualTo(Date value) {
            addCriterion("TEMP_VALID_TIME <>", value, "tempValidTime");
            return (Criteria) this;
        }

        public Criteria andTempValidTimeGreaterThan(Date value) {
            addCriterion("TEMP_VALID_TIME >", value, "tempValidTime");
            return (Criteria) this;
        }

        public Criteria andTempValidTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("TEMP_VALID_TIME >=", value, "tempValidTime");
            return (Criteria) this;
        }

        public Criteria andTempValidTimeLessThan(Date value) {
            addCriterion("TEMP_VALID_TIME <", value, "tempValidTime");
            return (Criteria) this;
        }

        public Criteria andTempValidTimeLessThanOrEqualTo(Date value) {
            addCriterion("TEMP_VALID_TIME <=", value, "tempValidTime");
            return (Criteria) this;
        }

        public Criteria andTempValidTimeIn(List<Date> values) {
            addCriterion("TEMP_VALID_TIME in", values, "tempValidTime");
            return (Criteria) this;
        }

        public Criteria andTempValidTimeNotIn(List<Date> values) {
            addCriterion("TEMP_VALID_TIME not in", values, "tempValidTime");
            return (Criteria) this;
        }

        public Criteria andTempValidTimeBetween(Date value1, Date value2) {
            addCriterion("TEMP_VALID_TIME between", value1, value2, "tempValidTime");
            return (Criteria) this;
        }

        public Criteria andTempValidTimeNotBetween(Date value1, Date value2) {
            addCriterion("TEMP_VALID_TIME not between", value1, value2, "tempValidTime");
            return (Criteria) this;
        }

        public Criteria andPayPasswordIsNull() {
            addCriterion("PAY_PASSWORD is null");
            return (Criteria) this;
        }

        public Criteria andPayPasswordIsNotNull() {
            addCriterion("PAY_PASSWORD is not null");
            return (Criteria) this;
        }

        public Criteria andPayPasswordEqualTo(String value) {
            addCriterion("PAY_PASSWORD =", value, "payPassword");
            return (Criteria) this;
        }

        public Criteria andPayPasswordNotEqualTo(String value) {
            addCriterion("PAY_PASSWORD <>", value, "payPassword");
            return (Criteria) this;
        }

        public Criteria andPayPasswordGreaterThan(String value) {
            addCriterion("PAY_PASSWORD >", value, "payPassword");
            return (Criteria) this;
        }

        public Criteria andPayPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("PAY_PASSWORD >=", value, "payPassword");
            return (Criteria) this;
        }

        public Criteria andPayPasswordLessThan(String value) {
            addCriterion("PAY_PASSWORD <", value, "payPassword");
            return (Criteria) this;
        }

        public Criteria andPayPasswordLessThanOrEqualTo(String value) {
            addCriterion("PAY_PASSWORD <=", value, "payPassword");
            return (Criteria) this;
        }

        public Criteria andPayPasswordLike(String value) {
            addCriterion("PAY_PASSWORD like", value, "payPassword");
            return (Criteria) this;
        }

        public Criteria andPayPasswordNotLike(String value) {
            addCriterion("PAY_PASSWORD not like", value, "payPassword");
            return (Criteria) this;
        }

        public Criteria andPayPasswordIn(List<String> values) {
            addCriterion("PAY_PASSWORD in", values, "payPassword");
            return (Criteria) this;
        }

        public Criteria andPayPasswordNotIn(List<String> values) {
            addCriterion("PAY_PASSWORD not in", values, "payPassword");
            return (Criteria) this;
        }

        public Criteria andPayPasswordBetween(String value1, String value2) {
            addCriterion("PAY_PASSWORD between", value1, value2, "payPassword");
            return (Criteria) this;
        }

        public Criteria andPayPasswordNotBetween(String value1, String value2) {
            addCriterion("PAY_PASSWORD not between", value1, value2, "payPassword");
            return (Criteria) this;
        }

        public Criteria andTempPayPasswordIsNull() {
            addCriterion("TEMP_PAY_PASSWORD is null");
            return (Criteria) this;
        }

        public Criteria andTempPayPasswordIsNotNull() {
            addCriterion("TEMP_PAY_PASSWORD is not null");
            return (Criteria) this;
        }

        public Criteria andTempPayPasswordEqualTo(String value) {
            addCriterion("TEMP_PAY_PASSWORD =", value, "tempPayPassword");
            return (Criteria) this;
        }

        public Criteria andTempPayPasswordNotEqualTo(String value) {
            addCriterion("TEMP_PAY_PASSWORD <>", value, "tempPayPassword");
            return (Criteria) this;
        }

        public Criteria andTempPayPasswordGreaterThan(String value) {
            addCriterion("TEMP_PAY_PASSWORD >", value, "tempPayPassword");
            return (Criteria) this;
        }

        public Criteria andTempPayPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("TEMP_PAY_PASSWORD >=", value, "tempPayPassword");
            return (Criteria) this;
        }

        public Criteria andTempPayPasswordLessThan(String value) {
            addCriterion("TEMP_PAY_PASSWORD <", value, "tempPayPassword");
            return (Criteria) this;
        }

        public Criteria andTempPayPasswordLessThanOrEqualTo(String value) {
            addCriterion("TEMP_PAY_PASSWORD <=", value, "tempPayPassword");
            return (Criteria) this;
        }

        public Criteria andTempPayPasswordLike(String value) {
            addCriterion("TEMP_PAY_PASSWORD like", value, "tempPayPassword");
            return (Criteria) this;
        }

        public Criteria andTempPayPasswordNotLike(String value) {
            addCriterion("TEMP_PAY_PASSWORD not like", value, "tempPayPassword");
            return (Criteria) this;
        }

        public Criteria andTempPayPasswordIn(List<String> values) {
            addCriterion("TEMP_PAY_PASSWORD in", values, "tempPayPassword");
            return (Criteria) this;
        }

        public Criteria andTempPayPasswordNotIn(List<String> values) {
            addCriterion("TEMP_PAY_PASSWORD not in", values, "tempPayPassword");
            return (Criteria) this;
        }

        public Criteria andTempPayPasswordBetween(String value1, String value2) {
            addCriterion("TEMP_PAY_PASSWORD between", value1, value2, "tempPayPassword");
            return (Criteria) this;
        }

        public Criteria andTempPayPasswordNotBetween(String value1, String value2) {
            addCriterion("TEMP_PAY_PASSWORD not between", value1, value2, "tempPayPassword");
            return (Criteria) this;
        }

        public Criteria andTempValidPayTimeIsNull() {
            addCriterion("TEMP_VALID_PAY_TIME is null");
            return (Criteria) this;
        }

        public Criteria andTempValidPayTimeIsNotNull() {
            addCriterion("TEMP_VALID_PAY_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andTempValidPayTimeEqualTo(Date value) {
            addCriterion("TEMP_VALID_PAY_TIME =", value, "tempValidPayTime");
            return (Criteria) this;
        }

        public Criteria andTempValidPayTimeNotEqualTo(Date value) {
            addCriterion("TEMP_VALID_PAY_TIME <>", value, "tempValidPayTime");
            return (Criteria) this;
        }

        public Criteria andTempValidPayTimeGreaterThan(Date value) {
            addCriterion("TEMP_VALID_PAY_TIME >", value, "tempValidPayTime");
            return (Criteria) this;
        }

        public Criteria andTempValidPayTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("TEMP_VALID_PAY_TIME >=", value, "tempValidPayTime");
            return (Criteria) this;
        }

        public Criteria andTempValidPayTimeLessThan(Date value) {
            addCriterion("TEMP_VALID_PAY_TIME <", value, "tempValidPayTime");
            return (Criteria) this;
        }

        public Criteria andTempValidPayTimeLessThanOrEqualTo(Date value) {
            addCriterion("TEMP_VALID_PAY_TIME <=", value, "tempValidPayTime");
            return (Criteria) this;
        }

        public Criteria andTempValidPayTimeIn(List<Date> values) {
            addCriterion("TEMP_VALID_PAY_TIME in", values, "tempValidPayTime");
            return (Criteria) this;
        }

        public Criteria andTempValidPayTimeNotIn(List<Date> values) {
            addCriterion("TEMP_VALID_PAY_TIME not in", values, "tempValidPayTime");
            return (Criteria) this;
        }

        public Criteria andTempValidPayTimeBetween(Date value1, Date value2) {
            addCriterion("TEMP_VALID_PAY_TIME between", value1, value2, "tempValidPayTime");
            return (Criteria) this;
        }

        public Criteria andTempValidPayTimeNotBetween(Date value1, Date value2) {
            addCriterion("TEMP_VALID_PAY_TIME not between", value1, value2, "tempValidPayTime");
            return (Criteria) this;
        }

        public Criteria andInvCodeIsNull() {
            addCriterion("INV_CODE is null");
            return (Criteria) this;
        }

        public Criteria andInvCodeIsNotNull() {
            addCriterion("INV_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andInvCodeEqualTo(String value) {
            addCriterion("INV_CODE =", value, "invCode");
            return (Criteria) this;
        }

        public Criteria andInvCodeNotEqualTo(String value) {
            addCriterion("INV_CODE <>", value, "invCode");
            return (Criteria) this;
        }

        public Criteria andInvCodeGreaterThan(String value) {
            addCriterion("INV_CODE >", value, "invCode");
            return (Criteria) this;
        }

        public Criteria andInvCodeGreaterThanOrEqualTo(String value) {
            addCriterion("INV_CODE >=", value, "invCode");
            return (Criteria) this;
        }

        public Criteria andInvCodeLessThan(String value) {
            addCriterion("INV_CODE <", value, "invCode");
            return (Criteria) this;
        }

        public Criteria andInvCodeLessThanOrEqualTo(String value) {
            addCriterion("INV_CODE <=", value, "invCode");
            return (Criteria) this;
        }

        public Criteria andInvCodeLike(String value) {
            addCriterion("INV_CODE like", value, "invCode");
            return (Criteria) this;
        }

        public Criteria andInvCodeNotLike(String value) {
            addCriterion("INV_CODE not like", value, "invCode");
            return (Criteria) this;
        }

        public Criteria andInvCodeIn(List<String> values) {
            addCriterion("INV_CODE in", values, "invCode");
            return (Criteria) this;
        }

        public Criteria andInvCodeNotIn(List<String> values) {
            addCriterion("INV_CODE not in", values, "invCode");
            return (Criteria) this;
        }

        public Criteria andInvCodeBetween(String value1, String value2) {
            addCriterion("INV_CODE between", value1, value2, "invCode");
            return (Criteria) this;
        }

        public Criteria andInvCodeNotBetween(String value1, String value2) {
            addCriterion("INV_CODE not between", value1, value2, "invCode");
            return (Criteria) this;
        }

        public Criteria andInvCreateTimeIsNull() {
            addCriterion("INV_CREATE_TIME is null");
            return (Criteria) this;
        }

        public Criteria andInvCreateTimeIsNotNull() {
            addCriterion("INV_CREATE_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andInvCreateTimeEqualTo(Date value) {
            addCriterion("INV_CREATE_TIME =", value, "invCreateTime");
            return (Criteria) this;
        }

        public Criteria andInvCreateTimeNotEqualTo(Date value) {
            addCriterion("INV_CREATE_TIME <>", value, "invCreateTime");
            return (Criteria) this;
        }

        public Criteria andInvCreateTimeGreaterThan(Date value) {
            addCriterion("INV_CREATE_TIME >", value, "invCreateTime");
            return (Criteria) this;
        }

        public Criteria andInvCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("INV_CREATE_TIME >=", value, "invCreateTime");
            return (Criteria) this;
        }

        public Criteria andInvCreateTimeLessThan(Date value) {
            addCriterion("INV_CREATE_TIME <", value, "invCreateTime");
            return (Criteria) this;
        }

        public Criteria andInvCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("INV_CREATE_TIME <=", value, "invCreateTime");
            return (Criteria) this;
        }

        public Criteria andInvCreateTimeIn(List<Date> values) {
            addCriterion("INV_CREATE_TIME in", values, "invCreateTime");
            return (Criteria) this;
        }

        public Criteria andInvCreateTimeNotIn(List<Date> values) {
            addCriterion("INV_CREATE_TIME not in", values, "invCreateTime");
            return (Criteria) this;
        }

        public Criteria andInvCreateTimeBetween(Date value1, Date value2) {
            addCriterion("INV_CREATE_TIME between", value1, value2, "invCreateTime");
            return (Criteria) this;
        }

        public Criteria andInvCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("INV_CREATE_TIME not between", value1, value2, "invCreateTime");
            return (Criteria) this;
        }

        public Criteria andIsInvUsedIsNull() {
            addCriterion("IS_INV_USED is null");
            return (Criteria) this;
        }

        public Criteria andIsInvUsedIsNotNull() {
            addCriterion("IS_INV_USED is not null");
            return (Criteria) this;
        }

        public Criteria andIsInvUsedEqualTo(Short value) {
            addCriterion("IS_INV_USED =", value, "isInvUsed");
            return (Criteria) this;
        }

        public Criteria andIsInvUsedNotEqualTo(Short value) {
            addCriterion("IS_INV_USED <>", value, "isInvUsed");
            return (Criteria) this;
        }

        public Criteria andIsInvUsedGreaterThan(Short value) {
            addCriterion("IS_INV_USED >", value, "isInvUsed");
            return (Criteria) this;
        }

        public Criteria andIsInvUsedGreaterThanOrEqualTo(Short value) {
            addCriterion("IS_INV_USED >=", value, "isInvUsed");
            return (Criteria) this;
        }

        public Criteria andIsInvUsedLessThan(Short value) {
            addCriterion("IS_INV_USED <", value, "isInvUsed");
            return (Criteria) this;
        }

        public Criteria andIsInvUsedLessThanOrEqualTo(Short value) {
            addCriterion("IS_INV_USED <=", value, "isInvUsed");
            return (Criteria) this;
        }

        public Criteria andIsInvUsedIn(List<Short> values) {
            addCriterion("IS_INV_USED in", values, "isInvUsed");
            return (Criteria) this;
        }

        public Criteria andIsInvUsedNotIn(List<Short> values) {
            addCriterion("IS_INV_USED not in", values, "isInvUsed");
            return (Criteria) this;
        }

        public Criteria andIsInvUsedBetween(Short value1, Short value2) {
            addCriterion("IS_INV_USED between", value1, value2, "isInvUsed");
            return (Criteria) this;
        }

        public Criteria andIsInvUsedNotBetween(Short value1, Short value2) {
            addCriterion("IS_INV_USED not between", value1, value2, "isInvUsed");
            return (Criteria) this;
        }

        public Criteria andIdentifyCodeIsNull() {
            addCriterion("IDENTIFY_CODE is null");
            return (Criteria) this;
        }

        public Criteria andIdentifyCodeIsNotNull() {
            addCriterion("IDENTIFY_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andIdentifyCodeEqualTo(String value) {
            addCriterion("IDENTIFY_CODE =", value, "identifyCode");
            return (Criteria) this;
        }

        public Criteria andIdentifyCodeNotEqualTo(String value) {
            addCriterion("IDENTIFY_CODE <>", value, "identifyCode");
            return (Criteria) this;
        }

        public Criteria andIdentifyCodeGreaterThan(String value) {
            addCriterion("IDENTIFY_CODE >", value, "identifyCode");
            return (Criteria) this;
        }

        public Criteria andIdentifyCodeGreaterThanOrEqualTo(String value) {
            addCriterion("IDENTIFY_CODE >=", value, "identifyCode");
            return (Criteria) this;
        }

        public Criteria andIdentifyCodeLessThan(String value) {
            addCriterion("IDENTIFY_CODE <", value, "identifyCode");
            return (Criteria) this;
        }

        public Criteria andIdentifyCodeLessThanOrEqualTo(String value) {
            addCriterion("IDENTIFY_CODE <=", value, "identifyCode");
            return (Criteria) this;
        }

        public Criteria andIdentifyCodeLike(String value) {
            addCriterion("IDENTIFY_CODE like", value, "identifyCode");
            return (Criteria) this;
        }

        public Criteria andIdentifyCodeNotLike(String value) {
            addCriterion("IDENTIFY_CODE not like", value, "identifyCode");
            return (Criteria) this;
        }

        public Criteria andIdentifyCodeIn(List<String> values) {
            addCriterion("IDENTIFY_CODE in", values, "identifyCode");
            return (Criteria) this;
        }

        public Criteria andIdentifyCodeNotIn(List<String> values) {
            addCriterion("IDENTIFY_CODE not in", values, "identifyCode");
            return (Criteria) this;
        }

        public Criteria andIdentifyCodeBetween(String value1, String value2) {
            addCriterion("IDENTIFY_CODE between", value1, value2, "identifyCode");
            return (Criteria) this;
        }

        public Criteria andIdentifyCodeNotBetween(String value1, String value2) {
            addCriterion("IDENTIFY_CODE not between", value1, value2, "identifyCode");
            return (Criteria) this;
        }

        public Criteria andIdentifyCreateTimeIsNull() {
            addCriterion("IDENTIFY_CREATE_TIME is null");
            return (Criteria) this;
        }

        public Criteria andIdentifyCreateTimeIsNotNull() {
            addCriterion("IDENTIFY_CREATE_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andIdentifyCreateTimeEqualTo(Date value) {
            addCriterion("IDENTIFY_CREATE_TIME =", value, "identifyCreateTime");
            return (Criteria) this;
        }

        public Criteria andIdentifyCreateTimeNotEqualTo(Date value) {
            addCriterion("IDENTIFY_CREATE_TIME <>", value, "identifyCreateTime");
            return (Criteria) this;
        }

        public Criteria andIdentifyCreateTimeGreaterThan(Date value) {
            addCriterion("IDENTIFY_CREATE_TIME >", value, "identifyCreateTime");
            return (Criteria) this;
        }

        public Criteria andIdentifyCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("IDENTIFY_CREATE_TIME >=", value, "identifyCreateTime");
            return (Criteria) this;
        }

        public Criteria andIdentifyCreateTimeLessThan(Date value) {
            addCriterion("IDENTIFY_CREATE_TIME <", value, "identifyCreateTime");
            return (Criteria) this;
        }

        public Criteria andIdentifyCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("IDENTIFY_CREATE_TIME <=", value, "identifyCreateTime");
            return (Criteria) this;
        }

        public Criteria andIdentifyCreateTimeIn(List<Date> values) {
            addCriterion("IDENTIFY_CREATE_TIME in", values, "identifyCreateTime");
            return (Criteria) this;
        }

        public Criteria andIdentifyCreateTimeNotIn(List<Date> values) {
            addCriterion("IDENTIFY_CREATE_TIME not in", values, "identifyCreateTime");
            return (Criteria) this;
        }

        public Criteria andIdentifyCreateTimeBetween(Date value1, Date value2) {
            addCriterion("IDENTIFY_CREATE_TIME between", value1, value2, "identifyCreateTime");
            return (Criteria) this;
        }

        public Criteria andIdentifyCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("IDENTIFY_CREATE_TIME not between", value1, value2, "identifyCreateTime");
            return (Criteria) this;
        }

        public Criteria andIdentifyCountIsNull() {
            addCriterion("IDENTIFY_COUNT is null");
            return (Criteria) this;
        }

        public Criteria andIdentifyCountIsNotNull() {
            addCriterion("IDENTIFY_COUNT is not null");
            return (Criteria) this;
        }

        public Criteria andIdentifyCountEqualTo(Short value) {
            addCriterion("IDENTIFY_COUNT =", value, "identifyCount");
            return (Criteria) this;
        }

        public Criteria andIdentifyCountNotEqualTo(Short value) {
            addCriterion("IDENTIFY_COUNT <>", value, "identifyCount");
            return (Criteria) this;
        }

        public Criteria andIdentifyCountGreaterThan(Short value) {
            addCriterion("IDENTIFY_COUNT >", value, "identifyCount");
            return (Criteria) this;
        }

        public Criteria andIdentifyCountGreaterThanOrEqualTo(Short value) {
            addCriterion("IDENTIFY_COUNT >=", value, "identifyCount");
            return (Criteria) this;
        }

        public Criteria andIdentifyCountLessThan(Short value) {
            addCriterion("IDENTIFY_COUNT <", value, "identifyCount");
            return (Criteria) this;
        }

        public Criteria andIdentifyCountLessThanOrEqualTo(Short value) {
            addCriterion("IDENTIFY_COUNT <=", value, "identifyCount");
            return (Criteria) this;
        }

        public Criteria andIdentifyCountIn(List<Short> values) {
            addCriterion("IDENTIFY_COUNT in", values, "identifyCount");
            return (Criteria) this;
        }

        public Criteria andIdentifyCountNotIn(List<Short> values) {
            addCriterion("IDENTIFY_COUNT not in", values, "identifyCount");
            return (Criteria) this;
        }

        public Criteria andIdentifyCountBetween(Short value1, Short value2) {
            addCriterion("IDENTIFY_COUNT between", value1, value2, "identifyCount");
            return (Criteria) this;
        }

        public Criteria andIdentifyCountNotBetween(Short value1, Short value2) {
            addCriterion("IDENTIFY_COUNT not between", value1, value2, "identifyCount");
            return (Criteria) this;
        }

        public Criteria andSuperiorUserIdIsNull() {
            addCriterion("SUPERIOR_USER_ID is null");
            return (Criteria) this;
        }

        public Criteria andSuperiorUserIdIsNotNull() {
            addCriterion("SUPERIOR_USER_ID is not null");
            return (Criteria) this;
        }

        public Criteria andSuperiorUserIdEqualTo(Long value) {
            addCriterion("SUPERIOR_USER_ID =", value, "superiorUserId");
            return (Criteria) this;
        }

        public Criteria andSuperiorUserIdNotEqualTo(Long value) {
            addCriterion("SUPERIOR_USER_ID <>", value, "superiorUserId");
            return (Criteria) this;
        }

        public Criteria andSuperiorUserIdGreaterThan(Long value) {
            addCriterion("SUPERIOR_USER_ID >", value, "superiorUserId");
            return (Criteria) this;
        }

        public Criteria andSuperiorUserIdGreaterThanOrEqualTo(Long value) {
            addCriterion("SUPERIOR_USER_ID >=", value, "superiorUserId");
            return (Criteria) this;
        }

        public Criteria andSuperiorUserIdLessThan(Long value) {
            addCriterion("SUPERIOR_USER_ID <", value, "superiorUserId");
            return (Criteria) this;
        }

        public Criteria andSuperiorUserIdLessThanOrEqualTo(Long value) {
            addCriterion("SUPERIOR_USER_ID <=", value, "superiorUserId");
            return (Criteria) this;
        }

        public Criteria andSuperiorUserIdIn(List<Long> values) {
            addCriterion("SUPERIOR_USER_ID in", values, "superiorUserId");
            return (Criteria) this;
        }

        public Criteria andSuperiorUserIdNotIn(List<Long> values) {
            addCriterion("SUPERIOR_USER_ID not in", values, "superiorUserId");
            return (Criteria) this;
        }

        public Criteria andSuperiorUserIdBetween(Long value1, Long value2) {
            addCriterion("SUPERIOR_USER_ID between", value1, value2, "superiorUserId");
            return (Criteria) this;
        }

        public Criteria andSuperiorUserIdNotBetween(Long value1, Long value2) {
            addCriterion("SUPERIOR_USER_ID not between", value1, value2, "superiorUserId");
            return (Criteria) this;
        }

        public Criteria andBankIdIsNull() {
            addCriterion("BANK_ID is null");
            return (Criteria) this;
        }

        public Criteria andBankIdIsNotNull() {
            addCriterion("BANK_ID is not null");
            return (Criteria) this;
        }

        public Criteria andBankIdEqualTo(String value) {
            addCriterion("BANK_ID =", value, "bankId");
            return (Criteria) this;
        }

        public Criteria andBankIdNotEqualTo(String value) {
            addCriterion("BANK_ID <>", value, "bankId");
            return (Criteria) this;
        }

        public Criteria andBankIdGreaterThan(String value) {
            addCriterion("BANK_ID >", value, "bankId");
            return (Criteria) this;
        }

        public Criteria andBankIdGreaterThanOrEqualTo(String value) {
            addCriterion("BANK_ID >=", value, "bankId");
            return (Criteria) this;
        }

        public Criteria andBankIdLessThan(String value) {
            addCriterion("BANK_ID <", value, "bankId");
            return (Criteria) this;
        }

        public Criteria andBankIdLessThanOrEqualTo(String value) {
            addCriterion("BANK_ID <=", value, "bankId");
            return (Criteria) this;
        }

        public Criteria andBankIdLike(String value) {
            addCriterion("BANK_ID like", value, "bankId");
            return (Criteria) this;
        }

        public Criteria andBankIdNotLike(String value) {
            addCriterion("BANK_ID not like", value, "bankId");
            return (Criteria) this;
        }

        public Criteria andBankIdIn(List<String> values) {
            addCriterion("BANK_ID in", values, "bankId");
            return (Criteria) this;
        }

        public Criteria andBankIdNotIn(List<String> values) {
            addCriterion("BANK_ID not in", values, "bankId");
            return (Criteria) this;
        }

        public Criteria andBankIdBetween(String value1, String value2) {
            addCriterion("BANK_ID between", value1, value2, "bankId");
            return (Criteria) this;
        }

        public Criteria andBankIdNotBetween(String value1, String value2) {
            addCriterion("BANK_ID not between", value1, value2, "bankId");
            return (Criteria) this;
        }

        public Criteria andLastPrebookTimeIsNull() {
            addCriterion("LAST_PREBOOK_TIME is null");
            return (Criteria) this;
        }

        public Criteria andLastPrebookTimeIsNotNull() {
            addCriterion("LAST_PREBOOK_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andLastPrebookTimeEqualTo(Date value) {
            addCriterion("LAST_PREBOOK_TIME =", value, "lastPrebookTime");
            return (Criteria) this;
        }

        public Criteria andLastPrebookTimeNotEqualTo(Date value) {
            addCriterion("LAST_PREBOOK_TIME <>", value, "lastPrebookTime");
            return (Criteria) this;
        }

        public Criteria andLastPrebookTimeGreaterThan(Date value) {
            addCriterion("LAST_PREBOOK_TIME >", value, "lastPrebookTime");
            return (Criteria) this;
        }

        public Criteria andLastPrebookTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("LAST_PREBOOK_TIME >=", value, "lastPrebookTime");
            return (Criteria) this;
        }

        public Criteria andLastPrebookTimeLessThan(Date value) {
            addCriterion("LAST_PREBOOK_TIME <", value, "lastPrebookTime");
            return (Criteria) this;
        }

        public Criteria andLastPrebookTimeLessThanOrEqualTo(Date value) {
            addCriterion("LAST_PREBOOK_TIME <=", value, "lastPrebookTime");
            return (Criteria) this;
        }

        public Criteria andLastPrebookTimeIn(List<Date> values) {
            addCriterion("LAST_PREBOOK_TIME in", values, "lastPrebookTime");
            return (Criteria) this;
        }

        public Criteria andLastPrebookTimeNotIn(List<Date> values) {
            addCriterion("LAST_PREBOOK_TIME not in", values, "lastPrebookTime");
            return (Criteria) this;
        }

        public Criteria andLastPrebookTimeBetween(Date value1, Date value2) {
            addCriterion("LAST_PREBOOK_TIME between", value1, value2, "lastPrebookTime");
            return (Criteria) this;
        }

        public Criteria andLastPrebookTimeNotBetween(Date value1, Date value2) {
            addCriterion("LAST_PREBOOK_TIME not between", value1, value2, "lastPrebookTime");
            return (Criteria) this;
        }

        public Criteria andAuthorizeIsNull() {
            addCriterion("AUTHORIZE is null");
            return (Criteria) this;
        }

        public Criteria andAuthorizeIsNotNull() {
            addCriterion("AUTHORIZE is not null");
            return (Criteria) this;
        }

        public Criteria andAuthorizeEqualTo(String value) {
            addCriterion("AUTHORIZE =", value, "authorize");
            return (Criteria) this;
        }

        public Criteria andAuthorizeNotEqualTo(String value) {
            addCriterion("AUTHORIZE <>", value, "authorize");
            return (Criteria) this;
        }

        public Criteria andAuthorizeGreaterThan(String value) {
            addCriterion("AUTHORIZE >", value, "authorize");
            return (Criteria) this;
        }

        public Criteria andAuthorizeGreaterThanOrEqualTo(String value) {
            addCriterion("AUTHORIZE >=", value, "authorize");
            return (Criteria) this;
        }

        public Criteria andAuthorizeLessThan(String value) {
            addCriterion("AUTHORIZE <", value, "authorize");
            return (Criteria) this;
        }

        public Criteria andAuthorizeLessThanOrEqualTo(String value) {
            addCriterion("AUTHORIZE <=", value, "authorize");
            return (Criteria) this;
        }

        public Criteria andAuthorizeLike(String value) {
            addCriterion("AUTHORIZE like", value, "authorize");
            return (Criteria) this;
        }

        public Criteria andAuthorizeNotLike(String value) {
            addCriterion("AUTHORIZE not like", value, "authorize");
            return (Criteria) this;
        }

        public Criteria andAuthorizeIn(List<String> values) {
            addCriterion("AUTHORIZE in", values, "authorize");
            return (Criteria) this;
        }

        public Criteria andAuthorizeNotIn(List<String> values) {
            addCriterion("AUTHORIZE not in", values, "authorize");
            return (Criteria) this;
        }

        public Criteria andAuthorizeBetween(String value1, String value2) {
            addCriterion("AUTHORIZE between", value1, value2, "authorize");
            return (Criteria) this;
        }

        public Criteria andAuthorizeNotBetween(String value1, String value2) {
            addCriterion("AUTHORIZE not between", value1, value2, "authorize");
            return (Criteria) this;
        }

        public Criteria andRolesIsNull() {
            addCriterion("ROLES is null");
            return (Criteria) this;
        }

        public Criteria andRolesIsNotNull() {
            addCriterion("ROLES is not null");
            return (Criteria) this;
        }

        public Criteria andRolesEqualTo(String value) {
            addCriterion("ROLES =", value, "roles");
            return (Criteria) this;
        }

        public Criteria andRolesNotEqualTo(String value) {
            addCriterion("ROLES <>", value, "roles");
            return (Criteria) this;
        }

        public Criteria andRolesGreaterThan(String value) {
            addCriterion("ROLES >", value, "roles");
            return (Criteria) this;
        }

        public Criteria andRolesGreaterThanOrEqualTo(String value) {
            addCriterion("ROLES >=", value, "roles");
            return (Criteria) this;
        }

        public Criteria andRolesLessThan(String value) {
            addCriterion("ROLES <", value, "roles");
            return (Criteria) this;
        }

        public Criteria andRolesLessThanOrEqualTo(String value) {
            addCriterion("ROLES <=", value, "roles");
            return (Criteria) this;
        }

        public Criteria andRolesLike(String value) {
            addCriterion("ROLES like", value, "roles");
            return (Criteria) this;
        }

        public Criteria andRolesNotLike(String value) {
            addCriterion("ROLES not like", value, "roles");
            return (Criteria) this;
        }

        public Criteria andRolesIn(List<String> values) {
            addCriterion("ROLES in", values, "roles");
            return (Criteria) this;
        }

        public Criteria andRolesNotIn(List<String> values) {
            addCriterion("ROLES not in", values, "roles");
            return (Criteria) this;
        }

        public Criteria andRolesBetween(String value1, String value2) {
            addCriterion("ROLES between", value1, value2, "roles");
            return (Criteria) this;
        }

        public Criteria andRolesNotBetween(String value1, String value2) {
            addCriterion("ROLES not between", value1, value2, "roles");
            return (Criteria) this;
        }

        public Criteria andLevelIdIsNull() {
            addCriterion("LEVEL_ID is null");
            return (Criteria) this;
        }

        public Criteria andLevelIdIsNotNull() {
            addCriterion("LEVEL_ID is not null");
            return (Criteria) this;
        }

        public Criteria andLevelIdEqualTo(Long value) {
            addCriterion("LEVEL_ID =", value, "levelId");
            return (Criteria) this;
        }

        public Criteria andLevelIdNotEqualTo(Long value) {
            addCriterion("LEVEL_ID <>", value, "levelId");
            return (Criteria) this;
        }

        public Criteria andLevelIdGreaterThan(Long value) {
            addCriterion("LEVEL_ID >", value, "levelId");
            return (Criteria) this;
        }

        public Criteria andLevelIdGreaterThanOrEqualTo(Long value) {
            addCriterion("LEVEL_ID >=", value, "levelId");
            return (Criteria) this;
        }

        public Criteria andLevelIdLessThan(Long value) {
            addCriterion("LEVEL_ID <", value, "levelId");
            return (Criteria) this;
        }

        public Criteria andLevelIdLessThanOrEqualTo(Long value) {
            addCriterion("LEVEL_ID <=", value, "levelId");
            return (Criteria) this;
        }

        public Criteria andLevelIdIn(List<Long> values) {
            addCriterion("LEVEL_ID in", values, "levelId");
            return (Criteria) this;
        }

        public Criteria andLevelIdNotIn(List<Long> values) {
            addCriterion("LEVEL_ID not in", values, "levelId");
            return (Criteria) this;
        }

        public Criteria andLevelIdBetween(Long value1, Long value2) {
            addCriterion("LEVEL_ID between", value1, value2, "levelId");
            return (Criteria) this;
        }

        public Criteria andLevelIdNotBetween(Long value1, Long value2) {
            addCriterion("LEVEL_ID not between", value1, value2, "levelId");
            return (Criteria) this;
        }

        public Criteria andThirdEmpNumberIsNull() {
            addCriterion("THIRD_EMP_NUMBER is null");
            return (Criteria) this;
        }

        public Criteria andThirdEmpNumberIsNotNull() {
            addCriterion("THIRD_EMP_NUMBER is not null");
            return (Criteria) this;
        }

        public Criteria andThirdEmpNumberEqualTo(String value) {
            addCriterion("THIRD_EMP_NUMBER =", value, "thirdEmpNumber");
            return (Criteria) this;
        }

        public Criteria andThirdEmpNumberNotEqualTo(String value) {
            addCriterion("THIRD_EMP_NUMBER <>", value, "thirdEmpNumber");
            return (Criteria) this;
        }

        public Criteria andThirdEmpNumberGreaterThan(String value) {
            addCriterion("THIRD_EMP_NUMBER >", value, "thirdEmpNumber");
            return (Criteria) this;
        }

        public Criteria andThirdEmpNumberGreaterThanOrEqualTo(String value) {
            addCriterion("THIRD_EMP_NUMBER >=", value, "thirdEmpNumber");
            return (Criteria) this;
        }

        public Criteria andThirdEmpNumberLessThan(String value) {
            addCriterion("THIRD_EMP_NUMBER <", value, "thirdEmpNumber");
            return (Criteria) this;
        }

        public Criteria andThirdEmpNumberLessThanOrEqualTo(String value) {
            addCriterion("THIRD_EMP_NUMBER <=", value, "thirdEmpNumber");
            return (Criteria) this;
        }

        public Criteria andThirdEmpNumberLike(String value) {
            addCriterion("THIRD_EMP_NUMBER like", value, "thirdEmpNumber");
            return (Criteria) this;
        }

        public Criteria andThirdEmpNumberNotLike(String value) {
            addCriterion("THIRD_EMP_NUMBER not like", value, "thirdEmpNumber");
            return (Criteria) this;
        }

        public Criteria andThirdEmpNumberIn(List<String> values) {
            addCriterion("THIRD_EMP_NUMBER in", values, "thirdEmpNumber");
            return (Criteria) this;
        }

        public Criteria andThirdEmpNumberNotIn(List<String> values) {
            addCriterion("THIRD_EMP_NUMBER not in", values, "thirdEmpNumber");
            return (Criteria) this;
        }

        public Criteria andThirdEmpNumberBetween(String value1, String value2) {
            addCriterion("THIRD_EMP_NUMBER between", value1, value2, "thirdEmpNumber");
            return (Criteria) this;
        }

        public Criteria andThirdEmpNumberNotBetween(String value1, String value2) {
            addCriterion("THIRD_EMP_NUMBER not between", value1, value2, "thirdEmpNumber");
            return (Criteria) this;
        }

        public Criteria andUsernameLikeInsensitive(String value) {
            addCriterion("upper(USERNAME) like", value.toUpperCase(), "username");
            return (Criteria) this;
        }

        public Criteria andPasswordLikeInsensitive(String value) {
            addCriterion("upper(PASSWORD) like", value.toUpperCase(), "password");
            return (Criteria) this;
        }

        public Criteria andEmployeeNoLikeInsensitive(String value) {
            addCriterion("upper(EMPLOYEE_NO) like", value.toUpperCase(), "employeeNo");
            return (Criteria) this;
        }

        public Criteria andSexLikeInsensitive(String value) {
            addCriterion("upper(SEX) like", value.toUpperCase(), "sex");
            return (Criteria) this;
        }

        public Criteria andNameCnLikeInsensitive(String value) {
            addCriterion("upper(NAME_CN) like", value.toUpperCase(), "nameCn");
            return (Criteria) this;
        }

        public Criteria andPinyinFirstLikeInsensitive(String value) {
            addCriterion("upper(PINYIN_FIRST) like", value.toUpperCase(), "pinyinFirst");
            return (Criteria) this;
        }

        public Criteria andPinyinFullLikeInsensitive(String value) {
            addCriterion("upper(PINYIN_FULL) like", value.toUpperCase(), "pinyinFull");
            return (Criteria) this;
        }

        public Criteria andNameEnLastLikeInsensitive(String value) {
            addCriterion("upper(NAME_EN_LAST) like", value.toUpperCase(), "nameEnLast");
            return (Criteria) this;
        }

        public Criteria andNameEnMiddleLikeInsensitive(String value) {
            addCriterion("upper(NAME_EN_MIDDLE) like", value.toUpperCase(), "nameEnMiddle");
            return (Criteria) this;
        }

        public Criteria andNameEnFirstLikeInsensitive(String value) {
            addCriterion("upper(NAME_EN_FIRST) like", value.toUpperCase(), "nameEnFirst");
            return (Criteria) this;
        }

        public Criteria andPhoneLikeInsensitive(String value) {
            addCriterion("upper(PHONE) like", value.toUpperCase(), "phone");
            return (Criteria) this;
        }

        public Criteria andFaxLikeInsensitive(String value) {
            addCriterion("upper(FAX) like", value.toUpperCase(), "fax");
            return (Criteria) this;
        }

        public Criteria andMobilephoneLikeInsensitive(String value) {
            addCriterion("upper(MOBILEPHONE) like", value.toUpperCase(), "mobilephone");
            return (Criteria) this;
        }

        public Criteria andPositionLikeInsensitive(String value) {
            addCriterion("upper(POSITION) like", value.toUpperCase(), "position");
            return (Criteria) this;
        }

        public Criteria andJobLikeInsensitive(String value) {
            addCriterion("upper(JOB) like", value.toUpperCase(), "job");
            return (Criteria) this;
        }

        public Criteria andEmailLikeInsensitive(String value) {
            addCriterion("upper(EMAIL) like", value.toUpperCase(), "email");
            return (Criteria) this;
        }

        public Criteria andIdcNameLikeInsensitive(String value) {
            addCriterion("upper(IDC_NAME) like", value.toUpperCase(), "idcName");
            return (Criteria) this;
        }

        public Criteria andIdcTypeLikeInsensitive(String value) {
            addCriterion("upper(IDC_TYPE) like", value.toUpperCase(), "idcType");
            return (Criteria) this;
        }

        public Criteria andIdcNoLikeInsensitive(String value) {
            addCriterion("upper(IDC_NO) like", value.toUpperCase(), "idcNo");
            return (Criteria) this;
        }

        public Criteria andIdcValidityDateLikeInsensitive(String value) {
            addCriterion("upper(IDC_VALIDITY_DATE) like", value.toUpperCase(), "idcValidityDate");
            return (Criteria) this;
        }

        public Criteria andIdcName2LikeInsensitive(String value) {
            addCriterion("upper(IDC_NAME2) like", value.toUpperCase(), "idcName2");
            return (Criteria) this;
        }

        public Criteria andIdcType2LikeInsensitive(String value) {
            addCriterion("upper(IDC_TYPE2) like", value.toUpperCase(), "idcType2");
            return (Criteria) this;
        }

        public Criteria andIdcNo2LikeInsensitive(String value) {
            addCriterion("upper(IDC_NO2) like", value.toUpperCase(), "idcNo2");
            return (Criteria) this;
        }

        public Criteria andIdcValidityDate2LikeInsensitive(String value) {
            addCriterion("upper(IDC_VALIDITY_DATE2) like", value.toUpperCase(), "idcValidityDate2");
            return (Criteria) this;
        }

        public Criteria andIdcName3LikeInsensitive(String value) {
            addCriterion("upper(IDC_NAME3) like", value.toUpperCase(), "idcName3");
            return (Criteria) this;
        }

        public Criteria andIdcType3LikeInsensitive(String value) {
            addCriterion("upper(IDC_TYPE3) like", value.toUpperCase(), "idcType3");
            return (Criteria) this;
        }

        public Criteria andIdcNo3LikeInsensitive(String value) {
            addCriterion("upper(IDC_NO3) like", value.toUpperCase(), "idcNo3");
            return (Criteria) this;
        }

        public Criteria andIdcValidityDate3LikeInsensitive(String value) {
            addCriterion("upper(IDC_VALIDITY_DATE3) like", value.toUpperCase(), "idcValidityDate3");
            return (Criteria) this;
        }

        public Criteria andStateLikeInsensitive(String value) {
            addCriterion("upper(STATE) like", value.toUpperCase(), "state");
            return (Criteria) this;
        }

        public Criteria andUserTypeLikeInsensitive(String value) {
            addCriterion("upper(USER_TYPE) like", value.toUpperCase(), "userType");
            return (Criteria) this;
        }

        public Criteria andRemarkLikeInsensitive(String value) {
            addCriterion("upper(REMARK) like", value.toUpperCase(), "remark");
            return (Criteria) this;
        }

        public Criteria andTempPasswordLikeInsensitive(String value) {
            addCriterion("upper(TEMP_PASSWORD) like", value.toUpperCase(), "tempPassword");
            return (Criteria) this;
        }

        public Criteria andPayPasswordLikeInsensitive(String value) {
            addCriterion("upper(PAY_PASSWORD) like", value.toUpperCase(), "payPassword");
            return (Criteria) this;
        }

        public Criteria andTempPayPasswordLikeInsensitive(String value) {
            addCriterion("upper(TEMP_PAY_PASSWORD) like", value.toUpperCase(), "tempPayPassword");
            return (Criteria) this;
        }

        public Criteria andInvCodeLikeInsensitive(String value) {
            addCriterion("upper(INV_CODE) like", value.toUpperCase(), "invCode");
            return (Criteria) this;
        }

        public Criteria andIdentifyCodeLikeInsensitive(String value) {
            addCriterion("upper(IDENTIFY_CODE) like", value.toUpperCase(), "identifyCode");
            return (Criteria) this;
        }

        public Criteria andBankIdLikeInsensitive(String value) {
            addCriterion("upper(BANK_ID) like", value.toUpperCase(), "bankId");
            return (Criteria) this;
        }

        public Criteria andAuthorizeLikeInsensitive(String value) {
            addCriterion("upper(AUTHORIZE) like", value.toUpperCase(), "authorize");
            return (Criteria) this;
        }

        public Criteria andRolesLikeInsensitive(String value) {
            addCriterion("upper(ROLES) like", value.toUpperCase(), "roles");
            return (Criteria) this;
        }

        public Criteria andThirdEmpNumberLikeInsensitive(String value) {
            addCriterion("upper(THIRD_EMP_NUMBER) like", value.toUpperCase(), "thirdEmpNumber");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}