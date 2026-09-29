package p000;

import android.text.TextUtils;
import android.util.Log;
import java.util.HashMap;
import org.json.JSONObject;

/* JADX INFO: renamed from: cc */
/* JADX INFO: loaded from: classes.dex */
public final class C0842cc {

    /* JADX INFO: renamed from: c */
    public static final C0842cc f9868c;

    /* JADX INFO: renamed from: d */
    public static final C0842cc f9869d;

    /* JADX INFO: renamed from: e */
    public static final C0842cc f9870e;

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f9871a;

    /* JADX INFO: renamed from: b */
    public String f9872b;

    static {
        int i = 0;
        f9868c = new C0842cc("TINK", i);
        f9869d = new C0842cc("CRUNCHY", i);
        f9870e = new C0842cc("NO_PREFIX", i);
    }

    public C0842cc(String str, nj0 nj0Var) {
        this.f9871a = 1;
        this.f9872b = str;
    }

    /* JADX INFO: renamed from: a */
    public static void m4496a(C3309ls c3309ls, s29 s29Var) {
        String str = s29Var.f60210a;
        if (str != null) {
            c3309ls.m16485C("X-CRASHLYTICS-GOOGLE-APP-ID", str);
        }
        c3309ls.m16485C("X-CRASHLYTICS-API-CLIENT-TYPE", "android");
        c3309ls.m16485C("X-CRASHLYTICS-API-CLIENT-VERSION", "20.0.6");
        c3309ls.m16485C("Accept", "application/json");
        c3309ls.m16485C("X-CRASHLYTICS-DEVICE-MODEL", s29Var.f60211b);
        String str2 = s29Var.f60212c;
        if (str2 != null) {
            c3309ls.m16485C("X-CRASHLYTICS-OS-BUILD-VERSION", str2);
        }
        String str3 = s29Var.f60213d;
        if (str3 != null) {
            c3309ls.m16485C("X-CRASHLYTICS-OS-DISPLAY-VERSION", str3);
        }
        String str4 = s29Var.f60214e.m10757c().f58591a;
        if (str4 != null) {
            c3309ls.m16485C("X-CRASHLYTICS-INSTALLATION-ID", str4);
        }
    }

    /* JADX INFO: renamed from: b */
    public static HashMap m4497b(s29 s29Var) {
        HashMap map = new HashMap();
        map.put("build_version", s29Var.f60217h);
        map.put("display_version", s29Var.f60216g);
        map.put("source", Integer.toString(s29Var.f60218i));
        String str = s29Var.f60215f;
        if (!TextUtils.isEmpty(str)) {
            map.put("instance", str);
        }
        return map;
    }

    /* JADX INFO: renamed from: c */
    public JSONObject m4498c(C3126ix c3126ix) {
        String str = this.f9872b;
        int i = c3126ix.f44720b;
        iy5 iy5Var = iy5.f44770f;
        iy5Var.m14207r("Settings response code was: " + i);
        if (i != 200 && i != 201 && i != 202 && i != 203) {
            String strM12431h = g9a.m12431h("Settings request failed; (status: ", i, ") from ", str);
            if (iy5Var.m14204d(6)) {
                Log.e("FirebaseCrashlytics", strM12431h, null);
            }
            return null;
        }
        String str2 = (String) c3126ix.f44721c;
        try {
            return new JSONObject(str2);
        } catch (Exception e) {
            iy5Var.m14208s("Failed to parse settings JSON from ".concat(str), e);
            iy5Var.m14208s("Settings response " + str2, null);
            return null;
        }
    }

    public String toString() {
        switch (this.f9871a) {
            case 0:
                return this.f9872b;
            case 5:
                return ux5.m22992o(new StringBuilder("<"), this.f9872b, '>');
            default:
                return super.toString();
        }
    }

    public /* synthetic */ C0842cc(String str, int i) {
        this.f9871a = i;
        this.f9872b = str;
    }
}
