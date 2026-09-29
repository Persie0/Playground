package p000;

import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.C3213d;
import kotlinx.coroutines.CompletionHandlerException;

/* JADX INFO: renamed from: b0 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0793b0 extends C3213d implements Continuation, un1 {

    /* JADX INFO: renamed from: e */
    public final kn1 f7705e;

    public AbstractC0793b0(kn1 kn1Var, boolean z) {
        super(z);
        m15502U((cd4) kn1Var.get(nj0.f52795N));
        this.f7705e = kn1Var.plus(this);
    }

    @Override // kotlinx.coroutines.C3213d
    /* JADX INFO: renamed from: D */
    public final String mo3133D() {
        return getClass().getSimpleName().concat(" was cancelled");
    }

    @Override // kotlinx.coroutines.C3213d
    /* JADX INFO: renamed from: T */
    public final void mo3134T(CompletionHandlerException completionHandlerException) {
        bq1.m4056g0(this.f7705e, completionHandlerException);
    }

    @Override // kotlinx.coroutines.C3213d
    /* JADX INFO: renamed from: d0 */
    public final void mo3135d0(Object obj) {
        if (!(obj instanceof dc1)) {
            mo3137p0(obj);
        } else {
            dc1 dc1Var = (dc1) obj;
            mo3136o0(dc1Var.f35375a, dc1.f35374b.get(dc1Var) == 1);
        }
    }

    @Override // kotlin.coroutines.Continuation
    public final kn1 getContext() {
        return this.f7705e;
    }

    /* JADX INFO: renamed from: o0 */
    public void mo3136o0(Throwable th, boolean z) {
    }

    /* JADX INFO: renamed from: p0 */
    public void mo3137p0(Object obj) {
    }

    @Override // kotlin.coroutines.Continuation
    public final void resumeWith(Object obj) {
        Throwable thM15355a = Result.m15355a(obj);
        if (thM15355a != null) {
            obj = new dc1(thM15355a, false);
        }
        Object objM15506Z = m15506Z(obj);
        if (objM15506Z == AbstractC3584sr.f61279f) {
            return;
        }
        mo4901v(objM15506Z);
    }

    @Override // p000.un1
    /* JADX INFO: renamed from: x */
    public final kn1 mo1309x() {
        return this.f7705e;
    }
}
