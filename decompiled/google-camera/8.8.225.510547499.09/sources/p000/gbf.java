package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class gbf implements gbi {

    /* JADX INFO: renamed from: a */
    private static final nbh f24092a = nbh.m17259h("com/google/android/apps/camera/one/photo/commands/ZslFallbackImageCaptureCommand");

    /* JADX INFO: renamed from: b */
    private final gbi f24093b;

    public gbf(gbi gbiVar) {
        this.f24093b = gbiVar;
    }

    @Override // p000.gbi
    /* JADX INFO: renamed from: a */
    public final jwn mo7626a() {
        return this.f24093b.mo7626a();
    }

    @Override // p000.gbi
    /* JADX INFO: renamed from: b */
    public final jwn mo7627b() {
        return this.f24093b.mo7627b();
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [gyh, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v7, types: [gav, java.lang.Object] */
    @Override // p000.gbi
    /* JADX INFO: renamed from: c */
    public final void mo7628c(gbh gbhVar, glk glkVar) {
        ((nbe) ((nbe) f24092a.m17252c()).mo17276G(2548)).mo17293r("Running fallback command: %s", this.f24093b);
        glkVar.f25502c.mo9905k().mo10404f();
        glkVar.f25501b.mo9015h();
        this.f24093b.mo7628c(gbhVar, glkVar);
    }
}
