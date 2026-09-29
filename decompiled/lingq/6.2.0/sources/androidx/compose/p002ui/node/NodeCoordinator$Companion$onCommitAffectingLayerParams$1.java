package androidx.compose.p002ui.node;

import kotlin.jvm.internal.Lambda;
import p000.vi3;
import p000.xfa;

/* JADX INFO: loaded from: classes.dex */
final class NodeCoordinator$Companion$onCommitAffectingLayerParams$1 extends Lambda implements vi3 {

    /* JADX INFO: renamed from: b */
    public static final NodeCoordinator$Companion$onCommitAffectingLayerParams$1 f4256b = new NodeCoordinator$Companion$onCommitAffectingLayerParams$1(1);

    @Override // p000.vi3
    public final Object invoke(Object obj) throws Throwable {
        AbstractC0362l abstractC0362l = (AbstractC0362l) obj;
        C0357g c0357g = abstractC0362l.f4432J;
        try {
            if (abstractC0362l.mo1611x()) {
                abstractC0362l.m1665F1(true);
            }
            return xfa.f68157a;
        } catch (Throwable th) {
            c0357g.m1587e0(th);
            throw null;
        }
    }
}
