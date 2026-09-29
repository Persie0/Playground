package com.lingq.feature.playlist;

import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.AbstractC3224d;
import p000.C3386nv;
import p000.c32;
import p000.eh9;
import p000.hf6;
import p000.lda;
import p000.un1;
import p000.wfb;
import p000.xfa;
import p000.ye6;
import p000.zi3;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.playlist.PlaylistViewModel$7", m4291f = "PlaylistViewModel.kt", m4292l = {1066}, m4293m = "invokeSuspend", m4294v = 2)
final class PlaylistViewModel$7 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f27637a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2255e f27638b;

    /* JADX INFO: renamed from: com.lingq.feature.playlist.PlaylistViewModel$7$1 */
    @c32(m4290c = "com.lingq.feature.playlist.PlaylistViewModel$7$1", m4291f = "PlaylistViewModel.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
    final class C22421 extends SuspendLambda implements zi3 {

        /* JADX INFO: renamed from: a */
        public /* synthetic */ Object f27639a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ C2255e f27640b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C22421(C2255e c2255e, Continuation continuation) {
            super(2, continuation);
            this.f27640b = c2255e;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            C22421 c22421 = new C22421(this.f27640b, continuation);
            c22421.f27639a = obj;
            return c22421;
        }

        @Override // p000.zi3
        public final Object invoke(Object obj, Object obj2) throws Throwable {
            C22421 c22421 = (C22421) create((hf6) obj, (Continuation) obj2);
            xfa xfaVar = xfa.f68157a;
            c22421.invokeSuspend(xfaVar);
            return xfaVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            hf6 hf6Var = (hf6) this.f27639a;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            AbstractC3193b.m15359b(obj);
            if (hf6Var instanceof ye6) {
                int i = ((ye6) hf6Var).f69729a;
                C2255e c2255e = this.f27640b;
                wfb.m23926u(lda.m16103C(c2255e), null, null, new PlaylistViewModel$selectPlaylist$1(c2255e, i, null), 3);
                c2255e.mo8241G0();
            }
            return xfa.f68157a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlaylistViewModel$7(C2255e c2255e, Continuation continuation) {
        super(2, continuation);
        this.f27638b = c2255e;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new PlaylistViewModel$7(this.f27638b, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((PlaylistViewModel$7) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f27637a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            C2255e c2255e = this.f27638b;
            eh9 eh9VarMo8244S1 = c2255e.f27847x.mo8244S1();
            C22421 c22421 = new C22421(c2255e, null);
            eh9VarMo8244S1.getClass();
            this.f27637a = 1;
            if (AbstractC3224d.m15529h(eh9VarMo8244S1, c22421, this) == coroutineSingletons) {
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
