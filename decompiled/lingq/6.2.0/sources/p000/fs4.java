package p000;

import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.DispatchException;

/* JADX INFO: loaded from: classes.dex */
public final class fs4 extends y92 {

    /* JADX INFO: renamed from: f */
    public final Continuation f39555f;

    public fs4(kn1 kn1Var, zi3 zi3Var) {
        super(kn1Var, false);
        this.f39555f = AbstractC3584sr.m21647z(zi3Var, this, this);
    }

    @Override // kotlinx.coroutines.C3213d
    /* JADX INFO: renamed from: e0 */
    public final void mo12052e0() throws Throwable {
        try {
            eh0.m11116M(xfa.f68157a, AbstractC3584sr.m21600K(this.f39555f));
        } catch (Throwable th) {
            th = th;
            if (th instanceof DispatchException) {
                th = ((DispatchException) th).f47748a;
            }
            resumeWith(AbstractC3193b.m15358a(th));
            throw th;
        }
    }
}
