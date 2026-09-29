package com.lingq.feature.playlist;

import com.lingq.core.data.repository.C1302r;
import com.lingq.core.domain.model.playlist.Playlist;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.AbstractC3224d;
import p000.C3386nv;
import p000.c32;
import p000.kk8;
import p000.nn1;
import p000.un1;
import p000.wfb;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.playlist.PlaylistViewModel$getDefaultPlaylist$1", m4291f = "PlaylistViewModel.kt", m4292l = {528}, m4293m = "invokeSuspend", m4294v = 2)
final class PlaylistViewModel$getDefaultPlaylist$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f27689a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2255e f27690b;

    /* JADX INFO: renamed from: com.lingq.feature.playlist.PlaylistViewModel$getDefaultPlaylist$1$1 */
    @c32(m4290c = "com.lingq.feature.playlist.PlaylistViewModel$getDefaultPlaylist$1$1", m4291f = "PlaylistViewModel.kt", m4292l = {530}, m4293m = "invokeSuspend", m4294v = 2)
    final class C22451 extends SuspendLambda implements zi3 {

        /* JADX INFO: renamed from: a */
        public int f27691a;

        /* JADX INFO: renamed from: b */
        public /* synthetic */ Object f27692b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ C2255e f27693c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C22451(C2255e c2255e, Continuation continuation) {
            super(2, continuation);
            this.f27693c = c2255e;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            C22451 c22451 = new C22451(this.f27693c, continuation);
            c22451.f27692b = obj;
            return c22451;
        }

        @Override // p000.zi3
        public final Object invoke(Object obj, Object obj2) {
            return ((C22451) create((Playlist) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Playlist playlist = (Playlist) this.f27692b;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.f27691a;
            if (i == 0) {
                AbstractC3193b.m15359b(obj);
                if (playlist != null) {
                    C2255e c2255e = this.f27693c;
                    nn1 nn1Var = c2255e.f27841r;
                    PlaylistViewModel$getDefaultPlaylist$1$1$1$1 playlistViewModel$getDefaultPlaylist$1$1$1$1 = new PlaylistViewModel$getDefaultPlaylist$1$1$1$1(c2255e, playlist, null);
                    this.f27692b = null;
                    this.f27691a = 1;
                    if (wfb.m23905G(playlistViewModel$getDefaultPlaylist$1$1$1$1, nn1Var, this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
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
    public PlaylistViewModel$getDefaultPlaylist$1(C2255e c2255e, Continuation continuation) {
        super(2, continuation);
        this.f27690b = c2255e;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new PlaylistViewModel$getDefaultPlaylist$1(this.f27690b, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((PlaylistViewModel$getDefaultPlaylist$1) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f27689a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            C2255e c2255e = this.f27690b;
            kk8 kk8VarM7355o = ((C1302r) c2255e.f27837n).m7355o(c2255e.f27825b.mo4589b2());
            C22451 c22451 = new C22451(c2255e, null);
            this.f27689a = 1;
            if (AbstractC3224d.m15529h(kk8VarM7355o, c22451, this) == coroutineSingletons) {
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
