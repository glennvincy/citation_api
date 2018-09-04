package net.citation.citation_api.dao.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.sql.Date;
import java.util.Objects;
@Entity
@Table(name="UserEntity")
public class UserEntity {
    @Id
    private long id;
    private String login;
    private String passwd;
    private Date dateCreation;
    private Date dateSuppression;
    private Date dateMAJ;

    public UserEntity(long id, String login, String passwd, Date dateCreation, Date dateSuppression, Date dateMAJ) {
        this.id = id;
        this.login = login;
        this.passwd = passwd;
        this.dateCreation = dateCreation;
        this.dateSuppression = dateSuppression;
        this.dateMAJ = dateMAJ;
    }

    public UserEntity() {
    }

    public long getId() {
        return id;
    }

    public String getLogin() {
        return login;
    }

    public String getPasswd() {
        return passwd;
    }

    public Date getDateCreation() {
        return dateCreation;
    }

    public Date getDateSuppression() {
        return dateSuppression;
    }

    public Date getDateMAJ() {
        return dateMAJ;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof UserEntity)) return false;
        UserEntity userEntity = (UserEntity) o;
        return id == userEntity.id &&
                Objects.equals(login, userEntity.login) &&
                Objects.equals(passwd, userEntity.passwd) &&
                Objects.equals(dateCreation, userEntity.dateCreation) &&
                Objects.equals(dateSuppression, userEntity.dateSuppression) &&
                Objects.equals(dateMAJ, userEntity.dateMAJ);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, login, passwd, dateCreation, dateSuppression, dateMAJ);
    }
}
