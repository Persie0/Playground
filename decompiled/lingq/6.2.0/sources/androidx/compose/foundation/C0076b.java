package androidx.compose.foundation;

import androidx.compose.foundation.gestures.AbstractC0095c;
import androidx.compose.p002ui.input.pointer.PointerInputEventHandler;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import p000.og7;
import p000.xfa;

/* JADX INFO: renamed from: androidx.compose.foundation.b */
/* JADX INFO: loaded from: classes.dex */
public final class C0076b implements PointerInputEventHandler {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C0077c f1737a;

    public C0076b(C0077c c0077c) {
        this.f1737a = c0077c;
    }

    @Override // androidx.compose.p002ui.input.pointer.PointerInputEventHandler
    public final Object invoke(og7 og7Var, Continuation continuation) {
        Object objM836k = AbstractC0095c.m836k(og7Var, new AndroidEdgeEffectOverscrollEffect$pointerInputNode$1$1(this.f1737a, null), continuation);
        return objM836k == CoroutineSingletons.COROUTINE_SUSPENDED ? objM836k : xfa.f68157a;
    }
}
