package p394t7;

import com.facebook.appevents.codeless.internal.PathComponent;
import dm.C5207g;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: t7.a */
/* JADX INFO: loaded from: classes.dex */
public final class C9215a {

    /* JADX INFO: renamed from: a */
    public final String f47821a;

    /* JADX INFO: renamed from: b */
    public final String f47822b;

    /* JADX INFO: renamed from: c */
    public final ArrayList f47823c;

    /* JADX INFO: renamed from: d */
    public final String f47824d;

    public C9215a(JSONObject jSONObject) throws JSONException {
        int length;
        String string = jSONObject.getString("name");
        C5207g.m11110e(string, "component.getString(PARAMETER_NAME_KEY)");
        this.f47821a = string;
        String strOptString = jSONObject.optString("value");
        C5207g.m11110e(strOptString, "component.optString(PARAMETER_VALUE_KEY)");
        this.f47822b = strOptString;
        String strOptString2 = jSONObject.optString("path_type", "absolute");
        C5207g.m11110e(strOptString2, "component.optString(Constants.EVENT_MAPPING_PATH_TYPE_KEY, Constants.PATH_TYPE_ABSOLUTE)");
        this.f47824d = strOptString2;
        ArrayList arrayList = new ArrayList();
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("path");
        if (jSONArrayOptJSONArray != null && (length = jSONArrayOptJSONArray.length()) > 0) {
            int i10 = 0;
            while (true) {
                int i11 = i10 + 1;
                JSONObject jSONObject2 = jSONArrayOptJSONArray.getJSONObject(i10);
                C5207g.m11110e(jSONObject2, "jsonPathArray.getJSONObject(i)");
                arrayList.add(new PathComponent(jSONObject2));
                if (i11 >= length) {
                    break;
                } else {
                    i10 = i11;
                }
            }
        }
        this.f47823c = arrayList;
    }
}
