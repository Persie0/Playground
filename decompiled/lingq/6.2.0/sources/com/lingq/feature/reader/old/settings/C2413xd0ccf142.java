package com.lingq.feature.reader.old.settings;

import androidx.lifecycle.AbstractC0708b;
import androidx.lifecycle.Lifecycle$State;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.AbstractC3224d;
import p000.C3386nv;
import p000.bh4;
import p000.c32;
import p000.du0;
import p000.lg3;
import p000.un1;
import p000.wb5;
import p000.wfb;
import p000.xfa;
import p000.zi3;

/* JADX INFO: renamed from: com.lingq.feature.reader.old.settings.LessonReviewMenuFragment$onViewCreated$$inlined$launchAndRepeatWithViewLifecycle$default$1 */
/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.reader.old.settings.LessonReviewMenuFragment$onViewCreated$$inlined$launchAndRepeatWithViewLifecycle$default$1", m4291f = "LessonReviewMenuFragment.kt", m4292l = {153}, m4293m = "invokeSuspend", m4294v = 2)
public final class C2413xd0ccf142 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f29433a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ LessonReviewMenuFragment f29434b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Lifecycle$State f29435c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ LessonReviewMenuFragment f29436d;

    /* JADX INFO: renamed from: com.lingq.feature.reader.old.settings.LessonReviewMenuFragment$onViewCreated$$inlined$launchAndRepeatWithViewLifecycle$default$1$1, reason: invalid class name */
    @c32(m4290c = "com.lingq.feature.reader.old.settings.LessonReviewMenuFragment$onViewCreated$$inlined$launchAndRepeatWithViewLifecycle$default$1$1", m4291f = "LessonReviewMenuFragment.kt", m4292l = {192}, m4293m = "invokeSuspend", m4294v = 2)
    public final class AnonymousClass1 extends SuspendLambda implements zi3 {

        /* JADX INFO: renamed from: a */
        public int f29437a;

        /* JADX INFO: renamed from: b */
        public /* synthetic */ Object f29438b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ LessonReviewMenuFragment f29439c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(LessonReviewMenuFragment lessonReviewMenuFragment, Continuation continuation) {
            super(2, continuation);
            this.f29439c = lessonReviewMenuFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f29439c, continuation);
            anonymousClass1.f29438b = obj;
            return anonymousClass1;
        }

        @Override // p000.zi3
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            un1 un1Var = (un1) this.f29438b;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.f29437a;
            if (i == 0) {
                AbstractC3193b.m15359b(obj);
                LessonReviewMenuFragment lessonReviewMenuFragment = this.f29439c;
                wfb.m23926u(un1Var, null, null, new LessonReviewMenuFragment$onViewCreated$5$1(lessonReviewMenuFragment, null), 3);
                wfb.m23926u(un1Var, null, null, new LessonReviewMenuFragment$onViewCreated$5$2(lessonReviewMenuFragment, null), 3);
                wfb.m23926u(un1Var, null, null, new LessonReviewMenuFragment$onViewCreated$5$3(lessonReviewMenuFragment, null), 3);
                wfb.m23926u(un1Var, null, null, new LessonReviewMenuFragment$onViewCreated$5$4(lessonReviewMenuFragment, null), 3);
                wfb.m23926u(un1Var, null, null, new LessonReviewMenuFragment$onViewCreated$5$5(lessonReviewMenuFragment, null), 3);
                wfb.m23926u(un1Var, null, null, new LessonReviewMenuFragment$onViewCreated$5$6(lessonReviewMenuFragment, null), 3);
                wfb.m23926u(un1Var, null, null, new LessonReviewMenuFragment$onViewCreated$5$7(lessonReviewMenuFragment, null), 3);
                bh4[] bh4VarArr = LessonReviewMenuFragment.f29427G0;
                du0 du0Var = lessonReviewMenuFragment.m9346T0().f43592d;
                LessonReviewMenuFragment$onViewCreated$5$8 lessonReviewMenuFragment$onViewCreated$5$8 = new LessonReviewMenuFragment$onViewCreated$5$8(lessonReviewMenuFragment, null);
                this.f29438b = null;
                this.f29437a = 1;
                if (AbstractC3224d.m15529h(du0Var, lessonReviewMenuFragment$onViewCreated$5$8, this) == coroutineSingletons) {
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2413xd0ccf142(LessonReviewMenuFragment lessonReviewMenuFragment, Lifecycle$State lifecycle$State, Continuation continuation, LessonReviewMenuFragment lessonReviewMenuFragment2) {
        super(2, continuation);
        this.f29434b = lessonReviewMenuFragment;
        this.f29435c = lifecycle$State;
        this.f29436d = lessonReviewMenuFragment2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new C2413xd0ccf142(this.f29434b, this.f29435c, continuation, this.f29436d);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((C2413xd0ccf142) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f29433a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            lg3 lg3VarM2112n = this.f29434b.m2112n();
            lg3VarM2112n.m16179b();
            wb5 wb5Var = lg3VarM2112n.f49626e;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f29436d, null);
            this.f29433a = 1;
            if (AbstractC0708b.m2509b(wb5Var, this.f29435c, anonymousClass1, this) == coroutineSingletons) {
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
