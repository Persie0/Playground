package com.lingq.feature.playlist;

import androidx.room.util.AbstractC0758a;
import com.lingq.core.data.repository.C1302r;
import com.lingq.core.domain.model.playlist.Playlist;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.C3386nv;
import p000.c32;
import p000.ld0;
import p000.un1;
import p000.xd7;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.playlist.PlaylistViewModel$selectPlaylist$1", m4291f = "PlaylistViewModel.kt", m4292l = {913}, m4293m = "invokeSuspend", m4294v = 2)
final class PlaylistViewModel$selectPlaylist$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f27733a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2255e f27734b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ int f27735c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlaylistViewModel$selectPlaylist$1(C2255e c2255e, int i, Continuation continuation) {
        super(2, continuation);
        this.f27734b = c2255e;
        this.f27735c = i;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new PlaylistViewModel$selectPlaylist$1(this.f27734b, this.f27735c, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((PlaylistViewModel$selectPlaylist$1) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f27733a;
        C2255e c2255e = this.f27734b;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            xd7 xd7Var = c2255e.f27837n;
            String strMo4589b2 = c2255e.f27825b.mo4589b2();
            this.f27733a = 1;
            obj = AbstractC0758a.m2861d(new ld0(strMo4589b2, this.f27735c, 17), ((C1302r) xd7Var).f16534c.f17045K, this, true, false);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC3193b.m15359b(obj);
        }
        Playlist playlist = (Playlist) obj;
        if (playlist != null) {
            c2255e.f27828e.mo344f2(playlist);
        }
        return xfa.f68157a;
    }
}
