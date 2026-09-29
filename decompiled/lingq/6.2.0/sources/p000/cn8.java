package p000;

import kotlin.coroutines.Continuation;
import kotlinx.coroutines.DispatchException;

/* JADX INFO: loaded from: classes.dex */
public class cn8 extends AbstractC0793b0 implements vn1 {

    /* JADX INFO: renamed from: f */
    public final Continuation f10336f;

    public cn8(kn1 kn1Var, Continuation continuation) {
        super(kn1Var, true);
        this.f10336f = continuation;
    }

    @Override // kotlinx.coroutines.C3213d
    /* JADX INFO: renamed from: X */
    public final boolean mo4898X() {
        return true;
    }

    @Override // p000.vn1
    public final vn1 getCallerFrame() {
        Continuation continuation = this.f10336f;
        if (continuation instanceof vn1) {
            return (vn1) continuation;
        }
        return null;
    }

    /* JADX INFO: renamed from: q0 */
    public void mo4899q0() {
    }

    @Override // kotlinx.coroutines.C3213d
    /* JADX INFO: renamed from: t */
    public void mo4900t(Object obj) throws DispatchException {
        eh0.m11116M(do7.m10550z(obj), AbstractC3584sr.m21600K(this.f10336f));
    }

    @Override // kotlinx.coroutines.C3213d
    /* JADX INFO: renamed from: v */
    public void mo4901v(Object obj) {
        this.f10336f.resumeWith(do7.m10550z(obj));
    }
}
