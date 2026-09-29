package androidx.compose.foundation.text.handwriting;

import androidx.compose.foundation.gestures.AbstractC0095c;
import androidx.compose.p002ui.input.pointer.PointerInputEventHandler;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import p000.im9;
import p000.og7;
import p000.xfa;

/* JADX INFO: renamed from: androidx.compose.foundation.text.handwriting.a */
/* JADX INFO: loaded from: classes.dex */
public final class C0181a implements PointerInputEventHandler {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ im9 f2915a;

    public C0181a(im9 im9Var) {
        this.f2915a = im9Var;
    }

    @Override // androidx.compose.p002ui.input.pointer.PointerInputEventHandler
    public final Object invoke(og7 og7Var, Continuation continuation) {
        Object objM836k = AbstractC0095c.m836k(og7Var, new StylusHandwritingNode$suspendingPointerInputModifierNode$1$1(this.f2915a, null), continuation);
        return objM836k == CoroutineSingletons.COROUTINE_SUSPENDED ? objM836k : xfa.f68157a;
    }
}
