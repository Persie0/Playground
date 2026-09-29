package androidx.compose.p002ui.node;

import kotlin.jvm.internal.Lambda;
import p000.i54;
import p000.se1;
import p000.vi3;
import p000.xfa;

/* JADX INFO: loaded from: classes.dex */
final class ComposeUiNode$Companion$ApplyOnDeactivatedNodeAssertion$1 extends Lambda implements vi3 {

    /* JADX INFO: renamed from: b */
    public static final ComposeUiNode$Companion$ApplyOnDeactivatedNodeAssertion$1 f4224b = new ComposeUiNode$Companion$ApplyOnDeactivatedNodeAssertion$1(1);

    @Override // p000.vi3
    public final Object invoke(Object obj) {
        se1 se1Var = (se1) obj;
        C0357g c0357g = se1Var instanceof C0357g ? (C0357g) se1Var : null;
        if (c0357g != null && c0357g.f4357l0) {
            i54.m13663b("Apply is called on deactivated node " + se1Var);
        }
        return xfa.f68157a;
    }
}
