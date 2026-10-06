package p000;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class mmx {

    /* JADX INFO: renamed from: d */
    public static final mav f41072d = new mav("AppUpdateService");

    /* JADX INFO: renamed from: f */
    private static final Intent f41073f = new Intent("com.google.android.play.core.install.BIND_UPDATE_SERVICE").setPackage("com.android.vending");

    /* JADX INFO: renamed from: a */
    public mnq f41074a;

    /* JADX INFO: renamed from: b */
    public final String f41075b;

    /* JADX INFO: renamed from: c */
    public final Context f41076c;

    /* JADX INFO: renamed from: e */
    public final mav f41077e;

    public mmx(Context context, mav mavVar, byte[] bArr, byte[] bArr2) {
        this.f41075b = context.getPackageName();
        this.f41076c = context;
        this.f41077e = mavVar;
        mav mavVar2 = mns.f41134a;
        try {
            if (context.getPackageManager().getApplicationInfo("com.android.vending", 0).enabled) {
                try {
                    Signature[] signatureArr = context.getPackageManager().getPackageInfo("com.android.vending", 64).signatures;
                    if (signatureArr == null || (signatureArr.length) == 0) {
                        mav mavVar3 = mns.f41134a;
                        Object[] objArr = new Object[0];
                        if (Log.isLoggable("PlayCore", 5)) {
                            Log.w("PlayCore", mav.m16282c((String) mavVar3.f39742a, "Phonesky package is not signed -- possibly self-built package. Could not verify.", objArr));
                            return;
                        }
                        return;
                    }
                    for (Signature signature : signatureArr) {
                        String strM15582i = lkm.m15582i(signature.toByteArray());
                        if ("8P1sW0EPJcslw7UzRsiXL64w-O50Ed-RBICtay1g24M".equals(strM15582i) || ((Build.TAGS.contains("dev-keys") || Build.TAGS.contains("test-keys")) && "GXWy8XF3vIml3_MfnmSmyuKBpT3B0dWbHRR_4cgq-gA".equals(strM15582i))) {
                            this.f41074a = new mnq(lkm.m15583j(context), f41072d, f41073f, null);
                            return;
                        }
                    }
                } catch (PackageManager.NameNotFoundException e) {
                }
            }
        } catch (PackageManager.NameNotFoundException e2) {
        }
    }

    /* JADX INFO: renamed from: a */
    public static int m16643a(Bundle bundle) {
        return bundle.getInt("error.code", -2);
    }

    /* JADX INFO: renamed from: b */
    public static Bundle m16644b() {
        Bundle bundle = new Bundle();
        Bundle bundle2 = new Bundle();
        Map mapM16652a = mnb.m16652a();
        bundle2.putInt("playcore_version_code", ((Integer) mapM16652a.get("java")).intValue());
        if (mapM16652a.containsKey("native")) {
            bundle2.putInt("playcore_native_version", ((Integer) mapM16652a.get("native")).intValue());
        }
        if (mapM16652a.containsKey("unity")) {
            bundle2.putInt("playcore_unity_version", ((Integer) mapM16652a.get("unity")).intValue());
        }
        bundle.putAll(bundle2);
        bundle.putInt("playcore.version.code", 11004);
        return bundle;
    }

    /* JADX INFO: renamed from: c */
    public static jpp m16645c() {
        f41072d.m16287d("onError(%d)", -9);
        return jvh.m13565m(new mnd(-9));
    }

    /* JADX INFO: renamed from: d */
    public static HashSet m16646d(ArrayList arrayList) {
        HashSet hashSet = new HashSet();
        if (arrayList != null) {
            hashSet.addAll(arrayList);
        }
        return hashSet;
    }
}
