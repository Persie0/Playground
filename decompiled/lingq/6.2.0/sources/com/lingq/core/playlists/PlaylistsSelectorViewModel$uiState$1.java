package com.lingq.core.playlists;

import java.util.List;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.aj3;
import p000.c32;
import p000.nd7;
import p000.sf7;
import p000.xfa;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.playlists.PlaylistsSelectorViewModel$uiState$1", m4291f = "PlaylistsSelectorViewModel.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
final class PlaylistsSelectorViewModel$uiState$1 extends SuspendLambda implements aj3 {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ List f22239a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ nd7 f22240b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C1832h f22241c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlaylistsSelectorViewModel$uiState$1(C1832h c1832h, Continuation continuation) {
        super(3, continuation);
        this.f22241c = c1832h;
    }

    @Override // p000.aj3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        PlaylistsSelectorViewModel$uiState$1 playlistsSelectorViewModel$uiState$1 = new PlaylistsSelectorViewModel$uiState$1(this.f22241c, (Continuation) obj3);
        playlistsSelectorViewModel$uiState$1.f22239a = (List) obj;
        playlistsSelectorViewModel$uiState$1.f22240b = (nd7) obj2;
        return playlistsSelectorViewModel$uiState$1.invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        List list = this.f22239a;
        nd7 nd7Var = this.f22240b;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        AbstractC3193b.m15359b(obj);
        return new sf7(list, this.f22241c.f22299i.mo4598w2(), nd7Var);
    }
}
