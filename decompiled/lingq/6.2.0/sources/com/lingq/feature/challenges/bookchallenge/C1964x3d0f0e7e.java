package com.lingq.feature.challenges.bookchallenge;

import androidx.lifecycle.AbstractC0708b;
import androidx.lifecycle.Lifecycle$State;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.C3244l;
import p000.C3386nv;
import p000.c18;
import p000.c32;
import p000.lg3;
import p000.un1;
import p000.wb5;
import p000.xfa;
import p000.ye0;
import p000.zi3;

/* JADX INFO: renamed from: com.lingq.feature.challenges.bookchallenge.BookChallengeChooserParentFragment$onViewCreated$$inlined$launchAndRepeatWithViewLifecycle$default$1 */
/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.feature.challenges.bookchallenge.BookChallengeChooserParentFragment$onViewCreated$$inlined$launchAndRepeatWithViewLifecycle$default$1", m4291f = "BookChallengeChooserParentFragment.kt", m4292l = {153}, m4293m = "invokeSuspend", m4294v = 2)
public final class C1964x3d0f0e7e extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f24519a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ BookChallengeChooserParentFragment f24520b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Lifecycle$State f24521c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ BookChallengeChooserParentFragment f24522d;

    /* JADX INFO: renamed from: com.lingq.feature.challenges.bookchallenge.BookChallengeChooserParentFragment$onViewCreated$$inlined$launchAndRepeatWithViewLifecycle$default$1$1, reason: invalid class name */
    @c32(m4290c = "com.lingq.feature.challenges.bookchallenge.BookChallengeChooserParentFragment$onViewCreated$$inlined$launchAndRepeatWithViewLifecycle$default$1$1", m4291f = "BookChallengeChooserParentFragment.kt", m4292l = {156}, m4293m = "invokeSuspend", m4294v = 2)
    public final class AnonymousClass1 extends SuspendLambda implements zi3 {

        /* JADX INFO: renamed from: a */
        public int f24523a;

        /* JADX INFO: renamed from: b */
        public /* synthetic */ Object f24524b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ BookChallengeChooserParentFragment f24525c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(Continuation continuation, BookChallengeChooserParentFragment bookChallengeChooserParentFragment) {
            super(2, continuation);
            this.f24525c = bookChallengeChooserParentFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(continuation, this.f24525c);
            anonymousClass1.f24524b = obj;
            return anonymousClass1;
        }

        @Override // p000.zi3
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.f24523a;
            if (i == 0) {
                AbstractC3193b.m15359b(obj);
                BookChallengeChooserParentFragment bookChallengeChooserParentFragment = this.f24525c;
                c18 c18Var = bookChallengeChooserParentFragment.m8811A0().f24550j;
                ye0 ye0Var = new ye0(bookChallengeChooserParentFragment, 0);
                this.f24524b = null;
                this.f24523a = 1;
                if (((C3244l) c18Var.f9311a).collect(ye0Var, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                AbstractC3193b.m15359b(obj);
            }
            C3386nv.m17631r();
            return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1964x3d0f0e7e(BookChallengeChooserParentFragment bookChallengeChooserParentFragment, Lifecycle$State lifecycle$State, Continuation continuation, BookChallengeChooserParentFragment bookChallengeChooserParentFragment2) {
        super(2, continuation);
        this.f24520b = bookChallengeChooserParentFragment;
        this.f24521c = lifecycle$State;
        this.f24522d = bookChallengeChooserParentFragment2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new C1964x3d0f0e7e(this.f24520b, this.f24521c, continuation, this.f24522d);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((C1964x3d0f0e7e) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f24519a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            lg3 lg3VarM2112n = this.f24520b.m2112n();
            lg3VarM2112n.m16179b();
            wb5 wb5Var = lg3VarM2112n.f49626e;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(null, this.f24522d);
            this.f24519a = 1;
            if (AbstractC0708b.m2509b(wb5Var, this.f24521c, anonymousClass1, this) == coroutineSingletons) {
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
