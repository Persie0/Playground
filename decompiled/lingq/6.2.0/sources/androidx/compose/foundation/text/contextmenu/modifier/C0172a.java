package androidx.compose.foundation.text.contextmenu.modifier;

import androidx.compose.foundation.text.contextmenu.gestures.AbstractC0168a;
import androidx.compose.p002ui.input.pointer.PointerInputEventHandler;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import p000.ht9;
import p000.og7;
import p000.xfa;

/* JADX INFO: renamed from: androidx.compose.foundation.text.contextmenu.modifier.a */
/* JADX INFO: loaded from: classes.dex */
public final class C0172a implements PointerInputEventHandler {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ ht9 f2881a;

    public C0172a(ht9 ht9Var) {
        this.f2881a = ht9Var;
    }

    @Override // androidx.compose.p002ui.input.pointer.PointerInputEventHandler
    public final Object invoke(og7 og7Var, Continuation continuation) {
        Object objM1063b = AbstractC0168a.m1063b(og7Var, new TextContextMenuGestureNode$1$1(1, this.f2881a, ht9.class, "tryShowContextMenu", "tryShowContextMenu-k-4lQ0M(J)V", 0), continuation);
        return objM1063b == CoroutineSingletons.COROUTINE_SUSPENDED ? objM1063b : xfa.f68157a;
    }
}
