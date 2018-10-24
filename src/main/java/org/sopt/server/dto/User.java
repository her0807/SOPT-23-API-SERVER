package org.sopt.server.dto;

import lombok.Data;

import java.io.Serializable;

/**
 * Created by ds on 2018-10-20.
 */

@Data
public class User implements Serializable {

    private static final long serialVersionUID = -1609275235115313627L;

    private int u_id;
    private String u_name;
    private String u_part;
    private String u_profile;
    private String u_email;
}
