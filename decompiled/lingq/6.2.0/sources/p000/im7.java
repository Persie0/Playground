package p000;

import android.content.Context;
import android.content.SharedPreferences;
import com.kochava.tracker.BuildConfig;

/* JADX INFO: loaded from: classes.dex */
public abstract class im7 {

    /* JADX INFO: renamed from: a */
    public static final sq5 f44292a;

    static {
        sj5 sj5VarM20396w = r46.m20396w();
        f44292a = ux5.m22983f(sj5VarM20396w, sj5VarM20396w, BuildConfig.SDK_MODULE_NAME, "ProfileMigration");
    }

    /* JADX INFO: renamed from: a */
    public static void m14016a(hm7 hm7Var, em7 em7Var, am7 am7Var, sl7 sl7Var) {
        String str = hm7Var.f42615a;
        synchronized (em7Var) {
            em7Var.f37466g = str;
            ((cj9) em7Var.f60774a).m4783k("main.device_id", str);
        }
        String str2 = hm7Var.f42615a;
        synchronized (em7Var) {
            ((cj9) em7Var.f60774a).m4783k("main.device_id_original", str2);
        }
        long j = hm7Var.f42616b;
        synchronized (em7Var) {
            em7Var.f37462c = j;
            ((cj9) em7Var.f60774a).m4782j("main.first_start_time_millis", j);
        }
        long j2 = hm7Var.f42617c;
        synchronized (em7Var) {
            em7Var.f37463d = j2;
            ((cj9) em7Var.f60774a).m4782j("main.start_count", j2);
        }
        am7Var.m570Q(hm7Var.f42618d);
        am7Var.m572S(hm7Var.f42619e);
        if (!b34.m3255w(hm7Var.f42622h)) {
            em7Var.m11228I(hm7Var.f42622h);
        }
        Boolean bool = hm7Var.f42621g;
        if (bool != null) {
            boolean zBooleanValue = bool.booleanValue();
            synchronized (am7Var) {
                am7Var.f844i = zBooleanValue;
                ((cj9) am7Var.f60774a).m4779g("install.app_limit_ad_tracking", zBooleanValue);
            }
        }
        dg4 dg4Var = hm7Var.f42620f;
        if (dg4Var == null || dg4Var.m10348r() <= 0) {
            dg4 dg4VarM10328c = dg4.m10328c();
            dg4VarM10328c.m10330A("count", hm7Var.f42618d);
            am7Var.m566M(e32.m10816i(dg4VarM10328c));
        } else {
            am7Var.m566M(e32.m10816i(hm7Var.f42620f));
        }
        if (!b34.m3255w(hm7Var.f42623i)) {
            String str3 = hm7Var.f42623i;
            synchronized (sl7Var) {
                try {
                    sl7Var.f60980b = str3;
                    cj9 cj9Var = (cj9) sl7Var.f60774a;
                    if (str3 == null) {
                        cj9Var.m4778f("engagement.push_token");
                    } else {
                        cj9Var.m4783k("engagement.push_token", str3);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        Boolean bool2 = hm7Var.f42624j;
        if (bool2 != null) {
            boolean zBooleanValue2 = bool2.booleanValue();
            synchronized (sl7Var) {
                ((cj9) sl7Var.f60774a).m4779g("engagement.push_enabled", zBooleanValue2);
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m14017b(Context context, long j, em7 em7Var, am7 am7Var, sl7 sl7Var) {
        long j2;
        boolean z;
        hm7 hm7Var;
        hm7 hm7Var2;
        Boolean boolValueOf;
        sq5 sq5Var = f44292a;
        sq5Var.m21555D("Checking if this install is a migration from a previous SDK version");
        long j3 = j - 3600000;
        try {
            int i = (int) (j3 / 1000);
            SharedPreferences sharedPreferences = context.getSharedPreferences("kosp", 0);
            String strReplace = sharedPreferences.getString("kochava_device_id", "").replace("STR::", "");
            long j4 = ((long) sharedPreferences.getInt("first_launch_time", i)) * 1000;
            boolean z2 = true;
            try {
                long j5 = sharedPreferences.getInt("launch_count", 1);
                z2 = true;
                boolean z3 = sharedPreferences.getBoolean("initial_needs_sent", true);
                long j6 = sharedPreferences.getInt("install_count", !z3 ? 1 : 0);
                long j7 = ((long) sharedPreferences.getInt("initial_sent_time", !z3 ? i : 0)) * 1000;
                String strReplace2 = sharedPreferences.getString("kochava_app_id_override", "").replace("STR::", "");
                Boolean boolValueOf2 = sharedPreferences.contains("app_limit_tracking") ? Boolean.valueOf(sharedPreferences.getBoolean("app_limit_tracking", false)) : null;
                try {
                    dg4 dg4VarM10329d = dg4.m10329d(sharedPreferences.getString("last_install", "").replace("JSO::", ""), true);
                    String strReplace3 = sharedPreferences.getString("push_token", "").replace("STR::", "");
                    if (sharedPreferences.contains("push_token_enable")) {
                        j2 = j3;
                        z = true;
                        try {
                            boolValueOf = Boolean.valueOf(sharedPreferences.getBoolean("push_token_enable", true));
                        } catch (Exception e) {
                            e = e;
                            sq5Var.m21555D("Unable to migrate data from V3 SDK: " + e.getMessage());
                        }
                    } else {
                        j2 = j3;
                        z = true;
                        boolValueOf = null;
                    }
                    if (b34.m3255w(strReplace)) {
                        hm7Var = null;
                    } else {
                        hm7Var = new hm7(strReplace, j4, j5, j6, j7);
                        hm7Var.f42622h = strReplace2;
                        hm7Var.f42621g = boolValueOf2;
                        hm7Var.f42620f = dg4VarM10329d;
                        hm7Var.f42623i = strReplace3;
                        hm7Var.f42624j = boolValueOf;
                    }
                } catch (Exception e2) {
                    e = e2;
                    j2 = j3;
                    z = true;
                }
            } catch (Exception e3) {
                e = e3;
                j2 = j3;
                z = z2;
            }
        } catch (Exception e4) {
            e = e4;
            j2 = j3;
            z = true;
        }
        if (hm7Var != null) {
            sq5Var.m21555D("Data migrated from V3 SDK");
            m14016a(hm7Var, em7Var, am7Var, sl7Var);
            return;
        }
        try {
            boolean z4 = false;
            SharedPreferences sharedPreferences2 = context.getSharedPreferences("ko.tr", 0);
            String strReplace4 = context.getSharedPreferences("ko.dt.pt", 0).getString("kochava_device_id", "").replace("STR::", "");
            if (sharedPreferences2.getBoolean("initial_sent", false) && !sharedPreferences2.contains("initial")) {
                z4 = z;
            }
            hm7Var2 = !b34.m3255w(strReplace4) ? new hm7(strReplace4, j2, 1L, z4 ? 1L : 0L, z4 ? j2 : 0L) : null;
        } catch (Exception e5) {
            sq5Var.m21555D("Unable to migrate data from V2 SDK: " + e5.getMessage());
        }
        if (hm7Var2 == null) {
            sq5Var.m21555D("No previous SDK data was found to migrate");
        } else {
            sq5Var.m21555D("Data migrated from V2 SDK");
            m14016a(hm7Var2, em7Var, am7Var, sl7Var);
        }
    }
}
