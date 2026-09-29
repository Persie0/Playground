package com.lingq.feature.playlist;

import com.lingq.core.domain.model.playlist.Playlist;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.C3244l;
import p000.C3160ju;
import p000.C3386nv;
import p000.c32;
import p000.df7;
import p000.lda;
import p000.sq5;
import p000.un1;
import p000.wfb;
import p000.xfa;
import p000.xm5;
import p000.ym5;
import p000.zi3;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.playlist.PlaylistViewModel$archiveCurrentPlaylist$1", m4291f = "PlaylistViewModel.kt", m4292l = {963, 978}, m4293m = "invokeSuspend", m4294v = 2)
final class PlaylistViewModel$archiveCurrentPlaylist$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f27641a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2255e f27642b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Playlist f27643c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlaylistViewModel$archiveCurrentPlaylist$1(C2255e c2255e, Playlist playlist, Continuation continuation) {
        super(2, continuation);
        this.f27642b = c2255e;
        this.f27643c = playlist;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new PlaylistViewModel$archiveCurrentPlaylist$1(this.f27642b, this.f27643c, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((PlaylistViewModel$archiveCurrentPlaylist$1) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0067, code lost:
    
        if (kotlinx.coroutines.AbstractC3208a.m15438e(r4, r9) == r0) goto L19;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f27641a;
        xfa xfaVar = xfa.f68157a;
        C2255e c2255e = this.f27642b;
        if (i != 0) {
            if (i == 1) {
                AbstractC3193b.m15359b(obj);
            } else {
                if (i != 2) {
                    C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                AbstractC3193b.m15359b(obj);
            }
            C2255e.m9237Y2(c2255e);
            return xfaVar;
        }
        AbstractC3193b.m15359b(obj);
        sq5 sq5Var = c2255e.f27836m;
        Playlist playlist = this.f27643c;
        String str = playlist.f19554b;
        C3160ju c3160ju = new C3160ju(playlist.f19556d);
        this.f27641a = 1;
        obj = sq5Var.m21579u(str, c3160ju, true, this);
        if (obj != coroutineSingletons) {
        }
        return coroutineSingletons;
        if (!(((ym5) obj) instanceof xm5)) {
            C3244l c3244l = c2255e.f27823R;
            Boolean bool = Boolean.TRUE;
            c3244l.getClass();
            c3244l.m15572j(null, bool);
            return xfaVar;
        }
        c2255e.m9238Z2();
        c2255e.f27845v.m8450M(false);
        wfb.m23926u(lda.m16103C(c2255e), c2255e.f27840q, null, new PlaylistViewModel$getDefaultPlaylist$1(c2255e, null), 2);
        long j = df7.f35566a;
        this.f27641a = 2;
    }
}
