package p000;

import com.google.android.apps.camera.brella.mediastore.p007hP.wUzNh;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class gba implements gbi {

    /* JADX INFO: renamed from: a */
    private final gbi f24067a;

    /* JADX INFO: renamed from: b */
    private final mrm f24068b;

    /* JADX INFO: renamed from: c */
    private final boolean f24069c;

    /* JADX INFO: renamed from: d */
    private final boolean f24070d;

    /* JADX INFO: renamed from: e */
    private final kbz f24071e;

    /* JADX INFO: renamed from: f */
    private final kbo f24072f;

    /* JADX INFO: renamed from: g */
    private final inm f24073g;

    /* JADX INFO: renamed from: h */
    private final dhv f24074h;

    /* JADX INFO: renamed from: i */
    private final jwn f24075i;

    /* JADX INFO: renamed from: j */
    private final fvu f24076j;

    /* JADX INFO: renamed from: k */
    private final cwd f24077k;

    /* JADX INFO: renamed from: l */
    private final cwd f24078l;

    public gba(gbi gbiVar, mrm mrmVar, fvu fvuVar, ohb ohbVar, ohb ohbVar2, boolean z, boolean z2, kbn kbnVar, kbz kbzVar, inm inmVar, dhv dhvVar, jwn jwnVar) {
        this.f24067a = gbiVar;
        this.f24068b = mrmVar;
        this.f24076j = fvuVar;
        this.f24077k = cwd.m5640N(ohbVar);
        this.f24078l = cwd.m5640N(ohbVar2);
        this.f24069c = z;
        this.f24070d = z2;
        this.f24071e = kbzVar;
        this.f24073g = inmVar;
        this.f24074h = dhvVar;
        this.f24075i = jwnVar;
        this.f24072f = kbnVar.mo6314a("MicrovideoCapCmd");
    }

    @Override // p000.gbi
    /* JADX INFO: renamed from: a */
    public final jwn mo7626a() {
        return this.f24067a.mo7626a();
    }

    @Override // p000.gbi
    /* JADX INFO: renamed from: b */
    public final jwn mo7627b() {
        return this.f24067a.mo7627b();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [gyh, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v9, types: [gyh, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v5, types: [gyh, java.lang.Object] */
    @Override // p000.gbi
    /* JADX INFO: renamed from: c */
    public final void mo7628c(gbh gbhVar, glk glkVar) {
        this.f24071e.mo13961e("MvCaptureCommand");
        boolean z = !this.f24069c;
        boolean z2 = ((fua) glkVar.f25503d).f23581i;
        this.f24072f.mo13944f("captureImage: microvideoApi present=" + this.f24077k.m5652K() + " primaryCommand=" + this.f24067a.toString());
        ?? r2 = glkVar.f25502c;
        this.f24071e.mo13961e("setup");
        mrm mrmVarM16829i = r2 instanceof gxu ? mrm.m16829i((gxu) r2) : mqu.f41450a;
        if (!mrmVarM16829i.mo16813g()) {
            this.f24072f.mo13947i("Capture session not a Photo one: ".concat(String.valueOf(String.valueOf((Object) r2))));
        }
        fku fkuVarM6627g = null;
        if (this.f24077k.m5652K() && ((z || z2) && mrmVarM16829i.mo16813g())) {
            int iM3564b = cem.m3564b(((fua) glkVar.f25503d).f23573a, this.f24073g, this.f24076j, this.f24075i, this.f24074h);
            if (this.f24078l.m5652K()) {
                this.f24071e.mo13963g("createSession");
                fkuVarM6627g = ((drj) this.f24078l.m5651J()).m6627g(glkVar.f25502c.mo9898d(), glkVar.f25502c.mo9902h());
            }
            this.f24071e.mo13963g("attachSession");
            ((gxu) mrmVarM16829i.mo16809c()).f26758c = mrm.m16829i(((fgw) this.f24077k.m5651J()).mo8380a(r2, iM3564b, this.f24070d, fkuVarM6627g != null ? fkuVarM6627g.f22410a : kxk.m14965K(mqu.f41450a)));
        }
        if (z || z2 || !this.f24068b.mo16813g()) {
            this.f24071e.mo13963g("primaryCommand#captureImage");
            this.f24067a.mo7628c(gbhVar, glkVar);
        } else {
            this.f24071e.mo13963g("fallbackCommand#captureImage");
            ((gbi) this.f24068b.mo16809c()).mo7628c(gbhVar, glkVar);
        }
        if (fkuVarM6627g != null) {
            this.f24071e.mo13963g("deactivate");
            synchronized (fkuVarM6627g.f22415f) {
                if (!fkuVarM6627g.f22412c) {
                    fkuVarM6627g.f22410a.mo14894e(mqu.f41450a);
                }
                fkuVarM6627g.f22411b.close();
            }
        }
        this.f24071e.mo13962f();
        this.f24071e.mo13962f();
    }

    public final String toString() {
        mrl mrlVarM16765d = mpw.m16765d(this);
        mrlVarM16765d.f41475a = true;
        mrlVarM16765d.m16823b(wUzNh.ferXRiOas, this.f24067a);
        mrlVarM16765d.m16823b("fallback", this.f24068b.mo16812f());
        return mrlVarM16765d.toString();
    }
}
