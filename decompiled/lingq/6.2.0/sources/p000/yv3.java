package p000;

import androidx.compose.foundation.gestures.AbstractC0117w;
import androidx.compose.p002ui.input.pointer.PointerInputEventHandler;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* JADX INFO: loaded from: classes2.dex */
public final class yv3 implements PointerInputEventHandler {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ t66 f70544a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C3419on f70545b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ vi3 f70546c;

    public yv3(t66 t66Var, C3419on c3419on, vi3 vi3Var) {
        this.f70544a = t66Var;
        this.f70545b = c3419on;
        this.f70546c = vi3Var;
    }

    @Override // androidx.compose.p002ui.input.pointer.PointerInputEventHandler
    public final Object invoke(og7 og7Var, Continuation continuation) {
        Object objM942e = AbstractC0117w.m942e(og7Var, null, new C3485q5(this.f70544a, this.f70545b, this.f70546c, 17), continuation, 7);
        return objM942e == CoroutineSingletons.COROUTINE_SUSPENDED ? objM942e : xfa.f68157a;
    }
}
