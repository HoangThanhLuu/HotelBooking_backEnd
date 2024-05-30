package com.vn.htl.back_end.service;

import com.vn.htl.back_end.model.Role;
import com.vn.htl.back_end.model.User;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class RoleService implements IRoleService {
    @Override
    public List<Role> getRoles() {
        return List.of();
    }

    @Override
    public Role createRole(Role theRole) {
        return null;
    }

    @Override
    public void deleteRole(Long id) {

    }

    @Override
    public Role findByName(String name) {
        return null;
    }

    @Override
    public User removeUserFromRole(Long userId, Long roleId) {
        return null;
    }

    @Override
    public User assignRoleToUser(Long userId, Long roleId) {
        return null;
    }

    @Override
    public Role removeAllUsersFromRole(Long roleId) {
        return null;
    }
}
