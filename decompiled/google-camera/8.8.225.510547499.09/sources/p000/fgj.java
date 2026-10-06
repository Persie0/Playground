package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class fgj {

    /* JADX INFO: renamed from: a */
    private final boolean f21904a;

    /* JADX INFO: renamed from: b */
    private final ohb f21905b;

    /* JADX INFO: renamed from: c */
    private final inm f21906c;

    /* JADX INFO: renamed from: d */
    private final dhv f21907d;

    /* JADX INFO: renamed from: e */
    private final jwn f21908e;

    /* JADX INFO: renamed from: f */
    private final fvu f21909f;

    /* JADX INFO: renamed from: g */
    private final glk f21910g;

    /* JADX INFO: renamed from: h */
    private final cwd f21911h;

    /* JADX INFO: renamed from: i */
    private final cwd f21912i;

    /* JADX INFO: renamed from: j */
    private final cwd f21913j;

    public fgj(mrm mrmVar, ohb ohbVar, ohb ohbVar2, ohb ohbVar3, ohb ohbVar4, fvu fvuVar, inm inmVar, dhv dhvVar, glk glkVar, jwn jwnVar, byte[] bArr, byte[] bArr2) {
        this.f21904a = ((Boolean) mrmVar.mo16811e(false)).booleanValue();
        this.f21911h = cwd.m5640N(ohbVar);
        this.f21912i = cwd.m5640N(ohbVar2);
        this.f21913j = cwd.m5640N(ohbVar3);
        this.f21905b = ohbVar4;
        this.f21910g = glkVar;
        this.f21909f = fvuVar;
        this.f21906c = inmVar;
        this.f21907d = dhvVar;
        this.f21908e = jwnVar;
    }

    /* JADX INFO: renamed from: d */
    private static ftf m8386d(gof gofVar) {
        return new gjz(gofVar, 1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [gyh, java.lang.Object] */
    /* JADX INFO: renamed from: a */
    public final mrm m8387a() {
        if (!this.f21911h.m5652K()) {
            return mqu.f41450a;
        }
        glk glkVar = this.f21910g;
        return mrm.m16829i(((fgw) this.f21911h.m5651J()).mo8380a(glkVar.f25502c, cem.m3564b(((fua) glkVar.f25503d).f23573a, this.f21906c, this.f21909f, this.f21908e, this.f21907d), false, kxk.m14965K(mqu.f41450a)));
    }

    /* JADX WARN: Type inference failed for: r1v5, types: [gyh, java.lang.Object] */
    /* JADX INFO: renamed from: b */
    public final void m8388b() {
        if (this.f21904a) {
            ((ftb) this.f21912i.m5651J()).mo8747q(m8386d((gof) this.f21905b.get()), this.f21910g);
            ((fti) this.f21913j.m5651J()).mo8761f(this.f21910g.f25502c.mo9902h());
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m8389c() {
        if (this.f21904a) {
            ((ftb) this.f21912i.m5651J()).mo8745o(m8386d((gof) this.f21905b.get()), this.f21910g);
        }
    }
}
