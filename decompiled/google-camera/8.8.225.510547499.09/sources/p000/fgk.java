package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class fgk implements fbl, fbj, fbp {

    /* JADX INFO: renamed from: a */
    public volatile int f21914a = 1;

    /* JADX INFO: renamed from: b */
    private final ffr f21915b;

    /* JADX INFO: renamed from: c */
    private final jww f21916c;

    /* JADX INFO: renamed from: d */
    private final dhv f21917d;

    public fgk(ffr ffrVar, jww jwwVar, dhv dhvVar) {
        this.f21915b = ffrVar;
        this.f21916c = jwwVar;
        this.f21917d = dhvVar;
        jwwVar.mo3830a(new euz(this, 16), not.INSTANCE);
    }

    /* JADX INFO: renamed from: a */
    public final void m8390a() {
        String str;
        boolean zM8391d = m8391d();
        this.f21915b.mo8362f(zM8391d);
        if (zM8391d) {
            int i = this.f21914a;
            int i2 = i - 1;
            if (i == 0) {
                throw null;
            }
            switch (i2) {
                case 1:
                    this.f21915b.mo8364h(1);
                    return;
                case 2:
                    this.f21915b.mo8364h(2);
                    return;
                default:
                    switch (this.f21914a) {
                        case 1:
                            str = "MICROVIDEO_MODE_OFF";
                            break;
                        case 2:
                            str = "MICROVIDEO_MODE_AUTO";
                            break;
                        case 3:
                            str = "MICROVIDEO_MODE_ON";
                            break;
                        default:
                            str = "null";
                            break;
                    }
                    throw new RuntimeException("Unknown enabled microvideo mode: ".concat(str));
            }
        }
    }

    @Override // p000.fbj
    /* JADX INFO: renamed from: bE */
    public final void mo3522bE() {
        this.f21915b.mo8362f(false);
        this.f21915b.mo8366j(this);
    }

    @Override // p000.fbl
    /* JADX INFO: renamed from: bF */
    public final void mo3523bF() {
        this.f21915b.mo8365i(this);
        m8390a();
    }

    /* JADX INFO: renamed from: d */
    public final boolean m8391d() {
        ikw ikwVar = (ikw) this.f21916c.mo3831be();
        int i = this.f21914a;
        if (i != 3 && i != 2) {
            return false;
        }
        if (ikwVar == ikw.PHOTO) {
            return true;
        }
        dhv dhvVar = this.f21917d;
        dhx dhxVar = dib.f11240a;
        dhvVar.mo6177e();
        this.f21917d.mo6178f();
        return false;
    }
}
