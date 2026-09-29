package com.lingq.feature.vocabulary;

import com.lingq.core.domain.model.lesson.TokenType;
import com.lingq.core.token.C1909e;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.c32;
import p000.lxa;
import p000.n1b;
import p000.pwa;
import p000.t66;
import p000.un1;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.vocabulary.VocabularyScreenKt$VocabularyRoute$1$1", m4291f = "VocabularyScreen.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
final class VocabularyScreenKt$VocabularyRoute$1$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C2824b f33496a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ t66 f33497b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C1909e f33498c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VocabularyScreenKt$VocabularyRoute$1$1(C2824b c2824b, t66 t66Var, C1909e c1909e, Continuation continuation) {
        super(2, continuation);
        this.f33496a = c2824b;
        this.f33497b = t66Var;
        this.f33498c = c1909e;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new VocabularyScreenKt$VocabularyRoute$1$1(this.f33496a, this.f33497b, this.f33498c, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        VocabularyScreenKt$VocabularyRoute$1$1 vocabularyScreenKt$VocabularyRoute$1$1 = (VocabularyScreenKt$VocabularyRoute$1$1) create((un1) obj, (Continuation) obj2);
        xfa xfaVar = xfa.f68157a;
        vocabularyScreenKt$VocabularyRoute$1$1.invokeSuspend(xfaVar);
        return xfaVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        AbstractC3193b.m15359b(obj);
        lxa lxaVar = ((n1b) this.f33497b.getValue()).f52200j;
        xfa xfaVar = xfa.f68157a;
        if (lxaVar == null) {
            return xfaVar;
        }
        String str = lxaVar.f50278a;
        TokenType tokenType = lxaVar.f50279b;
        C1909e c1909e = this.f33498c;
        C2824b c2824b = this.f33496a;
        AbstractC2823a.m9741h(c1909e, c2824b, str, tokenType);
        c2824b.m9744V2(pwa.f56931a);
        return xfaVar;
    }
}
