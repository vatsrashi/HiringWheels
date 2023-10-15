package org.ncu.hirewheels.service;

import org.ncu.hirewheels.entities.role;

public interface RoleService {
    role addRole(role role);
    role getRoleById(Integer roleId);
    role updateRole(Integer roleId, role updatedRole);
    void deleteRole(Integer roleId);
}
