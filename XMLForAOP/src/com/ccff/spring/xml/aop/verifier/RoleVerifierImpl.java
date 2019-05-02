package com.ccff.spring.xml.aop.verifier;


import com.ccff.spring.xml.aop.pojo.Role;

public class RoleVerifierImpl implements RoleVerifier {
    @Override
    public boolean verify(Role role) {
        return role != null;
    }
}
