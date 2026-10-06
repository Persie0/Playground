package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class nox implements nol {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ Object f44003a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ Object f44004b;

    /* JADX INFO: renamed from: c */
    private final /* synthetic */ int f44005c;

    public nox(moq moqVar, nol nolVar, int i) {
        this.f44005c = i;
        this.f44004b = moqVar;
        this.f44003a = nolVar;
    }

    public nox(noz nozVar, nol nolVar, int i) {
        this.f44005c = i;
        this.f44003a = nozVar;
        this.f44004b = nolVar;
    }

    public final String toString() {
        switch (this.f44005c) {
            case 0:
                return this.f44004b.toString();
            default:
                return "propagating=[" + this.f44003a + "]";
        }
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, nol] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, moq] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, nol] */
    @Override // p000.nol
    /* JADX INFO: renamed from: a */
    public final nps mo3988a() {
        switch (this.f44005c) {
            case 0:
                return !((noz) this.f44003a).compareAndSet(noy.NOT_RUN, noy.STARTED) ? kxk.m14963I() : this.f44004b.mo3988a();
            default:
                ?? r0 = this.f44004b;
                ?? r1 = this.f44003a;
                moy moyVarM16726d = moz.m16726d();
                moq moqVarM16725c = moz.m16725c(moyVarM16726d, r0);
                try {
                    nps npsVarMo3988a = r1.mo3988a();
                    moz.m16725c(moyVarM16726d, moqVarM16725c);
                    npsVarMo3988a.getClass();
                    return npsVarMo3988a;
                } catch (Throwable th) {
                    try {
                        mod.m16702a(th);
                        throw th;
                    } catch (Throwable th2) {
                        moz.m16725c(moyVarM16726d, moqVarM16725c);
                        throw th2;
                    }
                }
        }
    }
}
