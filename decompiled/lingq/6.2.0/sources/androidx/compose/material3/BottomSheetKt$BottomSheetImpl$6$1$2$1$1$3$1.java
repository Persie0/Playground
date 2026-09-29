package androidx.compose.material3;

import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.C3386nv;
import p000.c32;
import p000.un1;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "androidx.compose.material3.BottomSheetKt$BottomSheetImpl$6$1$2$1$1$3$1", m4291f = "BottomSheet.kt", m4292l = {387}, m4293m = "invokeSuspend", m4294v = 1)
final class BottomSheetKt$BottomSheetImpl$6$1$2$1$1$3$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f3128a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C0269z f3129b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BottomSheetKt$BottomSheetImpl$6$1$2$1$1$3$1(C0269z c0269z, Continuation continuation) {
        super(2, continuation);
        this.f3129b = c0269z;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new BottomSheetKt$BottomSheetImpl$6$1$2$1$1$3$1(this.f3129b, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((BottomSheetKt$BottomSheetImpl$6$1$2$1$1$3$1) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f3128a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            this.f3128a = 1;
            if (this.f3129b.m1218f(this) == coroutineSingletons) {
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
