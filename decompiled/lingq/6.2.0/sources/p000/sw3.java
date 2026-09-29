package p000;

import java.io.IOException;
import java.net.SocketTimeoutException;
import okhttp3.internal.http2.ErrorCode;

/* JADX INFO: loaded from: classes.dex */
public final class sw3 extends C3774xw {

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ tw3 f61510n;

    public sw3(tw3 tw3Var) {
        this.f61510n = tw3Var;
    }

    @Override // p000.C3774xw
    /* JADX INFO: renamed from: j */
    public final IOException mo15138j(IOException iOException) {
        return new SocketTimeoutException("timeout");
    }

    @Override // p000.C3774xw
    /* JADX INFO: renamed from: k */
    public final void mo12998k() {
        this.f61510n.m22321f(ErrorCode.CANCEL);
        mw3 mw3Var = this.f61510n.f62995b;
        synchronized (mw3Var) {
            long j = mw3Var.f51914I;
            long j2 = mw3Var.f51913H;
            if (j < j2) {
                return;
            }
            mw3Var.f51913H = j2 + 1;
            mw3Var.f51915J = System.nanoTime() + 1000000000;
            zr9.m25750b(mw3Var.f51933h, AbstractC3393o1.m17738m(new StringBuilder(), mw3Var.f51928c, " ping"), new C3539rk(mw3Var, 22));
        }
    }

    /* JADX INFO: renamed from: l */
    public final void m21752l() {
        if (m24715i()) {
            throw mo15138j(null);
        }
    }
}
