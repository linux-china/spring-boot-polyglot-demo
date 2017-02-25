package org.mvnsearch.domain.model;

import org.jetbrains.annotations.Nullable;

/**
 * user repository
 *
 * @author linux_china
 */
public interface UserRepository {

    @Nullable
    public User findOne(Integer id);
}
