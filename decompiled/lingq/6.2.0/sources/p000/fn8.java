package p000;

import androidx.compose.foundation.gestures.AbstractC0117w;
import androidx.compose.p002ui.input.pointer.PointerInputEventHandler;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* JADX INFO: loaded from: classes2.dex */
public final class fn8 implements PointerInputEventHandler {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f39345a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ui3 f39346b;

    public /* synthetic */ fn8(int i, ui3 ui3Var) {
        this.f39345a = i;
        this.f39346b = ui3Var;
    }

    @Override // androidx.compose.p002ui.input.pointer.PointerInputEventHandler
    public final Object invoke(og7 og7Var, Continuation continuation) {
        int i = this.f39345a;
        xfa xfaVar = xfa.f68157a;
        ui3 ui3Var = this.f39346b;
        switch (i) {
            case 0:
                Object objM942e = AbstractC0117w.m942e(og7Var, null, new sy0(5, ui3Var), continuation, 7);
                return objM942e == CoroutineSingletons.COROUTINE_SUSPENDED ? objM942e : xfaVar;
            default:
                Object objM942e2 = AbstractC0117w.m942e(og7Var, null, new sy0(8, ui3Var), continuation, 7);
                return objM942e2 == CoroutineSingletons.COROUTINE_SUSPENDED ? objM942e2 : xfaVar;
        }
    }
}
