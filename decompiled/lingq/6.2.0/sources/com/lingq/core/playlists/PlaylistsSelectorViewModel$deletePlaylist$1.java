package com.lingq.core.playlists;

import com.lingq.core.data.repository.C1302r;
import com.lingq.core.domain.model.playlist.Playlist;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.C3386nv;
import p000.C3676v8;
import p000.c32;
import p000.un1;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.playlists.PlaylistsSelectorViewModel$deletePlaylist$1", m4291f = "PlaylistsSelectorViewModel.kt", m4292l = {108}, m4293m = "invokeSuspend", m4294v = 2)
final class PlaylistsSelectorViewModel$deletePlaylist$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f22232a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C1832h f22233b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Playlist f22234c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlaylistsSelectorViewModel$deletePlaylist$1(C1832h c1832h, Playlist playlist, Continuation continuation) {
        super(2, continuation);
        this.f22233b = c1832h;
        this.f22234c = playlist;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new PlaylistsSelectorViewModel$deletePlaylist$1(this.f22233b, this.f22234c, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((PlaylistsSelectorViewModel$deletePlaylist$1) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f22232a;
        xfa xfaVar = xfa.f68157a;
        Playlist playlist = this.f22234c;
        C1832h c1832h = this.f22233b;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            C3676v8 c3676v8 = c1832h.f22293c;
            String str = playlist.f19554b;
            String str2 = playlist.f19555c;
            int i2 = playlist.f19556d;
            this.f22232a = 1;
            Object objM7348h = ((C1302r) c3676v8.f64999a).m7348h(i2, str, str2, this);
            if (objM7348h != coroutineSingletons) {
                objM7348h = xfaVar;
            }
            if (objM7348h == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC3193b.m15359b(obj);
        }
        c1832h.mo343V1(playlist);
        return xfaVar;
    }
}
