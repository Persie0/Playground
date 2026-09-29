package p000;

import java.util.concurrent.CancellationException;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.JobCancellationException;
import kotlinx.coroutines.channels.C3211a;

/* JADX INFO: loaded from: classes.dex */
public final class kl7 extends AbstractC0793b0 implements ll7, cu0 {

    /* JADX INFO: renamed from: f */
    public final C3211a f47495f;

    public kl7(kn1 kn1Var, C3211a c3211a) {
        super(kn1Var, true);
        this.f47495f = c3211a;
    }

    @Override // kotlinx.coroutines.C3213d
    /* JADX INFO: renamed from: B */
    public final void mo15330B(CancellationException cancellationException) {
        this.f47495f.m15471j(cancellationException, true);
        m15518y(cancellationException);
    }

    @Override // kotlinx.coroutines.C3213d, p000.cd4, p000.cu0
    /* JADX INFO: renamed from: a */
    public final void mo4537a(CancellationException cancellationException) {
        if (isCancelled()) {
            return;
        }
        if (cancellationException == null) {
            cancellationException = new JobCancellationException(mo3133D(), null, this);
        }
        mo15330B(cancellationException);
    }

    @Override // p000.cu0
    /* JADX INFO: renamed from: f */
    public final ny8 mo9889f() {
        return this.f47495f.mo9889f();
    }

    @Override // p000.cu0
    /* JADX INFO: renamed from: g */
    public final Object mo9890g() {
        return this.f47495f.mo9890g();
    }

    @Override // p000.cu0
    /* JADX INFO: renamed from: h */
    public final Object mo9891h(Continuation continuation) {
        C3211a c3211a = this.f47495f;
        c3211a.getClass();
        Object objM15449J = C3211a.m15449J(c3211a, (ContinuationImpl) continuation);
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        return objM15449J;
    }

    @Override // p000.yv8
    /* JADX INFO: renamed from: i */
    public final boolean mo15331i(Throwable th) {
        return this.f47495f.m15471j(th, false);
    }

    @Override // p000.cu0
    public final ej0 iterator() {
        C3211a c3211a = this.f47495f;
        c3211a.getClass();
        return new ej0(c3211a);
    }

    @Override // p000.yv8
    /* JADX INFO: renamed from: k */
    public final Object mo4677k(Object obj) {
        return this.f47495f.mo4677k(obj);
    }

    @Override // p000.yv8
    /* JADX INFO: renamed from: m */
    public final Object mo4678m(Object obj, Continuation continuation) {
        return this.f47495f.mo4678m(obj, continuation);
    }

    @Override // p000.cu0
    /* JADX INFO: renamed from: o */
    public final Object mo9892o(SuspendLambda suspendLambda) {
        C3211a c3211a = this.f47495f;
        c3211a.getClass();
        return C3211a.m15448I(c3211a, suspendLambda);
    }

    @Override // p000.AbstractC0793b0
    /* JADX INFO: renamed from: o0 */
    public final void mo3136o0(Throwable th, boolean z) {
        if (this.f47495f.m15471j(th, false) || z) {
            return;
        }
        bq1.m4056g0(this.f7705e, th);
    }

    @Override // p000.AbstractC0793b0
    /* JADX INFO: renamed from: p0 */
    public final void mo3137p0(Object obj) {
        this.f47495f.mo15331i(null);
    }
}
