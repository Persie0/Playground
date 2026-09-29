package p000;

import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class l37 {

    /* JADX INFO: renamed from: a */
    public final String f48988a;

    /* JADX INFO: renamed from: b */
    public final String f48989b;

    /* JADX INFO: renamed from: c */
    public final ArrayList f48990c;

    /* JADX INFO: renamed from: d */
    public final String f48991d;

    public l37(JSONObject jSONObject) throws JSONException {
        String string = jSONObject.getString("name");
        string.getClass();
        this.f48988a = string;
        String strOptString = jSONObject.optString("value");
        strOptString.getClass();
        this.f48989b = strOptString;
        String strOptString2 = jSONObject.optString("path_type", "absolute");
        strOptString2.getClass();
        this.f48991d = strOptString2;
        ArrayList arrayList = new ArrayList();
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("path");
        if (jSONArrayOptJSONArray != null) {
            int length = jSONArrayOptJSONArray.length();
            for (int i = 0; i < length; i++) {
                JSONObject jSONObject2 = jSONArrayOptJSONArray.getJSONObject(i);
                jSONObject2.getClass();
                arrayList.add(new g57(jSONObject2));
            }
        }
        this.f48990c = arrayList;
    }

    /* JADX INFO: renamed from: a */
    public final String m15771a() {
        return this.f48988a;
    }

    /* JADX INFO: renamed from: b */
    public final ArrayList m15772b() {
        return this.f48990c;
    }

    /* JADX INFO: renamed from: c */
    public final String m15773c() {
        return this.f48991d;
    }

    /* JADX INFO: renamed from: d */
    public final String m15774d() {
        return this.f48989b;
    }
}
