package androidx.compose.foundation.text;

import androidx.compose.foundation.gestures.AbstractC0117w;
import androidx.compose.p002ui.input.pointer.PointerInputEventHandler;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import p000.gb0;
import p000.og7;
import p000.t66;
import p000.un1;
import p000.v56;
import p000.xfa;

/* JADX INFO: renamed from: androidx.compose.foundation.text.g */
/* JADX INFO: loaded from: classes.dex */
public final class C0179g implements PointerInputEventHandler {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ un1 f2903a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ t66 f2904b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ v56 f2905c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ t66 f2906d;

    public C0179g(un1 un1Var, t66 t66Var, v56 v56Var, t66 t66Var2) {
        this.f2903a = un1Var;
        this.f2904b = t66Var;
        this.f2905c = v56Var;
        this.f2906d = t66Var2;
    }

    @Override // androidx.compose.p002ui.input.pointer.PointerInputEventHandler
    public final Object invoke(og7 og7Var, Continuation continuation) {
        Object objM941d = AbstractC0117w.m941d(og7Var, new TextFieldPressGestureFilterKt$tapPressTextFieldModifier$1$2$1$1(this.f2903a, this.f2904b, this.f2905c, null), new gb0(8, this.f2906d), continuation);
        return objM941d == CoroutineSingletons.COROUTINE_SUSPENDED ? objM941d : xfa.f68157a;
    }
}
