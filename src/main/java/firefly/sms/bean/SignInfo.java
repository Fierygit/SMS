package firefly.sms.bean;


import java.util.*;

/**
 * @author Firefly
 * @version 1.0
 * @date 2020/6/3 23:16
 */


public class SignInfo {

    String id;
    Date date;
    String name;
    String location;
    String healthInfo;

    public SignInfo() {
    }

    public SignInfo(SignInfoDto signInfo) {
        this.id = signInfo.getId();
        this.healthInfo = signInfo.getHealthInfo();
        this.location = signInfo.getLocation();
        this.name = signInfo.getName();
    }

    public SignInfo(String id, Date date, String name, String location, String healthInfo) {
        this.id = id;
        this.date = date;
        this.name = name;
        this.location = location;
        this.healthInfo = healthInfo;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getHealthInfo() {
        return healthInfo;
    }

    public void setHealthInfo(String healthInfo) {
        this.healthInfo = healthInfo;
    }

    @Override
    public String toString() {
        return "SignInfo{" +
                "id='" + id + '\'' +
                ", date=" + date +
                ", name='" + name + '\'' +
                ", location='" + location + '\'' +
                ", healthInfo='" + healthInfo + '\'' +
                '}';
    }
}
