package p000;

import androidx.compose.foundation.gestures.AbstractC0117w;
import androidx.compose.p002ui.input.pointer.PointerInputEventHandler;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* JADX INFO: loaded from: classes2.dex */
public final class n6a implements PointerInputEventHandler {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ e28 f52416a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ui3 f52417b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ c7a f52418c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ ui3 f52419d;

    public n6a(e28 e28Var, ui3 ui3Var, c7a c7aVar, ui3 ui3Var2) {
        this.f52416a = e28Var;
        this.f52417b = ui3Var;
        this.f52418c = c7aVar;
        this.f52419d = ui3Var2;
    }

    @Override // androidx.compose.p002ui.input.pointer.PointerInputEventHandler
    public final Object invoke(og7 og7Var, Continuation continuation) {
        Object objM942e = AbstractC0117w.m942e(og7Var, null, new C3445p2(this.f52416a, this.f52417b, this.f52418c, this.f52419d, 21), continuation, 7);
        return objM942e == CoroutineSingletons.COROUTINE_SUSPENDED ? objM942e : xfa.f68157a;
    }
}
