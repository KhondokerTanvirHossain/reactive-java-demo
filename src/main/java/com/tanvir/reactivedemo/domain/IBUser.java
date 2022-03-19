package com.tanvir.reactivedemo.domain;

import com.google.gson.GsonBuilder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
@NoArgsConstructor
public class IBUser {

    private String ibUserOid;
    private String userId;
    private String branchOid;
    private String password;
    private String role;
    private String mobileNo;
    private String status;

}
