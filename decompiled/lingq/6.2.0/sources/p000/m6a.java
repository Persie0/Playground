package p000;

import androidx.compose.foundation.gestures.AbstractC0117w;
import androidx.compose.p002ui.input.pointer.PointerInputEventHandler;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* JADX INFO: loaded from: classes2.dex */
public final class m6a implements PointerInputEventHandler {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ c7a f50671a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ t66 f50672b;

    public m6a(c7a c7aVar, t66 t66Var) {
        this.f50671a = c7aVar;
        this.f50672b = t66Var;
    }

    @Override // androidx.compose.p002ui.input.pointer.PointerInputEventHandler
    public final Object invoke(og7 og7Var, Continuation continuation) {
        Object objM942e = AbstractC0117w.m942e(og7Var, null, new r3a(4, this.f50671a, this.f50672b), continuation, 7);
        return objM942e == CoroutineSingletons.COROUTINE_SUSPENDED ? objM942e : xfa.f68157a;
    }
}
