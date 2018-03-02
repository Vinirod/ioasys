package vinrod.br.com.rodrigues.iosys.models;

import com.google.gson.annotations.SerializedName;

/**
 * Created by rodri on 01/03/2018.
 */

public class UserAutenticationModel {
    @SerializedName("email")
    private String email;

    @SerializedName("password")
    private String password;

    public UserAutenticationModel(String email, String password){
        this.email = email;
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
