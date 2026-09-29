package p000;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.UiModeManager;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.content.pm.Signature;
import android.graphics.Point;
import android.media.AudioManager;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.os.Build;
import android.os.SystemClock;
import android.preference.PreferenceManager;
import android.provider.Settings;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import com.kochava.tracker.payload.internal.PayloadType;
import java.io.File;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;

/* JADX INFO: loaded from: classes.dex */
public final class f02 extends c02 {
    /* JADX INFO: renamed from: e */
    public static rf4 m11408e() {
        String str = Build.TAGS;
        if (str != null && str.contains("test-keys")) {
            return rf4.m20642b(false);
        }
        String[] strArr = {"/system/app/Superuser.apk", "/sbin/su", "/system/bin/su", "/system/xbin/su", "/data/local/xbin/su", "/data/local/bin/su", "/system/sd/xbin/su", "/system/bin/failsafe/su", "/data/local/su", "/su/bin/su"};
        for (int i = 0; i < 10; i++) {
            if (new File(strArr[i]).exists()) {
                return rf4.m20642b(false);
            }
        }
        return rf4.m20642b(true);
    }

    /* JADX INFO: renamed from: f */
    public static rf4 m11409f(Context context) {
        Intent intentRegisterReceiver = context.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        if (intentRegisterReceiver == null || !intentRegisterReceiver.hasExtra("status")) {
            C3386nv.m17636w("Cannot retrieve battery status");
            return null;
        }
        int intExtra = intentRegisterReceiver.getIntExtra("status", -1);
        if (intExtra == 2) {
            return new rf4("charging");
        }
        if (intExtra == 3) {
            return new rf4("discharging");
        }
        if (intExtra != 4) {
            return intExtra != 5 ? new rf4("unknown") : new rf4("full");
        }
        return new rf4("not_charging");
    }

    /* JADX INFO: renamed from: g */
    public static rf4 m11410g(Context context) {
        SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(context);
        String string = defaultSharedPreferences.getString("IABGPP_2_TCString", "");
        if (!b34.m3255w(string)) {
            dg4 dg4VarM10328c = dg4.m10328c();
            dg4VarM10328c.m10331B("2_tcstring", b34.m3231a0(16384, string));
            if (defaultSharedPreferences.contains("IABGPP_TCFEU2_gdprApplies")) {
                dg4VarM10328c.m10353w(defaultSharedPreferences.getInt("IABGPP_TCFEU2_gdprApplies", -1), "tcfeu2_gdprapplies");
            }
            return dg4VarM10328c.m10332C();
        }
        SharedPreferences sharedPreferences = context.getSharedPreferences(context.getPackageName() + ".v2.playerprefs", 0);
        String string2 = sharedPreferences.getString("IABGPP_2_TCString", "");
        if (b34.m3255w(string2)) {
            return rf4.m20644d();
        }
        dg4 dg4VarM10328c2 = dg4.m10328c();
        dg4VarM10328c2.m10331B("2_tcstring", b34.m3231a0(16384, string2));
        if (sharedPreferences.contains("IABGPP_TCFEU2_gdprApplies")) {
            dg4VarM10328c2.m10353w(sharedPreferences.getInt("IABGPP_TCFEU2_gdprApplies", -1), "tcfeu2_gdprapplies");
        }
        return dg4VarM10328c2.m10332C();
    }

