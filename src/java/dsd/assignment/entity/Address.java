/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dsd.assignment.entity;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Zinto
 */
@Entity
@Table(name = "ADDRESS")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Address.findAll", query = "SELECT a FROM Address a")
    , @NamedQuery(name = "Address.findByAddressid", query = "SELECT a FROM Address a WHERE a.addressid = :addressid")
    , @NamedQuery(name = "Address.findByRcode", query = "SELECT a FROM Address a WHERE a.rcode = :rcode")
    , @NamedQuery(name = "Address.findByIssame", query = "SELECT a FROM Address a WHERE a.issame = :issame")
    , @NamedQuery(name = "Address.findByPcode", query = "SELECT a FROM Address a WHERE a.pcode = :pcode")})
public class Address implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ADDRESSID")
    private Integer addressid;
    @Lob
    @Column(name = "RESIDENTIAADDRESS")
    private String residentiaaddress;
    @Column(name = "RCODE")
    private Integer rcode;
    @Column(name = "ISSAME")
    private Boolean issame;
    @Lob
    @Column(name = "POSTALADDRESS")
    private String postaladdress;
    @Column(name = "PCODE")
    private Boolean pcode;
    @OneToMany(mappedBy = "addresskey")
    private Collection<Users> usersCollection;

    public Address() {
    }

    public Address(Integer addressid) {
        this.addressid = addressid;
    }

    public Integer getAddressid() {
        return addressid;
    }

    public void setAddressid(Integer addressid) {
        this.addressid = addressid;
    }

    public String getResidentiaaddress() {
        return residentiaaddress;
    }

    public void setResidentiaaddress(String residentiaaddress) {
        this.residentiaaddress = residentiaaddress;
    }

    public Integer getRcode() {
        return rcode;
    }

    public void setRcode(Integer rcode) {
        this.rcode = rcode;
    }

    public Boolean getIssame() {
        return issame;
    }

    public void setIssame(Boolean issame) {
        this.issame = issame;
    }

    public String getPostaladdress() {
        return postaladdress;
    }

    public void setPostaladdress(String postaladdress) {
        this.postaladdress = postaladdress;
    }

    public Boolean getPcode() {
        return pcode;
    }

    public void setPcode(Boolean pcode) {
        this.pcode = pcode;
    }

    @XmlTransient
    public Collection<Users> getUsersCollection() {
        return usersCollection;
    }

    public void setUsersCollection(Collection<Users> usersCollection) {
        this.usersCollection = usersCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (addressid != null ? addressid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Address)) {
            return false;
        }
        Address other = (Address) object;
        if ((this.addressid == null && other.addressid != null) || (this.addressid != null && !this.addressid.equals(other.addressid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "dsd.assignment.entity.Address[ addressid=" + addressid + " ]";
    }
    
}
