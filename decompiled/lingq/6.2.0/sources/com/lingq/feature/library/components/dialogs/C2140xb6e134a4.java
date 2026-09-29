package com.lingq.feature.library.components.dialogs;

import androidx.compose.material3.C0269z;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.C3386nv;
import p000.c32;
import p000.un1;
import p000.xfa;
import p000.zi3;

/* JADX INFO: renamed from: com.lingq.feature.library.components.dialogs.MonthlyChallengeBottomSheetKt$MonthlyChallengeBottomSheet$2$1$2$1$1 */
/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.feature.library.components.dialogs.MonthlyChallengeBottomSheetKt$MonthlyChallengeBottomSheet$2$1$2$1$1", m4291f = "MonthlyChallengeBottomSheet.kt", m4292l = {92}, m4293m = "invokeSuspend", m4294v = 2)
final class C2140xb6e134a4 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f26632a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C0269z f26633b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2140xb6e134a4(C0269z c0269z, Continuation continuation) {
        super(2, continuation);
        this.f26633b = c0269z;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new C2140xb6e134a4(this.f26633b, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((C2140xb6e134a4) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f26632a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            this.f26632a = 1;
            if (this.f26633b.m1216d(this) == coroutineSingletons) {
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
