package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class kdg implements kdf {

    /* JADX INFO: renamed from: a */
    private final kat f35639a;

    /* JADX INFO: renamed from: b */
    private final kdf f35640b;

    /* JADX INFO: renamed from: c */
    private boolean f35641c = true;

    /* JADX INFO: renamed from: d */
    private boolean f35642d = false;

    public kdg(kdf kdfVar, kat katVar) {
        this.f35640b = kdfVar;
        this.f35639a = katVar;
    }

    @Override // p000.kdf
    /* JADX INFO: renamed from: a */
    public final kmd mo13994a() {
        if (this.f35641c) {
            this.f35641c = false;
            kmd kmdVarMo13994a = this.f35640b.mo13994a();
            while (kmdVarMo13994a != null) {
                if (((Boolean) this.f35639a.mo13589a(kmdVarMo13994a)).booleanValue()) {
                    this.f35642d = true;
                    return kmdVarMo13994a;
                }
                kmdVarMo13994a = this.f35640b.mo13994a();
            }
            this.f35640b.mo13995b();
        }
        if (!this.f35642d) {
            return this.f35640b.mo13994a();
        }
        kmd kmdVarMo13994a2 = this.f35640b.mo13994a();
        while (kmdVarMo13994a2 != null) {
            if (((Boolean) this.f35639a.mo13589a(kmdVarMo13994a2)).booleanValue()) {
                return kmdVarMo13994a2;
            }
            kmdVarMo13994a2 = this.f35640b.mo13994a();
        }
        return null;
    }

    @Override // p000.kdf
    /* JADX INFO: renamed from: b */
    public final void mo13995b() {
        this.f35640b.mo13995b();
    }
}
