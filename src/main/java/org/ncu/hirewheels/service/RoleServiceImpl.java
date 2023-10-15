package org.ncu.hirewheels.service;

import org.ncu.hirewheels.entities.role;
import org.ncu.hirewheels.repository.RoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RoleServiceImpl implements RoleService {
    private final RoleRepository roleRepository;

    @Autowired
    public RoleServiceImpl(RoleRepository roleRepository) {
        this.roleRepository = roleRepository;
    }

    @Override
    public role addRole(role role) {
        return roleRepository.save(role);
    }

    @Override
    public role getRoleById(Integer roleId) {
        return roleRepository.findById(roleId).orElse(null);
    }

    @Override
    public role updateRole(Integer roleId, role updatedRole) {
        if (roleRepository.existsById(roleId)) {
            // Load the existing role
            role existingRole = roleRepository.getById(roleId);

            // Update the fields of the existing role with the values from updatedRole
            existingRole.setRoleName(updatedRole.getRoleName());

            // Save the updated role
            return roleRepository.save(existingRole);
        }
        return null;
    }

    @Override
    public void deleteRole(Integer roleId) {
        roleRepository.deleteById(roleId);
    }
}
