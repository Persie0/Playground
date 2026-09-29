package p000;

import kotlin.coroutines.Continuation;
import kotlinx.coroutines.C3213d;

/* JADX INFO: loaded from: classes.dex */
public final class oe4 extends sm0 {

    /* JADX INFO: renamed from: k */
    public final C3213d f54241k;

    public oe4(Continuation continuation, C3213d c3213d) {
        super(1, continuation);
        this.f54241k = c3213d;
    }

    @Override // p000.sm0
    /* JADX INFO: renamed from: B */
    public final String mo17946B() {
        return "AwaitContinuation";
    }

    @Override // p000.sm0
    /* JADX INFO: renamed from: p */
    public final Throwable mo17947p(C3213d c3213d) {
        Throwable thM19897e;
        Object objM15500Q = this.f54241k.m15500Q();
        if (!(objM15500Q instanceof qe4) || (thM19897e = ((qe4) objM15500Q).m19897e()) == null) {
            return objM15500Q instanceof dc1 ? ((dc1) objM15500Q).f35375a : c3213d.mo4541u();
        }
        return thM19897e;
    }
}
