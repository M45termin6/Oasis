package org.oasis.cart.entity;

import javax.persistence.*;

@Entity
@Table(name = "cart_config")
public class CartConfigEntity extends  BaseEntity{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "config_key" , nullable = false)
    private String configKey;

    @Column(name = "config_value" , nullable = false)
    private String configValue;

    @Column(name = "is_active")
    private  Boolean isActive;

    public String getConfigKey() {
        return configKey;
    }

    public void setConfigKey(String configKey) {
        this.configKey = configKey;
    }

    public String getConfigValue() {
        return configValue;
    }

    public void setConfigValue(String configValue) {
        this.configValue = configValue;
    }

    public Boolean getActive() {
        return isActive;
    }

    public void setActive(Boolean active) {
        isActive = active;
    }


}
