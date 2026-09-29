package p000;

import kotlinx.coroutines.CoroutineExceptionHandler;

/* JADX INFO: loaded from: classes2.dex */
public final class fj2 extends AbstractC0830c0 implements CoroutineExceptionHandler {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ int f39190b;

    /* JADX WARN: Illegal instructions before constructor call */
    public fj2(int i) {
        s46 s46Var = s46.f60287b;
        this.f39190b = i;
        super(s46Var);
    }

    @Override // kotlinx.coroutines.CoroutineExceptionHandler
    /* JADX INFO: renamed from: p */
    public final void mo1248p(kn1 kn1Var, Throwable th) {
        rm5 rm5Var = sm5.Companion;
        String str = "Course " + this.f39190b + " download failed - " + th.getMessage();
        rm5Var.getClass();
        h0a.f41641a.mo11431b(str, new Object[0]);
    }
}
