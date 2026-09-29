package com.lingq.feature.onboarding.p014v2.pages.p023long;

import androidx.compose.foundation.gestures.C0108p;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.C3386nv;
import p000.aj3;
import p000.c32;
import p000.gq6;
import p000.vi3;
import p000.xfa;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.onboarding.v2.pages.long.CommitmentPageKt$FingerprintHold$1$1$1", m4291f = "CommitmentPage.kt", m4292l = {162}, m4293m = "invokeSuspend", m4294v = 2)
final class CommitmentPageKt$FingerprintHold$1$1$1 extends SuspendLambda implements aj3 {

    /* JADX INFO: renamed from: a */
    public int f27512a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ C0108p f27513b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ vi3 f27514c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CommitmentPageKt$FingerprintHold$1$1$1(vi3 vi3Var, Continuation continuation) {
        super(3, continuation);
        this.f27514c = vi3Var;
    }

    @Override // p000.aj3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        long j = ((gq6) obj2).f41189a;
        CommitmentPageKt$FingerprintHold$1$1$1 commitmentPageKt$FingerprintHold$1$1$1 = new CommitmentPageKt$FingerprintHold$1$1$1(this.f27514c, (Continuation) obj3);
        commitmentPageKt$FingerprintHold$1$1$1.f27513b = (C0108p) obj;
        return commitmentPageKt$FingerprintHold$1$1$1.invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C0108p c0108p = this.f27513b;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f27512a;
        vi3 vi3Var = this.f27514c;
        try {
            if (i == 0) {
                AbstractC3193b.m15359b(obj);
                vi3Var.invoke(Boolean.TRUE);
                this.f27513b = null;
                this.f27512a = 1;
                if (c0108p.m907b(this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                AbstractC3193b.m15359b(obj);
            }
            vi3Var.invoke(Boolean.FALSE);
            return xfa.f68157a;
        } catch (Throwable th) {
            vi3Var.invoke(Boolean.FALSE);
            throw th;
        }
    }
}
