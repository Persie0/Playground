package com.lingq.feature.playlist;

import com.lingq.core.domain.model.playlist.Playlist;
import com.lingq.core.domain.playlist.C1524g;
import java.util.List;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.AbstractC3224d;
import p000.C3386nv;
import p000.c32;
import p000.c83;
import p000.vi3;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.playlist.PlaylistViewModel$getUseCasePlaylistLessons$1", m4291f = "PlaylistViewModel.kt", m4292l = {496}, m4293m = "invokeSuspend", m4294v = 2)
final class PlaylistViewModel$getUseCasePlaylistLessons$1 extends SuspendLambda implements vi3 {

    /* JADX INFO: renamed from: a */
    public int f27702a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2255e f27703b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Playlist f27704c;

    /* JADX INFO: renamed from: com.lingq.feature.playlist.PlaylistViewModel$getUseCasePlaylistLessons$1$1 */
    @c32(m4290c = "com.lingq.feature.playlist.PlaylistViewModel$getUseCasePlaylistLessons$1$1", m4291f = "PlaylistViewModel.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
    final class C22471 extends SuspendLambda implements zi3 {

        /* JADX INFO: renamed from: a */
        public /* synthetic */ Object f27705a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ C2255e f27706b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C22471(C2255e c2255e, Continuation continuation) {
            super(2, continuation);
            this.f27706b = c2255e;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            C22471 c22471 = new C22471(this.f27706b, continuation);
            c22471.f27705a = obj;
            return c22471;
        }

        @Override // p000.zi3
        public final Object invoke(Object obj, Object obj2) throws Throwable {
            C22471 c22471 = (C22471) create((List) obj, (Continuation) obj2);
            xfa xfaVar = xfa.f68157a;
            c22471.invokeSuspend(xfaVar);
            return xfaVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            List list = (List) this.f27705a;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            AbstractC3193b.m15359b(obj);
            C2255e c2255e = this.f27706b;
            if (!((Boolean) c2255e.f27812G.getValue()).booleanValue()) {
                c2255e.f27807B.m15571i(list);
            }
            return xfa.f68157a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlaylistViewModel$getUseCasePlaylistLessons$1(C2255e c2255e, Playlist playlist, Continuation continuation) {
        super(1, continuation);
        this.f27703b = c2255e;
        this.f27704c = playlist;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new PlaylistViewModel$getUseCasePlaylistLessons$1(this.f27703b, this.f27704c, continuation);
    }

    @Override // p000.vi3
    public final Object invoke(Object obj) {
        return ((PlaylistViewModel$getUseCasePlaylistLessons$1) create((Continuation) obj)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f27702a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            C2255e c2255e = this.f27703b;
            C1524g c1524g = c2255e.f27830g;
            Playlist playlist = this.f27704c;
            c83 c83VarM8201a = c1524g.m8201a(playlist.f19556d, playlist.f19553a);
            C22471 c22471 = new C22471(c2255e, null);
            this.f27702a = 1;
            if (AbstractC3224d.m15529h(c83VarM8201a, c22471, this) == coroutineSingletons) {
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
