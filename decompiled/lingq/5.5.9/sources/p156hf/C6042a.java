package p156hf;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import com.kochava.tracker.BuildConfig;
import p254m2.C7472a;
import p533ze.InterfaceC10481c;

/* JADX INFO: renamed from: hf.a */
/* JADX INFO: loaded from: classes.dex */
public final class C6042a {

    /* JADX INFO: renamed from: a */
    public final InterfaceC10481c f35689a;

    /* JADX INFO: renamed from: b */
    public final boolean f35690b;

    public C6042a(Context context, String str, InterfaceC10481c interfaceC10481c) {
        boolean z10;
        ApplicationInfo applicationInfo;
        Bundle bundle;
        Object obj = C7472a.f41322a;
        Context contextM14854a = C7472a.e.m14854a(context);
        SharedPreferences sharedPreferences = contextM14854a.getSharedPreferences("com.google.firebase.common.prefs:" + str, 0);
        this.f35689a = interfaceC10481c;
        boolean z11 = true;
        if (sharedPreferences.contains("firebase_data_collection_default_enabled")) {
            z10 = sharedPreferences.getBoolean("firebase_data_collection_default_enabled", z11);
        } else {
            try {
                PackageManager packageManager = contextM14854a.getPackageManager();
                if (packageManager != null && (applicationInfo = packageManager.getApplicationInfo(contextM14854a.getPackageName(), BuildConfig.SDK_TRUNCATE_LENGTH)) != null && (bundle = applicationInfo.metaData) != null && bundle.containsKey("firebase_data_collection_default_enabled")) {
                    z11 = applicationInfo.metaData.getBoolean("firebase_data_collection_default_enabled");
                }
            } catch (PackageManager.NameNotFoundException unused) {
            }
            z10 = z11;
        }
        this.f35690b = z10;
    }
}
