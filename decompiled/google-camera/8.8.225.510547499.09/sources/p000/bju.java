package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class bju implements bjo {

    /* JADX INFO: renamed from: a */
    public final String f3528a;

    /* JADX INFO: renamed from: b */
    public final bjb f3529b;

    /* JADX INFO: renamed from: c */
    public final bjb f3530c;

    /* JADX INFO: renamed from: d */
    public final bjk f3531d;

    /* JADX INFO: renamed from: e */
    public final boolean f3532e;

    public bju(String str, bjb bjbVar, bjb bjbVar2, bjk bjkVar, boolean z) {
        this.f3528a = str;
        this.f3529b = bjbVar;
        this.f3530c = bjbVar2;
        this.f3531d = bjkVar;
        this.f3532e = z;
    }

    @Override // p000.bjo
    /* JADX INFO: renamed from: a */
    public final bhi mo2528a(bgv bgvVar, bkc bkcVar) {
        return new bhv(bgvVar, bkcVar, this);
    }
}
