package com.electronics.shopmebackend.config;

import java.util.Properties;

import javax.sql.DataSource;

import org.apache.commons.dbcp2.BasicDataSource;
import org.hibernate.SessionFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.orm.hibernate5.LocalSessionFactoryBuilder;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@ComponentScan(basePackages= {"com.electronics.shopmebackend"})
@EnableTransactionManagement
public class HibernateConfig {
	
	private final static String DATABASE_URL= "jdbc:oracle:thin:@localhost:1521:novregdb";
	private final static String DATABASE_DRIVER= "oracle.jdbc.driver.OracleDriver";
	private final static String DATABASE_DIALECT= "org.hibernate.dialect.Oracle10gDialect";
	private final static String DATABASE_USERNAME= "sh4nova";
	private final static String DATABASE_PASSWORD= "nova1";
	
	
	// DataSource bean will be returned which will be used for connection pooling.
	 @Bean
	 public DataSource getDataSource() {
		 
		 BasicDataSource datasource = new BasicDataSource();
		 
		 datasource.setUrl(DATABASE_URL);
		 datasource.setDriverClassName(DATABASE_DRIVER);
		 datasource.setUsername(DATABASE_USERNAME);
		 datasource.setPassword(DATABASE_PASSWORD);
		 
		 return datasource;
		 
	 }
	 
	 
	 @Bean
	 public SessionFactory getSessionFactory(DataSource datasource)
	 {
		 LocalSessionFactoryBuilder builder = new LocalSessionFactoryBuilder(datasource);
		 
		 builder.addProperties(getHibernateProperties());
		 builder.scanPackages("com.electronics.shopmebackend.dto");
		 
		 return builder.buildSessionFactory();
	 }


	// All the hibernate properties will be returned in this method
	private Properties getHibernateProperties() {
		// TODO Auto-generated method stub
		
		Properties prop= new Properties();
		
		prop.put("hibernate.dialect", "org.hibernate.dialect.Oracle10gDialect");
		prop.put("hibernate.hbm2ddl.auto", "update");
		prop.put("hibernate.show_sql","true");
		prop.put("hibernate.format_sql","true");
		
		return prop;
	}
	
	

	//TransactionManager bean
	@Bean
	public HibernateTransactionManager getTransactionManager(SessionFactory sessionFactory)
	{
		HibernateTransactionManager transactionManager= new HibernateTransactionManager(sessionFactory);
		
		return transactionManager;
		
	}
	

	 
	 
	 
	
	

}
