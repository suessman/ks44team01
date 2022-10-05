package anypet.ks44team01.config;
import java.io.IOException;

import javax.sql.DataSource;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.PlatformTransactionManager;

@Configuration
@MapperScan(basePackages = "ksmart.mybatis.mapper", sqlSessionFactoryRef = "mybatisSqlsessionFactory")
public class MybatisConfig {
	@Bean("mybatisSqlsessionFactory")
	public SqlSessionFactory mybatisSqlsessionFactory(DataSource dataSource, ApplicationContext ctx) throws Exception {
		SqlSessionFactoryBean sqlSessionFactoryBean = new SqlSessionFactoryBean();
		sqlSessionFactoryBean.setDataSource(dataSource);
		sqlSessionFactoryBean.setMapperLocations(ctx.getResources("classpath:mapper/**/*.xml"));
		sqlSessionFactoryBean.setTypeAliasesPackage("ksmart.mybatis.dto");
		return sqlSessionFactoryBean.getObject();
	}
	
	@Bean("mybatisSqlSessionTemplate")
	public SqlSessionTemplate mybatisSqlSessionTemplate(@Qualifier("mybatisSqlsessionFactory") 
				SqlSessionFactory sqlSessionFactory) {
		return new SqlSessionTemplate(sqlSessionFactory);
	}
	
	@Bean("mybatisTransactionManager")
	public PlatformTransactionManager transactionManager(DataSource dataSource) {
		return new DataSourceTransactionManager(dataSource);
	}
}
