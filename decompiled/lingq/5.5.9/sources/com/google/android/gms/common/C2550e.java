package com.google.android.gms.common;

import android.annotation.TargetApi;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageInstaller;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.os.UserManager;
import android.util.Log;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import com.kochava.tracker.BuildConfig;
import com.linguist.R;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;
import p176ib.C6272i;
import p176ib.C6281m0;
import p262mb.C7529b;
import p262mb.C7533f;
import p295ob.C8032b;

/* JADX INFO: renamed from: com.google.android.gms.common.e */
/* JADX INFO: loaded from: classes.dex */
public class C2550e {
    static final int GMS_AVAILABILITY_NOTIFICATION_ID = 10436;
    static final int GMS_GENERAL_ERROR_NOTIFICATION_ID = 39789;
    public static final String GOOGLE_PLAY_GAMES_PACKAGE = "com.google.android.play.games";

    @Deprecated
    public static final String GOOGLE_PLAY_SERVICES_PACKAGE = "com.google.android.gms";

    @Deprecated
    public static final int GOOGLE_PLAY_SERVICES_VERSION_CODE = 12451000;
    public static final String GOOGLE_PLAY_STORE_PACKAGE = "com.android.vending";
    static boolean zza;
    private static boolean zzb;

    @Deprecated
    static final AtomicBoolean sCanceledAvailabilityNotification = new AtomicBoolean();
    private static final AtomicBoolean zzc = new AtomicBoolean();

    @Deprecated
    public static void cancelAvailabilityErrorNotifications(Context context) {
        if (sCanceledAvailabilityNotification.getAndSet(true)) {
            return;
        }
        try {
            NotificationManager notificationManager = (NotificationManager) context.getSystemService("notification");
            if (notificationManager != null) {
                notificationManager.cancel(GMS_AVAILABILITY_NOTIFICATION_ID);
            }
        } catch (SecurityException e10) {
            Log.d("GooglePlayServicesUtil", "Suppressing Security Exception %s in cancelAvailabilityErrorNotifications.", e10);
        }
    }

    public static void enableUsingApkIndependentContext() {
        zzc.set(true);
    }

    @Deprecated
    public static void ensurePlayServicesAvailable(Context context, int i10) throws GooglePlayServicesRepairableException, GooglePlayServicesNotAvailableException {
        C2549d c2549d = C2549d.f13922b;
        int iMo7586c = c2549d.mo7586c(context, i10);
        if (iMo7586c != 0) {
            Intent intentMo7585a = c2549d.mo7585a(context, iMo7586c, "e");
            Log.e("GooglePlayServicesUtil", "GooglePlayServices not available due to error " + iMo7586c);
            if (intentMo7585a != null) {
                throw new GooglePlayServicesRepairableException();
            }
            throw new GooglePlayServicesNotAvailableException();
        }
    }

    @Deprecated
    public static int getApkVersion(Context context) {
        try {
            return context.getPackageManager().getPackageInfo("com.google.android.gms", 0).versionCode;
        } catch (PackageManager.NameNotFoundException unused) {
            Log.w("GooglePlayServicesUtil", "Google Play services is missing.");
            return 0;
        }
    }

    @Deprecated
    public static int getClientVersion(Context context) {
        PackageInfo packageInfoM15900b;
        ApplicationInfo applicationInfo;
        Bundle bundle;
        try {
            packageInfoM15900b = C8032b.m15902a(context).m15900b(context.getPackageName(), BuildConfig.SDK_TRUNCATE_LENGTH);
        } catch (PackageManager.NameNotFoundException unused) {
            packageInfoM15900b = null;
        }
        if (packageInfoM15900b == null || (applicationInfo = packageInfoM15900b.applicationInfo) == null || (bundle = applicationInfo.metaData) == null) {
            return -1;
        }
        return bundle.getInt("com.google.android.gms.version", -1);
    }

    @Deprecated
    public static PendingIntent getErrorPendingIntent(int i10, Context context, int i11) {
        return C2549d.f13922b.m7591b(i10, i11, context, null);
    }

    @Deprecated
    public static String getErrorString(int i10) {
        return ConnectionResult.m7528Q(i10);
    }

    @Deprecated
    public static Intent getGooglePlayServicesAvailabilityRecoveryIntent(int i10) {
        return C2549d.f13922b.mo7585a(null, i10, null);
    }

