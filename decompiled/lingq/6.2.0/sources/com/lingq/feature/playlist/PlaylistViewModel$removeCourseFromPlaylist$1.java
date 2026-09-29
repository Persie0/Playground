package com.lingq.feature.playlist;

import com.lingq.core.data.repository.C1302r;
import com.lingq.core.domain.model.playlist.Playlist;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.C3244l;
import p000.C3386nv;
import p000.c32;
import p000.vi3;
import p000.xd7;
import p000.xfa;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.playlist.PlaylistViewModel$removeCourseFromPlaylist$1", m4291f = "PlaylistViewModel.kt", m4292l = {580}, m4293m = "invokeSuspend", m4294v = 2)
final class PlaylistViewModel$removeCourseFromPlaylist$1 extends SuspendLambda implements vi3 {

    /* JADX INFO: renamed from: a */
    public int f27724a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2255e f27725b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ int f27726c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlaylistViewModel$removeCourseFromPlaylist$1(C2255e c2255e, int i, Continuation continuation) {
        super(1, continuation);
        this.f27725b = c2255e;
        this.f27726c = i;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new PlaylistViewModel$removeCourseFromPlaylist$1(this.f27725b, this.f27726c, continuation);
    }

    @Override // p000.vi3
    public final Object invoke(Object obj) {
        return ((PlaylistViewModel$removeCourseFromPlaylist$1) create((Continuation) obj)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        String str;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f27724a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            C2255e c2255e = this.f27725b;
            xd7 xd7Var = c2255e.f27837n;
            C3244l c3244l = c2255e.f27809D;
            String strMo4589b2 = c2255e.f27825b.mo4589b2();
            Playlist playlist = (Playlist) c3244l.getValue();
            if (playlist == null || (str = playlist.f19553a) == null) {
                str = "";
            }
            String str2 = str;
            Playlist playlist2 = (Playlist) c3244l.getValue();
            int i2 = playlist2 != null ? playlist2.f19556d : 0;
            this.f27724a = 1;
            if (((C1302r) xd7Var).m7360t(this.f27726c, i2, strMo4589b2, str2, this) == coroutineSingletons) {
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
