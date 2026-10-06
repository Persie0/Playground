package p000;

import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class gbl implements gax {

    /* JADX INFO: renamed from: a */
    public final nps f24103a;

    /* JADX INFO: renamed from: b */
    public final kbo f24104b;

    /* JADX INFO: renamed from: c */
    public final jws f24105c;

    /* JADX INFO: renamed from: d */
    public final jwf f24106d = new jwf(false);

    /* JADX INFO: renamed from: e */
    public final AtomicInteger f24107e = new AtomicInteger(0);

    /* JADX INFO: renamed from: f */
    public final hah f24108f;

    /* JADX INFO: renamed from: g */
    public final cwd f24109g;

    /* JADX INFO: renamed from: h */
    private final fvy f24110h;

    /* JADX INFO: renamed from: i */
    private final ccz f24111i;

    /* JADX INFO: renamed from: j */
    private final kbz f24112j;

    public gbl(fvy fvyVar, nps npsVar, kbn kbnVar, ccz cczVar, hah hahVar, ohb ohbVar, boolean z, kbz kbzVar) {
        this.f24110h = fvyVar;
        this.f24104b = kbnVar.mo6314a("PictureTakerImpl");
        this.f24111i = cczVar;
        this.f24103a = npsVar;
        this.f24108f = hahVar;
        this.f24112j = kbzVar;
        this.f24109g = cwd.m5640N(ohbVar);
        this.f24105c = new jws(new lqk(this, fvyVar, z, 1));
        npsVar.mo2282d(new fzz(this, 10), not.INSTANCE);
    }

    @Override // p000.gax
    /* JADX INFO: renamed from: a */
    public final jwn mo9017a() {
        return jwh.m13623c(this.f24105c);
    }

    @Override // p000.gax
    /* JADX INFO: renamed from: b */
    public final jwn mo9018b() {
        return this.f24106d;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [gav, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v1, types: [gyh, java.lang.Object] */
    @Override // p000.gax
    /* JADX INFO: renamed from: c */
    public final nps mo9019c(glk glkVar) {
        if (this.f24110h.m8842a()) {
            this.f24104b.mo13942d("Take picture was invoked, but the executor is shutting down!");
            glkVar.f25501b.mo9013f();
            glkVar.f25502c.mo9917w(new kec("Invoked when executor shutting down."));
            return kxk.m14963I();
        }
        nqf nqfVarM17621g = nqf.m17621g();
        this.f24106d.mo3415bf(Boolean.valueOf(this.f24107e.incrementAndGet() > 0));
        this.f24105c.m13643c();
        this.f24110h.m8843b(new gbk(this, new gbj(this, nqfVarM17621g), glkVar, this.f24111i, this.f24112j, null, null));
        return nqfVarM17621g;
    }
}
