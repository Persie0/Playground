package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class fne implements ohi {

    /* JADX INFO: renamed from: a */
    private final oju f22780a;

    /* JADX INFO: renamed from: b */
    private final oju f22781b;

    /* JADX INFO: renamed from: c */
    private final /* synthetic */ int f22782c;

    public fne(oju ojuVar, oju ojuVar2, int i) {
        this.f22782c = i;
        this.f22780a = ojuVar;
        this.f22781b = ojuVar2;
    }

    public fne(oju ojuVar, oju ojuVar2, int i, byte[] bArr) {
        this.f22782c = i;
        this.f22781b = ojuVar;
        this.f22780a = ojuVar2;
    }

    @Override // p000.oju
    public final /* synthetic */ Object get() {
        switch (this.f22782c) {
            case 0:
                break;
            case 1:
                break;
        }
        return m8604a();
    }

    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kmd] */
    /* JADX INFO: renamed from: a */
    public final kmd m8604a() {
        switch (this.f22782c) {
            case 0:
                djm djmVar = (djm) this.f22780a.get();
                fws fwsVar = (fws) this.f22781b.get();
                Object obj = djmVar.f11787a;
                kmg kmgVarM8910c = fwsVar.m8910c();
                kmgVarM8910c.getClass();
                return ((djm) obj).m6244s(kmgVarM8910c).f12521a;
            case 1:
                return ((kms) this.f22780a.get()).mo13854a(((cwa) this.f22781b).get().f9336a);
            default:
                return ((kak) this.f22781b).get().mo13854a(((khc) this.f22780a).get().f35837a);
        }
    }
}
