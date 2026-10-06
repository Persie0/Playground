package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class fsu implements ohi {

    /* JADX INFO: renamed from: a */
    private final oju f23516a;

    /* JADX INFO: renamed from: b */
    private final oju f23517b;

    /* JADX INFO: renamed from: c */
    private final oju f23518c;

    /* JADX INFO: renamed from: d */
    private final oju f23519d;

    /* JADX INFO: renamed from: e */
    private final oju f23520e;

    /* JADX INFO: renamed from: f */
    private final oju f23521f;

    /* JADX INFO: renamed from: g */
    private final /* synthetic */ int f23522g;

    public fsu(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4, oju ojuVar5, oju ojuVar6, int i) {
        this.f23522g = i;
        this.f23516a = ojuVar;
        this.f23517b = ojuVar2;
        this.f23518c = ojuVar3;
        this.f23519d = ojuVar4;
        this.f23520e = ojuVar5;
        this.f23521f = ojuVar6;
    }

    public fsu(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4, oju ojuVar5, oju ojuVar6, int i, byte[] bArr) {
        this.f23522g = i;
        this.f23516a = ojuVar;
        this.f23518c = ojuVar2;
        this.f23521f = ojuVar3;
        this.f23517b = ojuVar4;
        this.f23519d = ojuVar5;
        this.f23520e = ojuVar6;
    }

    /* JADX INFO: renamed from: a */
    public static fsu m8783a(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4, oju ojuVar5, oju ojuVar6) {
        return new fsu(ojuVar, ojuVar2, ojuVar3, ojuVar4, ojuVar5, ojuVar6, 0);
    }

    /* JADX INFO: renamed from: b */
    public static fsu m8784b(oju ojuVar, oju ojuVar2, oju ojuVar3, oju ojuVar4, oju ojuVar5, oju ojuVar6) {
        return new fsu(ojuVar, ojuVar2, ojuVar3, ojuVar4, ojuVar5, ojuVar6, 1, null);
    }

    @Override // p000.oju
    public final /* synthetic */ Object get() {
        switch (this.f23522g) {
            case 0:
                return new fst(((kbm) this.f23516a).get(), (dhv) this.f23517b.get(), (frk) this.f23518c.get(), (fqg) this.f23519d.get(), ((frb) this.f23520e).get(), (gva) this.f23521f.get(), 0, null);
            default:
                return new frf(((frc) this.f23516a).get(), ((cmv) this.f23518c).m3973a().intValue(), ((cmv) this.f23521f).m3973a().intValue(), ((cmv) this.f23517b).m3973a().intValue(), ((ftj) this.f23519d).m8789b().intValue(), (jwn) this.f23520e.get());
        }
    }
}
