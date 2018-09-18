package net.citation.citation_api.dao;


import net.citation.citation_api.dao.config.ApplicationConfiguration;
import net.citation.citation_api.dao.entity.UserEntity;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.support.AnnotationConfigContextLoader;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes= ApplicationConfiguration.class, loader= AnnotationConfigContextLoader.class)
public class UserDaoTest {
    @Autowired
    private IUserDao userDao;

    @Test
    public void when_create_user_with_id_then_get_persisted_user_with_the_same_id() {
        UserEntity userEntity = new UserEntity(1, "toto", "toto", null, null, null);
        userDao.persist(userEntity);
        Assert.assertNotNull(userDao.find(1));
    }

//    @Test
//    public void when_create_user_with_name_then_get_persisted_user_with_the_same_id_and() {
//        UserEntity userEntity = new UserEntity(2, "toto", "toto", null, null, null);
//        userDao.persist(userEntity);
//        UserEntity persistedUser = userDao.findByLogin("toto");
//        Assert.assertNotNull(persistedUser);
//        Assert.assertEquals("toto", persistedUser.getLogin());
//        Assert.assertEquals(2, persistedUser.getId());
//    }


}
