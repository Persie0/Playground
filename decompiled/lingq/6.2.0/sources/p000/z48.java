package p000;

import androidx.compose.runtime.C0284k;
import kotlinx.coroutines.CoroutineExceptionHandler;

/* JADX INFO: loaded from: classes.dex */
public final class z48 extends AbstractC0830c0 implements CoroutineExceptionHandler {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ nf1 f70898b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C0284k f70899c;

    /* JADX WARN: Illegal instructions before constructor call */
    public z48(nf1 nf1Var, C0284k c0284k) {
        s46 s46Var = s46.f60287b;
        this.f70898b = nf1Var;
        this.f70899c = c0284k;
        super(s46Var);
    }

    @Override // kotlinx.coroutines.CoroutineExceptionHandler
    /* JADX INFO: renamed from: p */
    public final void mo1248p(kn1 kn1Var, Throwable th) throws Throwable {
        nf1 nf1Var = this.f70898b;
        C0284k c0284k = this.f70899c;
        bna.m3988z0(th, new C3006fm(5, nf1Var, c0284k));
        CoroutineExceptionHandler coroutineExceptionHandler = (CoroutineExceptionHandler) c0284k.f3789a.get(s46.f60287b);
        if (coroutineExceptionHandler == null) {
            throw th;
        }
        coroutineExceptionHandler.mo1248p(kn1Var, th);
    }
}
