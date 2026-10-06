package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class kks implements klc {

    /* JADX INFO: renamed from: a */
    private static final kba f36405a = new gog(14);

    /* JADX INFO: renamed from: b */
    private final kgg f36406b;

    /* JADX INFO: renamed from: c */
    private final kle f36407c;

    /* JADX INFO: renamed from: d */
    private kfd f36408d = null;

    public kks(kgg kggVar, kle kleVar) {
        this.f36406b = kggVar;
        this.f36407c = kleVar;
    }

    /* JADX INFO: renamed from: e */
    public static klc m14455e(kgg kggVar, kle kleVar) {
        kleVar.getClass();
        return new kks(kggVar, kleVar);
    }

    /* JADX INFO: renamed from: f */
    public static klc m14456f(kgg kggVar) {
        return (!(kggVar instanceof kky) || ((kky) kggVar).mo14451f() <= 0) ? m14457g(kggVar) : new kks(kggVar, kle.m14477g());
    }

    /* JADX INFO: renamed from: g */
    public static klc m14457g(kgg kggVar) {
        boolean z = true;
        if ((kggVar instanceof kky) && ((kky) kggVar).mo14451f() > 0) {
            z = false;
        }
        lku.m15670x(z, "Cannot create a streamResult from a stream that uses more than 0 bytesPerImage");
        return new kks(kggVar, null);
    }

    @Override // p000.klc
    /* JADX INFO: renamed from: a */
    public final kba mo14458a() {
        kle kleVar = this.f36407c;
        return kleVar != null ? kleVar.m14478a() : f36405a;
    }

    @Override // p000.klc
    /* JADX INFO: renamed from: b */
    public final kba mo14459b() {
        kle kleVar = this.f36407c;
        return kleVar != null ? kleVar.m14479b() : f36405a;
    }

    @Override // p000.klc
    /* JADX INFO: renamed from: c */
    public final synchronized kfd mo14460c() {
        return this.f36408d;
    }

    @Override // p000.klc
    /* JADX INFO: renamed from: d */
    public final kgg mo14461d() {
        return this.f36406b;
    }

    @Override // p000.klc
    /* JADX INFO: renamed from: h */
    public final synchronized kpw mo14462h() {
        return null;
    }

    @Override // p000.klc
    /* JADX INFO: renamed from: i */
    public final synchronized void mo14463i(klb klbVar) {
        klbVar.mo14284h();
    }

    @Override // p000.klc
    /* JADX INFO: renamed from: j */
    public final synchronized void mo14464j(kfd kfdVar) {
        this.f36408d = kfdVar;
    }

    @Override // p000.klc
    /* JADX INFO: renamed from: k */
    public final synchronized void mo14465k(kpw kpwVar) {
        if (kpwVar != null) {
            kpwVar.close();
            throw new IllegalStateException("External results must never receive images.");
        }
    }

    public final synchronized String toString() {
        Long lValueOf;
        kfd kfdVar = this.f36408d;
        lValueOf = kfdVar == null ? null : Long.valueOf(kfdVar.f35812c);
        StringBuilder sb = new StringBuilder();
        sb.append("ExternalStreamResult-");
        sb.append(lValueOf);
        return "ExternalStreamResult-".concat(String.valueOf(lValueOf));
    }
}
