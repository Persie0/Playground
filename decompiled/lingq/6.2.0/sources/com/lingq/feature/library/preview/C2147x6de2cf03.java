package com.lingq.feature.library.preview;

import androidx.lifecycle.AbstractC0708b;
import androidx.lifecycle.Lifecycle$State;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.C3386nv;
import p000.c32;
import p000.lg3;
import p000.un1;
import p000.wb5;
import p000.wfb;
import p000.xfa;
import p000.zi3;

/* JADX INFO: renamed from: com.lingq.feature.library.preview.LessonPreviewFragment$onViewCreated$$inlined$launchAndRepeatWithViewLifecycle$default$1 */
/* JADX INFO: loaded from: classes.dex */
@c32(m4290c = "com.lingq.feature.library.preview.LessonPreviewFragment$onViewCreated$$inlined$launchAndRepeatWithViewLifecycle$default$1", m4291f = "LessonPreviewFragment.kt", m4292l = {153}, m4293m = "invokeSuspend", m4294v = 2)
public final class C2147x6de2cf03 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f26708a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ LessonPreviewFragment f26709b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Lifecycle$State f26710c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ LessonPreviewFragment f26711d;

    /* JADX INFO: renamed from: com.lingq.feature.library.preview.LessonPreviewFragment$onViewCreated$$inlined$launchAndRepeatWithViewLifecycle$default$1$1, reason: invalid class name */
    @c32(m4290c = "com.lingq.feature.library.preview.LessonPreviewFragment$onViewCreated$$inlined$launchAndRepeatWithViewLifecycle$default$1$1", m4291f = "LessonPreviewFragment.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
    public final class AnonymousClass1 extends SuspendLambda implements zi3 {

        /* JADX INFO: renamed from: a */
        public /* synthetic */ Object f26712a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ LessonPreviewFragment f26713b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(LessonPreviewFragment lessonPreviewFragment, Continuation continuation) {
            super(2, continuation);
            this.f26713b = lessonPreviewFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f26713b, continuation);
            anonymousClass1.f26712a = obj;
            return anonymousClass1;
        }

        @Override // p000.zi3
        public final Object invoke(Object obj, Object obj2) throws Throwable {
            AnonymousClass1 anonymousClass1 = (AnonymousClass1) create((un1) obj, (Continuation) obj2);
            xfa xfaVar = xfa.f68157a;
            anonymousClass1.invokeSuspend(xfaVar);
            return xfaVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            un1 un1Var = (un1) this.f26712a;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            AbstractC3193b.m15359b(obj);
            LessonPreviewFragment lessonPreviewFragment = this.f26713b;
            wfb.m23926u(un1Var, null, null, new LessonPreviewFragment$onViewCreated$3$1(lessonPreviewFragment, null), 3);
            wfb.m23926u(un1Var, null, null, new LessonPreviewFragment$onViewCreated$3$2(lessonPreviewFragment, null), 3);
            wfb.m23926u(un1Var, null, null, new LessonPreviewFragment$onViewCreated$3$3(lessonPreviewFragment, null), 3);
            return xfa.f68157a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2147x6de2cf03(LessonPreviewFragment lessonPreviewFragment, Lifecycle$State lifecycle$State, Continuation continuation, LessonPreviewFragment lessonPreviewFragment2) {
        super(2, continuation);
        this.f26709b = lessonPreviewFragment;
        this.f26710c = lifecycle$State;
        this.f26711d = lessonPreviewFragment2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new C2147x6de2cf03(this.f26709b, this.f26710c, continuation, this.f26711d);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((C2147x6de2cf03) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f26708a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            lg3 lg3VarM2112n = this.f26709b.m2112n();
            lg3VarM2112n.m16179b();
            wb5 wb5Var = lg3VarM2112n.f49626e;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f26711d, null);
            this.f26708a = 1;
            if (AbstractC0708b.m2509b(wb5Var, this.f26710c, anonymousClass1, this) == coroutineSingletons) {
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
