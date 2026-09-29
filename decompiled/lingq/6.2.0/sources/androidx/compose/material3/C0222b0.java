package androidx.compose.material3;

import androidx.compose.p002ui.input.pointer.PointerInputEventHandler;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import p000.mq7;
import p000.og7;
import p000.oq7;
import p000.v56;
import p000.vz1;
import p000.xfa;

/* JADX INFO: renamed from: androidx.compose.material3.b0 */
/* JADX INFO: loaded from: classes2.dex */
public final class C0222b0 implements PointerInputEventHandler {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ oq7 f3377a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ v56 f3378b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ v56 f3379c;

    public C0222b0(oq7 oq7Var, v56 v56Var, v56 v56Var2) {
        this.f3377a = oq7Var;
        this.f3378b = v56Var;
        this.f3379c = v56Var2;
    }

    @Override // androidx.compose.p002ui.input.pointer.PointerInputEventHandler
    public final Object invoke(og7 og7Var, Continuation continuation) {
        v56 v56Var = this.f3379c;
        oq7 oq7Var = this.f3377a;
        Object objM23649s = vz1.m23649s(new SliderKt$rangeSliderPressDragModifier$1$1(og7Var, oq7Var, new mq7(oq7Var, this.f3378b, v56Var, 0), null), continuation);
        return objM23649s == CoroutineSingletons.COROUTINE_SUSPENDED ? objM23649s : xfa.f68157a;
    }
}
