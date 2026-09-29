package com.lingq.feature.reader.stats.p019ui.words;

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
@c32(m4290c = "com.lingq.feature.reader.stats.ui.words.LessonCompleteDealBlueViewModel$onTtsClicked$1", m4291f = "LessonCompleteDealBlueViewModel.kt", m4292l = {121}, m4293m = "invokeSuspend", m4294v = 2)
final class LessonCompleteDealBlueViewModel$onTtsClicked$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f31102a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2573c f31103b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ w65 f31104c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LessonCompleteDealBlueViewModel$onTtsClicked$1(C2573c c2573c, w65 w65Var, Continuation continuation) {
        super(2, continuation);
        this.f31103b = c2573c;
        this.f31104c = w65Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new LessonCompleteDealBlueViewModel$onTtsClicked$1(this.f31103b, this.f31104c, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((LessonCompleteDealBlueViewModel$onTtsClicked$1) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f31102a;
        C2573c c2573c = this.f31103b;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            vj6 vj6Var = c2573c.f31127j;
            String strMo4589b2 = c2573c.f31120c.mo4589b2();
            this.f31102a = 1;
            obj = vj6Var.m23348x(strMo4589b2, this.f31104c);
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
        sca.m21224J0(c2573c.f31126i, (String) obj, false, 12);
        return xfa.f68157a;
    }
}
