package p366rg;

import android.annotation.SuppressLint;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.UiModeManager;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.Signature;
import android.content.pm.SigningInfo;
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
import androidx.datastore.preferences.PreferencesProto$Value;
import com.android.installreferrer.api.InstallReferrerClient;
import com.kochava.tracker.BuildConfig;
import com.kochava.tracker.payload.internal.PayloadType;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;
import mg.C7558b;
import p003a2.C0009a;
import p075dh.C5176d;
import p338qd.C8573r0;
import p534zf.C10485c;
import p534zf.C10487e;
import p534zf.InterfaceC10486d;

/* JADX INFO: renamed from: rg.e */
/* JADX INFO: loaded from: classes.dex */
public final class C8784e extends AbstractC8781b {
    /* JADX INFO: renamed from: e */
    public static C10485c m17060e() {
        String str = Build.TAGS;
        if (str != null && str.contains("test-keys")) {
            return C10485c.m19439b(false);
        }
        String[] strArr = {"/system/app/Superuser.apk", "/sbin/su", "/system/bin/su", "/system/xbin/su", "/data/local/xbin/su", "/data/local/bin/su", "/system/sd/xbin/su", "/system/bin/failsafe/su", "/data/local/su", "/su/bin/su"};
        for (int i10 = 0; i10 < 10; i10++) {
            if (new File(strArr[i10]).exists()) {
                return C10485c.m19439b(false);
            }
        }
        return C10485c.m19439b(true);
    }

    /* JADX INFO: renamed from: f */
    public static C10485c m17061f(Context context) {
        Intent intentRegisterReceiver = context.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        if (intentRegisterReceiver == null || !intentRegisterReceiver.hasExtra("status")) {
            throw new UnsupportedOperationException("Cannot retrieve battery status");
        }
        int intExtra = intentRegisterReceiver.getIntExtra("status", -1);
        if (intExtra == 2) {
            return new C10485c("charging");
        }
        if (intExtra == 3) {
            return new C10485c("discharging");
        }
        if (intExtra != 4) {
            return intExtra != 5 ? new C10485c("unknown") : new C10485c("full");
        }
        return new C10485c("not_charging");
    }

    /* JADX INFO: renamed from: g */
    public static C10485c m17062g(Context context) {
        String string = PreferenceManager.getDefaultSharedPreferences(context).getString("IABUSPrivacy_String", "");
        if (!C8573r0.m16662A0(string)) {
            if (string.length() > Math.max(0, BuildConfig.SDK_TRUNCATE_LENGTH)) {
                string = string.substring(0, Math.max(0, BuildConfig.SDK_TRUNCATE_LENGTH));
            }
            return new C10485c(string);
        }
        String string2 = context.getSharedPreferences(context.getPackageName() + ".v2.playerprefs", 0).getString("IABUSPrivacy_String", "");
        if (C8573r0.m16662A0(string2)) {
            return C10485c.m19441d();
        }
        if (string2.length() > Math.max(0, BuildConfig.SDK_TRUNCATE_LENGTH)) {
            string2 = string2.substring(0, Math.max(0, BuildConfig.SDK_TRUNCATE_LENGTH));
        }
        return new C10485c(string2);
    }

