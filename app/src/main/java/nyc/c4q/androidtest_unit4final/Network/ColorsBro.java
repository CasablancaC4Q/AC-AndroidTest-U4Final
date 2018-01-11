package nyc.c4q.androidtest_unit4final.Network;

import java.util.HashMap;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by c4q on 1/10/18.
 */

public interface ColorsBro {

    @GET("css-color-names.json")
    Call<HashMap<String ,String >> getColors();
}
