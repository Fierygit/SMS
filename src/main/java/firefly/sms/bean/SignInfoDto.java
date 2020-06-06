package firefly.sms.bean;

/**
 * @author Firefly
 * @version 1.0
 * @date 2020/6/6 15:29
 */


public class SignInfoDto {

    String id;
    String name;
    String location;
    String healthInfo;


    public SignInfoDto() {
    }

    public SignInfoDto(String id, String name, String location, String healthInfo) {
        this.id = id;
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
}

