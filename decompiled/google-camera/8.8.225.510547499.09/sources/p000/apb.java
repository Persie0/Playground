package p000;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class apb {
    /* JADX INFO: renamed from: a */
    static PackageInfo m1798a(PackageManager packageManager, Context context) {
        return packageManager.getPackageInfo(context.getPackageName(), PackageManager.PackageInfoFlags.of(0L));
    }
}
