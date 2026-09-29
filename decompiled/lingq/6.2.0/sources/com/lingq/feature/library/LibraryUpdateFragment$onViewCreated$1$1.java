package com.lingq.feature.library;

import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.AbstractC3224d;
import p000.C3386nv;
import p000.c32;
import p000.eh9;
import p000.gf6;
import p000.hf6;
import p000.ie6;
import p000.r95;
import p000.un1;
import p000.v95;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes.dex */
@c32(m4290c = "com.lingq.feature.library.LibraryUpdateFragment$onViewCreated$1$1", m4291f = "LibraryUpdateFragment.kt", m4292l = {273}, m4293m = "invokeSuspend", m4294v = 2)
final class LibraryUpdateFragment$onViewCreated$1$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f26447a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ LibraryUpdateFragment f26448b;

    /* JADX INFO: renamed from: com.lingq.feature.library.LibraryUpdateFragment$onViewCreated$1$1$1 */
    @c32(m4290c = "com.lingq.feature.library.LibraryUpdateFragment$onViewCreated$1$1$1", m4291f = "LibraryUpdateFragment.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
    final class C21341 extends SuspendLambda implements zi3 {

        /* JADX INFO: renamed from: a */
        public /* synthetic */ Object f26449a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ LibraryUpdateFragment f26450b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C21341(LibraryUpdateFragment libraryUpdateFragment, Continuation continuation) {
            super(2, continuation);
            this.f26450b = libraryUpdateFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            C21341 c21341 = new C21341(this.f26450b, continuation);
            c21341.f26449a = obj;
            return c21341;
        }

        @Override // p000.zi3
        public final Object invoke(Object obj, Object obj2) throws Throwable {
            C21341 c21341 = (C21341) create((hf6) obj, (Continuation) obj2);
            xfa xfaVar = xfa.f68157a;
            c21341.invokeSuspend(xfaVar);
            return xfaVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            hf6 hf6Var = (hf6) this.f26449a;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            AbstractC3193b.m15359b(obj);
            boolean z = hf6Var instanceof ie6;
            LibraryUpdateFragment libraryUpdateFragment = this.f26450b;
            if (z) {
                libraryUpdateFragment.m9055j0(new r95(((ie6) hf6Var).m13811a()));
                libraryUpdateFragment.m9054i0().mo8241G0();
            } else if (hf6Var instanceof gf6) {
                libraryUpdateFragment.m9055j0(new v95(((gf6) hf6Var).m12567a()));
                libraryUpdateFragment.m9054i0().mo8241G0();
            }
            return xfa.f68157a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LibraryUpdateFragment$onViewCreated$1$1(LibraryUpdateFragment libraryUpdateFragment, Continuation continuation) {
        super(2, continuation);
        this.f26448b = libraryUpdateFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new LibraryUpdateFragment$onViewCreated$1$1(this.f26448b, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((LibraryUpdateFragment$onViewCreated$1$1) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f26447a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            LibraryUpdateFragment libraryUpdateFragment = this.f26448b;
            eh9 eh9VarMo8244S1 = libraryUpdateFragment.m9054i0().f26682g.mo8244S1();
            C21341 c21341 = new C21341(libraryUpdateFragment, null);
            eh9VarMo8244S1.getClass();
            this.f26447a = 1;
            if (AbstractC3224d.m15529h(eh9VarMo8244S1, c21341, this) == coroutineSingletons) {
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
