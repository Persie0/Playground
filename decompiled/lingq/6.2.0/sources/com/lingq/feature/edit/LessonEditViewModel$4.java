package com.lingq.feature.edit;

import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.AbstractC3224d;
import kotlinx.coroutines.flow.C3244l;
import p000.C3386nv;
import p000.c32;
import p000.c83;
import p000.un1;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.feature.edit.LessonEditViewModel$4", m4291f = "LessonEditViewModel.kt", m4292l = {211}, m4293m = "invokeSuspend", m4294v = 2)
final class LessonEditViewModel$4 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f25871a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2077c f25872b;

    /* JADX INFO: renamed from: com.lingq.feature.edit.LessonEditViewModel$4$1 */
    @c32(m4290c = "com.lingq.feature.edit.LessonEditViewModel$4$1", m4291f = "LessonEditViewModel.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
    final class C20741 extends SuspendLambda implements zi3 {

        /* JADX INFO: renamed from: a */
        public /* synthetic */ long f25873a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ C2077c f25874b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C20741(C2077c c2077c, Continuation continuation) {
            super(2, continuation);
            this.f25874b = c2077c;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            C20741 c20741 = new C20741(this.f25874b, continuation);
            c20741.f25873a = ((Number) obj).longValue();
            return c20741;
        }

        @Override // p000.zi3
        public final Object invoke(Object obj, Object obj2) throws Throwable {
            C20741 c20741 = (C20741) create(Long.valueOf(((Number) obj).longValue()), (Continuation) obj2);
            xfa xfaVar = xfa.f68157a;
            c20741.invokeSuspend(xfaVar);
            return xfaVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            long j = this.f25873a;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            AbstractC3193b.m15359b(obj);
            C3244l c3244l = this.f25874b.f25950t;
            Long l = new Long(j);
            c3244l.getClass();
            c3244l.m15572j(null, l);
            return xfa.f68157a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LessonEditViewModel$4(C2077c c2077c, Continuation continuation) {
        super(2, continuation);
        this.f25872b = c2077c;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new LessonEditViewModel$4(this.f25872b, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((LessonEditViewModel$4) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f25871a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            C2077c c2077c = this.f25872b;
            c83 c83VarMo8486d = c2077c.f25941k.mo8486d();
            C20741 c20741 = new C20741(c2077c, null);
            this.f25871a = 1;
            if (AbstractC3224d.m15529h(c83VarMo8486d, c20741, this) == coroutineSingletons) {
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
