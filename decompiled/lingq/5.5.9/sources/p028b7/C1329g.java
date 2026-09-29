package p028b7;

import android.content.Context;
import android.support.v4.media.AbstractC0140a;
import com.clevertap.android.sdk.C2181a;
import com.clevertap.android.sdk.CleverTapInstanceConfig;
import org.json.JSONObject;
import p290o6.C7972o;

/* JADX INFO: renamed from: b7.g */
/* JADX INFO: loaded from: classes.dex */
public final class C1329g extends AbstractC1324b {

    /* JADX INFO: renamed from: b */
    public final AbstractC0140a f8096b;

    /* JADX INFO: renamed from: c */
    public final AbstractC0140a f8097c;

    /* JADX INFO: renamed from: d */
    public final CleverTapInstanceConfig f8098d;

    /* JADX INFO: renamed from: e */
    public final C2181a f8099e;

    public C1329g(C1325c c1325c, CleverTapInstanceConfig cleverTapInstanceConfig, C7972o c7972o) {
        this.f8097c = c1325c;
        this.f8098d = cleverTapInstanceConfig;
        this.f8099e = cleverTapInstanceConfig.m6433b();
        this.f8096b = c7972o;
    }

    @Override // android.support.v4.media.AbstractC0140a
    /* JADX INFO: renamed from: b0 */
    public final void mo591b0(JSONObject jSONObject, String str, Context context) {
        CleverTapInstanceConfig cleverTapInstanceConfig = this.f8098d;
        String str2 = cleverTapInstanceConfig.f10995a;
        this.f8099e.getClass();
        C2181a.m6460m(str2, "Processing GeoFences response...");
        String str3 = cleverTapInstanceConfig.f10995a;
        boolean z10 = cleverTapInstanceConfig.f10999e;
        AbstractC0140a abstractC0140a = this.f8097c;
        if (z10) {
            C2181a.m6460m(str3, "CleverTap instance is configured to analytics only, not processing geofence response");
            abstractC0140a.mo591b0(jSONObject, str, context);
            return;
        }
        if (jSONObject == null) {
            C2181a.m6460m(str3, "Geofences : Can't parse Geofences Response, JSON response object is null");
            return;
        }
        if (!jSONObject.has("geofences")) {
            C2181a.m6460m(str3, "Geofences : JSON object doesn't contain the Geofences key");
            abstractC0140a.mo591b0(jSONObject, str, context);
            return;
        }
        try {
            this.f8096b.mo568D();
            C2181a.m6452d(str3, "Geofences : Geofence SDK has not been initialized to handle the response");
        } catch (Throwable th2) {
            C2181a.m6461n(str3, "Geofences : Failed to handle Geofences response", th2);
        }
        abstractC0140a.mo591b0(jSONObject, str, context);
    }
}
