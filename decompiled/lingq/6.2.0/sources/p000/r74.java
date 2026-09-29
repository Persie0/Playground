package p000;

import android.os.Build;
import com.facebook.internal.instrument.InstrumentData$Type;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class r74 {

    /* JADX INFO: renamed from: a */
    public String f58846a;

    /* JADX INFO: renamed from: b */
    public InstrumentData$Type f58847b;

    /* JADX INFO: renamed from: c */
    public JSONArray f58848c;

    /* JADX INFO: renamed from: d */
    public String f58849d;

    /* JADX INFO: renamed from: e */
    public String f58850e;

    /* JADX INFO: renamed from: f */
    public String f58851f;

    /* JADX INFO: renamed from: g */
    public Long f58852g;

    /* JADX INFO: renamed from: a */
    public final void m20430a() {
        thb.m22051j(this.f58846a);
    }

    /* JADX INFO: renamed from: b */
    public final int m20431b(r74 r74Var) {
        r74Var.getClass();
        Long l = this.f58852g;
        if (l == null) {
            return -1;
        }
        long jLongValue = l.longValue();
        Long l2 = r74Var.f58852g;
        if (l2 != null) {
            return fa4.m11652n(l2.longValue(), jLongValue);
        }
        return 1;
    }

    /* JADX INFO: renamed from: c */
    public final boolean m20432c() {
        String str = this.f58851f;
        Long l = this.f58852g;
        InstrumentData$Type instrumentData$Type = this.f58847b;
        int i = instrumentData$Type == null ? -1 : q74.f57349a[instrumentData$Type.ordinal()];
        if (i == 1) {
            return (this.f58848c == null || l == null) ? false : true;
        }
        if (i != 2) {
            return ((i != 3 && i != 4 && i != 5) || str == null || l == null) ? false : true;
        }
        return (str == null || this.f58850e == null || l == null) ? false : true;
    }

    /* JADX INFO: renamed from: d */
    public final void m20433d() {
        if (m20432c()) {
            thb.m22040E(this.f58846a, toString());
        }
    }

    public final String toString() {
        Long l = this.f58852g;
        InstrumentData$Type instrumentData$Type = this.f58847b;
        int i = instrumentData$Type == null ? -1 : q74.f57349a[instrumentData$Type.ordinal()];
        JSONObject jSONObject = null;
        try {
            if (i == 1) {
                JSONObject jSONObject2 = new JSONObject();
                JSONArray jSONArray = this.f58848c;
                if (jSONArray != null) {
                    jSONObject2.put("feature_names", jSONArray);
                }
                if (l != null) {
                    jSONObject2.put("timestamp", l);
                }
                jSONObject = jSONObject2;
            } else if (i == 2 || i == 3 || i == 4 || i == 5) {
                JSONObject jSONObject3 = new JSONObject();
                jSONObject3.put("device_os_version", Build.VERSION.RELEASE);
                jSONObject3.put("device_model", Build.MODEL);
                String str = this.f58849d;
                if (str != null) {
                    jSONObject3.put("app_version", str);
                }
                if (l != null) {
                    jSONObject3.put("timestamp", l);
                }
                String str2 = this.f58850e;
                if (str2 != null) {
                    jSONObject3.put("reason", str2);
                }
                String str3 = this.f58851f;
                if (str3 != null) {
                    jSONObject3.put("callstack", str3);
                }
                if (instrumentData$Type != null) {
                    jSONObject3.put("type", instrumentData$Type);
                }
                jSONObject = jSONObject3;
            }
        } catch (JSONException unused) {
        }
        if (jSONObject == null) {
            String string = new JSONObject().toString();
            string.getClass();
            return string;
        }
        String string2 = jSONObject.toString();
        string2.getClass();
        return string2;
    }
}
