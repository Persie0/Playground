package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ikv implements ohi {

    /* JADX INFO: renamed from: a */
    private final /* synthetic */ int f31389a;

    /* JADX INFO: renamed from: b */
    private final Object f31390b;

    public ikv(fws fwsVar, int i) {
        this.f31389a = i;
        this.f31390b = fwsVar;
    }

    public ikv(oju ojuVar, int i) {
        this.f31389a = i;
        this.f31390b = ojuVar;
    }

    /* JADX INFO: renamed from: a */
    public final ikw m11415a() {
        switch (this.f31389a) {
            case 0:
                ikw ikwVarM3505d = cds.m3505d(((eme) this.f31390b).get());
                ikwVarM3505d.getClass();
                return ikwVarM3505d;
            default:
                return (ikw) ((fws) this.f31390b).f23769f;
        }
    }

    @Override // p000.oju
    public final /* synthetic */ Object get() {
        switch (this.f31389a) {
            case 0:
                break;
        }
        return m11415a();
    }
}
