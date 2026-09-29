package com.lingq.feature.reader.video;

import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.C3386nv;
import p000.c32;
import p000.sca;
import p000.un1;
import p000.vj6;
import p000.w65;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.reader.video.ReaderVideoComposeViewModel$playTts$1", m4291f = "ReaderVideoComposeViewModel.kt", m4292l = {955}, m4293m = "invokeSuspend", m4294v = 2)
final class ReaderVideoComposeViewModel$playTts$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f31258a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2583a f31259b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ w65 f31260c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReaderVideoComposeViewModel$playTts$1(C2583a c2583a, w65 w65Var, Continuation continuation) {
        super(2, continuation);
        this.f31259b = c2583a;
        this.f31260c = w65Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ReaderVideoComposeViewModel$playTts$1(this.f31259b, this.f31260c, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((ReaderVideoComposeViewModel$playTts$1) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f31258a;
        C2583a c2583a = this.f31259b;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            vj6 vj6Var = c2583a.f31346E;
            String strMo4589b2 = c2583a.f31369b.mo4589b2();
            this.f31258a = 1;
            obj = vj6Var.m23348x(strMo4589b2, this.f31260c);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC3193b.m15359b(obj);
        }
        sca.m21224J0(c2583a.f31347F, (String) obj, false, 12);
        return xfa.f68157a;
    }
}
