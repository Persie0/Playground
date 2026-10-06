package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class bjt implements bjo {

    /* JADX INFO: renamed from: a */
    public final String f3523a;

    /* JADX INFO: renamed from: b */
    public final bjl f3524b;

    /* JADX INFO: renamed from: c */
    public final bjl f3525c;

    /* JADX INFO: renamed from: d */
    public final bjb f3526d;

    /* JADX INFO: renamed from: e */
    public final boolean f3527e;

    public bjt(String str, bjl bjlVar, bjl bjlVar2, bjb bjbVar, boolean z) {
        this.f3523a = str;
        this.f3524b = bjlVar;
        this.f3525c = bjlVar2;
        this.f3526d = bjbVar;
        this.f3527e = z;
    }

    @Override // p000.bjo
    /* JADX INFO: renamed from: a */
    public final bhi mo2528a(bgv bgvVar, bkc bkcVar) {
        return new bhu(bgvVar, bkcVar, this);
    }

    public final String toString() {
        return "RectangleShape{position=" + String.valueOf(this.f3524b) + ", size=" + String.valueOf(this.f3525c) + "}";
    }
}
