package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class cso implements kba {

    /* JADX INFO: renamed from: a */
    public final ggm f9362a;

    /* JADX INFO: renamed from: f */
    private final inm f9367f;

    /* JADX INFO: renamed from: g */
    private final dhv f9368g;

    /* JADX INFO: renamed from: h */
    private final jwn f9369h;

    /* JADX INFO: renamed from: i */
    private final jwn f9370i;

    /* JADX INFO: renamed from: j */
    private jvb f9371j;

    /* JADX INFO: renamed from: b */
    public final jwf f9363b = new jwf(0);

    /* JADX INFO: renamed from: c */
    public final jwf f9364c = new jwf(kay.CLOCKWISE_0);

    /* JADX INFO: renamed from: d */
    public final Object f9365d = new Object();

    /* JADX INFO: renamed from: e */
    public boolean f9366e = false;

    /* JADX INFO: renamed from: k */
    private final kos f9372k = new das(this, 1);

    public cso(jwn jwnVar, ggm ggmVar, inm inmVar, dhv dhvVar, jwn jwnVar2) {
        this.f9369h = jwnVar;
        this.f9362a = ggmVar;
        this.f9367f = inmVar;
        this.f9368g = dhvVar;
        this.f9370i = jwnVar2;
    }

    /* JADX INFO: renamed from: a */
    public final jwn m5465a() {
        m5469e();
        return this.f9364c;
    }

    /* JADX INFO: renamed from: b */
    public final Integer m5466b(kay kayVar) {
        jwn jwnVar = this.f9369h;
        jwnVar.getClass();
        dci dciVar = (dci) jwnVar.mo3831be();
        dciVar.m5923a();
        return Integer.valueOf(cem.m3563a(this.f9368g.mo6184l(dib.f11315bV) ? ((Integer) this.f9370i.mo3831be()).intValue() : dciVar.f10511c.mo14553f(), kayVar.f35503e, this.f9367f, dciVar.m5924b(), this.f9368g));
    }

    /* JADX INFO: renamed from: c */
    public final void m5467c() {
        synchronized (this.f9365d) {
            m5469e();
            if (this.f9366e) {
                return;
            }
            this.f9363b.mo3415bf(m5466b(this.f9362a.mo9215c()));
            this.f9364c.mo3415bf(kay.m13889b(m5466b(this.f9362a.mo9215c()).intValue()));
            this.f9366e = true;
        }
    }

    @Override // p000.kba, java.lang.AutoCloseable
    public final void close() {
        synchronized (this.f9365d) {
            jvb jvbVar = this.f9371j;
            if (jvbVar != null && !jvbVar.mo8995b()) {
                this.f9362a.mo9218h(this.f9372k);
                jvbVar.close();
                this.f9371j = null;
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m5468d() {
        synchronized (this.f9365d) {
            m5469e();
            if (this.f9366e) {
                this.f9366e = false;
                this.f9363b.mo3415bf(m5466b(this.f9362a.mo9215c()));
                this.f9364c.mo3415bf(kay.m13889b(m5466b(this.f9362a.mo9215c()).intValue()));
            }
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m5469e() {
        synchronized (this.f9365d) {
            jvb jvbVar = this.f9371j;
            if (jvbVar == null || jvbVar.mo8995b()) {
                jvb jvbVar2 = new jvb();
                this.f9363b.mo3415bf(m5466b(this.f9362a.mo9215c()));
                this.f9364c.mo3415bf(kay.m13889b(m5466b(this.f9362a.mo9215c()).intValue()));
                this.f9362a.mo9217g(this.f9372k);
                jvbVar2.m13537d(this.f9369h.mo3830a(new ckv(this, 12), not.INSTANCE));
                this.f9371j = jvbVar2;
            }
        }
    }
}
