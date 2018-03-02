package vinrod.br.com.rodrigues.iosys.Interface;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.POST;
import retrofit2.http.Query;
import vinrod.br.com.rodrigues.iosys.Helpers.ListEnterprise;
import vinrod.br.com.rodrigues.iosys.models.UserAutenticationModel;

/**
 * Created by rodri on 01/03/2018.
 */

public interface IService {

    @POST("users/auth/sign_in")
    Call<UserAutenticationModel> authenticate(@Body UserAutenticationModel userAutenticationModel);

    @GET("enterprises")
    Call<ListEnterprise> listEnterprises(
            @Header("access-token") String access_token,
            @Header("client") String client,
            @Header("uid") String uid,
            @Query("name") String enterprise);
}
