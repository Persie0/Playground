package com.lingq.core.playlists;

import com.lingq.core.data.repository.C1302r;
import com.lingq.core.domain.model.playlist.Playlist;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.C3386nv;
import p000.C3676v8;
import p000.C3713w8;
import p000.c32;
import p000.cma;
import p000.un1;
import p000.vf7;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.playlists.PlaylistsSheetViewModel$addToPlaylist$1", m4291f = "PlaylistsSheetViewModel.kt", m4292l = {123, 131}, m4293m = "invokeSuspend", m4294v = 2)
final class PlaylistsSheetViewModel$addToPlaylist$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f22248a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C1833i f22249b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Playlist f22250c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlaylistsSheetViewModel$addToPlaylist$1(C1833i c1833i, Playlist playlist, Continuation continuation) {
        super(2, continuation);
        this.f22249b = c1833i;
        this.f22250c = playlist;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new PlaylistsSheetViewModel$addToPlaylist$1(this.f22249b, this.f22250c, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((PlaylistsSheetViewModel$addToPlaylist$1) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    /* JADX WARN: Code duplicated, block: B:25:0x006e A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:26:0x006f A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C1833i c1833i = this.f22249b;
        cma cmaVar = c1833i.f22314l;
        vf7 vf7Var = c1833i.f22304b;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f22248a;
        xfa xfaVar = xfa.f68157a;
        if (i != 0) {
            if (i == 1) {
                AbstractC3193b.m15359b(obj);
                return xfaVar;
            }
            if (i == 2) {
                AbstractC3193b.m15359b(obj);
                return xfaVar;
            }
            C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        AbstractC3193b.m15359b(obj);
        boolean z = vf7Var.f65318c;
        Playlist playlist = this.f22250c;
        if (z) {
            C3676v8 c3676v8 = c1833i.f22306d;
            String strMo4589b2 = cmaVar.mo4589b2();
            int i2 = playlist.f19556d;
            String str = playlist.f19553a;
            String str2 = vf7Var.f65317b;
            int i3 = vf7Var.f65316a;
            this.f22248a = 1;
            Object objM7344d = ((C1302r) c3676v8.f64999a).m7344d(i2, i3, strMo4589b2, str, str2, this);
            if (objM7344d != coroutineSingletons) {
                objM7344d = xfaVar;
            }
            if (objM7344d == coroutineSingletons) {
                return coroutineSingletons;
            }
            return xfaVar;
        }
        C3713w8 c3713w8 = c1833i.f22305c;
        String strMo4589b3 = cmaVar.mo4589b2();
        int i4 = playlist.f19556d;
        String str3 = playlist.f19553a;
        String str4 = vf7Var.f65317b;
        int i5 = vf7Var.f65316a;
        this.f22248a = 2;
        Object objM7345e = ((C1302r) c3713w8.f66505a).m7345e(i4, i5, strMo4589b3, str3, str4, this);
        if (objM7345e != coroutineSingletons) {
            objM7345e = xfaVar;
        }
        if (objM7345e == coroutineSingletons) {
            return coroutineSingletons;
        }
        return xfaVar;
    }
}
