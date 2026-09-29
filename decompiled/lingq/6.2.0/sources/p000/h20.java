package p000;

import android.os.Build;

/* JADX INFO: loaded from: classes.dex */
public final class h20 implements fp6 {

    /* JADX INFO: renamed from: a */
    public static final h20 f41672a = new h20();

    /* JADX INFO: renamed from: b */
    public static final c33 f41673b = c33.m4296c("appId");

    /* JADX INFO: renamed from: c */
    public static final c33 f41674c = c33.m4296c("deviceModel");

    /* JADX INFO: renamed from: d */
    public static final c33 f41675d = c33.m4296c("sessionSdkVersion");

    /* JADX INFO: renamed from: e */
    public static final c33 f41676e = c33.m4296c("osVersion");

    /* JADX INFO: renamed from: f */
    public static final c33 f41677f = c33.m4296c("logEnvironment");

    /* JADX INFO: renamed from: g */
    public static final c33 f41678g = c33.m4296c("androidAppInfo");

    @Override // p000.yr2
    /* JADX INFO: renamed from: a */
    public final void mo24a(Object obj, Object obj2) {
        C3384nt c3384nt = (C3384nt) obj;
        gp6 gp6Var = (gp6) obj2;
        gp6Var.mo12789a(f41673b, c3384nt.f53225a);
        gp6Var.mo12789a(f41674c, Build.MODEL);
        gp6Var.mo12789a(f41675d, "3.0.6");
        gp6Var.mo12789a(f41676e, Build.VERSION.RELEASE);
        gp6Var.mo12789a(f41677f, c3384nt.f53226b);
        gp6Var.mo12789a(f41678g, c3384nt.f53227c);
    }
}
