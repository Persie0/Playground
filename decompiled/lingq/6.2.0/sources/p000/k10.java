package p000;

/* JADX INFO: loaded from: classes.dex */
public final class k10 implements fp6 {

    /* JADX INFO: renamed from: a */
    public static final k10 f46526a = new k10();

    /* JADX INFO: renamed from: b */
    public static final c33 f46527b = c33.m4296c("batteryLevel");

    /* JADX INFO: renamed from: c */
    public static final c33 f46528c = c33.m4296c("batteryVelocity");

    /* JADX INFO: renamed from: d */
    public static final c33 f46529d = c33.m4296c("proximityOn");

    /* JADX INFO: renamed from: e */
    public static final c33 f46530e = c33.m4296c("orientation");

    /* JADX INFO: renamed from: f */
    public static final c33 f46531f = c33.m4296c("ramUsed");

    /* JADX INFO: renamed from: g */
    public static final c33 f46532g = c33.m4296c("diskUsed");

    @Override // p000.yr2
    /* JADX INFO: renamed from: a */
    public final void mo24a(Object obj, Object obj2) {
        mq1 mq1Var = (mq1) obj;
        gp6 gp6Var = (gp6) obj2;
        gp6Var.mo12789a(f46527b, ((y30) mq1Var).f69197a);
        y30 y30Var = (y30) mq1Var;
        gp6Var.mo12791e(f46528c, y30Var.f69198b);
        gp6Var.mo12790d(f46529d, y30Var.f69199c);
        gp6Var.mo12791e(f46530e, y30Var.f69200d);
        gp6Var.mo12793g(f46531f, y30Var.f69201e);
        gp6Var.mo12793g(f46532g, y30Var.f69202f);
    }
}