    /* JADX INFO: renamed from: h */
    public static rf4 m11411h(Context context) {
        SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(context);
        String string = defaultSharedPreferences.getString("IABTCF_TCString", "");
        if (!b34.m3255w(string)) {
            dg4 dg4VarM10328c = dg4.m10328c();
            dg4VarM10328c.m10331B("tcstring", b34.m3231a0(16384, string));
            if (defaultSharedPreferences.contains("IABTCF_gdprApplies")) {
                dg4VarM10328c.m10353w(defaultSharedPreferences.getInt("IABTCF_gdprApplies", -1), "gdprapplies");
            }
            return dg4VarM10328c.m10332C();
        }
        SharedPreferences sharedPreferences = context.getSharedPreferences(context.getPackageName() + ".v2.playerprefs", 0);
        String string2 = sharedPreferences.getString("IABTCF_TCString", "");
        if (b34.m3255w(string2)) {
            return rf4.m20644d();
        }
        dg4 dg4VarM10328c2 = dg4.m10328c();
        dg4VarM10328c2.m10331B("tcstring", b34.m3231a0(16384, string2));
        if (sharedPreferences.contains("IABTCF_gdprApplies")) {
            dg4VarM10328c2.m10353w(sharedPreferences.getInt("IABTCF_gdprApplies", -1), "gdprapplies");
        }
        return dg4VarM10328c2.m10332C();
    }

    /* JADX INFO: renamed from: i */
    public static rf4 m11412i(Context context) {
        String string = PreferenceManager.getDefaultSharedPreferences(context).getString("IABUSPrivacy_String", "");
        if (!b34.m3255w(string)) {
            return new rf4(b34.m3231a0(128, string));
        }
        String string2 = context.getSharedPreferences(context.getPackageName() + ".v2.playerprefs", 0).getString("IABUSPrivacy_String", "");
        return !b34.m3255w(string2) ? new rf4(b34.m3231a0(128, string2)) : rf4.m20644d();
    }

    /* JADX INFO: renamed from: j */
    public static rf4 m11413j(Context context) {
        NetworkCapabilities networkCapabilities;
        ConnectivityManager connectivityManagerM24362s = x74.m24362s(context);
        Network activeNetwork = connectivityManagerM24362s.getActiveNetwork();
        if (activeNetwork != null && (networkCapabilities = connectivityManagerM24362s.getNetworkCapabilities(activeNetwork)) != null) {
            if (networkCapabilities.hasTransport(1)) {
                return new rf4("wifi");
            }
            if (networkCapabilities.hasTransport(0)) {
                return new rf4("cellular");
            }
            return networkCapabilities.hasTransport(3) ? new rf4("wired") : new rf4("none");
        }
        return new rf4("none");
    }

    /* JADX INFO: renamed from: k */
    public static rf4 m11414k(Context context) {
        NotificationManager notificationManager = (NotificationManager) context.getSystemService("notification");
        if (notificationManager == null) {
            C3386nv.m17636w("Cannot retrieve NotificationManager");
            return null;
        }
        List<NotificationChannel> notificationChannels = notificationManager.getNotificationChannels();
        Iterator<NotificationChannel> it = notificationChannels.iterator();
        boolean z = true;
        while (it.hasNext()) {
            if (it.next().getImportance() != 0) {
                z = false;
            }
        }
        return (!z || notificationChannels.isEmpty()) ? rf4.m20642b(notificationManager.areNotificationsEnabled()) : rf4.m20642b(false);
    }

    /* JADX INFO: renamed from: l */
    public static rf4 m11415l(Context context) {
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        if (displayMetrics != null) {
            return new rf4(Double.valueOf(Math.round(Math.sqrt(Math.pow(displayMetrics.heightPixels / displayMetrics.ydpi, 2.0d) + Math.pow(displayMetrics.widthPixels / displayMetrics.xdpi, 2.0d)) * 10.0d) / 10.0d));
        }
        C3386nv.m17636w("Cannot retrieve DisplayMetrics");
        return null;
    }

    /* JADX INFO: renamed from: m */
    public static rf4 m11416m(Context context) {
        String packageName = context.getPackageName();
        Signature[] signatureArrM21913c = t9a.m21913c(context, packageName);
        if (signatureArrM21913c.length != 0) {
            return new rf4(AbstractC3393o1.m17735j(Integer.toString(Math.abs(signatureArrM21913c[0].toCharsString().hashCode())), "-", Integer.toString(Math.abs(packageName.hashCode()))));
        }
        C3386nv.m17636w("Unable to read signing signature");
        return null;
    }

