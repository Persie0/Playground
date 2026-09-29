package p000;

import com.amplitude.core.utilities.http.HttpStatus;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class m5a extends AbstractC3572sf {

    /* JADX INFO: renamed from: b */
    public final String f50623b;

    public m5a(JSONObject jSONObject) throws JSONException {
        super(HttpStatus.TOO_MANY_REQUESTS);
        this.f50623b = b34.m3251r(jSONObject);
        if (jSONObject.has("exceeded_daily_quota_users")) {
            jSONObject.getJSONObject("exceeded_daily_quota_users").keySet().getClass();
        }
        if (jSONObject.has("exceeded_daily_quota_devices")) {
            jSONObject.getJSONObject("exceeded_daily_quota_devices").keySet().getClass();
        }
        if (jSONObject.has("throttled_events")) {
            JSONArray jSONArray = jSONObject.getJSONArray("throttled_events");
            jSONArray.getClass();
            AbstractC3550rv.m20854v0(b34.m3227X(jSONArray));
        }
        if (jSONObject.has("throttled_users")) {
            jSONObject.getJSONObject("throttled_users").keySet().getClass();
        }
        if (jSONObject.has("throttled_devices")) {
            jSONObject.getJSONObject("throttled_devices").keySet().getClass();
        }
    }

    /* JADX INFO: renamed from: E */
    public final String m16652E() {
        return this.f50623b;
    }
}
