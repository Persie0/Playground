package p000;

import kotlin.coroutines.Continuation;
import retrofit2.AbstractC3533a;

/* JADX INFO: loaded from: classes.dex */
public final class ax3 extends bx3 {

    /* JADX INFO: renamed from: d */
    public final xl0 f7639d;

    /* JADX INFO: renamed from: e */
    public final boolean f7640e;

    public ax3(h78 h78Var, dr6 dr6Var, fm1 fm1Var, xl0 xl0Var, boolean z) {
        super(h78Var, dr6Var, fm1Var);
        this.f7639d = xl0Var;
        this.f7640e = z;
    }

    @Override // p000.bx3
    /* JADX INFO: renamed from: a */
    public final Object mo3111a(br6 br6Var, Object[] objArr) {
        ul0 ul0Var = (ul0) this.f7639d.mo3355h(br6Var);
        Continuation continuation = (Continuation) objArr[objArr.length - 1];
        try {
            if (!this.f7640e) {
                return AbstractC3533a.m20599a(ul0Var, continuation);
            }
            ul0Var.getClass();
            return AbstractC3533a.m20600b(ul0Var, continuation);
        } catch (LinkageError | ThreadDeath | VirtualMachineError e) {
            throw e;
        } catch (Throwable th) {
            return AbstractC3533a.m20601c(th, continuation);
        }
    }
}
