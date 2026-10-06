package p000;

import java.io.IOException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ltu extends ltd {

    /* JADX INFO: renamed from: a */
    private final nyw f39200a;

    public ltu(nyw nywVar) {
        this.f39200a = nywVar;
    }

    @Override // p000.ltd
    /* JADX INFO: renamed from: a */
    public final nps mo15962a(IOException iOException, lhz lhzVar) {
        if (!(iOException.getCause() instanceof nyb)) {
            return kxk.m14964J(iOException);
        }
        nps npsVarM14965K = kxk.m14965K(this.f39200a);
        ltn ltnVar = (ltn) lhzVar.f38277a;
        return nnj.m17524j(nod.m17554j(npsVarM14965K, mov.m16716b(new cnc(ltnVar, 15)), ltnVar.f39180c), IOException.class, new ltt(iOException, 0), not.INSTANCE);
    }
}
