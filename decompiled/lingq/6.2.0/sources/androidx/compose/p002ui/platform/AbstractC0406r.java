package androidx.compose.p002ui.platform;

import androidx.lifecycle.Lifecycle$State;
import p000.AbstractC3572sf;
import p000.oe3;
import p000.ui3;
import p000.v63;
import p000.vi3;
import p000.xfa;

/* JADX INFO: renamed from: androidx.compose.ui.platform.r */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0406r {
    /* JADX INFO: renamed from: a */
    public static final ui3 m1815a(AbstractC0389a abstractC0389a, final AbstractC3572sf abstractC3572sf) {
        if (abstractC3572sf.mo21327q().compareTo(Lifecycle$State.DESTROYED) <= 0) {
            v63.m23145w("Cannot configure ", abstractC0389a, " to disposeComposition at Lifecycle ON_DESTROY: ", abstractC3572sf, "is already destroyed");
            return null;
        }
        final oe3 oe3Var = new oe3(abstractC0389a, 3);
        abstractC3572sf.mo21323g(oe3Var);
        return new ui3() { // from class: androidx.compose.ui.platform.ViewCompositionStrategy_androidKt$installForLifecycle$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // p000.ui3
            /* JADX INFO: renamed from: a */
            public final Object mo0a() {
                abstractC3572sf.mo21331x(oe3Var);
                return xfa.f68157a;
            }
        };
    }

    /* JADX INFO: renamed from: b */
    public static final vi3 m1816b() {
        return InspectableValueKt$NoInspectorInfo$1.f4580b;
    }
}
