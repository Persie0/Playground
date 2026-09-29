package p000;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class sg1 {

    /* JADX INFO: renamed from: h */
    public static final Date f60804h = new Date(0);

    /* JADX INFO: renamed from: a */
    public final JSONObject f60805a;

    /* JADX INFO: renamed from: b */
    public final JSONObject f60806b;

    /* JADX INFO: renamed from: c */
    public final Date f60807c;

    /* JADX INFO: renamed from: d */
    public final JSONArray f60808d;

    /* JADX INFO: renamed from: e */
    public final JSONObject f60809e;

    /* JADX INFO: renamed from: f */
    public final long f60810f;

    /* JADX INFO: renamed from: g */
    public final JSONArray f60811g;

    public sg1(JSONObject jSONObject, Date date, JSONArray jSONArray, JSONObject jSONObject2, long j, JSONArray jSONArray2) throws JSONException {
        JSONObject jSONObject3 = new JSONObject();
        jSONObject3.put("configs_key", jSONObject);
        jSONObject3.put("fetch_time_key", date.getTime());
        jSONObject3.put("abt_experiments_key", jSONArray);
        jSONObject3.put("personalization_metadata_key", jSONObject2);
        jSONObject3.put("template_version_number_key", j);
        jSONObject3.put("rollout_metadata_key", jSONArray2);
        this.f60806b = jSONObject;
        this.f60807c = date;
        this.f60808d = jSONArray;
        this.f60809e = jSONObject2;
        this.f60810f = j;
        this.f60811g = jSONArray2;
        this.f60805a = jSONObject3;
    }

    /* JADX INFO: renamed from: a */
    public static sg1 m21345a(JSONObject jSONObject) throws JSONException {
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("personalization_metadata_key");
        if (jSONObjectOptJSONObject == null) {
            jSONObjectOptJSONObject = new JSONObject();
        }
        JSONObject jSONObject2 = jSONObjectOptJSONObject;
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("rollout_metadata_key");
        if (jSONArrayOptJSONArray == null) {
            jSONArrayOptJSONArray = new JSONArray();
        }
        return new sg1(jSONObject.getJSONObject("configs_key"), new Date(jSONObject.getLong("fetch_time_key")), jSONObject.getJSONArray("abt_experiments_key"), jSONObject2, jSONObject.optLong("template_version_number_key"), jSONArrayOptJSONArray);
    }

    /* JADX INFO: renamed from: d */
    public static rg1 m21346d() {
        rg1 rg1Var = new rg1();
        rg1Var.f59229b = new JSONObject();
        rg1Var.f59231d = f60804h;
        rg1Var.f59232e = new JSONArray();
        rg1Var.f59230c = new JSONObject();
        rg1Var.f59228a = 0L;
        rg1Var.f59233f = new JSONArray();
        return rg1Var;
    }

    /* JADX INFO: renamed from: b */
    public final HashMap m21347b() throws JSONException {
        HashMap map = new HashMap();
        int i = 0;
        while (true) {
            JSONArray jSONArray = this.f60808d;
            if (i >= jSONArray.length()) {
                return map;
            }
            JSONObject jSONObject = jSONArray.getJSONObject(i);
            if (jSONObject.has("affectedParameterKeys") && !jSONObject.getString("experimentId").startsWith("rollout")) {
                JSONArray jSONArray2 = jSONObject.getJSONArray("affectedParameterKeys");
                for (int i2 = 0; i2 < jSONArray2.length(); i2++) {
                    map.put(jSONArray2.getString(i2), jSONObject);
                }
            }
            i++;
        }
    }

    /* JADX INFO: renamed from: c */
    public final HashMap m21348c() throws JSONException {
        HashMap map = new HashMap();
        int i = 0;
        while (true) {
            JSONArray jSONArray = this.f60811g;
            if (i >= jSONArray.length()) {
                return map;
            }
            JSONObject jSONObject = jSONArray.getJSONObject(i);
            String string = jSONObject.getString("rolloutId");
            String string2 = jSONObject.getString("variantId");
            JSONArray jSONArray2 = jSONObject.getJSONArray("affectedParameterKeys");
            for (int i2 = 0; i2 < jSONArray2.length(); i2++) {
                String string3 = jSONArray2.getString(i2);
                if (!map.containsKey(string3)) {
                    map.put(string3, new HashMap());
                }
                Map map2 = (Map) map.get(string3);
                if (map2 != null) {
                    map2.put(string, string2);
                }
            }
            i++;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof sg1) {
            return this.f60805a.toString().equals(((sg1) obj).f60805a.toString());
        }
        return false;
    }

    public final int hashCode() {
        return this.f60805a.hashCode();
    }

    public final String toString() {
        return this.f60805a.toString();
    }
}
