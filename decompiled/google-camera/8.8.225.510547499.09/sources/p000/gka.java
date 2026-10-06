package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class gka implements gbi {

    /* JADX INFO: renamed from: a */
    private final /* synthetic */ int f25223a;

    /* JADX INFO: renamed from: b */
    private final Object f25224b;

    /* JADX INFO: renamed from: c */
    private final Object f25225c;

    /* JADX INFO: renamed from: d */
    private final Object f25226d;

    /* JADX INFO: renamed from: e */
    private final Object f25227e;

    public gka(gbi gbiVar, cwd cwdVar, cwd cwdVar2, gof gofVar, int i, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.f25223a = i;
        this.f25225c = cwdVar;
        this.f25224b = gbiVar;
        this.f25226d = cwdVar2;
        this.f25227e = gofVar;
    }

    public gka(kbn kbnVar, jwn jwnVar, int i) {
        this.f25223a = i;
        this.f25226d = jwnVar;
        this.f25227e = kbnVar.mo6314a("ImgCptrSwitch");
        this.f25225c = jwh.m13623c(jwr.m13640j(jwnVar, new cev(5)));
        this.f25224b = jwh.m13623c(jwr.m13640j(jwnVar, new cev(6)));
    }

    /* JADX INFO: renamed from: d */
    private static ftf m9352d(gof gofVar) {
        return new gjz(gofVar, 0);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [gbi, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, jwn] */
    @Override // p000.gbi
    /* JADX INFO: renamed from: a */
    public final jwn mo7626a() {
        switch (this.f25223a) {
            case 0:
                return this.f25224b.mo7626a();
            default:
                return this.f25225c;
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [gbi, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, jwn] */
    @Override // p000.gbi
    /* JADX INFO: renamed from: b */
    public final jwn mo7627b() {
        switch (this.f25223a) {
            case 0:
                return this.f25224b.mo7627b();
            default:
                return this.f25224b;
        }
    }

    /* JADX WARN: Type inference failed for: r0v12, types: [gyh, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v18, types: [gbi, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v19, types: [gof, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v25, types: [java.lang.Object, jwn] */
    /* JADX WARN: Type inference failed for: r0v4, types: [gbi, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v0, types: [gof, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v3, types: [gyh, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v5, types: [gyh, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v7, types: [java.lang.Object, kbo] */
    @Override // p000.gbi
    /* JADX INFO: renamed from: c */
    public final void mo7628c(gbh gbhVar, glk glkVar) {
        switch (this.f25223a) {
            case 0:
                if (((cwd) this.f25225c).m5652K() && ((cwd) this.f25226d).m5652K()) {
                    ((ftb) ((cwd) this.f25225c).m5651J()).mo8747q(m9352d(this.f25227e), glkVar);
                    if (glkVar.f25502c.mo9903i() == gyw.LONG_SHOT) {
                        ((fti) ((cwd) this.f25226d).m5651J()).mo8760e(glkVar.f25502c.mo9902h());
                    } else {
                        ((fti) ((cwd) this.f25226d).m5651J()).mo8761f(glkVar.f25502c.mo9902h());
                    }
                    this.f25224b.mo7628c(gbhVar, glkVar);
                    ((ftb) ((cwd) this.f25225c).m5651J()).mo8745o(m9352d(this.f25227e), glkVar);
                } else {
                    this.f25224b.mo7628c(gbhVar, glkVar);
                }
                break;
            default:
                gbi gbiVar = (gbi) this.f25226d.mo3831be();
                this.f25227e.mo13940b("Running command: ".concat(String.valueOf(gbiVar.toString())));
                gbiVar.mo7628c(gbhVar, glkVar);
                break;
        }
    }

    public final String toString() {
        switch (this.f25223a) {
            case 0:
                mrl mrlVarM16765d = mpw.m16765d(this);
                mrlVarM16765d.m16823b("delegate", this.f25224b);
                return mrlVarM16765d.toString();
            default:
                mrl mrlVarM16765d2 = mpw.m16765d(this);
                mrlVarM16765d2.m16822a(this.f25226d);
                return mrlVarM16765d2.toString();
        }
    }
}
