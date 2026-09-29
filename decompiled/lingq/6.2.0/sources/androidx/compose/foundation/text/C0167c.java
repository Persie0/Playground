package androidx.compose.foundation.text;

import androidx.compose.foundation.text.selection.C0205f;
import androidx.compose.p002ui.input.pointer.PointerInputEventHandler;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import p000.og7;
import p000.vz1;
import p000.xfa;
import p000.xt9;

/* JADX INFO: renamed from: androidx.compose.foundation.text.c */
/* JADX INFO: loaded from: classes.dex */
public final class C0167c implements PointerInputEventHandler {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ xt9 f2849a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C0205f f2850b;

    public C0167c(xt9 xt9Var, C0205f c0205f) {
        this.f2849a = xt9Var;
        this.f2850b = c0205f;
    }

    @Override // androidx.compose.p002ui.input.pointer.PointerInputEventHandler
    public final Object invoke(og7 og7Var, Continuation continuation) {
        Object objM23649s = vz1.m23649s(new CoreTextFieldKt$TextFieldCursorHandle$2$1$1(og7Var, this.f2849a, this.f2850b, null), continuation);
        return objM23649s == CoroutineSingletons.COROUTINE_SUSPENDED ? objM23649s : xfa.f68157a;
    }
}
