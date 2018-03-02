package vinrod.br.com.rodrigues.iosys.Service;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import vinrod.br.com.rodrigues.iosys.Interface.IService;

/**
 * Created by rodri on 01/03/2018.
 */

public class Service {

    public static String STRING_BASE_URL = "http://54.94.179.135:8090/api/v1/";

    public static IService serviceConnectionRetrofit(){
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(STRING_BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        return retrofit.create(IService.class);
    }
}
