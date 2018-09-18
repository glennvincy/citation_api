package net.citation.citation_api.dao;

import net.citation.citation_api.dao.entity.UserEntity;

public interface IUserDao extends IGenericDao<UserEntity, Long>{

    UserEntity findByLogin(String name);
}
