package com.lingq.feature.reader.stats.p019ui.all;

import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.AbstractC3224d;
import p000.C3386nv;
import p000.c32;
import p000.i93;
import p000.un1;
import p000.ux5;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.reader.stats.ui.all.LessonCompleteAllWordsViewModel$5", m4291f = "LessonCompleteAllWordsViewModel.kt", m4292l = {168}, m4293m = "invokeSuspend", m4294v = 2)
final class LessonCompleteAllWordsViewModel$5 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f30905a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2556c f30906b;

    /* JADX INFO: renamed from: com.lingq.feature.reader.stats.ui.all.LessonCompleteAllWordsViewModel$5$1 */
    @c32(m4290c = "com.lingq.feature.reader.stats.ui.all.LessonCompleteAllWordsViewModel$5$1", m4291f = "LessonCompleteAllWordsViewModel.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
    final class C25501 extends SuspendLambda implements zi3 {

        /* JADX INFO: renamed from: a */
        public /* synthetic */ int f30907a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ C2556c f30908b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C25501(C2556c c2556c, Continuation continuation) {
            super(2, continuation);
            this.f30908b = c2556c;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            C25501 c25501 = new C25501(this.f30908b, continuation);
            c25501.f30907a = ((Number) obj).intValue();
            return c25501;
        }

        @Override // p000.zi3
        public final Object invoke(Object obj, Object obj2) throws Throwable {
            C25501 c25501 = (C25501) create(Integer.valueOf(((Number) obj).intValue()), (Continuation) obj2);
            xfa xfaVar = xfa.f68157a;
            c25501.invokeSuspend(xfaVar);
            return xfaVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            int i = this.f30907a;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            AbstractC3193b.m15359b(obj);
            ux5.m22977D(i > 0, this.f30908b.f30975w, null);
            return xfa.f68157a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LessonCompleteAllWordsViewModel$5(C2556c c2556c, Continuation continuation) {
        super(2, continuation);
        this.f30906b = c2556c;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new LessonCompleteAllWordsViewModel$5(this.f30906b, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((LessonCompleteAllWordsViewModel$5) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f30905a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            C2556c c2556c = this.f30906b;
            i93 i93VarM7396k = c2556c.f30961i.m7396k(c2556c.f30955c.mo4589b2());
            C25501 c25501 = new C25501(c2556c, null);
            this.f30905a = 1;
            if (AbstractC3224d.m15529h(i93VarM7396k, c25501, this) == coroutineSingletons) {
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
