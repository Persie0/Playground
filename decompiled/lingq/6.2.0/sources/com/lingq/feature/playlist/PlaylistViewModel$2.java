package com.lingq.feature.playlist;

import com.lingq.core.domain.model.playlist.Playlist;
import kotlin.AbstractC3193b;
import kotlin.Pair;
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
import p000.vz1;
import p000.wfb;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.playlist.PlaylistViewModel$2", m4291f = "PlaylistViewModel.kt", m4292l = {310}, m4293m = "invokeSuspend", m4294v = 2)
final class PlaylistViewModel$2 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f27616a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2255e f27617b;

    /* JADX INFO: renamed from: com.lingq.feature.playlist.PlaylistViewModel$2$1 */
    @c32(m4290c = "com.lingq.feature.playlist.PlaylistViewModel$2$1", m4291f = "PlaylistViewModel.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
    final class C22371 extends SuspendLambda implements zi3 {

        /* JADX INFO: renamed from: a */
        public /* synthetic */ Object f27618a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ C2255e f27619b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C22371(C2255e c2255e, Continuation continuation) {
            super(2, continuation);
            this.f27619b = c2255e;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            C22371 c22371 = new C22371(this.f27619b, continuation);
            c22371.f27618a = obj;
            return c22371;
        }

        @Override // p000.zi3
        public final Object invoke(Object obj, Object obj2) throws Throwable {
            C22371 c22371 = (C22371) create((Pair) obj, (Continuation) obj2);
            xfa xfaVar = xfa.f68157a;
            c22371.invokeSuspend(xfaVar);
            return xfaVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Pair pair = (Pair) this.f27618a;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            AbstractC3193b.m15359b(obj);
            String str = (String) pair.f47623a;
            String str2 = (String) pair.f47624b;
            str.getClass();
            str2.getClass();
            C2255e c2255e = this.f27619b;
            Playlist playlist = (Playlist) c2255e.f27809D.getValue();
            if (playlist != null && fa4.m11650l(playlist.f19555c, str)) {
                wfb.m23926u(lda.m16103C(c2255e), null, null, new PlaylistViewModel$onPlaylistEdited$1$1(c2255e, new Playlist(playlist.f19556d, vz1.m23629f(str2, playlist.f19554b), playlist.f19554b, str2, playlist.f19557e, playlist.f19558f), null), 3);
            }
            return xfa.f68157a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlaylistViewModel$2(C2255e c2255e, Continuation continuation) {
        super(2, continuation);
        this.f27617b = c2255e;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new PlaylistViewModel$2(this.f27617b, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((PlaylistViewModel$2) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f27616a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            C2255e c2255e = this.f27617b;
            c83 c83VarMo347x = c2255e.f27828e.mo347x();
            C22371 c22371 = new C22371(c2255e, null);
            this.f27616a = 1;
            if (AbstractC3224d.m15529h(c83VarMo347x, c22371, this) == coroutineSingletons) {
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
