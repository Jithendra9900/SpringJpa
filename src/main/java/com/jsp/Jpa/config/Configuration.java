package com.jsp.Jpa.config;

import javax.persistence.EntityManagerFactory;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalEntityManagerFactoryBean;
@Configurable
@ComponentScan(basePackages = "com.jsp.Jpa")
@EnableJpaRepositories(basePackages = "com.jsp.Jpa")
public class Configuration 
{
	@Bean("entityManagerFactory")
  public LocalEntityManagerFactoryBean getLocalEntityManagerFactoryBean()
  {
	  LocalEntityManagerFactoryBean bean=new LocalEntityManagerFactoryBean();
	  bean.setPersistenceUnitName("SpringJpa");
	  return bean;
  }
	@Bean("transactionManager")
	public JpaTransactionManager getJpaTransactionManager(EntityManagerFactory factory)
	{
		JpaTransactionManager tm=new JpaTransactionManager();
		tm.setEntityManagerFactory(factory);
		return tm;
	}
}
