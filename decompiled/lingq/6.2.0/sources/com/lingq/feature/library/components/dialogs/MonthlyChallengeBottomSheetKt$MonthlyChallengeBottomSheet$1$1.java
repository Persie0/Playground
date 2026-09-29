package com.lingq.feature.library.components.dialogs;

import com.lingq.core.domain.model.notification.Notice;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.c32;
import p000.un1;
import p000.vi3;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.library.components.dialogs.MonthlyChallengeBottomSheetKt$MonthlyChallengeBottomSheet$1$1", m4291f = "MonthlyChallengeBottomSheet.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
final class MonthlyChallengeBottomSheetKt$MonthlyChallengeBottomSheet$1$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ vi3 f26630a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Notice f26631b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MonthlyChallengeBottomSheetKt$MonthlyChallengeBottomSheet$1$1(vi3 vi3Var, Notice notice, Continuation continuation) {
        super(2, continuation);
        this.f26630a = vi3Var;
        this.f26631b = notice;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new MonthlyChallengeBottomSheetKt$MonthlyChallengeBottomSheet$1$1(this.f26630a, this.f26631b, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        MonthlyChallengeBottomSheetKt$MonthlyChallengeBottomSheet$1$1 monthlyChallengeBottomSheetKt$MonthlyChallengeBottomSheet$1$1 = (MonthlyChallengeBottomSheetKt$MonthlyChallengeBottomSheet$1$1) create((un1) obj, (Continuation) obj2);
        xfa xfaVar = xfa.f68157a;
        monthlyChallengeBottomSheetKt$MonthlyChallengeBottomSheet$1$1.invokeSuspend(xfaVar);
        return xfaVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        AbstractC3193b.m15359b(obj);
        this.f26630a.invoke(new Integer(this.f26631b.f19539a));
        return xfa.f68157a;
    }
}
