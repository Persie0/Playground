package com.lingq.feature.library;

import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.AbstractC3224d;
import p000.C3386nv;
import p000.af6;
import p000.c32;
import p000.eh9;
import p000.hf6;
import p000.ne6;
import p000.q95;
import p000.s95;
import p000.un1;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes.dex */
@c32(m4290c = "com.lingq.feature.library.LibraryUpdateFragment$onViewCreated$1$2", m4291f = "LibraryUpdateFragment.kt", m4292l = {273}, m4293m = "invokeSuspend", m4294v = 2)
final class LibraryUpdateFragment$onViewCreated$1$2 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f26451a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ LibraryUpdateFragment f26452b;

    /* JADX INFO: renamed from: com.lingq.feature.library.LibraryUpdateFragment$onViewCreated$1$2$1 */
    @c32(m4290c = "com.lingq.feature.library.LibraryUpdateFragment$onViewCreated$1$2$1", m4291f = "LibraryUpdateFragment.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
    final class C21351 extends SuspendLambda implements zi3 {

        /* JADX INFO: renamed from: a */
        public /* synthetic */ Object f26453a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ LibraryUpdateFragment f26454b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C21351(LibraryUpdateFragment libraryUpdateFragment, Continuation continuation) {
            super(2, continuation);
            this.f26454b = libraryUpdateFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            C21351 c21351 = new C21351(this.f26454b, continuation);
            c21351.f26453a = obj;
            return c21351;
        }

        @Override // p000.zi3
        public final Object invoke(Object obj, Object obj2) throws Throwable {
            C21351 c21351 = (C21351) create((hf6) obj, (Continuation) obj2);
            xfa xfaVar = xfa.f68157a;
            c21351.invokeSuspend(xfaVar);
            return xfaVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            hf6 hf6Var = (hf6) this.f26453a;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            AbstractC3193b.m15359b(obj);
            boolean z = hf6Var instanceof af6;
            LibraryUpdateFragment libraryUpdateFragment = this.f26454b;
            if (z) {
                libraryUpdateFragment.m9055j0(q95.f57451a);
                libraryUpdateFragment.m9054i0().mo8240E2();
            } else if (hf6Var instanceof ne6) {
                libraryUpdateFragment.m9055j0(s95.f60556a);
                libraryUpdateFragment.m9054i0().mo8240E2();
            }
            return xfa.f68157a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LibraryUpdateFragment$onViewCreated$1$2(LibraryUpdateFragment libraryUpdateFragment, Continuation continuation) {
        super(2, continuation);
        this.f26452b = libraryUpdateFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new LibraryUpdateFragment$onViewCreated$1$2(this.f26452b, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((LibraryUpdateFragment$onViewCreated$1$2) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f26451a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            LibraryUpdateFragment libraryUpdateFragment = this.f26452b;
            eh9 eh9VarMo8249k = libraryUpdateFragment.m9054i0().f26682g.mo8249k();
            C21351 c21351 = new C21351(libraryUpdateFragment, null);
            eh9VarMo8249k.getClass();
            this.f26451a = 1;
            if (AbstractC3224d.m15529h(eh9VarMo8249k, c21351, this) == coroutineSingletons) {
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
