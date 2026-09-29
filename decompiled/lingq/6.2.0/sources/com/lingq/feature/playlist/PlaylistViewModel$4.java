package com.lingq.feature.playlist;

import com.lingq.core.domain.model.playlist.Playlist;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.AbstractC3224d;
import p000.C3386nv;
import p000.c32;
import p000.c83;
import p000.fa4;
import p000.lda;
import p000.un1;
import p000.wfb;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.playlist.PlaylistViewModel$4", m4291f = "PlaylistViewModel.kt", m4292l = {323}, m4293m = "invokeSuspend", m4294v = 2)
final class PlaylistViewModel$4 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f27624a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2255e f27625b;

    /* JADX INFO: renamed from: com.lingq.feature.playlist.PlaylistViewModel$4$1 */
    @c32(m4290c = "com.lingq.feature.playlist.PlaylistViewModel$4$1", m4291f = "PlaylistViewModel.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
    final class C22391 extends SuspendLambda implements zi3 {

        /* JADX INFO: renamed from: a */
        public /* synthetic */ Object f27626a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ C2255e f27627b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C22391(C2255e c2255e, Continuation continuation) {
            super(2, continuation);
            this.f27627b = c2255e;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            C22391 c22391 = new C22391(this.f27627b, continuation);
            c22391.f27626a = obj;
            return c22391;
        }

        @Override // p000.zi3
        public final Object invoke(Object obj, Object obj2) throws Throwable {
            C22391 c22391 = (C22391) create((Playlist) obj, (Continuation) obj2);
            xfa xfaVar = xfa.f68157a;
            c22391.invokeSuspend(xfaVar);
            return xfaVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Playlist playlist = (Playlist) this.f27626a;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            AbstractC3193b.m15359b(obj);
            playlist.getClass();
            C2255e c2255e = this.f27627b;
            Playlist playlist2 = (Playlist) c2255e.f27809D.getValue();
            if (playlist2 != null && fa4.m11650l(playlist2.f19555c, playlist.f19555c)) {
                c2255e.m9238Z2();
                c2255e.f27845v.m8450M(false);
                wfb.m23926u(lda.m16103C(c2255e), c2255e.f27840q, null, new PlaylistViewModel$getDefaultPlaylist$1(c2255e, null), 2);
            }
            return xfa.f68157a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlaylistViewModel$4(C2255e c2255e, Continuation continuation) {
        super(2, continuation);
        this.f27625b = c2255e;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new PlaylistViewModel$4(this.f27625b, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((PlaylistViewModel$4) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f27624a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            C2255e c2255e = this.f27625b;
            c83 c83VarMo345m2 = c2255e.f27828e.mo345m2();
            C22391 c22391 = new C22391(c2255e, null);
            this.f27624a = 1;
            if (AbstractC3224d.m15529h(c83VarMo345m2, c22391, this) == coroutineSingletons) {
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
