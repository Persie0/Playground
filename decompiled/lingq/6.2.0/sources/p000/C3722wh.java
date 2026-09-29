package p000;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Binder;
import android.os.Process;
import com.google.android.gms.common.wrappers.InstantApps;

/* JADX INFO: renamed from: wh */
/* JADX INFO: loaded from: classes.dex */
public final class C3722wh {

    /* JADX INFO: renamed from: a */
    public final Context f66813a;

    public C3722wh(Context context, int i) {
        switch (i) {
            case 1:
                this.f66813a = context;
                break;
            default:
                context.getClass();
                this.f66813a = context;
                break;
        }
    }

    /* JADX INFO: renamed from: a */
    public ApplicationInfo m23948a(int i, String str) {
        return this.f66813a.getPackageManager().getApplicationInfo(str, i);
    }

    /* JADX INFO: renamed from: b */
    public PackageInfo m23949b(int i, String str) {
        return this.f66813a.getPackageManager().getPackageInfo(str, i);
    }

    /* JADX INFO: renamed from: c */
    public boolean m23950c() {
        int callingUid = Binder.getCallingUid();
        int iMyUid = Process.myUid();
        Context context = this.f66813a;
        if (callingUid == iMyUid) {
            return InstantApps.isInstantApp(context);
        }
        String nameForUid = context.getPackageManager().getNameForUid(Binder.getCallingUid());
        if (nameForUid != null) {
            return context.getPackageManager().isInstantApp(nameForUid);
        }
        return false;
    }
}
