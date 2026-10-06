package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class bci implements bce {

    /* JADX INFO: renamed from: a */
    public final apt f2942a;

    /* JADX INFO: renamed from: b */
    public final aqa f2943b;

    /* JADX INFO: renamed from: c */
    public final aqa f2944c;

    /* JADX INFO: renamed from: d */
    private final apo f2945d;

    public bci(apt aptVar) {
        this.f2942a = aptVar;
        this.f2945d = new bcf(aptVar);
        this.f2943b = new bcg(aptVar);
        this.f2944c = new bch(aptVar);
    }

    @Override // p000.bce
    /* JADX INFO: renamed from: a */
    public final void mo2193a(bcd bcdVar) {
        this.f2942a.m1824l();
        this.f2942a.m1825m();
        try {
            this.f2945d.m1806a(bcdVar);
            this.f2942a.m1829q();
        } finally {
            this.f2942a.m1827o();
        }
    }
}
