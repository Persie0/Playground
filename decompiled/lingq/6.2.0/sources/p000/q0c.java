package p000;

import android.app.AppOpsManager;
import android.content.Context;
import android.os.Binder;
import android.os.Process;
import androidx.compose.runtime.internal.C0282a;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public abstract class q0c {

    /* JADX INFO: renamed from: a */
    public static final C0282a f57111a = new C0282a(976617785, false, new wd1(3));

    /* JADX INFO: renamed from: a */
    public static int m19593a(Context context, String str, int i, int i2, String str2) {
        int iNoteProxyOpNoThrow;
        if (context.checkPermission(str, i, i2) != -1) {
            String strPermissionToOp = AppOpsManager.permissionToOp(str);
            if (strPermissionToOp != null) {
                if (str2 == null) {
                    String[] packagesForUid = context.getPackageManager().getPackagesForUid(i2);
                    if (packagesForUid != null && packagesForUid.length > 0) {
                        str2 = packagesForUid[0];
                    }
                }
                int iMyUid = Process.myUid();
                String packageName = context.getPackageName();
                if (iMyUid == i2 && Objects.equals(packageName, str2)) {
                    AppOpsManager appOpsManager = (AppOpsManager) context.getSystemService(AppOpsManager.class);
                    iNoteProxyOpNoThrow = appOpsManager == null ? 1 : appOpsManager.checkOpNoThrow(strPermissionToOp, Binder.getCallingUid(), str2);
                    if (iNoteProxyOpNoThrow == 0) {
                        iNoteProxyOpNoThrow = appOpsManager != null ? appOpsManager.checkOpNoThrow(strPermissionToOp, i2, context.getOpPackageName()) : 1;
                    }
                } else {
                    iNoteProxyOpNoThrow = ((AppOpsManager) context.getSystemService(AppOpsManager.class)).noteProxyOpNoThrow(strPermissionToOp, str2);
                }
                if (iNoteProxyOpNoThrow != 0) {
                    return -2;
                }
            }
            return 0;
        }
        return -1;
    }

    /* JADX INFO: renamed from: b */
    public static int m19594b(Context context, String str) {
        return m19593a(context, str, Process.myPid(), Process.myUid(), context.getPackageName());
    }
}
