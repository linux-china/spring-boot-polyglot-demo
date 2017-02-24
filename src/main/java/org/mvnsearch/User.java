package org.mvnsearch;

import java.io.Serializable;

/**
 * user class
 *
 * @author linux_china
 */
public class User implements Serializable {
    private Integer id;
    private String nick;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNick() {
        return nick;
    }

    public void setNick(String nick) {
        this.nick = nick;
    }
}
