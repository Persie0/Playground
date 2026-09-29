package p028b7;

import android.content.Context;
import android.support.v4.media.AbstractC0140a;
import com.clevertap.android.sdk.C2181a;
import com.clevertap.android.sdk.CleverTapAPI;
import com.clevertap.android.sdk.CleverTapInstanceConfig;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: b7.d */
/* JADX INFO: loaded from: classes.dex */
public final class C1326d extends AbstractC1324b {

    /* JADX INFO: renamed from: b */
    public final AbstractC0140a f8083b;

    /* JADX INFO: renamed from: c */
    public final CleverTapInstanceConfig f8084c;

    /* JADX INFO: renamed from: d */
    public final C2181a f8085d;

    public C1326d(C1331i c1331i, CleverTapInstanceConfig cleverTapInstanceConfig) {
        this.f8083b = c1331i;
        this.f8084c = cleverTapInstanceConfig;
        this.f8085d = cleverTapInstanceConfig.m6433b();
    }

    @Override // android.support.v4.media.AbstractC0140a
    /* JADX INFO: renamed from: b0 */
    public final void mo591b0(JSONObject jSONObject, String str, Context context) {
        int i10;
        CleverTapInstanceConfig cleverTapInstanceConfig = this.f8084c;
        C2181a c2181a = this.f8085d;
        try {
            if (jSONObject.has("console")) {
                JSONArray jSONArray = (JSONArray) jSONObject.get("console");
                if (jSONArray.length() > 0) {
                    for (int i11 = 0; i11 < jSONArray.length(); i11++) {
                        String str2 = cleverTapInstanceConfig.f10995a;
                        String string = jSONArray.get(i11).toString();
                        c2181a.getClass();
                        C2181a.m6452d(str2, string);
                    }
                }
            }
        } catch (Throwable unused) {
        }
        try {
            if (jSONObject.has("dbg_lvl") && (i10 = jSONObject.getInt("dbg_lvl")) >= 0) {
                CleverTapAPI.f10977c = i10;
                c2181a.getClass();
                C2181a.m6460m(cleverTapInstanceConfig.f10995a, "Set debug level to " + i10 + " for this session (set by upstream)");
            }
        } catch (Throwable unused2) {
        }
        this.f8083b.mo591b0(jSONObject, str, context);
    }
}
