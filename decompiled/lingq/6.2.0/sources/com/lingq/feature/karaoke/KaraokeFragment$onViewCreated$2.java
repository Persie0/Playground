package com.lingq.feature.karaoke;

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
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.karaoke.KaraokeFragment$onViewCreated$2", m4291f = "KaraokeFragment.kt", m4292l = {70}, m4293m = "invokeSuspend", m4294v = 2)
final class KaraokeFragment$onViewCreated$2 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f26200a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ KaraokeFragment f26201b;

    /* JADX INFO: renamed from: com.lingq.feature.karaoke.KaraokeFragment$onViewCreated$2$1 */
    @c32(m4290c = "com.lingq.feature.karaoke.KaraokeFragment$onViewCreated$2$1", m4291f = "KaraokeFragment.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
    final class C21101 extends SuspendLambda implements zi3 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ KaraokeFragment f26202a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C21101(KaraokeFragment karaokeFragment, Continuation continuation) {
            super(2, continuation);
            this.f26202a = karaokeFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new C21101(this.f26202a, continuation);
        }

        @Override // p000.zi3
        public final Object invoke(Object obj, Object obj2) throws Throwable {
            C21101 c21101 = (C21101) create((un1) obj, (Continuation) obj2);
            xfa xfaVar = xfa.f68157a;
            c21101.invokeSuspend(xfaVar);
            return xfaVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            AbstractC3193b.m15359b(obj);
            ((C2118c) this.f26202a.f26193B0.getValue()).mo8768j0(false);
            return xfa.f68157a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KaraokeFragment$onViewCreated$2(KaraokeFragment karaokeFragment, Continuation continuation) {
        super(2, continuation);
        this.f26201b = karaokeFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new KaraokeFragment$onViewCreated$2(this.f26201b, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((KaraokeFragment$onViewCreated$2) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f26200a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            KaraokeFragment karaokeFragment = this.f26201b;
            lg3 lg3VarM2112n = karaokeFragment.m2112n();
            Lifecycle$State lifecycle$State = Lifecycle$State.CREATED;
            C21101 c21101 = new C21101(karaokeFragment, null);
            this.f26200a = 1;
            if (AbstractC0708b.m2510c(lg3VarM2112n, lifecycle$State, c21101, this) == coroutineSingletons) {
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
