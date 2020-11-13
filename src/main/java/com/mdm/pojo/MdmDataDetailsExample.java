package com.mdm.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MdmDataDetailsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MdmDataDetailsExample() {
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andDataMainIdIsNull() {
            addCriterion("data_main_id is null");
            return (Criteria) this;
        }

        public Criteria andDataMainIdIsNotNull() {
            addCriterion("data_main_id is not null");
            return (Criteria) this;
        }

        public Criteria andDataMainIdEqualTo(Integer value) {
            addCriterion("data_main_id =", value, "dataMainId");
            return (Criteria) this;
        }

        public Criteria andDataMainIdNotEqualTo(Integer value) {
            addCriterion("data_main_id <>", value, "dataMainId");
            return (Criteria) this;
        }

        public Criteria andDataMainIdGreaterThan(Integer value) {
            addCriterion("data_main_id >", value, "dataMainId");
            return (Criteria) this;
        }

        public Criteria andDataMainIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("data_main_id >=", value, "dataMainId");
            return (Criteria) this;
        }

        public Criteria andDataMainIdLessThan(Integer value) {
            addCriterion("data_main_id <", value, "dataMainId");
            return (Criteria) this;
        }

        public Criteria andDataMainIdLessThanOrEqualTo(Integer value) {
            addCriterion("data_main_id <=", value, "dataMainId");
            return (Criteria) this;
        }

        public Criteria andDataMainIdIn(List<Integer> values) {
            addCriterion("data_main_id in", values, "dataMainId");
            return (Criteria) this;
        }

        public Criteria andDataMainIdNotIn(List<Integer> values) {
            addCriterion("data_main_id not in", values, "dataMainId");
            return (Criteria) this;
        }

        public Criteria andDataMainIdBetween(Integer value1, Integer value2) {
            addCriterion("data_main_id between", value1, value2, "dataMainId");
            return (Criteria) this;
        }

        public Criteria andDataMainIdNotBetween(Integer value1, Integer value2) {
            addCriterion("data_main_id not between", value1, value2, "dataMainId");
            return (Criteria) this;
        }

        public Criteria andDataDetailsCodeIsNull() {
            addCriterion("data_details_code is null");
            return (Criteria) this;
        }

        public Criteria andDataDetailsCodeIsNotNull() {
            addCriterion("data_details_code is not null");
            return (Criteria) this;
        }

        public Criteria andDataDetailsCodeEqualTo(String value) {
            addCriterion("data_details_code =", value, "dataDetailsCode");
            return (Criteria) this;
        }

        public Criteria andDataDetailsCodeNotEqualTo(String value) {
            addCriterion("data_details_code <>", value, "dataDetailsCode");
            return (Criteria) this;
        }

        public Criteria andDataDetailsCodeGreaterThan(String value) {
            addCriterion("data_details_code >", value, "dataDetailsCode");
            return (Criteria) this;
        }

        public Criteria andDataDetailsCodeGreaterThanOrEqualTo(String value) {
            addCriterion("data_details_code >=", value, "dataDetailsCode");
            return (Criteria) this;
        }

        public Criteria andDataDetailsCodeLessThan(String value) {
            addCriterion("data_details_code <", value, "dataDetailsCode");
            return (Criteria) this;
        }

        public Criteria andDataDetailsCodeLessThanOrEqualTo(String value) {
            addCriterion("data_details_code <=", value, "dataDetailsCode");
            return (Criteria) this;
        }

        public Criteria andDataDetailsCodeLike(String value) {
            addCriterion("data_details_code like", value, "dataDetailsCode");
            return (Criteria) this;
        }

        public Criteria andDataDetailsCodeNotLike(String value) {
            addCriterion("data_details_code not like", value, "dataDetailsCode");
            return (Criteria) this;
        }

        public Criteria andDataDetailsCodeIn(List<String> values) {
            addCriterion("data_details_code in", values, "dataDetailsCode");
            return (Criteria) this;
        }

        public Criteria andDataDetailsCodeNotIn(List<String> values) {
            addCriterion("data_details_code not in", values, "dataDetailsCode");
            return (Criteria) this;
        }

        public Criteria andDataDetailsCodeBetween(String value1, String value2) {
            addCriterion("data_details_code between", value1, value2, "dataDetailsCode");
            return (Criteria) this;
        }

        public Criteria andDataDetailsCodeNotBetween(String value1, String value2) {
            addCriterion("data_details_code not between", value1, value2, "dataDetailsCode");
            return (Criteria) this;
        }

        public Criteria andDataDetailsNameIsNull() {
            addCriterion("data_details_name is null");
            return (Criteria) this;
        }

        public Criteria andDataDetailsNameIsNotNull() {
            addCriterion("data_details_name is not null");
            return (Criteria) this;
        }

        public Criteria andDataDetailsNameEqualTo(String value) {
            addCriterion("data_details_name =", value, "dataDetailsName");
            return (Criteria) this;
        }

        public Criteria andDataDetailsNameNotEqualTo(String value) {
            addCriterion("data_details_name <>", value, "dataDetailsName");
            return (Criteria) this;
        }

        public Criteria andDataDetailsNameGreaterThan(String value) {
            addCriterion("data_details_name >", value, "dataDetailsName");
            return (Criteria) this;
        }

        public Criteria andDataDetailsNameGreaterThanOrEqualTo(String value) {
            addCriterion("data_details_name >=", value, "dataDetailsName");
            return (Criteria) this;
        }

        public Criteria andDataDetailsNameLessThan(String value) {
            addCriterion("data_details_name <", value, "dataDetailsName");
            return (Criteria) this;
        }

        public Criteria andDataDetailsNameLessThanOrEqualTo(String value) {
            addCriterion("data_details_name <=", value, "dataDetailsName");
            return (Criteria) this;
        }

        public Criteria andDataDetailsNameLike(String value) {
            addCriterion("data_details_name like", value, "dataDetailsName");
            return (Criteria) this;
        }

        public Criteria andDataDetailsNameNotLike(String value) {
            addCriterion("data_details_name not like", value, "dataDetailsName");
            return (Criteria) this;
        }

        public Criteria andDataDetailsNameIn(List<String> values) {
            addCriterion("data_details_name in", values, "dataDetailsName");
            return (Criteria) this;
        }

        public Criteria andDataDetailsNameNotIn(List<String> values) {
            addCriterion("data_details_name not in", values, "dataDetailsName");
            return (Criteria) this;
        }

        public Criteria andDataDetailsNameBetween(String value1, String value2) {
            addCriterion("data_details_name between", value1, value2, "dataDetailsName");
            return (Criteria) this;
        }

        public Criteria andDataDetailsNameNotBetween(String value1, String value2) {
            addCriterion("data_details_name not between", value1, value2, "dataDetailsName");
            return (Criteria) this;
        }

        public Criteria andCreatedByIsNull() {
            addCriterion("created_by is null");
            return (Criteria) this;
        }

        public Criteria andCreatedByIsNotNull() {
            addCriterion("created_by is not null");
            return (Criteria) this;
        }

        public Criteria andCreatedByEqualTo(Integer value) {
            addCriterion("created_by =", value, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByNotEqualTo(Integer value) {
            addCriterion("created_by <>", value, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByGreaterThan(Integer value) {
            addCriterion("created_by >", value, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByGreaterThanOrEqualTo(Integer value) {
            addCriterion("created_by >=", value, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByLessThan(Integer value) {
            addCriterion("created_by <", value, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByLessThanOrEqualTo(Integer value) {
            addCriterion("created_by <=", value, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByIn(List<Integer> values) {
            addCriterion("created_by in", values, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByNotIn(List<Integer> values) {
            addCriterion("created_by not in", values, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByBetween(Integer value1, Integer value2) {
            addCriterion("created_by between", value1, value2, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedByNotBetween(Integer value1, Integer value2) {
            addCriterion("created_by not between", value1, value2, "createdBy");
            return (Criteria) this;
        }

        public Criteria andCreatedDateIsNull() {
            addCriterion("created_date is null");
            return (Criteria) this;
        }

        public Criteria andCreatedDateIsNotNull() {
            addCriterion("created_date is not null");
            return (Criteria) this;
        }

        public Criteria andCreatedDateEqualTo(Date value) {
            addCriterion("created_date =", value, "createdDate");
            return (Criteria) this;
        }

        public Criteria andCreatedDateNotEqualTo(Date value) {
            addCriterion("created_date <>", value, "createdDate");
            return (Criteria) this;
        }

        public Criteria andCreatedDateGreaterThan(Date value) {
            addCriterion("created_date >", value, "createdDate");
            return (Criteria) this;
        }

        public Criteria andCreatedDateGreaterThanOrEqualTo(Date value) {
            addCriterion("created_date >=", value, "createdDate");
            return (Criteria) this;
        }

        public Criteria andCreatedDateLessThan(Date value) {
            addCriterion("created_date <", value, "createdDate");
            return (Criteria) this;
        }

        public Criteria andCreatedDateLessThanOrEqualTo(Date value) {
            addCriterion("created_date <=", value, "createdDate");
            return (Criteria) this;
        }

        public Criteria andCreatedDateIn(List<Date> values) {
            addCriterion("created_date in", values, "createdDate");
            return (Criteria) this;
        }

        public Criteria andCreatedDateNotIn(List<Date> values) {
            addCriterion("created_date not in", values, "createdDate");
            return (Criteria) this;
        }

        public Criteria andCreatedDateBetween(Date value1, Date value2) {
            addCriterion("created_date between", value1, value2, "createdDate");
            return (Criteria) this;
        }

        public Criteria andCreatedDateNotBetween(Date value1, Date value2) {
            addCriterion("created_date not between", value1, value2, "createdDate");
            return (Criteria) this;
        }

        public Criteria andUpdatedByIsNull() {
            addCriterion("updated_by is null");
            return (Criteria) this;
        }

        public Criteria andUpdatedByIsNotNull() {
            addCriterion("updated_by is not null");
            return (Criteria) this;
        }

        public Criteria andUpdatedByEqualTo(Integer value) {
            addCriterion("updated_by =", value, "updatedBy");
            return (Criteria) this;
        }

        public Criteria andUpdatedByNotEqualTo(Integer value) {
            addCriterion("updated_by <>", value, "updatedBy");
            return (Criteria) this;
        }

        public Criteria andUpdatedByGreaterThan(Integer value) {
            addCriterion("updated_by >", value, "updatedBy");
            return (Criteria) this;
        }

        public Criteria andUpdatedByGreaterThanOrEqualTo(Integer value) {
            addCriterion("updated_by >=", value, "updatedBy");
            return (Criteria) this;
        }

        public Criteria andUpdatedByLessThan(Integer value) {
            addCriterion("updated_by <", value, "updatedBy");
            return (Criteria) this;
        }

        public Criteria andUpdatedByLessThanOrEqualTo(Integer value) {
            addCriterion("updated_by <=", value, "updatedBy");
            return (Criteria) this;
        }

        public Criteria andUpdatedByIn(List<Integer> values) {
            addCriterion("updated_by in", values, "updatedBy");
            return (Criteria) this;
        }

        public Criteria andUpdatedByNotIn(List<Integer> values) {
            addCriterion("updated_by not in", values, "updatedBy");
            return (Criteria) this;
        }

        public Criteria andUpdatedByBetween(Integer value1, Integer value2) {
            addCriterion("updated_by between", value1, value2, "updatedBy");
            return (Criteria) this;
        }

        public Criteria andUpdatedByNotBetween(Integer value1, Integer value2) {
            addCriterion("updated_by not between", value1, value2, "updatedBy");
            return (Criteria) this;
        }

        public Criteria andUpdatedDateIsNull() {
            addCriterion("updated_date is null");
            return (Criteria) this;
        }

        public Criteria andUpdatedDateIsNotNull() {
            addCriterion("updated_date is not null");
            return (Criteria) this;
        }

        public Criteria andUpdatedDateEqualTo(Date value) {
            addCriterion("updated_date =", value, "updatedDate");
            return (Criteria) this;
        }

        public Criteria andUpdatedDateNotEqualTo(Date value) {
            addCriterion("updated_date <>", value, "updatedDate");
            return (Criteria) this;
        }

        public Criteria andUpdatedDateGreaterThan(Date value) {
            addCriterion("updated_date >", value, "updatedDate");
            return (Criteria) this;
        }

        public Criteria andUpdatedDateGreaterThanOrEqualTo(Date value) {
            addCriterion("updated_date >=", value, "updatedDate");
            return (Criteria) this;
        }

        public Criteria andUpdatedDateLessThan(Date value) {
            addCriterion("updated_date <", value, "updatedDate");
            return (Criteria) this;
        }

        public Criteria andUpdatedDateLessThanOrEqualTo(Date value) {
            addCriterion("updated_date <=", value, "updatedDate");
            return (Criteria) this;
        }

        public Criteria andUpdatedDateIn(List<Date> values) {
            addCriterion("updated_date in", values, "updatedDate");
            return (Criteria) this;
        }

        public Criteria andUpdatedDateNotIn(List<Date> values) {
            addCriterion("updated_date not in", values, "updatedDate");
            return (Criteria) this;
        }

        public Criteria andUpdatedDateBetween(Date value1, Date value2) {
            addCriterion("updated_date between", value1, value2, "updatedDate");
            return (Criteria) this;
        }

        public Criteria andUpdatedDateNotBetween(Date value1, Date value2) {
            addCriterion("updated_date not between", value1, value2, "updatedDate");
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