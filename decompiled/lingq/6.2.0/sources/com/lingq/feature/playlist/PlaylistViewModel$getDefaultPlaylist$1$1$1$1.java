package com.lingq.feature.playlist;

import com.lingq.core.domain.model.playlist.Playlist;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.C3386nv;
import p000.c32;
import p000.un1;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.playlist.PlaylistViewModel$getDefaultPlaylist$1$1$1$1", m4291f = "PlaylistViewModel.kt", m4292l = {531}, m4293m = "invokeSuspend", m4294v = 2)
final class PlaylistViewModel$getDefaultPlaylist$1$1$1$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f27694a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2255e f27695b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Playlist f27696c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlaylistViewModel$getDefaultPlaylist$1$1$1$1(C2255e c2255e, Playlist playlist, Continuation continuation) {
        super(2, continuation);
        this.f27695b = c2255e;
        this.f27696c = playlist;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new PlaylistViewModel$getDefaultPlaylist$1$1$1$1(this.f27695b, this.f27696c, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((PlaylistViewModel$getDefaultPlaylist$1$1$1$1) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f27694a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            this.f27694a = 1;
            if (C2255e.m9235W2(this.f27695b, this.f27696c, this) == coroutineSingletons) {
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
