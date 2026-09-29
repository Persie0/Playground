package androidx.compose.material3;

import androidx.compose.p002ui.input.pointer.PointerInputEventHandler;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import p000.og7;
import p000.v56;
import p000.vz1;
import p000.xfa;

/* JADX INFO: renamed from: androidx.compose.material3.c0 */
/* JADX INFO: loaded from: classes2.dex */
public final class C0224c0 implements PointerInputEventHandler {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ v56 f3383a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C0228e0 f3384b;

    public C0224c0(v56 v56Var, C0228e0 c0228e0) {
        this.f3383a = v56Var;
        this.f3384b = c0228e0;
    }

    @Override // androidx.compose.p002ui.input.pointer.PointerInputEventHandler
    public final Object invoke(og7 og7Var, Continuation continuation) {
        Object objM23649s = vz1.m23649s(new SliderKt$sliderTapModifier$1$1(og7Var, this.f3383a, this.f3384b, null), continuation);
        return objM23649s == CoroutineSingletons.COROUTINE_SUSPENDED ? objM23649s : xfa.f68157a;
    }
}
