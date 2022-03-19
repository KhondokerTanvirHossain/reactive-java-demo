package com.tanvir.reactivedemo.repository;

import com.google.gson.GsonBuilder;
import com.google.gson.annotations.Expose;
import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

import java.sql.Timestamp;
import java.util.Collection;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table("ibuser")
public class IBUserEntity {

    @Id
    @Expose
//    @GeneratedValue(generator = "UUID")
//    @GenericGenerator(name = "UUID", strategy = "org.hibernate.id.UUIDGenerator")
//    @Column(name = "ibuseroid", updatable = false, nullable = false)
    @Column(value = "ibuseroid")
    private String ibUserOid;

    @Column(value="userid")
    @Expose
    private String userId;

    @Column(value="branchoid")
    @Expose
    private String branchOid;

    @Column(value="password")
    @Expose
    private String password;

    @Column(value="role")
    @Expose
    private String role;

    @Column(value="mobileno")
    @Expose
    private String mobileNo;

    @Column(value="status")
    @Expose
    private String status;

    @Column(value = "createdon")
    @Expose
    private Timestamp createdOn;

    @Column(value="editedby")
    @Expose
    private String editedBy;

    @Column(value="editedon")
    @Expose
    private Timestamp editedOn;

    @Column(value="currentversion")
    @Expose
    private String currentVersion;

    @Column(value="resetrequired")
    @Expose
    private String resetRequired;


//    @ManyToMany(cascade = {CascadeType.PERSIST, CascadeType.MERGE}, fetch = FetchType.EAGER)
//    @JoinTable(name = "userrole",
//            joinColumns = @JoinColumn(name = "ibuseroid", referencedColumnName = "ibuseroid") ,
//            inverseJoinColumns = @JoinColumn(name = "roleoid", referencedColumnName = "roleoid")
//    )
//    private Collection<RoleEntity> roles;
//    private String role;

    @Override
    public String toString() {
        return new GsonBuilder().excludeFieldsWithoutExposeAnnotation().setPrettyPrinting().create().toJson(this);
    }
}
