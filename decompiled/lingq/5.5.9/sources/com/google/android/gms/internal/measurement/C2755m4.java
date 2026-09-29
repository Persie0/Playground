package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.net.Uri;
import android.os.Build;
import android.util.Log;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.m4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2755m4 {

    /* JADX INFO: renamed from: a */
    public static volatile zzii f14310a = zzie.f14537a;

    /* JADX INFO: renamed from: b */
    public static final Object f14311b = new Object();

    /* JADX WARN: Code duplicated, block: B:27:0x008d A[Catch: all -> 0x00c1, TRY_LEAVE, TryCatch #0 {, blocks: (B:12:0x0041, B:14:0x0049, B:15:0x0059, B:17:0x005b, B:19:0x0067, B:23:0x007a, B:25:0x0081, B:32:0x00a4, B:33:0x00b0, B:27:0x008d, B:28:0x0092, B:29:0x009b), top: B:41:0x0041 }] */
    /* JADX WARN: Code duplicated, block: B:31:0x00a2  */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: a */
    public static boolean m8063a(Context context, Uri uri) {
        String authority = uri.getAuthority();
        boolean z10 = false;
        if (!"com.google.android.gms.phenotype".equals(authority)) {
            Log.e("PhenotypeClientHelper", String.valueOf(authority).concat(" is an unsupported authority. Only com.google.android.gms.phenotype authority is supported."));
            return false;
        }
        if (f14310a.mo8477b()) {
            return ((Boolean) f14310a.mo8476a()).booleanValue();
        }
        synchronized (f14311b) {
            if (f14310a.mo8477b()) {
                return ((Boolean) f14310a.mo8476a()).booleanValue();
            }
            if (!"com.google.android.gms".equals(context.getPackageName())) {
                ProviderInfo providerInfoResolveContentProvider = context.getPackageManager().resolveContentProvider("com.google.android.gms.phenotype", Build.VERSION.SDK_INT < 29 ? 0 : 268435456);
                if (providerInfoResolveContentProvider != null && "com.google.android.gms".equals(providerInfoResolveContentProvider.packageName)) {
                    try {
                        if ((context.getPackageManager().getApplicationInfo("com.google.android.gms", 0).flags & 129) != 0) {
                            z10 = true;
                        }
                    } catch (PackageManager.NameNotFoundException unused) {
                    }
                }
            } else if ((context.getPackageManager().getApplicationInfo("com.google.android.gms", 0).flags & 129) != 0) {
                z10 = true;
            }
            f14310a = new zzik(Boolean.valueOf(z10));
            return ((Boolean) f14310a.mo8476a()).booleanValue();
        }
    }
}
