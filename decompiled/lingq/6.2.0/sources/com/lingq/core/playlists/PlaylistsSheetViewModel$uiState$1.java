package com.lingq.core.playlists;

import java.util.List;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.aj3;
import p000.c32;
import p000.nd7;
import p000.xf7;
import p000.xfa;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.playlists.PlaylistsSheetViewModel$uiState$1", m4291f = "PlaylistsSheetViewModel.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
final class PlaylistsSheetViewModel$uiState$1 extends SuspendLambda implements aj3 {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ List f22262a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ nd7 f22263b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C1833i f22264c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlaylistsSheetViewModel$uiState$1(C1833i c1833i, Continuation continuation) {
        super(3, continuation);
        this.f22264c = c1833i;
    }

    @Override // p000.aj3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        PlaylistsSheetViewModel$uiState$1 playlistsSheetViewModel$uiState$1 = new PlaylistsSheetViewModel$uiState$1(this.f22264c, (Continuation) obj3);
        playlistsSheetViewModel$uiState$1.f22262a = (List) obj;
        playlistsSheetViewModel$uiState$1.f22263b = (nd7) obj2;
        return playlistsSheetViewModel$uiState$1.invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        List list = this.f22262a;
        nd7 nd7Var = this.f22263b;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        AbstractC3193b.m15359b(obj);
        return new xf7(list, this.f22264c.f22314l.mo4598w2(), nd7Var);
    }
}
