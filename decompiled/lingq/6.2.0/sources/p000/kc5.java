package p000;

import androidx.compose.foundation.gestures.AbstractC0117w;
import androidx.compose.p002ui.input.pointer.PointerInputEventHandler;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* JADX INFO: loaded from: classes2.dex */
public final class kc5 implements PointerInputEventHandler {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f47027a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f47028b;

    public /* synthetic */ kc5(Object obj, int i) {
        this.f47027a = i;
        this.f47028b = obj;
    }

    @Override // androidx.compose.p002ui.input.pointer.PointerInputEventHandler
    public final Object invoke(og7 og7Var, Continuation continuation) {
        int i = this.f47027a;
        xfa xfaVar = xfa.f68157a;
        Object obj = this.f47028b;
        switch (i) {
            case 0:
                Object objM942e = AbstractC0117w.m942e(og7Var, null, new C0023al(26, (t66) obj), continuation, 7);
                return objM942e == CoroutineSingletons.COROUTINE_SUSPENDED ? objM942e : xfaVar;
            default:
                Object objM942e2 = AbstractC0117w.m942e(og7Var, null, new cx8((vi3) obj, 25), continuation, 7);
                return objM942e2 == CoroutineSingletons.COROUTINE_SUSPENDED ? objM942e2 : xfaVar;
        }
    }
}
