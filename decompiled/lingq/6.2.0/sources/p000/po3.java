package p000;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageInstaller;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.GooglePlayServicesIncorrectManifestValueException;
import com.google.android.gms.common.GooglePlayServicesMissingManifestValueException;
import com.google.android.gms.common.R$string;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public class po3 {

    /* JADX INFO: renamed from: a */
    public static final int f56583a;

    /* JADX INFO: renamed from: b */
    public static final po3 f56584b;

    static {
        int i = to3.f62638e;
        f56583a = 12451000;
        f56584b = new po3();
    }

    /* JADX INFO: renamed from: a */
    public static int m19430a(Context context) {
        int i = to3.f62638e;
        try {
            return context.getPackageManager().getPackageInfo("com.google.android.gms", 0).versionCode;
        } catch (PackageManager.NameNotFoundException unused) {
            Log.w("GooglePlayServicesUtil", "Google Play services is missing.");
            return 0;
        }
    }

    /* JADX INFO: renamed from: b */
    public Intent m19431b(int i, Context context, String str) {
        if (i != 1 && i != 2) {
            if (i != 3) {
                return null;
            }
            Uri uriFromParts = Uri.fromParts("package", "com.google.android.gms", null);
            Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
            intent.setData(uriFromParts);
            return intent;
        }
        if (context != null && b34.m3258z(context)) {
            Intent intent2 = new Intent("com.google.android.clockwork.home.UPDATE_ANDROID_WEAR_ACTION");
            intent2.setPackage("com.google.android.wearable.app");
            return intent2;
        }
        StringBuilder sb = new StringBuilder("gcore_");
        sb.append(f56583a);
        sb.append("-");
        if (!TextUtils.isEmpty(str)) {
            sb.append(str);
        }
        sb.append("-");
        if (context != null) {
            sb.append(context.getPackageName());
        }
        sb.append("-");
        if (context != null) {
            try {
                sb.append(m9b.m16702a(context).m23949b(0, context.getPackageName()).versionCode);
            } catch (PackageManager.NameNotFoundException unused) {
            }
        }
        String string = sb.toString();
        Intent intent3 = new Intent("android.intent.action.VIEW");
        Uri.Builder builderAppendQueryParameter = Uri.parse("market://details").buildUpon().appendQueryParameter("id", "com.google.android.gms");
        if (!TextUtils.isEmpty(string)) {
            builderAppendQueryParameter.appendQueryParameter("pcampaignid", string);
        }
        intent3.setData(builderAppendQueryParameter.build());
        intent3.setPackage("com.android.vending");
        intent3.addFlags(524288);
        return intent3;
    }

    /* JADX WARN: Code duplicated, block: B:112:0x0189 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:49:0x009e  */
    /* JADX WARN: Code duplicated, block: B:67:0x010e  */
    /* JADX WARN: Code duplicated, block: B:72:0x0131  */
    /* JADX WARN: Code duplicated, block: B:74:0x013d  */
    /* JADX WARN: Code duplicated, block: B:75:0x0185  */
    /* JADX WARN: Code duplicated, block: B:84:0x01a6  */
    /* JADX WARN: Code duplicated, block: B:85:0x01a8  */
    /* JADX INFO: renamed from: c */
    public int m19432c(Context context, int i) {
        boolean z;
        PackageInfo packageInfo;
        ApplicationInfo applicationInfo;
        int i2 = to3.f62638e;
        try {
            context.getResources().getString(R$string.common_google_play_services_unknown_issue);
        } catch (Throwable unused) {
            Log.e("GooglePlayServicesUtil", "The Google Play services resources were not found. Check your project configuration to ensure that the resources are included.");
        }
        boolean z2 = true;
        if (!"com.google.android.gms".equals(context.getPackageName()) && !to3.f62637d.get()) {
            synchronized (pb1.f55918f) {
                try {
                    if (!pb1.f55919g) {
                        pb1.f55919g = true;
                        try {
                            Bundle bundle = m9b.m16702a(context).m23948a(128, context.getPackageName()).metaData;
                            if (bundle != null) {
                                bundle.getString("com.google.app.id");
                                pb1.f55920h = bundle.getInt("com.google.android.gms.version");
                            }
                        } catch (PackageManager.NameNotFoundException e) {
                            Log.wtf("MetadataValueReader", "This should never happen.", e);
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            int i3 = pb1.f55920h;
            if (i3 == 0) {
                throw new GooglePlayServicesMissingManifestValueException();
            }
            if (i3 != 12451000) {
                throw new GooglePlayServicesIncorrectManifestValueException(i3);
            }
        }
        if (b34.m3258z(context)) {
            z = false;
        } else {
            if (b34.f7857r == null) {
                b34.f7857r = Boolean.valueOf(context.getPackageManager().hasSystemFeature("android.hardware.type.embedded"));
            }
            if (b34.f7857r.booleanValue()) {
                z = false;
            } else {
                z = true;
            }
        }
        lda.m16125k(i >= 0);
        String packageName = context.getPackageName();
        PackageManager packageManager = context.getPackageManager();
        int i4 = 9;
        if (z) {
            try {
                packageInfo = packageManager.getPackageInfo("com.android.vending", 134225984);
            } catch (PackageManager.NameNotFoundException unused2) {
                Log.w("GooglePlayServicesUtil", String.valueOf(packageName).concat(" requires the Google Play Store, but it is missing."));
            }
        } else {
            packageInfo = null;
        }
        try {
            PackageInfo packageInfo2 = packageManager.getPackageInfo("com.google.android.gms", 134217792);
            wo3.m24090a(context);
            if (!wo3.m24091d(packageInfo2, true)) {
                Log.w("GooglePlayServicesUtil", String.valueOf(packageName).concat(" requires Google Play services, but their signature is invalid."));
            } else if (z) {
                lda.m16130p(packageInfo);
                if (!wo3.m24091d(packageInfo, true)) {
                    Log.w("GooglePlayServicesUtil", String.valueOf(packageName).concat(" requires Google Play Store, but its signature is invalid."));
                } else if (!z && packageInfo != null && !packageInfo.signatures[0].equals(packageInfo2.signatures[0])) {
                    Log.w("GooglePlayServicesUtil", String.valueOf(packageName).concat(" requires Google Play Store, but its signature doesn't match that of Google Play services."));
                } else if (scd.m21244c(packageInfo2.versionCode) < scd.m21244c(i)) {
                    int i5 = packageInfo2.versionCode;
                    StringBuilder sb = new StringBuilder(String.valueOf(packageName).length() + 49 + String.valueOf(i).length() + 11 + String.valueOf(i5).length());
                    sb.append("Google Play services out of date for ");
                    sb.append(packageName);
                    sb.append(".  Requires ");
                    sb.append(i);
                    sb.append(" but found ");
                    sb.append(i5);
                    Log.w("GooglePlayServicesUtil", sb.toString());
                    i4 = 2;
                } else {
                    applicationInfo = packageInfo2.applicationInfo;
                    if (applicationInfo == null) {
                        try {
                            applicationInfo = packageManager.getApplicationInfo("com.google.android.gms", 0);
                        } catch (PackageManager.NameNotFoundException e2) {
                            Log.wtf("GooglePlayServicesUtil", String.valueOf(packageName).concat(" requires Google Play services, but they're missing when getting application info."), e2);
                            i4 = 1;
                        }
                    }
                    if (applicationInfo.enabled) {
                        i4 = 0;
                    } else {
                        i4 = 3;
                    }
                }
            } else if (!z) {
                if (scd.m21244c(packageInfo2.versionCode) < scd.m21244c(i)) {
                    int i6 = packageInfo2.versionCode;
                    StringBuilder sb2 = new StringBuilder(String.valueOf(packageName).length() + 49 + String.valueOf(i).length() + 11 + String.valueOf(i6).length());
                    sb2.append("Google Play services out of date for ");
                    sb2.append(packageName);
                    sb2.append(".  Requires ");
                    sb2.append(i);
                    sb2.append(" but found ");
                    sb2.append(i6);
                    Log.w("GooglePlayServicesUtil", sb2.toString());
                    i4 = 2;
                } else {
                    applicationInfo = packageInfo2.applicationInfo;
                    if (applicationInfo == null) {
                        applicationInfo = packageManager.getApplicationInfo("com.google.android.gms", 0);
                    }
                    if (applicationInfo.enabled) {
                        i4 = 3;
                    } else {
                        i4 = 0;
                    }
                }
            } else if (scd.m21244c(packageInfo2.versionCode) < scd.m21244c(i)) {
                int i7 = packageInfo2.versionCode;
                StringBuilder sb3 = new StringBuilder(String.valueOf(packageName).length() + 49 + String.valueOf(i).length() + 11 + String.valueOf(i7).length());
                sb3.append("Google Play services out of date for ");
                sb3.append(packageName);
                sb3.append(".  Requires ");
                sb3.append(i);
                sb3.append(" but found ");
                sb3.append(i7);
                Log.w("GooglePlayServicesUtil", sb3.toString());
                i4 = 2;
            } else {
                applicationInfo = packageInfo2.applicationInfo;
                if (applicationInfo == null) {
                    applicationInfo = packageManager.getApplicationInfo("com.google.android.gms", 0);
                }
                if (applicationInfo.enabled) {
                    i4 = 3;
                } else {
                    i4 = 0;
                }
            }
        } catch (PackageManager.NameNotFoundException unused3) {
            Log.w("GooglePlayServicesUtil", String.valueOf(packageName).concat(" requires Google Play services, but they are missing."));
        }
        if (i4 != 18) {
            if (i4 == 1) {
                try {
                    Iterator<PackageInstaller.SessionInfo> it = context.getPackageManager().getPackageInstaller().getAllSessions().iterator();
                    while (it.hasNext()) {
                        if ("com.google.android.gms".equals(it.next().getAppPackageName())) {
                        }
                    }
                    z2 = context.getPackageManager().getApplicationInfo("com.google.android.gms", 8192).enabled;
                } catch (PackageManager.NameNotFoundException | Exception unused4) {
                    z2 = false;
                }
            } else {
                z2 = false;
            }
        }
        if (z2) {
            return 18;
        }
        return i4;
    }
}
