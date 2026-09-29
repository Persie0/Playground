package p295ob;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Binder;
import android.os.Process;
import com.google.android.gms.common.wrappers.InstantApps;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;

/* JADX INFO: renamed from: ob.a */
/* JADX INFO: loaded from: classes.dex */
public final class C8031a {

    /* JADX INFO: renamed from: a */
    public final Context f43660a;

    public C8031a(Context context) {
        this.f43660a = context;
    }

    @ResultIgnorabilityUnspecified
    /* JADX INFO: renamed from: a */
    public final ApplicationInfo m15899a(String str, int i10) throws PackageManager.NameNotFoundException {
        return this.f43660a.getPackageManager().getApplicationInfo(str, i10);
    }

    @ResultIgnorabilityUnspecified
    /* JADX INFO: renamed from: b */
    public final PackageInfo m15900b(String str, int i10) throws PackageManager.NameNotFoundException {
        return this.f43660a.getPackageManager().getPackageInfo(str, i10);
    }

    /* JADX INFO: renamed from: c */
    public final boolean m15901c() {
        int callingUid = Binder.getCallingUid();
        int iMyUid = Process.myUid();
        Context context = this.f43660a;
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
