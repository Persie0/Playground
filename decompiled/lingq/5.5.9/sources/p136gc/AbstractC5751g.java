package p136gc;

import java.util.concurrent.Executor;

/* JADX INFO: renamed from: gc.g */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC5751g<TResult> {
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: a */
    public void mo12099a(ExecutorC5760p executorC5760p, InterfaceC5746b interfaceC5746b) {
        throw new UnsupportedOperationException("addOnCanceledListener is not implemented");
    }

    /* JADX INFO: renamed from: b */
    public void mo12100b(InterfaceC5747c interfaceC5747c) {
        throw new UnsupportedOperationException("addOnCompleteListener is not implemented");
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: c */
    public void mo12101c(Executor executor, InterfaceC5747c interfaceC5747c) {
        throw new UnsupportedOperationException("addOnCompleteListener is not implemented");
    }

    /* JADX INFO: renamed from: d */
    public abstract C5761q mo12102d(ExecutorC5760p executorC5760p, InterfaceC5748d interfaceC5748d);

    /* JADX INFO: renamed from: e */
    public abstract C5761q mo12103e(Executor executor, InterfaceC5749e interfaceC5749e);

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: f */
    public <TContinuationResult> AbstractC5751g<TContinuationResult> mo12104f(Executor executor, InterfaceC5745a<TResult, TContinuationResult> interfaceC5745a) {
        throw new UnsupportedOperationException("continueWith is not implemented");
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: g */
    public <TContinuationResult> AbstractC5751g<TContinuationResult> mo12105g(Executor executor, InterfaceC5745a<TResult, AbstractC5751g<TContinuationResult>> interfaceC5745a) {
        throw new UnsupportedOperationException("continueWithTask is not implemented");
    }

    /* JADX INFO: renamed from: h */
    public abstract Exception mo12106h();

    /* JADX INFO: renamed from: i */
    public abstract TResult mo12107i();

    /* JADX INFO: renamed from: j */
    public abstract <X extends Throwable> TResult mo12108j(Class<X> cls) throws Throwable;

    /* JADX INFO: renamed from: k */
    public abstract boolean mo12109k();

    /* JADX INFO: renamed from: l */
    public abstract boolean mo12110l();

    /* JADX INFO: renamed from: m */
    public abstract boolean mo12111m();

    /* JADX INFO: renamed from: n */
    public <TContinuationResult> AbstractC5751g<TContinuationResult> mo12112n(Executor executor, InterfaceC5750f<TResult, TContinuationResult> interfaceC5750f) {
        throw new UnsupportedOperationException("onSuccessTask is not implemented");
    }
}
