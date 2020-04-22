package com.example.demo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ExcelDataVO {

    /**
     * 业务id
     */
    private Integer id;

    /**
     * 业务名称
     */
    private String name;

    /**
     * ipv6子网
     */
    private Integer v6_id;

    /**
     * ipv6子网
     */
    private String v6_website;

    /**
     * ipv4子网
     */
    private Integer v4_id;

    /**
     * ipv4子网
     */
    private String v4_website;

    /**
     * vlan
     */
    private Integer vlan;

}
