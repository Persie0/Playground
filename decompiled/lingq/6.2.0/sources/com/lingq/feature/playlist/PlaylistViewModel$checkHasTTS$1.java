package com.lingq.feature.playlist;

import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.AbstractC3224d;
import p000.C3386nv;
import p000.c32;
import p000.i93;
import p000.un1;
import p000.ux5;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.playlist.PlaylistViewModel$checkHasTTS$1", m4291f = "PlaylistViewModel.kt", m4292l = {905}, m4293m = "invokeSuspend", m4294v = 2)
final class PlaylistViewModel$checkHasTTS$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f27660a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2255e f27661b;

    /* JADX INFO: renamed from: com.lingq.feature.playlist.PlaylistViewModel$checkHasTTS$1$1 */
    @c32(m4290c = "com.lingq.feature.playlist.PlaylistViewModel$checkHasTTS$1$1", m4291f = "PlaylistViewModel.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
    final class C22431 extends SuspendLambda implements zi3 {

        /* JADX INFO: renamed from: a */
        public /* synthetic */ int f27662a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ C2255e f27663b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C22431(C2255e c2255e, Continuation continuation) {
            super(2, continuation);
            this.f27663b = c2255e;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            C22431 c22431 = new C22431(this.f27663b, continuation);
            c22431.f27662a = ((Number) obj).intValue();
            return c22431;
        }

        @Override // p000.zi3
        public final Object invoke(Object obj, Object obj2) throws Throwable {
            C22431 c22431 = (C22431) create(Integer.valueOf(((Number) obj).intValue()), (Continuation) obj2);
            xfa xfaVar = xfa.f68157a;
            c22431.invokeSuspend(xfaVar);
            return xfaVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            int i = this.f27662a;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            AbstractC3193b.m15359b(obj);
            ux5.m22977D(i > 0, this.f27663b.f27819N, null);
            return xfa.f68157a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlaylistViewModel$checkHasTTS$1(C2255e c2255e, Continuation continuation) {
        super(2, continuation);
        this.f27661b = c2255e;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new PlaylistViewModel$checkHasTTS$1(this.f27661b, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((PlaylistViewModel$checkHasTTS$1) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f27660a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            C2255e c2255e = this.f27661b;
            i93 i93VarM7396k = c2255e.f27839p.m7396k(c2255e.f27825b.mo4589b2());
            C22431 c22431 = new C22431(c2255e, null);
            this.f27660a = 1;
            if (AbstractC3224d.m15529h(i93VarM7396k, c22431, this) == coroutineSingletons) {
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
