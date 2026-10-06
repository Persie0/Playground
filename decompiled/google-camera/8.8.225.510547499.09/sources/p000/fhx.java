package p000;

import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class fhx implements kyq {

    /* JADX INFO: renamed from: a */
    public static final nbh f22082a = nbh.m17259h("com/google/android/apps/camera/microvideo/encoder/LoggingMuxer");

    /* JADX INFO: renamed from: b */
    public final String f22083b;

    /* JADX INFO: renamed from: c */
    public final dhv f22084c;

    /* JADX INFO: renamed from: d */
    private final kyq f22085d;

    /* JADX INFO: renamed from: e */
    private final AtomicInteger f22086e = new AtomicInteger(0);

    public fhx(String str, dhv dhvVar, kyq kyqVar) {
        this.f22083b = str;
        this.f22085d = kyqVar;
        this.f22084c = dhvVar;
        nps npsVarMo8411b = kyqVar.mo8411b();
        npsVarMo8411b.mo2282d(new ewo(npsVarMo8411b, str, 13), not.INSTANCE);
    }

    @Override // p000.kyq
    /* JADX INFO: renamed from: a */
    public final kyt mo8410a() {
        return new fhw(this, this.f22085d.mo8410a(), this.f22086e.getAndIncrement());
    }

    @Override // p000.kyq
    /* JADX INFO: renamed from: b */
    public final nps mo8411b() {
        return this.f22085d.mo8411b();
    }

    @Override // p000.kyq
    /* JADX INFO: renamed from: c */
    public final void mo8412c() {
        ((nbe) ((nbe) f22082a.m17252c()).mo17276G(2310)).mo17293r("%s: muxer cancelled.", this.f22083b);
        this.f22085d.mo8412c();
    }

    @Override // p000.kyq
    /* JADX INFO: renamed from: d */
    public final void mo8413d() {
        ((nbe) ((nbe) f22082a.m17252c()).mo17276G(2314)).mo17293r("%s: starting.", this.f22083b);
        this.f22085d.mo8413d();
    }
}
