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
@c32(m4290c = "com.lingq.feature.playlist.PlaylistViewModel$removeLessonFromPlaylist$1", m4291f = "PlaylistViewModel.kt", m4292l = {565}, m4293m = "invokeSuspend", m4294v = 2)
final class PlaylistViewModel$removeLessonFromPlaylist$1 extends SuspendLambda implements vi3 {

    /* JADX INFO: renamed from: a */
    public int f27727a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2255e f27728b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ String f27729c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f27730d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlaylistViewModel$removeLessonFromPlaylist$1(C2255e c2255e, String str, int i, Continuation continuation) {
        super(1, continuation);
        this.f27728b = c2255e;
        this.f27729c = str;
        this.f27730d = i;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new PlaylistViewModel$removeLessonFromPlaylist$1(this.f27728b, this.f27729c, this.f27730d, continuation);
    }

    @Override // p000.vi3
    public final Object invoke(Object obj) {
        return ((PlaylistViewModel$removeLessonFromPlaylist$1) create((Continuation) obj)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        String str;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f27727a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            C2255e c2255e = this.f27728b;
            xd7 xd7Var = c2255e.f27837n;
            C3244l c3244l = c2255e.f27809D;
            String strMo4589b2 = c2255e.f27825b.mo4589b2();
            Playlist playlist = (Playlist) c3244l.getValue();
            if (playlist == null || (str = playlist.f19553a) == null) {
                str = "";
            }
            String str2 = str;
            Playlist playlist2 = (Playlist) c3244l.getValue();
            Integer num = new Integer(playlist2 != null ? playlist2.f19556d : 0);
            this.f27727a = 1;
            if (((C1302r) xd7Var).m7363w(strMo4589b2, str2, this.f27729c, this.f27730d, num, this) == coroutineSingletons) {
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
