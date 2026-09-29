package com.lingq.feature.reader.old.tutorial;

import java.util.List;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.AbstractC3224d;
import p000.C3386nv;
import p000.bh4;
import p000.c18;
import p000.c32;
import p000.un1;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.reader.old.tutorial.LessonMoveKnownFragment$onViewCreated$5$2", m4291f = "LessonMoveKnownFragment.kt", m4292l = {198}, m4293m = "invokeSuspend", m4294v = 2)
final class LessonMoveKnownFragment$onViewCreated$5$2 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f29586a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ LessonMoveKnownFragment f29587b;

    /* JADX INFO: renamed from: com.lingq.feature.reader.old.tutorial.LessonMoveKnownFragment$onViewCreated$5$2$1 */
    @c32(m4290c = "com.lingq.feature.reader.old.tutorial.LessonMoveKnownFragment$onViewCreated$5$2$1", m4291f = "LessonMoveKnownFragment.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
    final class C24471 extends SuspendLambda implements zi3 {

        /* JADX INFO: renamed from: a */
        public /* synthetic */ Object f29588a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ LessonMoveKnownFragment f29589b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C24471(LessonMoveKnownFragment lessonMoveKnownFragment, Continuation continuation) {
            super(2, continuation);
            this.f29589b = lessonMoveKnownFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            C24471 c24471 = new C24471(this.f29589b, continuation);
            c24471.f29588a = obj;
            return c24471;
        }

        @Override // p000.zi3
        public final Object invoke(Object obj, Object obj2) throws Throwable {
            C24471 c24471 = (C24471) create((List) obj, (Continuation) obj2);
            xfa xfaVar = xfa.f68157a;
            c24471.invokeSuspend(xfaVar);
            return xfaVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            List list = (List) this.f29588a;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            AbstractC3193b.m15359b(obj);
            if (list != null && list.isEmpty()) {
                bh4[] bh4VarArr = LessonMoveKnownFragment.f29562H0;
                LessonMoveKnownFragment lessonMoveKnownFragment = this.f29589b;
                if (lessonMoveKnownFragment.m9352T0().f29666i == -1) {
                    lessonMoveKnownFragment.m9351S0().m9322c3();
                }
                lessonMoveKnownFragment.m2109k().m2147T();
            }
            return xfa.f68157a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LessonMoveKnownFragment$onViewCreated$5$2(LessonMoveKnownFragment lessonMoveKnownFragment, Continuation continuation) {
        super(2, continuation);
        this.f29587b = lessonMoveKnownFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new LessonMoveKnownFragment$onViewCreated$5$2(this.f29587b, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((LessonMoveKnownFragment$onViewCreated$5$2) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f29586a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            bh4[] bh4VarArr = LessonMoveKnownFragment.f29562H0;
            LessonMoveKnownFragment lessonMoveKnownFragment = this.f29587b;
            c18 c18Var = lessonMoveKnownFragment.m9352T0().f29670m;
            C24471 c24471 = new C24471(lessonMoveKnownFragment, null);
            c18Var.getClass();
            this.f29586a = 1;
            if (AbstractC3224d.m15529h(c18Var, c24471, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC3193b.m15359b(obj);
        }
        C3386nv.m17633t("SharedFlow never completes, this call should never return.");
        return null;
    }
}
