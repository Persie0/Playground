package com.lingq.feature.reader.stats.p019ui.all;

import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.AbstractC3224d;
import kotlinx.coroutines.flow.C3228h;
import p000.C3386nv;
import p000.c32;
import p000.un1;
import p000.vs3;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.reader.stats.ui.all.LessonCompleteAllWordsViewModel$6", m4291f = "LessonCompleteAllWordsViewModel.kt", m4292l = {174}, m4293m = "invokeSuspend", m4294v = 2)
final class LessonCompleteAllWordsViewModel$6 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f30909a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2556c f30910b;

    /* JADX INFO: renamed from: com.lingq.feature.reader.stats.ui.all.LessonCompleteAllWordsViewModel$6$1 */
    @c32(m4290c = "com.lingq.feature.reader.stats.ui.all.LessonCompleteAllWordsViewModel$6$1", m4291f = "LessonCompleteAllWordsViewModel.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
    final class C25511 extends SuspendLambda implements zi3 {

        /* JADX INFO: renamed from: a */
        public /* synthetic */ Object f30911a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ C2556c f30912b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C25511(C2556c c2556c, Continuation continuation) {
            super(2, continuation);
            this.f30912b = c2556c;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            C25511 c25511 = new C25511(this.f30912b, continuation);
            c25511.f30911a = obj;
            return c25511;
        }

        @Override // p000.zi3
        public final Object invoke(Object obj, Object obj2) throws Throwable {
            C25511 c25511 = (C25511) create((vs3) obj, (Continuation) obj2);
            xfa xfaVar = xfa.f68157a;
            c25511.invokeSuspend(xfaVar);
            return xfaVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            vs3 vs3Var = (vs3) this.f30911a;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            AbstractC3193b.m15359b(obj);
            this.f30912b.f30952A.m15571i(vs3Var);
            return xfa.f68157a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LessonCompleteAllWordsViewModel$6(C2556c c2556c, Continuation continuation) {
        super(2, continuation);
        this.f30910b = c2556c;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new LessonCompleteAllWordsViewModel$6(this.f30910b, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((LessonCompleteAllWordsViewModel$6) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f30909a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            C2556c c2556c = this.f30910b;
            C3228h c3228hM8209a = c2556c.f30962j.m8209a();
            C25511 c25511 = new C25511(c2556c, null);
            this.f30909a = 1;
            if (AbstractC3224d.m15529h(c3228hM8209a, c25511, this) == coroutineSingletons) {
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
