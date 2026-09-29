package com.lingq.feature.reader.stats.p019ui.all;

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
@c32(m4290c = "com.lingq.feature.reader.stats.ui.all.LessonCompleteAllWordsViewModel$onTtsClicked$1", m4291f = "LessonCompleteAllWordsViewModel.kt", m4292l = {323}, m4293m = "invokeSuspend", m4294v = 2)
final class LessonCompleteAllWordsViewModel$onTtsClicked$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f30935a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2556c f30936b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ w65 f30937c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LessonCompleteAllWordsViewModel$onTtsClicked$1(C2556c c2556c, w65 w65Var, Continuation continuation) {
        super(2, continuation);
        this.f30936b = c2556c;
        this.f30937c = w65Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new LessonCompleteAllWordsViewModel$onTtsClicked$1(this.f30936b, this.f30937c, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((LessonCompleteAllWordsViewModel$onTtsClicked$1) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f30935a;
        C2556c c2556c = this.f30936b;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            vj6 vj6Var = c2556c.f30963k;
            String strMo4589b2 = c2556c.f30955c.mo4589b2();
            this.f30935a = 1;
            obj = vj6Var.m23348x(strMo4589b2, this.f30937c);
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
        sca.m21224J0(c2556c.f30965m, (String) obj, false, 12);
        return xfa.f68157a;
    }
}
