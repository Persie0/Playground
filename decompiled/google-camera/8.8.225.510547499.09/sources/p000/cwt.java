package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class cwt {

    /* JADX INFO: renamed from: a */
    public jxp f9891a = jxp.RES_1080P;

    /* JADX INFO: renamed from: b */
    private final cwo f9892b;

    /* JADX INFO: renamed from: c */
    private final cwq f9893c;

    /* JADX INFO: renamed from: d */
    private final cwm f9894d;

    /* JADX INFO: renamed from: e */
    private final cwl f9895e;

    /* JADX INFO: renamed from: f */
    private final jww f9896f;

    /* JADX INFO: renamed from: g */
    private final jwf f9897g;

    public cwt(cwo cwoVar, cwq cwqVar, jwf jwfVar, cwm cwmVar, cwl cwlVar, jww jwwVar) {
        this.f9897g = jwfVar;
        this.f9892b = cwoVar;
        this.f9893c = cwqVar;
        this.f9894d = cwmVar;
        this.f9895e = cwlVar;
        this.f9896f = jwwVar;
    }

    /* JADX INFO: renamed from: a */
    public final cws m5690a(ikw ikwVar) {
        ikw ikwVar2 = ikw.UNINITIALIZED;
        switch (ikwVar.ordinal()) {
            case 2:
                if (this.f9896f.mo3831be() == cxk.CINEMATIC) {
                    return this.f9895e;
                }
                return this.f9891a.m13663d() ? this.f9893c : this.f9892b;
            case 5:
                return this.f9897g;
            case 8:
                return this.f9894d;
            default:
                return this.f9892b;
        }
    }
}
