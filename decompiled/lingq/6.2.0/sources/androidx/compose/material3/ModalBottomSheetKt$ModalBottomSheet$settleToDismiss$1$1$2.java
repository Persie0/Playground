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
@c32(m4290c = "androidx.compose.material3.ModalBottomSheetKt$ModalBottomSheet$settleToDismiss$1$1$2", m4291f = "ModalBottomSheet.kt", m4292l = {128}, m4293m = "invokeSuspend", m4294v = 1)
final class ModalBottomSheetKt$ModalBottomSheet$settleToDismiss$1$1$2 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f3220a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C0269z f3221b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ModalBottomSheetKt$ModalBottomSheet$settleToDismiss$1$1$2(C0269z c0269z, Continuation continuation) {
        super(2, continuation);
        this.f3221b = c0269z;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ModalBottomSheetKt$ModalBottomSheet$settleToDismiss$1$1$2(this.f3221b, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((ModalBottomSheetKt$ModalBottomSheet$settleToDismiss$1$1$2) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f3220a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            this.f3220a = 1;
            if (this.f3221b.m1216d(this) == coroutineSingletons) {
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
