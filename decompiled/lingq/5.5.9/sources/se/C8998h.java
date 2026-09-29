package se;

import org.json.JSONException;
import org.json.JSONObject;
import p241le.C7341l;

/* JADX INFO: renamed from: se.h */
/* JADX INFO: loaded from: classes.dex */
public final class C8998h implements InterfaceC8995e {
    @Override // se.InterfaceC8995e
    /* JADX INFO: renamed from: a */
    public final C8992b mo17234a(C7341l c7341l, JSONObject jSONObject) throws JSONException {
        long jCurrentTimeMillis;
        jSONObject.optInt("settings_version", 0);
        int iOptInt = jSONObject.optInt("cache_duration", 3600);
        double dOptDouble = jSONObject.optDouble("on_demand_upload_rate_per_minute", 10.0d);
        double dOptDouble2 = jSONObject.optDouble("on_demand_backoff_base", 1.2d);
        int iOptInt2 = jSONObject.optInt("on_demand_backoff_step_duration_seconds", 60);
        C8992b.b bVar = jSONObject.has("session") ? new C8992b.b(jSONObject.getJSONObject("session").optInt("max_custom_exception_events", 8)) : new C8992b.b(new JSONObject().optInt("max_custom_exception_events", 8));
        JSONObject jSONObject2 = jSONObject.getJSONObject("features");
        C8992b.a aVar = new C8992b.a(jSONObject2.optBoolean("collect_reports", true), jSONObject2.optBoolean("collect_anrs", false), jSONObject2.optBoolean("collect_build_ids", false));
        long j10 = iOptInt;
        if (jSONObject.has("expires_at")) {
            jCurrentTimeMillis = jSONObject.optLong("expires_at");
        } else {
            c7341l.getClass();
            jCurrentTimeMillis = (j10 * 1000) + System.currentTimeMillis();
        }
        return new C8992b(jCurrentTimeMillis, bVar, aVar, dOptDouble, dOptDouble2, iOptInt2);
    }
}
