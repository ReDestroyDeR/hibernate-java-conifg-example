package org.example.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import java.util.Properties;

@Configuration
@ConfigurationProperties(prefix = "persistence")
public class PersistenceConfigurationProperties {
    /**
     * JDBC url до целевого хранилища
     */
    private String url;
    /**
     * Имя пользователя
     */
    private String user;
    /**
     * Пароль
     */
    private String password;
    /**
     * {@link java.sql.Driver} класс для используемого хранилища
     */
    private String driverClass;
    /**
     * {@link org.hibernate.dialect.Dialect} класс диалекта hibernate
     */
    private String dialect;
    /**
     * Базовые пакеты, для поиска {@link javax.persistence.Entity}
     */
    private String[] basePackages;
    /**
     * Дополнительные параметры
     * <p>
     * Например:
     * <p>
     * <code>
     * persistence.additionalProperties.hibernate.hbm2ddl.auto=create-drop
     * </code>
     */
    private Properties additionalProperties;

    public PersistenceConfigurationProperties() {
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getDriverClass() {
        return driverClass;
    }

    public void setDriverClass(String driverClass) {
        this.driverClass = driverClass;
    }

    public String getDialect() {
        return dialect;
    }

    public void setDialect(String dialect) {
        this.dialect = dialect;
    }

    public String[] getBasePackages() {
        return basePackages;
    }

    public void setBasePackages(String[] basePackages) {
        this.basePackages = basePackages;
    }

    public Properties getAdditionalProperties() {
        return additionalProperties;
    }

    public void setAdditionalProperties(Properties additionalProperties) {
        this.additionalProperties = additionalProperties;
    }

    public PersistenceConfigurationProperties(String url, String user, String password, String driverClass, String dialect, String[] basePackages, Properties additionalProperties) {
        this.url = url;
        this.user = user;
        this.password = password;
        this.driverClass = driverClass;
        this.dialect = dialect;
        this.basePackages = basePackages;
        this.additionalProperties = additionalProperties;
    }
}
