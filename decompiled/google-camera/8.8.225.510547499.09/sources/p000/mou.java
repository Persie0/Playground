package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class mou implements mrf {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ moq f41216a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ mrf f41217b;

    public mou(moq moqVar, mrf mrfVar) {
        this.f41216a = moqVar;
        this.f41217b = mrfVar;
    }

    @Override // p000.mrf
    public final Object apply(Object obj) {
        moq moqVar = this.f41216a;
        mrf mrfVar = this.f41217b;
        moy moyVarM16726d = moz.m16726d();
        moq moqVarM16725c = moz.m16725c(moyVarM16726d, moqVar);
        try {
            Object objApply = mrfVar.apply(obj);
            moz.m16725c(moyVarM16726d, moqVarM16725c);
            return objApply;
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

    public final String toString() {
        return "propagating=[" + this.f41217b + "]";
    }
}
