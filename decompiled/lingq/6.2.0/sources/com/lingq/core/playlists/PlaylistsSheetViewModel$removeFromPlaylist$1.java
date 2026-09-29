package com.lingq.core.playlists;

import com.lingq.core.data.repository.C1302r;
import com.lingq.core.domain.model.playlist.Playlist;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.C3386nv;
import p000.C3713w8;
import p000.c32;
import p000.un1;
import p000.vf7;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.playlists.PlaylistsSheetViewModel$removeFromPlaylist$1", m4291f = "PlaylistsSheetViewModel.kt", m4292l = {144}, m4293m = "invokeSuspend", m4294v = 2)
final class PlaylistsSheetViewModel$removeFromPlaylist$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f22259a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C1833i f22260b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Playlist f22261c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlaylistsSheetViewModel$removeFromPlaylist$1(C1833i c1833i, Playlist playlist, Continuation continuation) {
        super(2, continuation);
        this.f22260b = c1833i;
        this.f22261c = playlist;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new PlaylistsSheetViewModel$removeFromPlaylist$1(this.f22260b, this.f22261c, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((PlaylistsSheetViewModel$removeFromPlaylist$1) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f22259a;
        xfa xfaVar = xfa.f68157a;
        if (i != 0) {
            if (i == 1) {
                AbstractC3193b.m15359b(obj);
                return xfaVar;
            }
            C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        AbstractC3193b.m15359b(obj);
        C1833i c1833i = this.f22260b;
        C3713w8 c3713w8 = c1833i.f22307e;
        String strMo4589b2 = c1833i.f22314l.mo4589b2();
        vf7 vf7Var = c1833i.f22304b;
        String str = vf7Var.f65317b;
        int i2 = vf7Var.f65316a;
        int i3 = this.f22261c.f19556d;
        this.f22259a = 1;
        Object objM7361u = ((C1302r) c3713w8.f66505a).m7361u(i2, i3, strMo4589b2, str, this);
        if (objM7361u != coroutineSingletons) {
            objM7361u = xfaVar;
        }
        return objM7361u == coroutineSingletons ? coroutineSingletons : xfaVar;
    }
}
