package p028b7;

import android.content.Context;
import android.support.v4.media.AbstractC0140a;
import com.clevertap.android.sdk.C2181a;
import com.clevertap.android.sdk.CleverTapInstanceConfig;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p290o6.C7985x;
import p381s6.C8967b;

/* JADX INFO: renamed from: b7.f */
/* JADX INFO: loaded from: classes.dex */
public final class C1328f extends AbstractC1324b {

    /* JADX INFO: renamed from: b */
    public final AbstractC0140a f8092b;

    /* JADX INFO: renamed from: c */
    public final CleverTapInstanceConfig f8093c;

    /* JADX INFO: renamed from: d */
    public final C2181a f8094d;

    /* JADX INFO: renamed from: e */
    public final C7985x f8095e;

    public C1328f(C1333k c1333k, CleverTapInstanceConfig cleverTapInstanceConfig, C7985x c7985x) {
        this.f8092b = c1333k;
        this.f8093c = cleverTapInstanceConfig;
        this.f8094d = cleverTapInstanceConfig.m6433b();
        this.f8095e = c7985x;
    }

    @Override // android.support.v4.media.AbstractC0140a
    /* JADX INFO: renamed from: b0 */
    public final void mo591b0(JSONObject jSONObject, String str, Context context) {
        CleverTapInstanceConfig cleverTapInstanceConfig = this.f8093c;
        String str2 = cleverTapInstanceConfig.f10995a;
        this.f8094d.getClass();
        C2181a.m6460m(str2, "Processing Feature Flags response...");
        String str3 = cleverTapInstanceConfig.f10995a;
        boolean z10 = cleverTapInstanceConfig.f10999e;
        AbstractC0140a abstractC0140a = this.f8092b;
        if (z10) {
            C2181a.m6460m(str3, "CleverTap instance is configured to analytics only, not processing Feature Flags response");
            abstractC0140a.mo591b0(jSONObject, str, context);
            return;
        }
        if (jSONObject == null) {
            C2181a.m6460m(str3, "Feature Flag : Can't parse Feature Flags Response, JSON response object is null");
            return;
        }
        if (!jSONObject.has("ff_notifs")) {
            C2181a.m6460m(str3, "Feature Flag : JSON object doesn't contain the Feature Flags key");
            abstractC0140a.mo591b0(jSONObject, str, context);
            return;
        }
        try {
            C2181a.m6460m(str3, "Feature Flag : Processing Feature Flags response");
            m4891l0(jSONObject.getJSONObject("ff_notifs"));
        } catch (Throwable th2) {
            C2181a.m6461n(str3, "Feature Flag : Failed to parse response", th2);
        }
        abstractC0140a.mo591b0(jSONObject, str, context);
    }

    /* JADX INFO: renamed from: l0 */
    public final void m4891l0(JSONObject jSONObject) throws JSONException {
        C8967b c8967b;
        if (jSONObject.getJSONArray("kv") == null || (c8967b = this.f8095e.f43435d) == null) {
            C2181a c2181aM6433b = this.f8093c.m6433b();
            String str = this.f8093c.f10995a;
            c2181aM6433b.getClass();
            C2181a.m6460m(str, "Feature Flag : Can't parse feature flags, CTFeatureFlagsController is null");
            return;
        }
        synchronized (c8967b) {
            try {
                JSONArray jSONArray = jSONObject.getJSONArray("kv");
                for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                    try {
                        JSONObject jSONObject2 = jSONArray.getJSONObject(i10);
                        c8967b.f46981g.put(jSONObject2.getString("n"), Boolean.valueOf(jSONObject2.getBoolean("v")));
                    } catch (JSONException e10) {
                        C2181a c2181aM17193c = c8967b.m17193c();
                        String strM17194d = c8967b.m17194d();
                        String str2 = "Error parsing Feature Flag array " + e10.getLocalizedMessage();
                        c2181aM17193c.getClass();
                        C2181a.m6460m(strM17194d, str2);
                    }
                }
                C2181a c2181aM17193c2 = c8967b.m17193c();
                String strM17194d2 = c8967b.m17194d();
                String str3 = "Updating feature flags..." + c8967b.f46981g;
                c2181aM17193c2.getClass();
                C2181a.m6460m(strM17194d2, str3);
                c8967b.m17191a(jSONObject);
                c8967b.f46979e.mo567C();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
