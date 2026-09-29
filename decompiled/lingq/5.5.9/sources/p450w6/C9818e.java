package p450w6;

import ae.C0062b;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import com.clevertap.android.sdk.C2181a;
import com.clevertap.android.sdk.CleverTapInstanceConfig;
import com.kochava.tracker.BuildConfig;
import java.util.Iterator;
import org.json.JSONObject;
import p003a2.C0009a;
import p290o6.C7951d0;
import p290o6.C7977q0;
import p338qd.C8586v1;
import p338qd.InterfaceC8589w1;
import td.C9270r;
import td.InterfaceC9268p;
import td.InterfaceC9271s;

/* JADX INFO: renamed from: w6.e */
/* JADX INFO: loaded from: classes.dex */
public final class C9818e implements InterfaceC9271s {

    /* JADX INFO: renamed from: a */
    public final Object f49981a;

    /* JADX INFO: renamed from: b */
    public final Object f49982b;

    /* JADX INFO: renamed from: c */
    public final Object f49983c;

    public C9818e(Context context, CleverTapInstanceConfig cleverTapInstanceConfig, C7951d0 c7951d0) {
        this.f49982b = context;
        this.f49981a = cleverTapInstanceConfig;
        this.f49983c = c7951d0;
    }

    public C9818e(C8586v1 c8586v1, InterfaceC9271s interfaceC9271s, InterfaceC9271s interfaceC9271s2) {
        this.f49981a = c8586v1;
        this.f49982b = interfaceC9271s;
        this.f49983c = interfaceC9271s2;
    }

