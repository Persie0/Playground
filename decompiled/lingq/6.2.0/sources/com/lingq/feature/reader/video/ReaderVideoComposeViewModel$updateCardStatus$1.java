package com.lingq.feature.reader.video;

import com.lingq.core.domain.model.status.TokenStatus;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.C3386nv;
import p000.c32;
import p000.un1;
import p000.xa2;
import p000.xfa;
import p000.y7d;
import p000.zi3;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.reader.video.ReaderVideoComposeViewModel$updateCardStatus$1", m4291f = "ReaderVideoComposeViewModel.kt", m4292l = {933}, m4293m = "invokeSuspend", m4294v = 2)
final class ReaderVideoComposeViewModel$updateCardStatus$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f31327a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2583a f31328b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ String f31329c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ TokenStatus f31330d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReaderVideoComposeViewModel$updateCardStatus$1(C2583a c2583a, String str, TokenStatus tokenStatus, Continuation continuation) {
        super(2, continuation);
        this.f31328b = c2583a;
        this.f31329c = str;
        this.f31330d = tokenStatus;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ReaderVideoComposeViewModel$updateCardStatus$1(this.f31328b, this.f31329c, this.f31330d, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((ReaderVideoComposeViewModel$updateCardStatus$1) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f31327a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            C2583a c2583a = this.f31328b;
            xa2 xa2Var = c2583a.f31342A;
            String strMo4589b2 = c2583a.f31369b.mo4589b2();
            int iM24986e = y7d.m24986e(this.f31330d);
            int i2 = c2583a.f31348G;
            this.f31327a = 1;
            if (xa2Var.m24431a(strMo4589b2, this.f31329c, iM24986e, i2, this) == coroutineSingletons) {
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
