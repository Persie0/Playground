package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class gbb implements gbi {

    /* JADX INFO: renamed from: a */
    private static final nbh f24079a = nbh.m17259h("com/google/android/apps/camera/one/photo/commands/PortraitCaptureCommand");

    /* JADX INFO: renamed from: b */
    private final gbi f24080b;

    /* JADX INFO: renamed from: c */
    private final jwn f24081c;

    /* JADX INFO: renamed from: d */
    private final gdt f24082d;

    /* JADX INFO: renamed from: e */
    private final mca f24083e;

    public gbb(gdt gdtVar, mca mcaVar, gbi gbiVar, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.f24082d = gdtVar;
        this.f24083e = mcaVar;
        this.f24080b = gbiVar;
        this.f24081c = jwr.m13634d(gbiVar.mo7626a(), jwr.m13635e(gdtVar.f24337a, 1));
    }

    @Override // p000.gbi
    /* JADX INFO: renamed from: a */
    public final jwn mo7626a() {
        return this.f24081c;
    }

    @Override // p000.gbi
    /* JADX INFO: renamed from: b */
    public final jwn mo7627b() {
        return this.f24080b.mo7627b();
    }

    @Override // p000.gbi
    /* JADX INFO: renamed from: c */
    public final void mo7628c(gbh gbhVar, glk glkVar) {
        boolean z;
        int i;
        gdt gdtVar = this.f24082d;
        synchronized (gdtVar.f24338b) {
            z = false;
            if (!gdtVar.f24342f && gdtVar.f24339c.isEmpty() && (i = gdtVar.f24341e) > 0) {
                gdtVar.f24341e = i - 1;
                gdtVar.f24340d.f34974a = Integer.valueOf(gdtVar.m9081a());
                z = true;
            }
        }
        gdtVar.f24340d.m13646c();
        gdv gdvVar = z ? new gdv(gdtVar, 1) : null;
        this.f24082d.f24337a.mo3831be();
        if (gdvVar == null) {
            ((nbe) ((nbe) f24079a.m17252c()).mo17276G((char) 2547)).mo17290o("Ticket not available");
            return;
        }
        Object obj = glkVar.f25502c;
        mrm mrmVarM16828h = mrm.m16828h((gxt) obj);
        if (!mrmVarM16828h.mo16813g()) {
            ((nbe) ((nbe) f24079a.m17252c()).mo17276G((char) 2546)).mo17293r("Capture session not a MultiImageCaptureSession: %s", obj);
        }
        fgj fgjVarM16306d = this.f24083e.m16306d(glkVar);
        fgjVarM16306d.m8388b();
        if (mrmVarM16828h.mo16813g()) {
            mrm mrmVarM8387a = fgjVarM16306d.m8387a();
            if (mrmVarM8387a.mo16813g()) {
                ((gxt) mrmVarM16828h.mo16809c()).f26755c = mrm.m16829i((fgv) mrmVarM8387a.mo16809c());
            }
        }
        ((fua) glkVar.f25503d).f23578f.m13537d(gdvVar);
        this.f24080b.mo7628c(gbhVar, glkVar);
        fgjVarM16306d.m8389c();
    }
}
