package com.mikadosolutions.training.springmvc.bean;

import javax.annotation.Resource;
import javax.sql.DataSource;
import org.springframework.jdbc.core.JdbcTemplate;

public class BaseDAO
{
	protected JdbcTemplate jdbcTemplate;
		@Resource(name="dataSource")
		public void setDataSource  (DataSource dataSource)
	{
		this.jdbcTemplate= new JdbcTemplate(dataSource);
	}

};
