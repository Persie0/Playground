package p000;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class dd1 implements uo7 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f35418a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f35419b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f35420c;

    public /* synthetic */ dd1(int i, Object obj, Object obj2) {
        this.f35418a = i;
        this.f35419b = obj;
        this.f35420c = obj2;
    }

    @Override // p000.uo7
    public final Object get() {
        ApplicationInfo applicationInfo;
        Bundle bundle;
        int i = this.f35418a;
        Object obj = this.f35420c;
        Object obj2 = this.f35419b;
        switch (i) {
            case 0:
                hc1 hc1Var = (hc1) obj;
                return hc1Var.f42158f.mo3790l(new co7(hc1Var, (ed1) obj2));
            case 1:
                return new wr3((Context) obj2, (String) obj);
            default:
                q43 q43Var = (q43) obj2;
                String strM19646d = q43Var.m19646d();
                uz1 uz1Var = new uz1();
                Context contextCreateDeviceProtectedStorageContext = ((Context) obj).createDeviceProtectedStorageContext();
                SharedPreferences sharedPreferences = contextCreateDeviceProtectedStorageContext.getSharedPreferences("com.google.firebase.common.prefs:".concat(strM19646d), 0);
                boolean z = true;
                if (sharedPreferences.contains("firebase_data_collection_default_enabled")) {
                    z = sharedPreferences.getBoolean("firebase_data_collection_default_enabled", true);
                } else {
                    try {
                        PackageManager packageManager = contextCreateDeviceProtectedStorageContext.getPackageManager();
                        if (packageManager != null && (applicationInfo = packageManager.getApplicationInfo(contextCreateDeviceProtectedStorageContext.getPackageName(), 128)) != null && (bundle = applicationInfo.metaData) != null && bundle.containsKey("firebase_data_collection_default_enabled")) {
                            z = applicationInfo.metaData.getBoolean("firebase_data_collection_default_enabled");
                        }
                        break;
                    } catch (PackageManager.NameNotFoundException unused) {
                    }
                }
                uz1Var.f64559a = z;
                return uz1Var;
        }
    }
}
