package com.lingq.feature.playlist;

import kotlin.AbstractC3193b;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.AbstractC3224d;
import kotlinx.coroutines.flow.C3244l;
import kotlinx.coroutines.flow.internal.C3235e;
import p000.C0790ay;
import p000.C2944dy;
import p000.C3386nv;
import p000.C3540rl;
import p000.InterfaceC3055gy;
import p000.c32;
import p000.un1;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.playlist.PlaylistViewModel$observePendingAutoPlay$1", m4291f = "PlaylistViewModel.kt", m4292l = {432}, m4293m = "invokeSuspend", m4294v = 2)
final class PlaylistViewModel$observePendingAutoPlay$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f27707a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2255e f27708b;

    /* JADX INFO: renamed from: com.lingq.feature.playlist.PlaylistViewModel$observePendingAutoPlay$1$2 */
    @c32(m4290c = "com.lingq.feature.playlist.PlaylistViewModel$observePendingAutoPlay$1$2", m4291f = "PlaylistViewModel.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
    final class C22482 extends SuspendLambda implements zi3 {

        /* JADX INFO: renamed from: a */
        public /* synthetic */ Object f27709a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ C2255e f27710b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C22482(C2255e c2255e, Continuation continuation) {
            super(2, continuation);
            this.f27710b = c2255e;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            C22482 c22482 = new C22482(this.f27710b, continuation);
            c22482.f27709a = obj;
            return c22482;
        }

        @Override // p000.zi3
        public final Object invoke(Object obj, Object obj2) throws Throwable {
            C22482 c22482 = (C22482) create((Pair) obj, (Continuation) obj2);
            xfa xfaVar = xfa.f68157a;
            c22482.invokeSuspend(xfaVar);
            return xfaVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            C2255e c2255e = this.f27710b;
            C3244l c3244l = c2255e.f27821P;
            Pair pair = (Pair) this.f27709a;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            AbstractC3193b.m15359b(obj);
            int iIntValue = ((Number) pair.f47623a).intValue();
            InterfaceC3055gy interfaceC3055gy = (InterfaceC3055gy) pair.f47624b;
            if (interfaceC3055gy instanceof C0790ay) {
                c3244l.m15571i(null);
                c2255e.f27845v.m8446I(iIntValue, true);
            } else if (interfaceC3055gy instanceof C2944dy) {
                c3244l.m15571i(null);
            }
            return xfa.f68157a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlaylistViewModel$observePendingAutoPlay$1(C2255e c2255e, Continuation continuation) {
        super(2, continuation);
        this.f27708b = c2255e;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new PlaylistViewModel$observePendingAutoPlay$1(this.f27708b, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((PlaylistViewModel$observePendingAutoPlay$1) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f27707a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            C2255e c2255e = this.f27708b;
            C3235e c3235eM15521C = AbstractC3224d.m15521C(AbstractC3224d.m15536o(new C3540rl(c2255e.f27821P, 5)), new C2249x3bb99381(c2255e, null));
            C22482 c22482 = new C22482(c2255e, null);
            this.f27707a = 1;
            if (AbstractC3224d.m15529h(c3235eM15521C, c22482, this) == coroutineSingletons) {
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