    /* JADX INFO: renamed from: n */
    public static rf4 m11417n(Context context) {
        UiModeManager uiModeManager = (UiModeManager) context.getSystemService("uimode");
        if (uiModeManager == null) {
            C3386nv.m17636w("Cannot retrieve UiModeManager");
            return null;
        }
        switch (uiModeManager.getCurrentModeType()) {
            case 0:
                return new rf4("Undefined");
            case 1:
                return new rf4("Normal");
            case 2:
                return new rf4("Desk");
            case 3:
                return new rf4("Car");
            case 4:
                return new rf4("Television");
            case 5:
                return new rf4("Appliance");
            case 6:
                return new rf4("Watch");
            case 7:
                return new rf4("VR_Headset");
            default:
                return new rf4("Unknown");
        }
    }

    @Override // p000.c02
    /* JADX INFO: renamed from: a */
    public final synchronized a02[] mo4248a() {
        PayloadType payloadType;
        a02 a02VarM2a;
        a02 a02VarM2a2;
        PayloadType payloadType2;
        a02 a02VarM2a3;
        a02 a02VarM2a4;
        PayloadType payloadType3;
        PayloadType payloadType4;
        PayloadType payloadType5;
        a02 a02VarM2a5;
        PayloadType payloadType6;
        a02 a02VarM2a6;
        a02 a02VarM2a7;
        a02 a02VarM2a8;
        a02 a02VarM2a9;
        a02 a02VarM2a10;
        a02 a02VarM2a11;
        a02 a02VarM2a12;
        a02 a02VarM2a13;
        a02 a02VarM2a14;
        a02 a02VarM2a15;
        a02 a02VarM2a16;
        a02 a02VarM2a17;
        a02 a02VarM2a18;
        a02 a02VarM2a19;
        a02 a02VarM2a20;
        a02 a02VarM2a21;
        PayloadType payloadType7;
        PayloadType payloadType8;
        payloadType = PayloadType.Install;
        a02VarM2a = a02.m2a("installed_date", false, false, payloadType);
        a02VarM2a2 = a02.m2a("installer_package", false, false, payloadType);
        payloadType2 = PayloadType.Init;
        a02VarM2a3 = a02.m2a("metrics", false, false, payloadType2);
        a02VarM2a4 = a02.m2a("package", false, false, payloadType2, payloadType);
        payloadType3 = PayloadType.Event;
        payloadType4 = PayloadType.SessionBegin;
        payloadType5 = PayloadType.SessionEnd;
        a02VarM2a5 = a02.m2a("app_name", false, false, payloadType, payloadType3, payloadType4, payloadType5);
        payloadType6 = PayloadType.Update;
        a02VarM2a6 = a02.m2a("app_version", false, false, payloadType, payloadType6, payloadType3, payloadType4, payloadType5);
        a02VarM2a7 = a02.m2a("app_short_string", false, false, payloadType, payloadType6, payloadType3, payloadType4, payloadType5);
        a02VarM2a8 = a02.m2a("sdk_id", false, false, payloadType);
        a02VarM2a9 = a02.m2a("instant_app", false, false, payloadType, payloadType3, payloadType4, payloadType5);
        a02VarM2a10 = a02.m2a("bms", false, false, payloadType, payloadType4, payloadType5, payloadType3);
        a02VarM2a11 = a02.m2a("screen_inches", false, false, payloadType);
        a02VarM2a12 = a02.m2a("device_cores", false, false, payloadType);
        a02VarM2a13 = a02.m2a("screen_dpi", false, false, payloadType, payloadType3, payloadType4, payloadType5);
        a02VarM2a14 = a02.m2a("manufacturer", false, false, payloadType, payloadType3, payloadType4, payloadType5);
        a02VarM2a15 = a02.m2a("product_name", false, false, payloadType, payloadType3, payloadType4, payloadType5);
        a02VarM2a16 = a02.m2a("architecture", false, false, payloadType, payloadType3, payloadType4, payloadType5);
        a02VarM2a17 = a02.m2a("device", false, false, payloadType2, payloadType, payloadType3, payloadType4, payloadType5);
        a02VarM2a18 = a02.m2a("disp_h", false, false, payloadType, payloadType3, payloadType4, payloadType5);
        a02VarM2a19 = a02.m2a("disp_w", false, false, payloadType, payloadType3, payloadType4, payloadType5);
        a02VarM2a20 = a02.m2a("is_genuine", false, false, payloadType, payloadType6);
        a02VarM2a21 = a02.m2a("language", false, false, payloadType, payloadType6);
        payloadType7 = PayloadType.PushTokenAdd;
        payloadType8 = PayloadType.PushTokenRemove;
        return new a02[]{a02VarM2a, a02VarM2a2, a02VarM2a3, a02VarM2a4, a02VarM2a5, a02VarM2a6, a02VarM2a7, a02VarM2a8, a02VarM2a9, a02VarM2a10, a02VarM2a11, a02VarM2a12, a02VarM2a13, a02VarM2a14, a02VarM2a15, a02VarM2a16, a02VarM2a17, a02VarM2a18, a02VarM2a19, a02VarM2a20, a02VarM2a21, a02.m2a("locale", false, false, payloadType, payloadType7, payloadType8, payloadType3, payloadType4, payloadType5), a02.m2a("os_version", false, false, payloadType2, payloadType, payloadType6, payloadType3, payloadType4, payloadType5), a02.m2a("screen_brightness", false, false, payloadType, payloadType3, payloadType4, payloadType5), a02.m2a("device_orientation", false, false, payloadType, payloadType3, payloadType4, payloadType5), a02.m2a("volume", false, false, payloadType, payloadType3, payloadType4, payloadType5), a02.m2a("battery_status", false, false, payloadType, payloadType3, payloadType4, payloadType5), a02.m2a("battery_level", false, false, payloadType, payloadType3, payloadType4, payloadType5), a02.m2a("timezone", false, false, payloadType, payloadType7, payloadType8, payloadType3, payloadType4, payloadType5), a02.m2a("ui_mode", false, false, payloadType, payloadType3, payloadType4, payloadType5), a02.m2a("notifications_enabled", false, false, payloadType, payloadType7, payloadType8, payloadType3, payloadType4, payloadType5), a02.m2a("iab_usp", false, false, payloadType, payloadType3, payloadType4, payloadType5), a02.m2a("iab_tcf", false, false, payloadType, payloadType3, payloadType4, payloadType5), a02.m2a("iab_gpp", false, false, payloadType, payloadType3, payloadType4, payloadType5), a02.m2a("network_conn_type", false, false, payloadType, payloadType3, payloadType4, payloadType5)};
    }

