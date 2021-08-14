package com.azurianTest.backend.config;

import java.util.Properties;

import javax.persistence.EntityManagerFactory;
import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;


//Integración de Spring y JPA
//Configuración JPA para poder usar la interface EntityManager
@Configuration
@EnableTransactionManagement
@PropertySource(value = "classpath:application.properties")
public class JPAConfig {
	
	//Mediante este objeto se obtienen los datos del archivo "application.properties".
	@Autowired
	private Environment env;

	//LocalContainerEntityManagerFactoryBean da acceso completo a la configuración del EntityManagerFactory
	@Bean
	public LocalContainerEntityManagerFactoryBean emf() {
		LocalContainerEntityManagerFactoryBean emf = new LocalContainerEntityManagerFactoryBean();
		emf.setJpaVendorAdapter(new HibernateJpaVendorAdapter());
		emf.setDataSource(getDataSource());
		emf.setPackagesToScan("com.azurianTest.backend.entity");
		emf.setJpaProperties(getJpaProperties());
		return emf;
	}

	//Se configuran los datos de la base de datos
	@Bean
	public DataSource getDataSource() {
		DriverManagerDataSource ds = new DriverManagerDataSource();
		ds.setDriverClassName("com.mysql.jdbc.Driver");
		ds.setUrl(env.getProperty("database.url"));
		ds.setUsername(env.getProperty("database.user"));
		ds.setPassword(env.getProperty("database.password"));
		return ds;
	}

	@Bean
	public PlatformTransactionManager transactionManager(EntityManagerFactory emf) {
		return new JpaTransactionManager(emf);
	}

	//Configurar propiedades de hibernate
	private Properties getJpaProperties() {
		Properties props = new Properties();
		props.setProperty("hibernate.dialect", "org.hibernate.dialect.MySQL5Dialect");
		props.setProperty("hibernate.show_sql", env.getProperty("hibernate.show.sql"));
		props.setProperty("hibernate.format_sql", env.getProperty("hibernate.format.sql"));
		return props;
	}
}
