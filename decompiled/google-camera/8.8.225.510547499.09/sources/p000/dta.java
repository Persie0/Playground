package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class dta implements ipm {

    /* JADX INFO: renamed from: a */
    private final /* synthetic */ int f12539a;

    /* JADX INFO: renamed from: b */
    private final Object f12540b;

    public dta(cvy cvyVar, int i, byte[] bArr) {
        this.f12539a = i;
        this.f12540b = cvyVar;
    }

    public dta(jwn jwnVar, int i) {
        this.f12539a = i;
        this.f12540b = jwnVar;
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, jwn] */
    @Override // p000.ipm
    /* JADX INFO: renamed from: a */
    public final synchronized ipk mo3626a(ipo ipoVar) {
        switch (this.f12539a) {
            case 0:
                return new dsz(ipoVar.mo11583b(), (cvy) this.f12540b, null);
            default:
                ipoVar.mo11583b();
                return new drf(((ipg) ipoVar).f31698b, this.f12540b);
        }
    }
}
