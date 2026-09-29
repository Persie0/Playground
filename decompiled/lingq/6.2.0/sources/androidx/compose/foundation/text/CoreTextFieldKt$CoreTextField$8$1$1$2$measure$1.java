package androidx.compose.foundation.text;

import androidx.compose.foundation.relocation.C0154a;
import androidx.compose.foundation.text.selection.C0205f;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.C3386nv;
import p000.c32;
import p000.cx9;
import p000.e28;
import p000.l70;
import p000.mq6;
import p000.rw9;
import p000.sw9;
import p000.un1;
import p000.xfa;
import p000.yw4;
import p000.zi3;

/* JADX INFO: loaded from: classes.dex */
@c32(m4290c = "androidx.compose.foundation.text.CoreTextFieldKt$CoreTextField$8$1$1$2$measure$1", m4291f = "CoreTextField.kt", m4292l = {620}, m4293m = "invokeSuspend", m4294v = 1)
final class CoreTextFieldKt$CoreTextField$8$1$1$2$measure$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f2777a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C0205f f2778b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C0154a f2779c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CoreTextFieldKt$CoreTextField$8$1$1$2$measure$1(C0205f c0205f, C0154a c0154a, Continuation continuation) {
        super(2, continuation);
        this.f2778b = c0205f;
        this.f2779c = c0154a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new CoreTextFieldKt$CoreTextField$8$1$1$2$measure$1(this.f2778b, this.f2779c, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((CoreTextFieldKt$CoreTextField$8$1$1$2$measure$1) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f2777a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            C0205f c0205f = this.f2778b;
            mq6 mq6Var = c0205f.f3077b;
            long j = c0205f.m1114o().f65991b;
            int i2 = cx9.f34693c;
            int iMo13411t = mq6Var.mo13411t((int) (j >> 32));
            yw4 yw4Var = c0205f.f3079d;
            sw9 sw9VarM25363d = yw4Var != null ? yw4Var.m25363d() : null;
            sw9VarM25363d.getClass();
            rw9 rw9Var = sw9VarM25363d.f61519a;
            e28 e28VarM20956c = rw9Var.m20956c(l70.m15945h(iMo13411t, 0, rw9Var.f59975a.f58295a.f54604b.length()));
            this.f2777a = 1;
            if (this.f2779c.m1046a(e28VarM20956c, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC3193b.m15359b(obj);
        }
        return xfa.f68157a;
    }
}
