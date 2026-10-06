package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class bka implements bjo {

    /* JADX INFO: renamed from: a */
    public final bjb f3560a;

    /* JADX INFO: renamed from: b */
    public final bjb f3561b;

    /* JADX INFO: renamed from: c */
    public final bjb f3562c;

    /* JADX INFO: renamed from: d */
    public final boolean f3563d;

    /* JADX INFO: renamed from: e */
    public final int f3564e;

    public bka(int i, bjb bjbVar, bjb bjbVar2, bjb bjbVar3, boolean z) {
        this.f3564e = i;
        this.f3560a = bjbVar;
        this.f3561b = bjbVar2;
        this.f3562c = bjbVar3;
        this.f3563d = z;
    }

    @Override // p000.bjo
    /* JADX INFO: renamed from: a */
    public final bhi mo2528a(bgv bgvVar, bkc bkcVar) {
        return new bhy(bkcVar, this);
    }

    public final String toString() {
        return "Trim Path: {start: " + String.valueOf(this.f3560a) + ", end: " + String.valueOf(this.f3561b) + ", offset: " + String.valueOf(this.f3562c) + "}";
    }
}
