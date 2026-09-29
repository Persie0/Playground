package com.lingq.feature.playlist;

import com.lingq.core.domain.model.playlist.Playlist;
import com.lingq.core.domain.playlist.C1520c;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.AbstractC3224d;
import p000.C3386nv;
import p000.c32;
import p000.c83;
import p000.ux5;
import p000.vi3;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.playlist.PlaylistViewModel$fetchPlaylist$1", m4291f = "PlaylistViewModel.kt", m4292l = {511}, m4293m = "invokeSuspend", m4294v = 2)
final class PlaylistViewModel$fetchPlaylist$1 extends SuspendLambda implements vi3 {

    /* JADX INFO: renamed from: a */
    public int f27678a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2255e f27679b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Playlist f27680c;

    /* JADX INFO: renamed from: com.lingq.feature.playlist.PlaylistViewModel$fetchPlaylist$1$1 */
    @c32(m4290c = "com.lingq.feature.playlist.PlaylistViewModel$fetchPlaylist$1$1", m4291f = "PlaylistViewModel.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
    final class C22441 extends SuspendLambda implements zi3 {

        /* JADX INFO: renamed from: a */
        public /* synthetic */ int f27681a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ C2255e f27682b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C22441(C2255e c2255e, Continuation continuation) {
            super(2, continuation);
            this.f27682b = c2255e;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            C22441 c22441 = new C22441(this.f27682b, continuation);
            c22441.f27681a = ((Number) obj).intValue();
            return c22441;
        }

        @Override // p000.zi3
        public final Object invoke(Object obj, Object obj2) throws Throwable {
            C22441 c22441 = (C22441) create(Integer.valueOf(((Number) obj).intValue()), (Continuation) obj2);
            xfa xfaVar = xfa.f68157a;
            c22441.invokeSuspend(xfaVar);
            return xfaVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            int i = this.f27681a;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            AbstractC3193b.m15359b(obj);
            ux5.m22977D(i == 0, this.f27682b.f27811F, null);
            return xfa.f68157a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlaylistViewModel$fetchPlaylist$1(C2255e c2255e, Playlist playlist, Continuation continuation) {
        super(1, continuation);
        this.f27679b = c2255e;
        this.f27680c = playlist;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new PlaylistViewModel$fetchPlaylist$1(this.f27679b, this.f27680c, continuation);
    }

    @Override // p000.vi3
    public final Object invoke(Object obj) {
        return ((PlaylistViewModel$fetchPlaylist$1) create((Continuation) obj)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C2255e c2255e = this.f27679b;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f27678a;
        try {
            if (i == 0) {
                AbstractC3193b.m15359b(obj);
                C1520c c1520c = c2255e.f27831h;
                Playlist playlist = this.f27680c;
                c83 c83VarM8196a = c1520c.m8196a(playlist.f19556d, playlist.f19553a);
                C22441 c22441 = new C22441(c2255e, null);
                this.f27678a = 1;
                if (AbstractC3224d.m15529h(c83VarM8196a, c22441, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                AbstractC3193b.m15359b(obj);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return xfa.f68157a;
    }
}