    /* JADX INFO: renamed from: h */
    public static C10485c m17063h(Context context) throws UnsupportedOperationException {
        NetworkCapabilities networkCapabilities;
        ConnectivityManager connectivityManagerM15079a = C7558b.m15079a(context);
        Network activeNetwork = connectivityManagerM15079a.getActiveNetwork();
        if (activeNetwork != null && (networkCapabilities = connectivityManagerM15079a.getNetworkCapabilities(activeNetwork)) != null) {
            if (networkCapabilities.hasTransport(1)) {
                return new C10485c("wifi");
            }
            if (networkCapabilities.hasTransport(0)) {
                return new C10485c("cellular");
            }
            return networkCapabilities.hasTransport(3) ? new C10485c("wired") : new C10485c("none");
        }
        return new C10485c("none");
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: i */
    public static C10485c m17064i(Context context) {
        NotificationManager notificationManager = (NotificationManager) context.getSystemService("notification");
        if (notificationManager == null) {
            throw new UnsupportedOperationException("Cannot retrieve NotificationManager");
        }
        List<NotificationChannel> notificationChannels = notificationManager.getNotificationChannels();
        Iterator<NotificationChannel> it = notificationChannels.iterator();
        boolean z10 = true;
        while (it.hasNext()) {
            if (it.next().getImportance() != 0) {
                z10 = false;
            }
        }
        return (!z10 || notificationChannels.isEmpty()) ? C10485c.m19439b(notificationManager.areNotificationsEnabled()) : C10485c.m19439b(false);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: j */
    public static C10485c m17065j(Context context) throws UnsupportedOperationException {
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        if (displayMetrics == null) {
            throw new UnsupportedOperationException("Cannot retrieve DisplayMetrics");
        }
        return new C10485c(Double.valueOf(Math.round(Math.sqrt(Math.pow(displayMetrics.heightPixels / displayMetrics.ydpi, 2.0d) + Math.pow(displayMetrics.widthPixels / displayMetrics.xdpi, 2.0d)) * 10.0d) / 10.0d));
    }

    @SuppressLint({"PackageManagerGetSignatures"})
    /* JADX INFO: renamed from: k */
    public static C10485c m17066k(Context context) throws Exception {
        Signature[] signingCertificateHistory;
        String packageName = context.getPackageName();
        if (Build.VERSION.SDK_INT >= 28) {
            SigningInfo signingInfo = context.getPackageManager().getPackageInfo(packageName, 134217728).signingInfo;
            signingCertificateHistory = signingInfo != null ? signingInfo.getSigningCertificateHistory() : null;
        } else {
            signingCertificateHistory = context.getPackageManager().getPackageInfo(packageName, 64).signatures;
        }
        if (signingCertificateHistory == null || signingCertificateHistory.length == 0) {
            throw new UnsupportedOperationException("Unable to read signing signature");
        }
        return new C10485c(C0009a.m21i(Integer.toString(Math.abs(signingCertificateHistory[0].toCharsString().hashCode())), "-", Integer.toString(Math.abs(packageName.hashCode()))));
    }

    /* JADX INFO: renamed from: l */
    public static C10485c m17067l(Context context) {
        UiModeManager uiModeManager = (UiModeManager) context.getSystemService("uimode");
        if (uiModeManager == null) {
            throw new UnsupportedOperationException("Cannot retrieve UiModeManager");
        }
        switch (uiModeManager.getCurrentModeType()) {
            case InstallReferrerClient.InstallReferrerResponse.f10530OK /* 0 */:
                return new C10485c("Undefined");
            case 1:
                return new C10485c("Normal");
            case 2:
                return new C10485c("Desk");
            case 3:
                return new C10485c("Car");
            case 4:
                return new C10485c("Television");
            case 5:
                return new C10485c("Appliance");
            case PreferencesProto$Value.STRING_SET_FIELD_NUMBER /* 6 */:
                return new C10485c("Watch");
            case PreferencesProto$Value.DOUBLE_FIELD_NUMBER /* 7 */:
                return new C10485c("VR_Headset");
            default:
                return new C10485c("Unknown");
        }
    }

    @Override // p366rg.AbstractC8781b
    /* JADX INFO: renamed from: b */
    public final synchronized C8780a[] mo17042b() {
        PayloadType payloadType;
        PayloadType payloadType2;
        PayloadType payloadType3;
        PayloadType payloadType4;
        PayloadType payloadType5;
        PayloadType payloadType6;
        PayloadType payloadType7;
        PayloadType payloadType8;
        payloadType = PayloadType.Install;
        payloadType2 = PayloadType.Init;
        payloadType3 = PayloadType.Event;
        payloadType4 = PayloadType.SessionBegin;
        payloadType5 = PayloadType.SessionEnd;
        payloadType6 = PayloadType.Update;
        payloadType7 = PayloadType.PushTokenAdd;
        payloadType8 = PayloadType.PushTokenRemove;
        return new C8780a[]{C8780a.m17039a("installed_date", false, false, payloadType), C8780a.m17039a("installer_package", false, false, payloadType), C8780a.m17039a("metrics", false, false, payloadType2), C8780a.m17039a("package", false, false, payloadType2, payloadType), C8780a.m17039a("app_name", false, false, payloadType, payloadType3, payloadType4, payloadType5), C8780a.m17039a("app_version", false, false, payloadType, payloadType6, payloadType3, payloadType4, payloadType5), C8780a.m17039a("app_short_string", false, false, payloadType, payloadType6, payloadType3, payloadType4, payloadType5), C8780a.m17039a("sdk_id", false, false, payloadType), C8780a.m17039a("instant_app", false, false, payloadType, payloadType3, payloadType4, payloadType5), C8780a.m17039a("bms", false, false, payloadType, payloadType4, payloadType5, payloadType3), C8780a.m17039a("screen_inches", false, false, payloadType), C8780a.m17039a("device_cores", false, false, payloadType), C8780a.m17039a("screen_dpi", false, false, payloadType, payloadType3, payloadType4, payloadType5), C8780a.m17039a("manufacturer", false, false, payloadType, payloadType3, payloadType4, payloadType5), C8780a.m17039a("product_name", false, false, payloadType, payloadType3, payloadType4, payloadType5), C8780a.m17039a("architecture", false, false, payloadType, payloadType3, payloadType4, payloadType5), C8780a.m17039a("device", false, false, payloadType2, payloadType, payloadType3, payloadType4, payloadType5), C8780a.m17039a("disp_h", false, false, payloadType, payloadType3, payloadType4, payloadType5), C8780a.m17039a("disp_w", false, false, payloadType, payloadType3, payloadType4, payloadType5), C8780a.m17039a("is_genuine", false, false, payloadType, payloadType6), C8780a.m17039a("language", false, false, payloadType, payloadType6), C8780a.m17039a("locale", false, false, payloadType, payloadType7, payloadType8, payloadType3, payloadType4, payloadType5), C8780a.m17039a("os_version", false, false, payloadType2, payloadType, payloadType6, payloadType3, payloadType4, payloadType5), C8780a.m17039a("screen_brightness", false, false, payloadType, payloadType3, payloadType4, payloadType5), C8780a.m17039a("device_orientation", false, false, payloadType, payloadType3, payloadType4, payloadType5), C8780a.m17039a("volume", false, false, payloadType, payloadType3, payloadType4, payloadType5), C8780a.m17039a("battery_status", false, false, payloadType, payloadType3, payloadType4, payloadType5), C8780a.m17039a("battery_level", false, false, payloadType, payloadType3, payloadType4, payloadType5), C8780a.m17039a("timezone", false, false, payloadType, payloadType7, payloadType8, payloadType3, payloadType4, payloadType5), C8780a.m17039a("ui_mode", false, false, payloadType, payloadType3, payloadType4, payloadType5), C8780a.m17039a("notifications_enabled", false, false, payloadType, payloadType7, payloadType8, payloadType3, payloadType4, payloadType5), C8780a.m17039a("iab_usp", false, false, payloadType, payloadType3, payloadType4, payloadType5), C8780a.m17039a("network_conn_type", false, false, payloadType, payloadType3, payloadType4, payloadType5)};
    }

    @Override // p366rg.AbstractC8781b
    /* JADX INFO: renamed from: c */
    public final synchronized InterfaceC10486d mo17043c(Context context, C5176d c5176d, String str, ArrayList arrayList, List list) throws Exception {
        C10485c c10485c;
        str.getClass();
        switch (str) {
            case "instant_app":
                return C10485c.m19439b(context.getPackageManager().isInstantApp());
            case "timezone":
                return new C10485c(TimeZone.getDefault().getID());
            case "manufacturer":
                return new C10485c(Build.MANUFACTURER);
            case "installed_date":
                return new C10485c(Long.valueOf(context.getPackageManager().getPackageInfo(context.getPackageName(), 0).firstInstallTime / 1000));
            case "language":
            case "locale":
                return new C10485c(Locale.getDefault().getLanguage() + "-" + Locale.getDefault().getCountry());
            case "device":
                return new C10485c(Build.MODEL + "-" + Build.BRAND);
            case "disp_h":
                WindowManager windowManager = (WindowManager) context.getSystemService("window");
                if (windowManager == null) {
                    throw new UnsupportedOperationException("Cannot retrieve WindowManager");
                }
                Display defaultDisplay = windowManager.getDefaultDisplay();
                Point point = new Point();
                defaultDisplay.getRealSize(point);
                return C10485c.m19440c(point.y);
            case "disp_w":
                WindowManager windowManager2 = (WindowManager) context.getSystemService("window");
                if (windowManager2 == null) {
                    throw new UnsupportedOperationException("Cannot retrieve WindowManager");
                }
                Display defaultDisplay2 = windowManager2.getDefaultDisplay();
                Point point2 = new Point();
                defaultDisplay2.getRealSize(point2);
                return C10485c.m19440c(point2.x);
            case "battery_status":
                return m17061f(context);
            case "sdk_id":
                return m17066k(context);
            case "app_version":
                return new C10485c(Integer.toString(context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode));
            case "battery_level":
                Intent intentRegisterReceiver = context.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
                if (intentRegisterReceiver == null || !intentRegisterReceiver.hasExtra("level")) {
                    throw new UnsupportedOperationException("Cannot retrieve battery level");
                }
                return C10485c.m19440c(Math.min(100, Math.max(0, intentRegisterReceiver.getIntExtra("level", -1))));
            case "volume":
                AudioManager audioManager = (AudioManager) context.getSystemService("audio");
                if (audioManager != null) {
                    return new C10485c(Double.valueOf(Math.min(1.0d, Math.max(0.0d, Math.round(((((double) audioManager.getStreamVolume(3)) * 1.0d) / ((double) audioManager.getStreamMaxVolume(3))) * 10000.0d) / 10000.0d))));
                }
                throw new UnsupportedOperationException("Cannot retrieve AudioManager");
            case "package":
                return new C10485c(context.getPackageName());
            case "device_cores":
                return C10485c.m19440c(Math.max(1, Runtime.getRuntime().availableProcessors()));
            case "ui_mode":
                return m17067l(context);
            case "screen_dpi":
                return C10485c.m19440c(context.getResources().getDisplayMetrics().densityDpi);
            case "installer_package":
                context.getPackageManager().getInstallerPackageName(context.getPackageName());
                return "com.android.vending" != 0 ? new C10485c("com.android.vending") : C10485c.m19441d();
            case "network_conn_type":
                return m17063h(context);
            case "bms":
                return new C10485c(Long.valueOf(System.currentTimeMillis() - SystemClock.elapsedRealtime()));
            case "os_version":
                return new C10485c("Android " + Build.VERSION.RELEASE);
            case "notifications_enabled":
                return m17064i(context);
            case "architecture":
                String property = System.getProperty("os.arch");
                return property != null ? new C10485c(property) : C10485c.m19441d();
            case "metrics":
                C10487e c10487eM19445u = C10487e.m19445u();
                c10487eM19445u.m19474z("min_api", context.getApplicationInfo().minSdkVersion);
                c10487eM19445u.m19474z("target_api", context.getApplicationInfo().targetSdkVersion);
                return c10487eM19445u.mo19461k();
            case "product_name":
                return new C10485c(Build.PRODUCT);
            case "app_name":
                return new C10485c(context.getApplicationInfo().loadLabel(context.getPackageManager()).toString());
            case "screen_inches":
                return m17065j(context);
            case "is_genuine":
                return m17060e();
            case "iab_usp":
                return m17062g(context);
            case "screen_brightness":
                return new C10485c(Double.valueOf(Math.min(1.0d, Math.max(0.0d, Math.round((((double) Settings.System.getInt(context.getContentResolver(), "screen_brightness")) / 255.0d) * 10000.0d) / 10000.0d))));
            case "device_orientation":
                int i10 = context.getResources().getConfiguration().orientation;
                if (i10 == 2) {
                    c10485c = new C10485c("landscape");
                } else {
                    if (i10 != 1) {
                        throw new UnsupportedOperationException("Orientation undefined");
                    }
                    c10485c = new C10485c("portrait");
                }
                return c10485c;
            case "app_short_string":
                String str2 = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
                return str2 != null ? new C10485c(str2) : C10485c.m19441d();
            default:
                throw new Exception("Invalid key name");
        }
    }
}
