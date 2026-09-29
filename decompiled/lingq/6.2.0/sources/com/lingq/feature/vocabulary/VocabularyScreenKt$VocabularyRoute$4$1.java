package com.lingq.feature.vocabulary;

import android.content.Context;
import com.lingq.core.token.C1909e;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.bia;
import p000.c32;
import p000.k0b;
import p000.n1b;
import p000.og8;
import p000.qwa;
import p000.t66;
import p000.un1;
import p000.w41;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.vocabulary.VocabularyScreenKt$VocabularyRoute$4$1", m4291f = "VocabularyScreen.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
final class VocabularyScreenKt$VocabularyRoute$4$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C2824b f33499a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ t66 f33500b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ w41 f33501c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ Context f33502d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ og8 f33503e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ bia f33504f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ C1909e f33505g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ t66 f33506h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VocabularyScreenKt$VocabularyRoute$4$1(C2824b c2824b, t66 t66Var, w41 w41Var, Context context, og8 og8Var, bia biaVar, C1909e c1909e, t66 t66Var2, Continuation continuation) {
        super(2, continuation);
        this.f33499a = c2824b;
        this.f33500b = t66Var;
        this.f33501c = w41Var;
        this.f33502d = context;
        this.f33503e = og8Var;
        this.f33504f = biaVar;
        this.f33505g = c1909e;
        this.f33506h = t66Var2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new VocabularyScreenKt$VocabularyRoute$4$1(this.f33499a, this.f33500b, this.f33501c, this.f33502d, this.f33503e, this.f33504f, this.f33505g, this.f33506h, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        VocabularyScreenKt$VocabularyRoute$4$1 vocabularyScreenKt$VocabularyRoute$4$1 = (VocabularyScreenKt$VocabularyRoute$4$1) create((un1) obj, (Continuation) obj2);
        xfa xfaVar = xfa.f68157a;
        vocabularyScreenKt$VocabularyRoute$4$1.invokeSuspend(xfaVar);
        return xfaVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        AbstractC3193b.m15359b(obj);
        t66 t66Var = this.f33500b;
        if (((n1b) t66Var.getValue()).f52195e.f66191d) {
            k0b k0bVar = new k0b(((n1b) t66Var.getValue()).f52195e.f66189b, ((n1b) t66Var.getValue()).f52195e.f66190c);
            w41 w41Var = this.f33501c;
            Context context = this.f33502d;
            og8 og8Var = this.f33503e;
            bia biaVar = this.f33504f;
            C1909e c1909e = this.f33505g;
            C2824b c2824b = this.f33499a;
            AbstractC2823a.m9740g(w41Var, context, og8Var, biaVar, c1909e, c2824b, this.f33506h, k0bVar);
            c2824b.m9744V2(qwa.f58305a);
        }
        return xfa.f68157a;
    }
}
