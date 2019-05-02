package com.ccff.spring.aspectj.check;

import com.ccff.spring.aspectj.pojo.Role;

public class RoleVerifierImpl implements RoleVerifier {
    @Override
    public boolean verify(Role role) {
        return role != null;
    }
}
