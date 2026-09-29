package androidx.compose.material3.internal;

import androidx.compose.foundation.MutatePriority;
import androidx.compose.material3.C0252k0;
import androidx.compose.p002ui.focus.FocusStateImpl;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.C3386nv;
import p000.c32;
import p000.t66;
import p000.un1;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "androidx.compose.material3.internal.BasicTooltipKt$keyboardBehavior$1$1", m4291f = "BasicTooltip.kt", m4292l = {319}, m4293m = "invokeSuspend", m4294v = 1)
final class BasicTooltipKt$keyboardBehavior$1$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f3487a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ FocusStateImpl f3488b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ t66 f3489c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C0252k0 f3490d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BasicTooltipKt$keyboardBehavior$1$1(FocusStateImpl focusStateImpl, t66 t66Var, C0252k0 c0252k0, Continuation continuation) {
        super(2, continuation);
        this.f3488b = focusStateImpl;
        this.f3489c = t66Var;
        this.f3490d = c0252k0;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new BasicTooltipKt$keyboardBehavior$1$1(this.f3488b, this.f3489c, this.f3490d, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((BasicTooltipKt$keyboardBehavior$1$1) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f3487a;
        FocusStateImpl focusStateImpl = this.f3488b;
        C0252k0 c0252k0 = this.f3490d;
        t66 t66Var = this.f3489c;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            if (focusStateImpl.isFocused()) {
                t66Var.setValue(Boolean.TRUE);
                MutatePriority mutatePriority = MutatePriority.PreventUserInput;
                this.f3487a = 1;
                if (c0252k0.m1179c(mutatePriority, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
        } else {
            if (i != 1) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC3193b.m15359b(obj);
        }
        if (((Boolean) t66Var.getValue()).booleanValue() && c0252k0.m1178b() && !focusStateImpl.isFocused()) {
            t66Var.setValue(Boolean.FALSE);
            c0252k0.m1177a();
        }
        return xfa.f68157a;
    }
}
