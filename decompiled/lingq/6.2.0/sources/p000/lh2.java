package p000;

import java.util.concurrent.CancellationException;
import kotlin.AbstractC3193b;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.CoroutinesInternalError;
import kotlinx.coroutines.DispatchException;

/* JADX INFO: loaded from: classes.dex */
public abstract class lh2 extends rr9 {

    /* JADX INFO: renamed from: c */
    public int f49653c;

    public lh2(int i) {
        super(0L, false);
        this.f49653c = i;
    }

    /* JADX INFO: renamed from: b */
    public void mo16217b(CancellationException cancellationException) {
    }

    /* JADX INFO: renamed from: c */
    public abstract Continuation mo15233c();

    /* JADX INFO: renamed from: e */
    public Throwable mo16218e(Object obj) {
        dc1 dc1Var = obj instanceof dc1 ? (dc1) obj : null;
        if (dc1Var != null) {
            return dc1Var.f35375a;
        }
        return null;
    }

    /* JADX INFO: renamed from: f */
    public Object mo16219f(Object obj) {
        return obj;
    }

    /* JADX INFO: renamed from: g */
    public final void m16220g(Throwable th) {
        bq1.m4056g0(mo15233c().getContext(), new CoroutinesInternalError("Fatal exception in coroutines machinery for " + this + ". Please read KDoc to 'handleFatalException' method and report this incident to maintainers", th));
    }

    /* JADX INFO: renamed from: h */
    public abstract Object mo15234h();

    @Override // java.lang.Runnable
    public final void run() {
        try {
            Continuation continuationMo15233c = mo15233c();
            continuationMo15233c.getClass();
            kh2 kh2Var = (kh2) continuationMo15233c;
            ContinuationImpl continuationImpl = kh2Var.f47290e;
            Object obj = kh2Var.f47292g;
            kn1 context = continuationImpl.getContext();
            Object objM20372O = r46.m20372O(context, obj);
            cd4 cd4Var = null;
            ofa ofaVarM21986S = objM20372O != r46.f58686p ? te1.m21986S(continuationImpl, context, objM20372O) : null;
            try {
                kn1 context2 = continuationImpl.getContext();
                Object objMo15234h = mo15234h();
                Throwable thMo16218e = mo16218e(objMo15234h);
                if (thMo16218e == null) {
                    int i = this.f49653c;
                    boolean z = true;
                    if (i != 1 && i != 2) {
                        z = false;
                    }
                    if (z) {
                        cd4Var = (cd4) context2.get(nj0.f52795N);
                    }
                }
                if (cd4Var != null && !cd4Var.mo4538b()) {
                    CancellationException cancellationExceptionMo4541u = cd4Var.mo4541u();
                    mo16217b(cancellationExceptionMo4541u);
                    continuationImpl.resumeWith(AbstractC3193b.m15358a(cancellationExceptionMo4541u));
                } else if (thMo16218e != null) {
                    continuationImpl.resumeWith(new Result.Failure(thMo16218e));
                } else {
                    continuationImpl.resumeWith(mo16219f(objMo15234h));
                }
            } finally {
                if (ofaVarM21986S == null || ofaVarM21986S.m17963r0()) {
                    r46.m20367J(context, objM20372O);
                }
            }
        } catch (DispatchException e) {
            bq1.m4056g0(mo15233c().getContext(), e.f47748a);
        } catch (Throwable th) {
            m16220g(th);
        }
    }
}
