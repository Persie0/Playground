package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class mot implements nom {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ moq f41214a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ nom f41215b;

    public mot(moq moqVar, nom nomVar) {
        this.f41214a = moqVar;
        this.f41215b = nomVar;
    }

    @Override // p000.nom
    /* JADX INFO: renamed from: a */
    public final nps mo3942a(Object obj) {
        moq moqVar = this.f41214a;
        nom nomVar = this.f41215b;
        moy moyVarM16726d = moz.m16726d();
        moq moqVarM16725c = moz.m16725c(moyVarM16726d, moqVar);
        try {
            nps npsVarMo3942a = nomVar.mo3942a(obj);
            moz.m16725c(moyVarM16726d, moqVarM16725c);
            npsVarMo3942a.getClass();
            return npsVarMo3942a;
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
        return "propagating=[" + this.f41215b + "]";
    }
}
