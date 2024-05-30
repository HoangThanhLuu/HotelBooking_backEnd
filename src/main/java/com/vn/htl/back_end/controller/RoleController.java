package com.vn.htl.back_end.controller;

import com.vn.htl.back_end.exception.RoleAlreadyExistException;
import com.vn.htl.back_end.model.Role;
import com.vn.htl.back_end.service.IRoleService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static org.springframework.http.HttpStatus.FOUND;

@RestController
@RequestMapping("/roles")
@RequiredArgsConstructor
public class RoleController {
    private final IRoleService roleService;
    @GetMapping("/all-roles")
    public ResponseEntity<List<Role>> getAllRoles(){
        return new ResponseEntity<>(roleService.getRoles(), FOUND);
    }
    @PostMapping("/create-new-role")
    public ResponseEntity<String> createRole(@RequestBody Role theRole){
        try{
            roleService.createRole(theRole);
            return ResponseEntity.ok("New role created successfully!");
        }catch(RoleAlreadyExistException re){
            return ResponseEntity.status(HttpStatus.CONFLICT).body(re.getMessage());

        }
    }
}
