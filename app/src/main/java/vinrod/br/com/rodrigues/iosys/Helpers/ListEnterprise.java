package vinrod.br.com.rodrigues.iosys.Helpers;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.ArrayList;

import vinrod.br.com.rodrigues.iosys.models.EnterpriseModel;

/**
 * Created by rodri on 01/03/2018.
 */

public class ListEnterprise implements Serializable {

    @SerializedName("enterprises")
    private ArrayList<EnterpriseModel> listEnterprise;

    public ArrayList<EnterpriseModel> getListEnterprise() {
        return listEnterprise;
    }

    public void setListEnterprise(ArrayList<EnterpriseModel> listEnterprise) {
        this.listEnterprise = listEnterprise;
    }

}
