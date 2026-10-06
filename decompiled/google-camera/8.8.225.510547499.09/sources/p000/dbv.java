package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class dbv implements dcl {

    /* JADX INFO: renamed from: a */
    public final cwd f10449a;

    /* JADX INFO: renamed from: b */
    private final jvd f10450b;

    /* JADX INFO: renamed from: c */
    private final ddq f10451c;

    /* JADX INFO: renamed from: d */
    private final dck f10452d;

    /* JADX INFO: renamed from: e */
    private final fcp f10453e;

    /* JADX INFO: renamed from: f */
    private final kbo f10454f;

    /* JADX INFO: renamed from: g */
    private final dcf f10455g;

    public dbv(dck dckVar, jvd jvdVar, ddq ddqVar, cwd cwdVar, fcp fcpVar, kbo kboVar, dcf dcfVar, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.f10452d = dckVar;
        this.f10450b = jvdVar;
        this.f10451c = ddqVar;
        this.f10449a = cwdVar;
        this.f10453e = fcpVar;
        this.f10455g = dcfVar;
        this.f10454f = kboVar.mo6314a("CamUnavailableHndlr");
    }

    @Override // p000.dcl
    /* JADX INFO: renamed from: a */
    public final void mo5908a() {
        this.f10451c.mo5949i();
    }

    @Override // p000.dcl
    /* JADX INFO: renamed from: b */
    public final void mo5909b() {
        this.f10451c.mo5950j();
        kxk.m14975U(this.f10451c.mo5943c(), new cmo(this, 8), this.f10450b);
    }

    @Override // p000.dcl
    /* JADX INFO: renamed from: c */
    public final void mo5910c() {
        this.f10451c.mo5951k();
        kxk.m14975U(this.f10451c.mo5944d(), new cmo(this, 7), this.f10450b);
    }

    /* JADX INFO: renamed from: d */
    public final void m5911d(ddj ddjVar, int i, int i2, int i3) {
        DialogInterfaceC0155eg dialogInterfaceC0155egMo5906c;
        this.f10454f.mo13940b(ddjVar.toString());
        int iM6034d = dez.m6034d(ddjVar, i, i2, this.f10449a.m5671s());
        if (iM6034d == 4) {
            dialogInterfaceC0155egMo5906c = this.f10452d.mo5904a(i3);
        } else {
            dialogInterfaceC0155egMo5906c = iM6034d == 3 ? this.f10452d.mo5906c(i3) : this.f10452d.mo5905b(i3);
        }
        if (this.f10455g.m5922b(dialogInterfaceC0155egMo5906c)) {
            this.f10454f.mo13940b("Showing hardware help dialog for unavailability of any cameras due to reason: " + dcn.m5925a(i3) + " at stage " + nea.m17402p(iM6034d));
            this.f10453e.mo8148W(2, iM6034d, i3, null, 0);
        }
    }
}