    @Override // p000.c02
    /* JADX INFO: renamed from: b */
    public final synchronized rf4 mo4249b(Context context, n67 n67Var, String str, List list, List list2) {
        long j;
        rf4 rf4Var;
        try {
            switch (str) {
                case "instant_app":
                    return rf4.m20642b(context.getPackageManager().isInstantApp());
                case "timezone":
                    return new rf4(TimeZone.getDefault().getID());
                case "manufacturer":
                    return new rf4(Build.MANUFACTURER);
                case "installed_date":
                    try {
                        j = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).firstInstallTime;
                        break;
                    } catch (Throwable unused) {
                        j = 0;
                    }
                    return new rf4(Long.valueOf(j / 1000));
                case "language":
                case "locale":
                    return new rf4(Locale.getDefault().getLanguage() + "-" + Locale.getDefault().getCountry());
                case "device":
                    return new rf4(Build.MODEL + "-" + Build.BRAND);
                case "disp_h":
                    WindowManager windowManager = (WindowManager) context.getSystemService("window");
                    if (windowManager == null) {
                        throw new UnsupportedOperationException("Cannot retrieve WindowManager");
                    }
                    Display defaultDisplay = windowManager.getDefaultDisplay();
                    Point point = new Point();
                    defaultDisplay.getRealSize(point);
                    return rf4.m20643c(point.y);
                case "disp_w":
                    WindowManager windowManager2 = (WindowManager) context.getSystemService("window");
                    if (windowManager2 == null) {
                        throw new UnsupportedOperationException("Cannot retrieve WindowManager");
                    }
                    Display defaultDisplay2 = windowManager2.getDefaultDisplay();
                    Point point2 = new Point();
                    defaultDisplay2.getRealSize(point2);
                    return rf4.m20643c(point2.x);
                case "battery_status":
                    return m11409f(context);
                case "sdk_id":
                    return m11416m(context);
                case "app_version":
                    return new rf4(Integer.toString(context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode));
                case "battery_level":
                    Intent intentRegisterReceiver = context.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
                    if (intentRegisterReceiver == null || !intentRegisterReceiver.hasExtra("level")) {
                        throw new UnsupportedOperationException("Cannot retrieve battery level");
                    }
                    return rf4.m20643c(Math.min(100, Math.max(0, intentRegisterReceiver.getIntExtra("level", -1))));
                case "volume":
                    AudioManager audioManager = (AudioManager) context.getSystemService("audio");
                    if (audioManager != null) {
                        return new rf4(Double.valueOf(Math.min(1.0d, Math.max(0.0d, Math.round(((((double) audioManager.getStreamVolume(3)) * 1.0d) / ((double) audioManager.getStreamMaxVolume(3))) * 10000.0d) / 10000.0d))));
                    }
                    throw new UnsupportedOperationException("Cannot retrieve AudioManager");
                case "package":
                    return new rf4(context.getPackageName());
                case "device_cores":
                    return rf4.m20643c(Math.max(1, Runtime.getRuntime().availableProcessors()));
                case "ui_mode":
                    return m11417n(context);
                case "screen_dpi":
                    return rf4.m20643c(context.getResources().getDisplayMetrics().densityDpi);
                case "installer_package":
                    String installerPackageName = context.getPackageManager().getInstallerPackageName(context.getPackageName());
                    return installerPackageName != null ? new rf4(installerPackageName) : rf4.m20644d();
                case "network_conn_type":
                    return m11413j(context);
                case "bms":
                    return new rf4(Long.valueOf(System.currentTimeMillis() - SystemClock.elapsedRealtime()));
                case "os_version":
                    return new rf4("Android " + Build.VERSION.RELEASE);
                case "notifications_enabled":
                    return m11414k(context);
                case "architecture":
                    String property = System.getProperty("os.arch");
                    return property != null ? new rf4(property) : rf4.m20644d();
                case "metrics":
                    dg4 dg4VarM10328c = dg4.m10328c();
                    dg4VarM10328c.m10353w(context.getApplicationInfo().minSdkVersion, "min_api");
                    dg4VarM10328c.m10353w(context.getApplicationInfo().targetSdkVersion, "target_api");
                    return dg4VarM10328c.m10332C();
                case "product_name":
                    return new rf4(Build.PRODUCT);
                case "app_name":
                    return new rf4(context.getApplicationInfo().loadLabel(context.getPackageManager()).toString());
                case "screen_inches":
                    return m11415l(context);
                case "is_genuine":
                    return m11408e();
                case "iab_gpp":
                    return m11410g(context);
                case "iab_tcf":
                    return m11411h(context);
                case "iab_usp":
                    return m11412i(context);
                case "screen_brightness":
                    return new rf4(Double.valueOf(Math.min(1.0d, Math.max(0.0d, Math.round((((double) Settings.System.getInt(context.getContentResolver(), "screen_brightness")) / 255.0d) * 10000.0d) / 10000.0d))));
                case "device_orientation":
                    int i = context.getResources().getConfiguration().orientation;
                    if (i == 2) {
                        rf4Var = new rf4("landscape");
                    } else {
                        if (i != 1) {
                            throw new UnsupportedOperationException("Orientation undefined");
                        }
                        rf4Var = new rf4("portrait");
                    }
                    return rf4Var;
                case "app_short_string":
                    String str2 = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
                    return str2 != null ? new rf4(str2) : rf4.m20644d();
                default:
                    throw new Exception("Invalid key name");
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}
