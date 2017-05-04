package com.ycy.model;

import java.util.ArrayList;
import java.util.List;

public class KeyWordExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public KeyWordExample() {
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

        public Criteria andKeywordIdIsNull() {
            addCriterion("keyword_id is null");
            return (Criteria) this;
        }

        public Criteria andKeywordIdIsNotNull() {
            addCriterion("keyword_id is not null");
            return (Criteria) this;
        }

        public Criteria andKeywordIdEqualTo(String value) {
            addCriterion("keyword_id =", value, "keywordId");
            return (Criteria) this;
        }

        public Criteria andKeywordIdNotEqualTo(String value) {
            addCriterion("keyword_id <>", value, "keywordId");
            return (Criteria) this;
        }

        public Criteria andKeywordIdGreaterThan(String value) {
            addCriterion("keyword_id >", value, "keywordId");
            return (Criteria) this;
        }

        public Criteria andKeywordIdGreaterThanOrEqualTo(String value) {
            addCriterion("keyword_id >=", value, "keywordId");
            return (Criteria) this;
        }

        public Criteria andKeywordIdLessThan(String value) {
            addCriterion("keyword_id <", value, "keywordId");
            return (Criteria) this;
        }

        public Criteria andKeywordIdLessThanOrEqualTo(String value) {
            addCriterion("keyword_id <=", value, "keywordId");
            return (Criteria) this;
        }

        public Criteria andKeywordIdLike(String value) {
            addCriterion("keyword_id like", value, "keywordId");
            return (Criteria) this;
        }

        public Criteria andKeywordIdNotLike(String value) {
            addCriterion("keyword_id not like", value, "keywordId");
            return (Criteria) this;
        }

        public Criteria andKeywordIdIn(List<String> values) {
            addCriterion("keyword_id in", values, "keywordId");
            return (Criteria) this;
        }

        public Criteria andKeywordIdNotIn(List<String> values) {
            addCriterion("keyword_id not in", values, "keywordId");
            return (Criteria) this;
        }

        public Criteria andKeywordIdBetween(String value1, String value2) {
            addCriterion("keyword_id between", value1, value2, "keywordId");
            return (Criteria) this;
        }

        public Criteria andKeywordIdNotBetween(String value1, String value2) {
            addCriterion("keyword_id not between", value1, value2, "keywordId");
            return (Criteria) this;
        }

        public Criteria andKeywordValueIsNull() {
            addCriterion("keyword_value is null");
            return (Criteria) this;
        }

        public Criteria andKeywordValueIsNotNull() {
            addCriterion("keyword_value is not null");
            return (Criteria) this;
        }

        public Criteria andKeywordValueEqualTo(String value) {
            addCriterion("keyword_value =", value, "keywordValue");
            return (Criteria) this;
        }

        public Criteria andKeywordValueNotEqualTo(String value) {
            addCriterion("keyword_value <>", value, "keywordValue");
            return (Criteria) this;
        }

        public Criteria andKeywordValueGreaterThan(String value) {
            addCriterion("keyword_value >", value, "keywordValue");
            return (Criteria) this;
        }

        public Criteria andKeywordValueGreaterThanOrEqualTo(String value) {
            addCriterion("keyword_value >=", value, "keywordValue");
            return (Criteria) this;
        }

        public Criteria andKeywordValueLessThan(String value) {
            addCriterion("keyword_value <", value, "keywordValue");
            return (Criteria) this;
        }

        public Criteria andKeywordValueLessThanOrEqualTo(String value) {
            addCriterion("keyword_value <=", value, "keywordValue");
            return (Criteria) this;
        }

        public Criteria andKeywordValueLike(String value) {
            addCriterion("keyword_value like", value, "keywordValue");
            return (Criteria) this;
        }

        public Criteria andKeywordValueNotLike(String value) {
            addCriterion("keyword_value not like", value, "keywordValue");
            return (Criteria) this;
        }

        public Criteria andKeywordValueIn(List<String> values) {
            addCriterion("keyword_value in", values, "keywordValue");
            return (Criteria) this;
        }

        public Criteria andKeywordValueNotIn(List<String> values) {
            addCriterion("keyword_value not in", values, "keywordValue");
            return (Criteria) this;
        }

        public Criteria andKeywordValueBetween(String value1, String value2) {
            addCriterion("keyword_value between", value1, value2, "keywordValue");
            return (Criteria) this;
        }

        public Criteria andKeywordValueNotBetween(String value1, String value2) {
            addCriterion("keyword_value not between", value1, value2, "keywordValue");
            return (Criteria) this;
        }

