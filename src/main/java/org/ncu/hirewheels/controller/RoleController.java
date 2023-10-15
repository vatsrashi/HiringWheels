package org.ncu.hirewheels.controller;

import org.ncu.hirewheels.entities.role;
import org.ncu.hirewheels.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "http://localhost:8081")
@RestController
@RequestMapping("/role")
public class RoleController {
    @Autowired
    private RoleService roleService;

    @PostMapping("/add-role")
    public ResponseEntity<role> addRole(@RequestBody role role) {
        role addedRole = roleService.addRole(role);
        return new ResponseEntity<>(addedRole, HttpStatus.OK);
    }

    @GetMapping("/get-role/{roleId}")
    public ResponseEntity<role> getRoleById(@PathVariable("roleId") int roleId) {
        role fetchedRole = roleService.getRoleById(roleId);
        if (fetchedRole != null) {
            return new ResponseEntity<>(fetchedRole, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @PutMapping("/update-role/{roleId}")
    public ResponseEntity<role> updateRole(@PathVariable("roleId") int roleId, @RequestBody role updatedRole) {
        role updated = roleService.updateRole(roleId, updatedRole);
        if (updated != null) {
            return new ResponseEntity<>(updated, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping("/delete-role/{roleId}")
    public ResponseEntity<HttpStatus> deleteRole(@PathVariable("roleId") int roleId) {
        roleService.deleteRole(roleId);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
