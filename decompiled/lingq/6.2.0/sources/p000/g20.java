package p000;

import android.os.Build;

/* JADX INFO: loaded from: classes.dex */
public final class g20 implements fp6 {

    /* JADX INFO: renamed from: a */
    public static final g20 f40065a = new g20();

    /* JADX INFO: renamed from: b */
    public static final c33 f40066b = c33.m4296c("packageName");

    /* JADX INFO: renamed from: c */
    public static final c33 f40067c = c33.m4296c("versionName");

    /* JADX INFO: renamed from: d */
    public static final c33 f40068d = c33.m4296c("appBuildVersion");

    /* JADX INFO: renamed from: e */
    public static final c33 f40069e = c33.m4296c("deviceManufacturer");

    /* JADX INFO: renamed from: f */
    public static final c33 f40070f = c33.m4296c("currentProcessDetails");

    /* JADX INFO: renamed from: g */
    public static final c33 f40071g = c33.m4296c("appProcessDetails");

    @Override // p000.yr2
    /* JADX INFO: renamed from: a */
    public final void mo24a(Object obj, Object obj2) {
        C3297lg c3297lg = (C3297lg) obj;
        gp6 gp6Var = (gp6) obj2;
        gp6Var.mo12789a(f40066b, c3297lg.f49611a);
        gp6Var.mo12789a(f40067c, c3297lg.f49612b);
        gp6Var.mo12789a(f40068d, c3297lg.f49613c);
        gp6Var.mo12789a(f40069e, Build.MANUFACTURER);
        gp6Var.mo12789a(f40070f, c3297lg.f49614d);
        gp6Var.mo12789a(f40071g, c3297lg.f49615e);
    }
}
