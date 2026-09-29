package com.lingq.feature.reader.old.tutorial;

import java.util.List;
import kotlin.AbstractC3193b;
import kotlin.collections.EmptyList;
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
@c32(m4290c = "com.lingq.feature.reader.old.tutorial.LessonMoveKnownFragment$onViewCreated$5$3", m4291f = "LessonMoveKnownFragment.kt", m4292l = {198}, m4293m = "invokeSuspend", m4294v = 2)
final class LessonMoveKnownFragment$onViewCreated$5$3 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f29590a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ LessonMoveKnownFragment f29591b;

    /* JADX INFO: renamed from: com.lingq.feature.reader.old.tutorial.LessonMoveKnownFragment$onViewCreated$5$3$1 */
    @c32(m4290c = "com.lingq.feature.reader.old.tutorial.LessonMoveKnownFragment$onViewCreated$5$3$1", m4291f = "LessonMoveKnownFragment.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
    final class C24481 extends SuspendLambda implements zi3 {

        /* JADX INFO: renamed from: a */
        public /* synthetic */ Object f29592a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ LessonMoveKnownFragment f29593b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C24481(LessonMoveKnownFragment lessonMoveKnownFragment, Continuation continuation) {
            super(2, continuation);
            this.f29593b = lessonMoveKnownFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            C24481 c24481 = new C24481(this.f29593b, continuation);
            c24481.f29592a = obj;
            return c24481;
        }

        @Override // p000.zi3
        public final Object invoke(Object obj, Object obj2) throws Throwable {
            C24481 c24481 = (C24481) create((List) obj, (Continuation) obj2);
            xfa xfaVar = xfa.f68157a;
            c24481.invokeSuspend(xfaVar);
            return xfaVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            List list = (List) this.f29592a;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            AbstractC3193b.m15359b(obj);
            bh4[] bh4VarArr = LessonMoveKnownFragment.f29562H0;
            LessonMoveKnownFragment lessonMoveKnownFragment = this.f29593b;
            if (lessonMoveKnownFragment.m9352T0().f29666i == -1) {
                lessonMoveKnownFragment.m9352T0().m9354V2(list);
            } else {
                lessonMoveKnownFragment.m9352T0().m9354V2(EmptyList.f47638a);
            }
            return xfa.f68157a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LessonMoveKnownFragment$onViewCreated$5$3(LessonMoveKnownFragment lessonMoveKnownFragment, Continuation continuation) {
        super(2, continuation);
        this.f29591b = lessonMoveKnownFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new LessonMoveKnownFragment$onViewCreated$5$3(this.f29591b, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((LessonMoveKnownFragment$onViewCreated$5$3) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f29590a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            bh4[] bh4VarArr = LessonMoveKnownFragment.f29562H0;
            LessonMoveKnownFragment lessonMoveKnownFragment = this.f29591b;
            c18 c18Var = lessonMoveKnownFragment.m9351S0().f29402r1;
            C24481 c24481 = new C24481(lessonMoveKnownFragment, null);
            c18Var.getClass();
            this.f29590a = 1;
            if (AbstractC3224d.m15529h(c18Var, c24481, this) == coroutineSingletons) {
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
