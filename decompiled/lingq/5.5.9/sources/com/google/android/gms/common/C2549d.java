package com.google.android.gms.common;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.text.TextUtils;
import p262mb.C7529b;
import p295ob.C8032b;

/* JADX INFO: renamed from: com.google.android.gms.common.d */
/* JADX INFO: loaded from: classes.dex */
public class C2549d {

    /* JADX INFO: renamed from: a */
    public static final int f13921a = C2550e.GOOGLE_PLAY_SERVICES_VERSION_CODE;

    /* JADX INFO: renamed from: b */
    public static final C2549d f13922b = new C2549d();

    /* JADX INFO: renamed from: a */
    public Intent mo7585a(Context context, int i10, String str) {
        if (i10 != 1 && i10 != 2) {
            if (i10 != 3) {
                return null;
            }
            Uri uriFromParts = Uri.fromParts("package", "com.google.android.gms", null);
            Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
            intent.setData(uriFromParts);
            return intent;
        }
        if (context != null && C7529b.m15041b(context)) {
            Intent intent2 = new Intent("com.google.android.clockwork.home.UPDATE_ANDROID_WEAR_ACTION");
            intent2.setPackage("com.google.android.wearable.app");
            return intent2;
        }
        StringBuilder sb2 = new StringBuilder("gcore_");
        sb2.append(f13921a);
        sb2.append("-");
        if (!TextUtils.isEmpty(str)) {
            sb2.append(str);
        }
        sb2.append("-");
        if (context != null) {
            sb2.append(context.getPackageName());
        }
        sb2.append("-");
        if (context != null) {
            try {
                sb2.append(C8032b.m15902a(context).m15900b(context.getPackageName(), 0).versionCode);
            } catch (PackageManager.NameNotFoundException unused) {
            }
        }
        String string = sb2.toString();
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

    /* JADX INFO: renamed from: b */
    public final PendingIntent m7591b(int i10, int i11, Context context, String str) {
        Intent intentMo7585a = mo7585a(context, i10, str);
        if (intentMo7585a == null) {
            return null;
        }
        return PendingIntent.getActivity(context, i11, intentMo7585a, 201326592);
    }

    /* JADX INFO: renamed from: c */
    public int mo7586c(Context context, int i10) {
        int iIsGooglePlayServicesAvailable = C2550e.isGooglePlayServicesAvailable(context, i10);
        if (C2550e.isPlayServicesPossiblyUpdating(context, iIsGooglePlayServicesAvailable)) {
            return 18;
        }
        return iIsGooglePlayServicesAvailable;
    }
}
