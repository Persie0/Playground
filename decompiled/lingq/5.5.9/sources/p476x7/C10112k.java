package p476x7;

import ae.C0062b;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import com.facebook.LoggingBehavior;
import com.facebook.appevents.AppEventsLogger$FlushBehavior;
import com.facebook.appevents.FlushReason;
import dm.C5207g;
import java.util.Arrays;
import java.util.Locale;
import p067d8.C5078r;
import p173i8.C6205a;
import p291o7.C7993c0;
import p291o7.C8004n;
import p317p7.C8199f;
import p317p7.C8201h;

/* JADX INFO: renamed from: x7.k */
/* JADX INFO: loaded from: classes.dex */
public final class C10112k {

    /* JADX INFO: renamed from: a */
    public static final C10112k f51284a = new C10112k();

    /* JADX INFO: renamed from: b */
    public static final String f51285b = C10112k.class.getCanonicalName();

    /* JADX INFO: renamed from: c */
    public static final long[] f51286c = {300000, 900000, 1800000, 3600000, 21600000, 43200000, 86400000, 172800000, 259200000, 604800000, 1209600000, 1814400000, 2419200000L, 5184000000L, 7776000000L, 10368000000L, 12960000000L, 15552000000L, 31536000000L};

    /* JADX INFO: renamed from: b */
    public static final void m18970b(String str, String str2, Context context) {
        if (C6205a.m12742b(C10112k.class)) {
            return;
        }
        try {
            Bundle bundle = new Bundle();
            bundle.putString("fb_mobile_launch_source", "Unclassified");
            bundle.putString("fb_mobile_pckg_fp", f51284a.m18972a(context));
            bundle.putString("fb_mobile_app_cert_hash", C0062b.m331a1(context));
            C8201h c8201h = new C8201h(str, str2);
            C8004n c8004n = C8004n.f43550a;
            if (C7993c0.m15849b()) {
                c8201h.m16332d(bundle, "fb_mobile_activate_app");
            }
            String str3 = C8201h.f44393c;
            if (C8201h.a.m16337b() != AppEventsLogger$FlushBehavior.EXPLICIT_ONLY && !C6205a.m12742b(c8201h)) {
                try {
                    String str4 = C8199f.f44386a;
                    C8199f.m16323c(FlushReason.EXPLICIT);
                } catch (Throwable th2) {
                    C6205a.m12741a(c8201h, th2);
                }
            }
        } catch (Throwable th3) {
            C6205a.m12741a(C10112k.class, th3);
        }
    }

    /* JADX INFO: renamed from: c */
    public static final void m18971c(String str, C10111j c10111j, String str2) {
        long jLongValue;
        int i10;
        String string;
        Long l10;
        if (C6205a.m12742b(C10112k.class) || c10111j == null) {
            return;
        }
        try {
            Long l11 = c10111j.f51282e;
            if (l11 == null) {
                l11 = 0L;
            }
            if (l11 == null) {
                Long l12 = c10111j.f51279b;
                jLongValue = 0 - (l12 == null ? 0L : l12.longValue());
            } else {
                jLongValue = l11.longValue();
            }
            String str3 = f51285b;
            C10112k c10112k = f51284a;
            if (jLongValue < 0) {
                c10112k.getClass();
                if (!C6205a.m12742b(c10112k)) {
                    try {
                        C5078r.a aVar = C5078r.f32986e;
                        LoggingBehavior loggingBehavior = LoggingBehavior.APP_EVENTS;
                        C5207g.m11108c(str3);
                        aVar.m10780b(loggingBehavior, str3, "Clock skew detected");
                    } catch (Throwable th2) {
                        C6205a.m12741a(c10112k, th2);
                    }
                }
                jLongValue = 0;
            }
            Long l13 = c10111j.f51278a;
            long jLongValue2 = (l13 == null || (l10 = c10111j.f51279b) == null) ? 0L : l10.longValue() - l13.longValue();
            if (jLongValue2 < 0) {
                c10112k.getClass();
                if (!C6205a.m12742b(c10112k)) {
                    try {
                        C5078r.a aVar2 = C5078r.f32986e;
                        LoggingBehavior loggingBehavior2 = LoggingBehavior.APP_EVENTS;
                        C5207g.m11108c(str3);
                        aVar2.m10780b(loggingBehavior2, str3, "Clock skew detected");
                    } catch (Throwable th3) {
                        C6205a.m12741a(c10112k, th3);
                    }
                }
                jLongValue2 = 0;
            }
            Bundle bundle = new Bundle();
            bundle.putInt("fb_mobile_app_interruptions", c10111j.f51281d);
            Locale locale = Locale.ROOT;
            Object[] objArr = new Object[1];
            if (C6205a.m12742b(C10112k.class)) {
                i10 = 0;
            } else {
                i10 = 0;
                while (true) {
                    try {
                        long[] jArr = f51286c;
                        if (i10 >= jArr.length || jArr[i10] >= jLongValue) {
                            break;
                        } else {
                            i10++;
                        }
                    } catch (Throwable th4) {
                        C6205a.m12741a(C10112k.class, th4);
                        i10 = 0;
                    }
                }
            }
            objArr[0] = Integer.valueOf(i10);
            String str4 = String.format(locale, "session_quanta_%d", Arrays.copyOf(objArr, 1));
            C5207g.m11110e(str4, "java.lang.String.format(locale, format, *args)");
            bundle.putString("fb_mobile_time_between_sessions", str4);
            C10113l c10113l = c10111j.f51283f;
            if (c10113l == null || (string = c10113l.toString()) == null) {
                string = "Unclassified";
            }
            bundle.putString("fb_mobile_launch_source", string);
            Long l14 = c10111j.f51279b;
            bundle.putLong("_logTime", (l14 == null ? 0L : l14.longValue()) / ((long) 1000));
            C8201h c8201h = new C8201h(str, str2);
            double d10 = jLongValue2 / 1000;
            C8004n c8004n = C8004n.f43550a;
            if (!C7993c0.m15849b() || C6205a.m12742b(c8201h)) {
                return;
            }
            try {
                c8201h.m16333e("fb_mobile_deactivate_app", Double.valueOf(d10), bundle, false, C10105d.m18960a());
            } catch (Throwable th5) {
                C6205a.m12741a(c8201h, th5);
            }
        } catch (Throwable th6) {
            C6205a.m12741a(C10112k.class, th6);
        }
    }

    /* JADX INFO: renamed from: a */
    public final String m18972a(Context context) {
        if (C6205a.m12742b(this)) {
            return null;
        }
        try {
            PackageManager packageManager = context.getPackageManager();
            String strM11116k = C5207g.m11116k(packageManager.getPackageInfo(context.getPackageName(), 0).versionName, "PCKGCHKSUM;");
            SharedPreferences sharedPreferences = context.getSharedPreferences("com.facebook.sdk.appEventPreferences", 0);
            String string = sharedPreferences.getString(strM11116k, null);
            if (string != null && string.length() == 32) {
                return string;
            }
            String strM18968b = C10110i.m18968b(context);
            if (strM18968b == null) {
                ApplicationInfo applicationInfo = packageManager.getApplicationInfo(context.getPackageName(), 0);
                C5207g.m11110e(applicationInfo, "pm.getApplicationInfo(context.packageName, 0)");
                strM18968b = C10110i.m18967a(applicationInfo.sourceDir);
            }
            sharedPreferences.edit().putString(strM11116k, strM18968b).apply();
            return strM18968b;
        } catch (Exception unused) {
            return null;
        } catch (Throwable th2) {
            C6205a.m12741a(this, th2);
            return null;
        }
    }
}
