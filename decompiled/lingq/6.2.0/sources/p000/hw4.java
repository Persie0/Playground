package p000;

import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.DispatchException;

/* JADX INFO: loaded from: classes.dex */
public final class hw4 extends pg9 {

    /* JADX INFO: renamed from: f */
    public final Continuation f43035f;

    public hw4(kn1 kn1Var, zi3 zi3Var) {
        super(kn1Var, false);
        this.f43035f = AbstractC3584sr.m21647z(zi3Var, this, this);
    }

    @Override // kotlinx.coroutines.C3213d
    /* JADX INFO: renamed from: e0 */
    public final void mo12052e0() throws Throwable {
        try {
            eh0.m11116M(xfa.f68157a, AbstractC3584sr.m21600K(this.f43035f));
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
