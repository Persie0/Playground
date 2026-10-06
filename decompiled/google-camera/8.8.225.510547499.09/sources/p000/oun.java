package p000;

import java.io.IOException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class oun extends owg {

    /* JADX INFO: renamed from: c */
    private final onm f46583c;

    public oun(onm onmVar, oly olyVar) {
        super(olyVar, -2);
        this.f46583c = onmVar;
    }

    /* JADX INFO: renamed from: c */
    static /* synthetic */ Object m19081c(oun ounVar, oub oubVar, ols olsVar) {
        Object objMo560a = ounVar.f46583c.mo560a(oubVar, olsVar);
        return objMo560a == oma.COROUTINE_SUSPENDED ? objMo560a : oki.f46196a;
    }

    @Override // p000.owg
    /* JADX INFO: renamed from: b */
    protected Object mo19080b(oub oubVar, ols olsVar) {
        return m19081c(this, oubVar, olsVar);
    }

    @Override // p000.owg
    public final String toString() throws IOException {
        return "block[" + this.f46583c + "] -> " + super.toString();
    }
}