    /* JADX INFO: renamed from: a */
    public final void m18296a(String str, String str2, String str3) {
        if (!m18300e() && str != null && str2 != null) {
            if (str3 == null) {
                return;
            }
            String strM21i = C0009a.m21i(str2, "_", str3);
            JSONObject jSONObjectM18297b = m18297b();
            try {
                jSONObjectM18297b.put(strM21i, str);
                m18303h(jSONObjectM18297b);
            } catch (Throwable th2) {
                CleverTapInstanceConfig cleverTapInstanceConfig = (CleverTapInstanceConfig) this.f49981a;
                C2181a c2181aM6433b = cleverTapInstanceConfig.m6433b();
                String str4 = cleverTapInstanceConfig.f10995a;
                String str5 = "Error caching guid: " + th2.toString();
                c2181aM6433b.getClass();
                C2181a.m6460m(str4, str5);
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public final JSONObject m18297b() {
        Context context = (Context) this.f49982b;
        CleverTapInstanceConfig cleverTapInstanceConfig = (CleverTapInstanceConfig) this.f49981a;
        JSONObject jSONObject = null;
        String strM15829g = C7977q0.m15829g(context, cleverTapInstanceConfig, "cachedGUIDsKey", null);
        cleverTapInstanceConfig.m6434c("ON_USER_LOGIN", "getCachedGUIDs:[" + strM15829g + "]");
        C2181a c2181aM6433b = cleverTapInstanceConfig.m6433b();
        String str = cleverTapInstanceConfig.f10995a;
        if (strM15829g != null) {
            try {
                jSONObject = new JSONObject(strM15829g);
            } catch (Throwable th2) {
                String str2 = "Error reading guid cache: " + th2.toString();
                c2181aM6433b.getClass();
                C2181a.m6460m(str, str2);
            }
        }
        return jSONObject != null ? jSONObject : new JSONObject();
    }

    /* JADX INFO: renamed from: c */
    public final String m18298c() {
        Context context = (Context) this.f49982b;
        Object obj = this.f49981a;
        String strM15829g = C7977q0.m15829g(context, (CleverTapInstanceConfig) obj, "SP_KEY_PROFILE_IDENTITIES", "");
        ((CleverTapInstanceConfig) obj).m6434c("ON_USER_LOGIN", "getCachedIdentityKeysForAccount:" + strM15829g);
        return strM15829g;
    }

    /* JADX INFO: renamed from: d */
    public final String m18299d(String str, String str2) {
        Object obj = this.f49981a;
        if (str != null) {
            try {
                String string = m18297b().getString(C0009a.m21i(str, "_", str2));
                ((CleverTapInstanceConfig) obj).m6434c("ON_USER_LOGIN", "getGUIDForIdentifier:[Key:" + str + ", value:" + string + "]");
                return string;
            } catch (Throwable th2) {
                CleverTapInstanceConfig cleverTapInstanceConfig = (CleverTapInstanceConfig) obj;
                C2181a c2181aM6433b = cleverTapInstanceConfig.m6433b();
                String str3 = cleverTapInstanceConfig.f10995a;
                String str4 = "Error reading guid cache: " + th2.toString();
                c2181aM6433b.getClass();
                C2181a.m6460m(str3, str4);
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: e */
    public final boolean m18300e() {
        boolean zM15767l = ((C7951d0) this.f49983c).m15767l();
        ((CleverTapInstanceConfig) this.f49981a).m6434c("ON_USER_LOGIN", "isErrorDeviceId:[" + zM15767l + "]");
        return zM15767l;
    }

    /* JADX INFO: renamed from: f */
    public final void m18301f() {
        Object obj = this.f49981a;
        try {
            C7977q0.m15830h(C7977q0.m15827e((Context) this.f49982b, null).edit().remove(C7977q0.m15833k((CleverTapInstanceConfig) obj, "cachedGUIDsKey")));
            ((CleverTapInstanceConfig) obj).m6434c("ON_USER_LOGIN", "removeCachedGUIDs:[]");
        } catch (Throwable th2) {
            CleverTapInstanceConfig cleverTapInstanceConfig = (CleverTapInstanceConfig) obj;
            C2181a c2181aM6433b = cleverTapInstanceConfig.m6433b();
            String str = cleverTapInstanceConfig.f10995a;
            String str2 = "Error removing guid cache: " + th2.toString();
            c2181aM6433b.getClass();
            C2181a.m6460m(str, str2);
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m18302g(String str, String str2) {
        if (!m18300e() && str != null) {
            if (str2 == null) {
                return;
            }
            JSONObject jSONObjectM18297b = m18297b();
            try {
                Iterator<String> itKeys = jSONObjectM18297b.keys();
                loop0: while (true) {
                    while (itKeys.hasNext()) {
                        String next = itKeys.next();
                        if (next.toLowerCase().contains(str2.toLowerCase()) && jSONObjectM18297b.getString(next).equals(str)) {
                            jSONObjectM18297b.remove(next);
                            if (jSONObjectM18297b.length() == 0) {
                                m18301f();
                            } else {
                                m18303h(jSONObjectM18297b);
                            }
                        }
                    }
                    break loop0;
                }
            } catch (Throwable th2) {
                CleverTapInstanceConfig cleverTapInstanceConfig = (CleverTapInstanceConfig) this.f49981a;
                C2181a c2181aM6433b = cleverTapInstanceConfig.m6433b();
                String str3 = cleverTapInstanceConfig.f10995a;
                String str4 = "Error removing cached key: " + th2.toString();
                c2181aM6433b.getClass();
                C2181a.m6460m(str3, str4);
            }
        }
    }

    /* JADX INFO: renamed from: h */
    public final void m18303h(JSONObject jSONObject) {
        Object obj = this.f49981a;
        try {
            String string = jSONObject.toString();
            C7977q0.m15832j((Context) this.f49982b, C7977q0.m15833k((CleverTapInstanceConfig) obj, "cachedGUIDsKey"), string);
            ((CleverTapInstanceConfig) obj).m6434c("ON_USER_LOGIN", "setCachedGUIDs:[" + string + "]");
        } catch (Throwable th2) {
            CleverTapInstanceConfig cleverTapInstanceConfig = (CleverTapInstanceConfig) obj;
            C2181a c2181aM6433b = cleverTapInstanceConfig.m6433b();
            String str = cleverTapInstanceConfig.f10995a;
            String str2 = "Error persisting guid cache: " + th2.toString();
            c2181aM6433b.getClass();
            C2181a.m6460m(str, str2);
        }
    }

    @Override // td.InterfaceC9271s
    public final Object zza() {
        Context contextM16807a = ((C8586v1) ((InterfaceC9271s) this.f49981a)).m16807a();
        InterfaceC9268p interfaceC9268pM17630a = C9270r.m17630a((InterfaceC9271s) this.f49982b);
        InterfaceC9268p interfaceC9268pM17630a2 = C9270r.m17630a((InterfaceC9271s) this.f49983c);
        String string = null;
        try {
            Bundle bundle = contextM16807a.getPackageManager().getApplicationInfo(contextM16807a.getPackageName(), BuildConfig.SDK_TRUNCATE_LENGTH).metaData;
            if (bundle != null) {
                string = bundle.getString("local_testing_dir");
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        InterfaceC8589w1 interfaceC8589w1 = string == null ? (InterfaceC8589w1) interfaceC9268pM17630a.zza() : (InterfaceC8589w1) interfaceC9268pM17630a2.zza();
        C0062b.m271G2(interfaceC8589w1);
        return interfaceC8589w1;
    }
}
