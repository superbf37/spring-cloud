package org.superbf.cloud.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.superbf.cloud.entity.User;

public interface UserRepository extends JpaRepository<User,Long> {
}