    public static Context getRemoteContext(Context context) {
        try {
            return context.createPackageContext("com.google.android.gms", 3);
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    public static Resources getRemoteResource(Context context) {
        try {
            return context.getPackageManager().getResourcesForApplication("com.google.android.gms");
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    public static boolean honorsDebugCertificates(Context context) {
        if (!zza) {
            try {
                try {
                    PackageInfo packageInfoM15900b = C8032b.m15902a(context).m15900b("com.google.android.gms", 64);
                    C2551f.m7592a(context);
                    if (packageInfoM15900b == null || C2551f.m7594d(packageInfoM15900b, false) || !C2551f.m7594d(packageInfoM15900b, true)) {
                        zzb = false;
                    } else {
                        zzb = true;
                    }
                    zza = true;
                } catch (PackageManager.NameNotFoundException e10) {
                    Log.w("GooglePlayServicesUtil", "Cannot find Google Play services package name.", e10);
                    zza = true;
                }
            } catch (Throwable th2) {
                zza = true;
                throw th2;
            }
        }
        return zzb || !"user".equals(Build.TYPE);
    }

    @ResultIgnorabilityUnspecified
    @Deprecated
    public static int isGooglePlayServicesAvailable(Context context) {
        return isGooglePlayServicesAvailable(context, GOOGLE_PLAY_SERVICES_VERSION_CODE);
    }

    /* JADX WARN: Code duplicated, block: B:100:0x01c6  */
    /* JADX WARN: Code duplicated, block: B:107:0x01e7 A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:108:0x01e9 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:63:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:82:0x0158  */
    /* JADX WARN: Code duplicated, block: B:91:0x0188  */
    /* JADX WARN: Code duplicated, block: B:92:0x018a  */
    /* JADX WARN: Code duplicated, block: B:95:0x0190  */
    /* JADX WARN: Code duplicated, block: B:97:0x0195  */
    /* JADX WARN: Code duplicated, block: B:98:0x01c0  */
    /* JADX WARN: Instruction removed from duplicated block: B:97:0x0195, please report this as an issue */
    /* JADX WARN: Unreachable blocks removed: 3, instructions: 3 */
    @Deprecated
    public static int isGooglePlayServicesAvailable(Context context, int i10) {
        boolean z10;
        PackageInfo packageInfo;
        int i11;
        int i12;
        ApplicationInfo applicationInfo;
        try {
            context.getResources().getString(R.string.common_google_play_services_unknown_issue);
        } catch (Throwable unused) {
            Log.e("GooglePlayServicesUtil", "The Google Play services resources were not found. Check your project configuration to ensure that the resources are included.");
        }
        if (!"com.google.android.gms".equals(context.getPackageName()) && !zzc.get()) {
            synchronized (C6281m0.f36474a) {
                if (!C6281m0.f36475b) {
                    C6281m0.f36475b = true;
                    try {
                        Bundle bundle = C8032b.m15902a(context).m15899a(context.getPackageName(), BuildConfig.SDK_TRUNCATE_LENGTH).metaData;
                        if (bundle != null) {
                            bundle.getString("com.google.app.id");
                            C6281m0.f36476c = bundle.getInt("com.google.android.gms.version");
                        }
                    } catch (PackageManager.NameNotFoundException e10) {
                        Log.wtf("MetadataValueReader", "This should never happen.", e10);
                    }
                }
            }
            int i13 = C6281m0.f36476c;
            if (i13 == 0) {
                throw new GooglePlayServicesMissingManifestValueException();
            }
            if (i13 != GOOGLE_PLAY_SERVICES_VERSION_CODE) {
                throw new GooglePlayServicesIncorrectManifestValueException(i13);
            }
        }
        if (C7529b.m15041b(context)) {
            z10 = false;
        } else {
            if (C7529b.f41601c == null) {
                C7529b.f41601c = Boolean.valueOf(context.getPackageManager().hasSystemFeature("android.hardware.type.iot") || context.getPackageManager().hasSystemFeature("android.hardware.type.embedded"));
            }
            if (C7529b.f41601c.booleanValue()) {
                z10 = false;
            } else {
                z10 = true;
            }
        }
        C6272i.m12908b(i10 >= 0);
        String packageName = context.getPackageName();
        PackageManager packageManager = context.getPackageManager();
        if (z10) {
            try {
                packageInfo = packageManager.getPackageInfo("com.android.vending", 8256);
            } catch (PackageManager.NameNotFoundException unused2) {
                Log.w("GooglePlayServicesUtil", String.valueOf(packageName).concat(" requires the Google Play Store, but it is missing."));
            }
        } else {
            packageInfo = null;
        }
        try {
            PackageInfo packageInfo2 = packageManager.getPackageInfo("com.google.android.gms", 64);
            C2551f.m7592a(context);
            if (!C2551f.m7594d(packageInfo2, true)) {
                Log.w("GooglePlayServicesUtil", String.valueOf(packageName).concat(" requires Google Play services, but their signature is invalid."));
            } else {
                if (!z10) {
                    if (z10) {
                    }
                    i11 = packageInfo2.versionCode;
                    if (i11 == -1) {
                        i12 = -1;
                    } else {
                        i12 = i11 / 1000;
                    }
                    if (i12 >= (i10 != -1 ? i10 / 1000 : -1)) {
                        applicationInfo = packageInfo2.applicationInfo;
                        if (applicationInfo == null) {
                            applicationInfo = packageManager.getApplicationInfo("com.google.android.gms", 0);
                        }
                        if (applicationInfo.enabled) {
                            return 0;
                        }
                        return 3;
                    }
                    Log.w("GooglePlayServicesUtil", "Google Play services out of date for " + packageName + ".  Requires " + i10 + " but found " + i11);
                    return 2;
                }
                C6272i.m12915i(packageInfo);
                if (!C2551f.m7594d(packageInfo, true)) {
                    Log.w("GooglePlayServicesUtil", String.valueOf(packageName).concat(" requires Google Play Store, but its signature is invalid."));
                } else {
                    if (z10 || packageInfo == null || packageInfo.signatures[0].equals(packageInfo2.signatures[0])) {
                        i11 = packageInfo2.versionCode;
                        if (i11 == -1) {
                            i12 = -1;
                        } else {
                            i12 = i11 / 1000;
                        }
                        if (i12 >= (i10 != -1 ? i10 / 1000 : -1)) {
                            Log.w("GooglePlayServicesUtil", "Google Play services out of date for " + packageName + ".  Requires " + i10 + " but found " + i11);
                            return 2;
                        }
                        applicationInfo = packageInfo2.applicationInfo;
                        if (applicationInfo == null) {
                            try {
                                applicationInfo = packageManager.getApplicationInfo("com.google.android.gms", 0);
                            } catch (PackageManager.NameNotFoundException e11) {
                                Log.wtf("GooglePlayServicesUtil", String.valueOf(packageName).concat(" requires Google Play services, but they're missing when getting application info."), e11);
                                return 1;
                            }
                        }
                        if (applicationInfo.enabled) {
                            return 3;
                        }
                        return 0;
                    }
                    Log.w("GooglePlayServicesUtil", String.valueOf(packageName).concat(" requires Google Play Store, but its signature doesn't match that of Google Play services."));
                }
            }
            return 9;
        } catch (PackageManager.NameNotFoundException unused3) {
            Log.w("GooglePlayServicesUtil", String.valueOf(packageName).concat(" requires Google Play services, but they are missing."));
            return 1;
        }
    }

    @Deprecated
    public static boolean isGooglePlayServicesUid(Context context, int i10) {
        return C7533f.m15045a(context, i10);
    }

    @Deprecated
    public static boolean isPlayServicesPossiblyUpdating(Context context, int i10) {
        if (i10 == 18) {
            return true;
        }
        if (i10 == 1) {
            return zza(context, "com.google.android.gms");
        }
        return false;
    }

    @Deprecated
    public static boolean isPlayStorePossiblyUpdating(Context context, int i10) {
        if (i10 == 9) {
            return zza(context, "com.android.vending");
        }
        return false;
    }

    @TargetApi(18)
    public static boolean isRestrictedUserProfile(Context context) {
        Object systemService = context.getSystemService("user");
        C6272i.m12915i(systemService);
        Bundle applicationRestrictions = ((UserManager) systemService).getApplicationRestrictions(context.getPackageName());
        return applicationRestrictions != null && "true".equals(applicationRestrictions.getString("restricted_profile"));
    }

    @Deprecated
    public static boolean isSidewinderDevice(Context context) {
        if (C7529b.f41600b == null) {
            C7529b.f41600b = Boolean.valueOf(context.getPackageManager().hasSystemFeature("cn.google"));
        }
        return C7529b.f41600b.booleanValue();
    }

    @Deprecated
    public static boolean isUserRecoverableError(int i10) {
        return i10 == 1 || i10 == 2 || i10 == 3 || i10 == 9;
    }

    @TargetApi(19)
    @Deprecated
    public static boolean uidHasPackageName(Context context, int i10, String str) {
        return C7533f.m15046b(context, i10, str);
    }

    @TargetApi(21)
    public static boolean zza(Context context, String str) throws PackageManager.NameNotFoundException {
        boolean zEquals = str.equals("com.google.android.gms");
        try {
            Iterator<PackageInstaller.SessionInfo> it = context.getPackageManager().getPackageInstaller().getAllSessions().iterator();
            while (it.hasNext()) {
                if (str.equals(it.next().getAppPackageName())) {
                    return true;
                }
            }
            ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo(str, 8192);
            if (zEquals) {
                return applicationInfo.enabled;
            }
            if (applicationInfo.enabled && !isRestrictedUserProfile(context)) {
                return true;
            }
            return false;
        } catch (PackageManager.NameNotFoundException | Exception unused) {
        }
    }
}
