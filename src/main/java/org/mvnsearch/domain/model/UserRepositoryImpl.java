package org.mvnsearch.domain.model;

import org.jetbrains.annotations.Nullable;
import org.springframework.stereotype.Repository;

/**
 * user repository implementation
 *
 * @author linux_china
 */
@Repository
public class UserRepositoryImpl implements UserRepository {
    @Nullable
    public User findOne(Integer id) {
        User user = new User();
        user.setId(id);
        user.setNick("nick:" + id);
        return user;
    }
}
