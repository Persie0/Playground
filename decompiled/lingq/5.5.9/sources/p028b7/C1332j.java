package p028b7;

import android.content.Context;
import android.content.SharedPreferences;
import android.support.v4.media.AbstractC0140a;
import com.clevertap.android.sdk.C2181a;
import com.clevertap.android.sdk.CleverTapInstanceConfig;
import org.json.JSONObject;
import p290o6.C7951d0;
import p290o6.C7977q0;
import p475x6.C10101a;

/* JADX INFO: renamed from: b7.j */
/* JADX INFO: loaded from: classes.dex */
public final class C1332j extends AbstractC1324b {

    /* JADX INFO: renamed from: b */
    public final AbstractC0140a f8113b;

    /* JADX INFO: renamed from: c */
    public final CleverTapInstanceConfig f8114c;

    /* JADX INFO: renamed from: d */
    public final C7951d0 f8115d;

    /* JADX INFO: renamed from: e */
    public final C2181a f8116e;

    /* JADX INFO: renamed from: f */
    public final C10101a f8117f;

    public C1332j(C1323a c1323a, CleverTapInstanceConfig cleverTapInstanceConfig, C7951d0 c7951d0, C10101a c10101a) {
        this.f8113b = c1323a;
        this.f8114c = cleverTapInstanceConfig;
        this.f8116e = cleverTapInstanceConfig.m6433b();
        this.f8115d = c7951d0;
        this.f8117f = c10101a;
    }

    @Override // android.support.v4.media.AbstractC0140a
    /* JADX INFO: renamed from: b0 */
    public final void mo591b0(JSONObject jSONObject, String str, Context context) {
        C10101a c10101a = this.f8117f;
        CleverTapInstanceConfig cleverTapInstanceConfig = this.f8114c;
        C2181a c2181a = this.f8116e;
        try {
            if (jSONObject.has("g")) {
                String string = jSONObject.getString("g");
                this.f8115d.m15760c(string);
                c2181a.getClass();
                C2181a.m6460m(cleverTapInstanceConfig.f10995a, "Got a new device ID: " + string);
            }
        } catch (Throwable th2) {
            String str2 = cleverTapInstanceConfig.f10995a;
            c2181a.getClass();
            C2181a.m6461n(str2, "Failed to update device ID!", th2);
        }
        try {
            if (jSONObject.has("_i")) {
                long j10 = jSONObject.getLong("_i");
                c10101a.getClass();
                SharedPreferences.Editor editorEdit = C7977q0.m15827e(context, "IJ").edit();
                editorEdit.putLong(C7977q0.m15833k(c10101a.f51229c, "comms_i"), j10);
                C7977q0.m15830h(editorEdit);
            }
        } catch (Throwable unused) {
        }
        try {
            if (jSONObject.has("_j")) {
                long j11 = jSONObject.getLong("_j");
                c10101a.getClass();
                SharedPreferences.Editor editorEdit2 = C7977q0.m15827e(context, "IJ").edit();
                editorEdit2.putLong(C7977q0.m15833k(c10101a.f51229c, "comms_j"), j11);
                C7977q0.m15830h(editorEdit2);
            }
        } catch (Throwable unused2) {
        }
        this.f8113b.mo591b0(jSONObject, str, context);
    }
}
