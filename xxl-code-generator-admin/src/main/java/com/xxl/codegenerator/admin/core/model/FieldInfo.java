package com.xxl.codegenerator.admin.core.model;

/**
 * @Author: miaohq
 * @Date: 2018-12-26 10:05:29
 * @Version 1.0
 */
public class FieldInfo {

    private String columnName;
    private String fieldName;
    private String fieldClass;
    private String fieldComment;

    public String getColumnName() {
        return columnName;
    }

    public void setColumnName(String columnName) {
        this.columnName = columnName;
    }

    public String getFieldName() {
        return fieldName;
    }

    public void setFieldName(String fieldName) {
        this.fieldName = fieldName;
    }

    public String getFieldClass() {
        return fieldClass;
    }

    public void setFieldClass(String fieldClass) {
        this.fieldClass = fieldClass;
    }

    public String getFieldComment() {
        return fieldComment;
    }

    public void setFieldComment(String fieldComment) {
        this.fieldComment = fieldComment;
    }

}
