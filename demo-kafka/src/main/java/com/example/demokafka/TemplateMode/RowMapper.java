package com.example.demokafka.TemplateMode;

import java.sql.ResultSet;

public interface RowMapper<T> {
    T mapRow(ResultSet rs, int rowNum) throws Exception;
}
