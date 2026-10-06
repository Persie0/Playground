package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class gbe implements gbi {

    /* JADX INFO: renamed from: a */
    private final gbi f24089a;

    /* JADX INFO: renamed from: b */
    private final boolean f24090b;

    /* JADX INFO: renamed from: c */
    private final int f24091c;

    public gbe(gbi gbiVar, int i, boolean z) {
        gbiVar.getClass();
        this.f24089a = gbiVar;
        this.f24091c = i;
        this.f24090b = z;
    }

    @Override // p000.gbi
    /* JADX INFO: renamed from: a */
    public final jwn mo7626a() {
        return this.f24089a.mo7626a();
    }

    @Override // p000.gbi
    /* JADX INFO: renamed from: b */
    public final jwn mo7627b() {
        return this.f24089a.mo7627b();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [gyh, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v3, types: [gyh, java.lang.Object] */
    @Override // p000.gbi
    /* JADX INFO: renamed from: c */
    public final void mo7628c(gbh gbhVar, glk glkVar) {
        ((hjz) glkVar.f25502c.mo9905k()).f28077c = this.f24090b;
        glkVar.f25502c.mo9896ab(this.f24091c);
        this.f24089a.mo7628c(gbhVar, glkVar);
    }

    public final String toString() {
        mrl mrlVarM16765d = mpw.m16765d(this);
        mrlVarM16765d.m16823b("delegate", this.f24089a);
        return mrlVarM16765d.toString();
    }
}
