package net.citation.citation_api.dao;

import net.citation.citation_api.dao.entity.UserEntity;
import org.springframework.stereotype.Repository;

@Repository
public class UserDao extends GenericDao<UserEntity, Long> implements IUserDao {
    @Override
    public UserEntity findByLogin(String name) {
        return getByCriteria("login", name).get(0);
    }
}
