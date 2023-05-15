package sptech.jswing.models;

import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.jdbc.core.JdbcTemplate;

public class Conexao2 {
    private JdbcTemplate connection;

    
    public Conexao2() {
        BasicDataSource dataSource = new BasicDataSource();
        dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
        dataSource.setUrl("jdbc:mysql://localhost/banco1");
        dataSource.setUsername("root");
        dataSource.setPassword("urubu100");
        this.connection = new JdbcTemplate(dataSource);
    }
    
    public JdbcTemplate getConnection() {
        return connection;
    }
}
