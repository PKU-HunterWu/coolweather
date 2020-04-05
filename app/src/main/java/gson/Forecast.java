package gson;

import com.google.gson.annotations.SerializedName;

public class Forecast {

    public String date;

    @SerializedName("tmp")
    public Temperture temperture;

    @SerializedName("cond")
    public More more;

    public class Temperture{
        public String max;
        public String min;
    }

    public class More{

        @SerializedName("txt_d")
        public String info;

    }

}