        public Criteria andKeywordAddUserIsNull() {
            addCriterion("keyword_add_user is null");
            return (Criteria) this;
        }

        public Criteria andKeywordAddUserIsNotNull() {
            addCriterion("keyword_add_user is not null");
            return (Criteria) this;
        }

        public Criteria andKeywordAddUserEqualTo(String value) {
            addCriterion("keyword_add_user =", value, "keywordAddUser");
            return (Criteria) this;
        }

        public Criteria andKeywordAddUserNotEqualTo(String value) {
            addCriterion("keyword_add_user <>", value, "keywordAddUser");
            return (Criteria) this;
        }

        public Criteria andKeywordAddUserGreaterThan(String value) {
            addCriterion("keyword_add_user >", value, "keywordAddUser");
            return (Criteria) this;
        }

        public Criteria andKeywordAddUserGreaterThanOrEqualTo(String value) {
            addCriterion("keyword_add_user >=", value, "keywordAddUser");
            return (Criteria) this;
        }

        public Criteria andKeywordAddUserLessThan(String value) {
            addCriterion("keyword_add_user <", value, "keywordAddUser");
            return (Criteria) this;
        }

        public Criteria andKeywordAddUserLessThanOrEqualTo(String value) {
            addCriterion("keyword_add_user <=", value, "keywordAddUser");
            return (Criteria) this;
        }

        public Criteria andKeywordAddUserLike(String value) {
            addCriterion("keyword_add_user like", value, "keywordAddUser");
            return (Criteria) this;
        }

        public Criteria andKeywordAddUserNotLike(String value) {
            addCriterion("keyword_add_user not like", value, "keywordAddUser");
            return (Criteria) this;
        }

        public Criteria andKeywordAddUserIn(List<String> values) {
            addCriterion("keyword_add_user in", values, "keywordAddUser");
            return (Criteria) this;
        }

        public Criteria andKeywordAddUserNotIn(List<String> values) {
            addCriterion("keyword_add_user not in", values, "keywordAddUser");
            return (Criteria) this;
        }

        public Criteria andKeywordAddUserBetween(String value1, String value2) {
            addCriterion("keyword_add_user between", value1, value2, "keywordAddUser");
            return (Criteria) this;
        }

        public Criteria andKeywordAddUserNotBetween(String value1, String value2) {
            addCriterion("keyword_add_user not between", value1, value2, "keywordAddUser");
            return (Criteria) this;
        }

        public Criteria andKeywordTypeIsNull() {
            addCriterion("keyword_type is null");
            return (Criteria) this;
        }

        public Criteria andKeywordTypeIsNotNull() {
            addCriterion("keyword_type is not null");
            return (Criteria) this;
        }

        public Criteria andKeywordTypeEqualTo(String value) {
            addCriterion("keyword_type =", value, "keywordType");
            return (Criteria) this;
        }

        public Criteria andKeywordTypeNotEqualTo(String value) {
            addCriterion("keyword_type <>", value, "keywordType");
            return (Criteria) this;
        }

        public Criteria andKeywordTypeGreaterThan(String value) {
            addCriterion("keyword_type >", value, "keywordType");
            return (Criteria) this;
        }

        public Criteria andKeywordTypeGreaterThanOrEqualTo(String value) {
            addCriterion("keyword_type >=", value, "keywordType");
            return (Criteria) this;
        }

        public Criteria andKeywordTypeLessThan(String value) {
            addCriterion("keyword_type <", value, "keywordType");
            return (Criteria) this;
        }

        public Criteria andKeywordTypeLessThanOrEqualTo(String value) {
            addCriterion("keyword_type <=", value, "keywordType");
            return (Criteria) this;
        }

        public Criteria andKeywordTypeLike(String value) {
            addCriterion("keyword_type like", value, "keywordType");
            return (Criteria) this;
        }

        public Criteria andKeywordTypeNotLike(String value) {
            addCriterion("keyword_type not like", value, "keywordType");
            return (Criteria) this;
        }

        public Criteria andKeywordTypeIn(List<String> values) {
            addCriterion("keyword_type in", values, "keywordType");
            return (Criteria) this;
        }

        public Criteria andKeywordTypeNotIn(List<String> values) {
            addCriterion("keyword_type not in", values, "keywordType");
            return (Criteria) this;
        }

        public Criteria andKeywordTypeBetween(String value1, String value2) {
            addCriterion("keyword_type between", value1, value2, "keywordType");
            return (Criteria) this;
        }

        public Criteria andKeywordTypeNotBetween(String value1, String value2) {
            addCriterion("keyword_type not between", value1, value2, "keywordType");
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