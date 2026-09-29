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
@c32(m4290c = "com.lingq.core.playlists.PlaylistsSheetViewModel$deletePlaylist$1", m4291f = "PlaylistsSheetViewModel.kt", m4292l = {155}, m4293m = "invokeSuspend", m4294v = 2)
final class PlaylistsSheetViewModel$deletePlaylist$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f22256a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C1833i f22257b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Playlist f22258c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlaylistsSheetViewModel$deletePlaylist$1(C1833i c1833i, Playlist playlist, Continuation continuation) {
        super(2, continuation);
        this.f22257b = c1833i;
        this.f22258c = playlist;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new PlaylistsSheetViewModel$deletePlaylist$1(this.f22257b, this.f22258c, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((PlaylistsSheetViewModel$deletePlaylist$1) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f22256a;
        xfa xfaVar = xfa.f68157a;
        Playlist playlist = this.f22258c;
        C1833i c1833i = this.f22257b;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            C3676v8 c3676v8 = c1833i.f22308f;
            String str = playlist.f19554b;
            String str2 = playlist.f19555c;
            int i2 = playlist.f19556d;
            this.f22256a = 1;
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
        c1833i.mo343V1(playlist);
        return xfaVar;
    }
}
