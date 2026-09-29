package p290o6;

import android.content.Context;
import android.content.SharedPreferences;
import android.support.v4.media.AbstractC0140a;
import com.clevertap.android.sdk.C2181a;
import com.clevertap.android.sdk.CleverTapInstanceConfig;
import com.clevertap.android.sdk.validation.Validator;

/* JADX INFO: renamed from: o6.p0 */
/* JADX INFO: loaded from: classes.dex */
public final class C7975p0 extends AbstractC0140a {

    /* JADX INFO: renamed from: a */
    public long f43396a = 0;

    /* JADX INFO: renamed from: b */
    public final C7986y f43397b;

    /* JADX INFO: renamed from: c */
    public final CleverTapInstanceConfig f43398c;

    /* JADX INFO: renamed from: d */
    public final C7963j0 f43399d;

    /* JADX INFO: renamed from: e */
    public final Validator f43400e;

    public C7975p0(CleverTapInstanceConfig cleverTapInstanceConfig, C7986y c7986y, Validator validator, C7963j0 c7963j0) {
        this.f43398c = cleverTapInstanceConfig;
        this.f43397b = c7986y;
        this.f43400e = validator;
        this.f43399d = c7963j0;
    }

    /* JADX WARN: Unreachable blocks removed: 3, instructions: 3 */
    /* JADX INFO: renamed from: k0 */
    public final void m15821k0() {
        C7986y c7986y = this.f43397b;
        c7986y.f43462d = 0;
        synchronized (c7986y.f43461c) {
            c7986y.f43460b = false;
        }
        C7986y c7986y2 = this.f43397b;
        if (c7986y2.f43465g) {
            c7986y2.f43465g = false;
        }
        C2181a c2181aM6433b = this.f43398c.m6433b();
        String str = this.f43398c.f10995a;
        c2181aM6433b.getClass();
        C2181a.m6460m(str, "Session destroyed; Session ID is now 0");
        C7986y c7986y3 = this.f43397b;
        synchronized (c7986y3) {
            c7986y3.f43455M = null;
        }
        C7986y c7986y4 = this.f43397b;
        synchronized (c7986y4) {
            c7986y4.f43456N = null;
        }
        C7986y c7986y5 = this.f43397b;
        synchronized (c7986y5) {
            try {
                c7986y5.f43457O = null;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        C7986y c7986y6 = this.f43397b;
        synchronized (c7986y6) {
            c7986y6.f43458P = null;
        }
    }

    /* JADX INFO: renamed from: l0 */
    public final void m15822l0(Context context) {
        C7986y c7986y = this.f43397b;
        if (!(c7986y.f43462d > 0)) {
            c7986y.f43464f = true;
            Validator validator = this.f43400e;
            if (validator != null) {
                validator.f11365a = null;
            }
            c7986y.f43462d = (int) (System.currentTimeMillis() / 1000);
            CleverTapInstanceConfig cleverTapInstanceConfig = this.f43398c;
            C2181a c2181aM6433b = cleverTapInstanceConfig.m6433b();
            String str = "Session created with ID: " + c7986y.f43462d;
            c2181aM6433b.getClass();
            String str2 = cleverTapInstanceConfig.f10995a;
            C2181a.m6460m(str2, str);
            SharedPreferences sharedPreferencesM15827e = C7977q0.m15827e(context, null);
            int iM15825c = C7977q0.m15825c(context, cleverTapInstanceConfig, "lastSessionId");
            int iM15825c2 = C7977q0.m15825c(context, cleverTapInstanceConfig, "sexe");
            if (iM15825c2 > 0) {
                c7986y.f43450H = iM15825c2 - iM15825c;
            }
            C2181a c2181aM6433b2 = cleverTapInstanceConfig.m6433b();
            String str3 = "Last session length: " + c7986y.f43450H + " seconds";
            c2181aM6433b2.getClass();
            C2181a.m6460m(str2, str3);
            if (iM15825c == 0) {
                c7986y.f43465g = true;
            }
            C7977q0.m15830h(sharedPreferencesM15827e.edit().putInt(C7977q0.m15833k(cleverTapInstanceConfig, "lastSessionId"), c7986y.f43462d));
        }
    }
}
