package p000;

import android.app.AppOpsManager;
import android.content.Context;
import android.os.Binder;
import android.os.Process;
import android.util.SparseIntArray;
import java.util.HashMap;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class aae {
    public aae() {
        new SparseIntArray();
        new HashMap();
    }

    /* JADX INFO: renamed from: a */
    public static int m0a(Context context, String str) {
        int iM53b;
        int iMyPid = Process.myPid();
        int iMyUid = Process.myUid();
        String packageName = context.getPackageName();
        if (context.checkPermission(str, iMyPid, iMyUid) == -1) {
            return -1;
        }
        String strM55d = aau.m55d(str);
        if (strM55d == null) {
            return 0;
        }
        if (packageName == null) {
            String[] packagesForUid = context.getPackageManager().getPackagesForUid(iMyUid);
            if (packagesForUid == null || packagesForUid.length <= 0) {
                return -1;
            }
            packageName = packagesForUid[0];
        }
        int iMyUid2 = Process.myUid();
        String packageName2 = context.getPackageName();
        if (iMyUid2 == iMyUid && aeb.m318b(packageName2, packageName)) {
            AppOpsManager appOpsManagerM61b = aav.m61b(context);
            iM53b = aav.m60a(appOpsManagerM61b, strM55d, Binder.getCallingUid(), packageName);
            if (iM53b == 0) {
                iM53b = aav.m60a(appOpsManagerM61b, strM55d, iMyUid, aav.m62c(context));
            }
        } else {
            iM53b = aau.m53b((AppOpsManager) aau.m54c(context, AppOpsManager.class), strM55d, packageName);
        }
        return iM53b != 0 ? -2 : 0;
    }
}
