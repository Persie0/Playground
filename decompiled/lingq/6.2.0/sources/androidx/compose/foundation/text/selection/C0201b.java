package androidx.compose.foundation.text.selection;

import androidx.compose.p002ui.input.pointer.C0333g;
import androidx.compose.p002ui.input.pointer.PointerInputEventHandler;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import p000.og7;
import p000.sm1;
import p000.xfa;

/* JADX INFO: renamed from: androidx.compose.foundation.text.selection.b */
/* JADX INFO: loaded from: classes.dex */
public final class C0201b implements PointerInputEventHandler {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ sm1 f3069a;

    public C0201b(sm1 sm1Var) {
        this.f3069a = sm1Var;
    }

    @Override // androidx.compose.p002ui.input.pointer.PointerInputEventHandler
    public final Object invoke(og7 og7Var, Continuation continuation) {
        Object objM1479Z0 = ((C0333g) og7Var).m1479Z0(new SelectionGesturesKt$updateSelectionTouchMode$1$1(this.f3069a, null), continuation);
        return objM1479Z0 == CoroutineSingletons.COROUTINE_SUSPENDED ? objM1479Z0 : xfa.f68157a;
    }
}
