package p000;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import com.google.firebase.sessions.LogEnvironment;

/* JADX INFO: loaded from: classes.dex */
public final class bz8 {

    /* JADX INFO: renamed from: a */
    public static final bz8 f9201a = new bz8();

    /* JADX INFO: renamed from: b */
    public static final cc4 f9202b;

    static {
        of4 of4Var = new of4();
        of4Var.mo12901e(az8.class, k20.f46572a);
        of4Var.mo12901e(fz8.class, l20.f48911a);
        of4Var.mo12901e(wz1.class, i20.f43374a);
        of4Var.mo12901e(C3384nt.class, h20.f41672a);
        of4Var.mo12901e(C3297lg.class, g20.f40065a);
        of4Var.mo12901e(al7.class, j20.f44920a);
        of4Var.f54272d = true;
        f9202b = new cc4(of4Var);
    }

    /* JADX INFO: renamed from: a */
    public static C3384nt m4240a(q43 q43Var) throws PackageManager.NameNotFoundException {
        q43Var.m19644a();
        Context context = q43Var.f57252a;
        context.getClass();
        String packageName = context.getPackageName();
        PackageInfo packageInfo = context.getPackageManager().getPackageInfo(packageName, 0);
        String strValueOf = String.valueOf(packageInfo.getLongVersionCode());
        q43Var.m19644a();
        String str = q43Var.f57254c.f261b;
        str.getClass();
        Build.MODEL.getClass();
        Build.VERSION.RELEASE.getClass();
        LogEnvironment logEnvironment = LogEnvironment.LOG_ENVIRONMENT_PROD;
        packageName.getClass();
        String str2 = packageInfo.versionName;
        if (str2 == null) {
            str2 = strValueOf;
        }
        Build.MANUFACTURER.getClass();
        q43Var.m19644a();
        al7 al7VarM19014B = pb1.m19014B(context);
        q43Var.m19644a();
        return new C3384nt(str, logEnvironment, new C3297lg(packageName, str2, strValueOf, al7VarM19014B, pb1.m19052v(context)));
    }
}
