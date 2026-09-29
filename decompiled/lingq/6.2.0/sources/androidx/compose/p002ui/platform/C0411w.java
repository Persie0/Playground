package androidx.compose.p002ui.platform;

import kotlin.jvm.internal.Ref$ObjectRef;
import p000.C3386nv;
import p000.gta;
import p000.i54;
import p000.td3;
import p000.ub5;
import p000.ui3;
import p000.xfa;
import p000.zha;

/* JADX INFO: renamed from: androidx.compose.ui.platform.w */
/* JADX INFO: loaded from: classes.dex */
public final class C0411w implements gta {

    /* JADX INFO: renamed from: a */
    public static final C0411w f4868a = new C0411w();

    @Override // p000.gta
    /* JADX INFO: renamed from: a */
    public final ui3 mo1822a(final AbstractC0389a abstractC0389a) {
        if (!abstractC0389a.isAttachedToWindow()) {
            final Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
            final td3 td3Var = new td3(1, abstractC0389a, ref$ObjectRef);
            abstractC0389a.addOnAttachStateChangeListener(td3Var);
            ref$ObjectRef.f47718a = new ui3() { // from class: androidx.compose.ui.platform.ViewCompositionStrategy$DisposeOnViewTreeLifecycleDestroyed$installFor$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // p000.ui3
                /* JADX INFO: renamed from: a */
                public final Object mo0a() {
                    abstractC0389a.removeOnAttachStateChangeListener(td3Var);
                    return xfa.f68157a;
                }
            };
            return new ui3() { // from class: androidx.compose.ui.platform.ViewCompositionStrategy$DisposeOnViewTreeLifecycleDestroyed$installFor$2
                {
                    super(0);
                }

                @Override // p000.ui3
                /* JADX INFO: renamed from: a */
                public final Object mo0a() {
                    ((ui3) ref$ObjectRef.f47718a).mo0a();
                    return xfa.f68157a;
                }
            };
        }
        ub5 ub5VarM25659b = zha.m25659b(abstractC0389a);
        if (ub5VarM25659b != null) {
            return AbstractC0406r.m1815a(abstractC0389a, ub5VarM25659b.mo256K());
        }
        i54.m13664c("View tree for " + abstractC0389a + " has no ViewTreeLifecycleOwner");
        C3386nv.m17631r();
        return null;
    }
}
