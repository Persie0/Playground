package com.lingq.feature.playlist;

import com.lingq.core.datastore.C1368a;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.C3386nv;
import p000.c32;
import p000.si7;
import p000.un1;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.playlist.PlaylistViewModel$setDisableDownloadsPlaylist$1", m4291f = "PlaylistViewModel.kt", m4292l = {994}, m4293m = "invokeSuspend", m4294v = 2)
final class PlaylistViewModel$setDisableDownloadsPlaylist$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f27741a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2255e f27742b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ boolean f27743c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlaylistViewModel$setDisableDownloadsPlaylist$1(C2255e c2255e, boolean z, Continuation continuation) {
        super(2, continuation);
        this.f27742b = c2255e;
        this.f27743c = z;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new PlaylistViewModel$setDisableDownloadsPlaylist$1(this.f27742b, this.f27743c, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((PlaylistViewModel$setDisableDownloadsPlaylist$1) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f27741a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            si7 si7Var = this.f27742b.f27842s;
            this.f27741a = 1;
            if (((C1368a) si7Var).m7909v(this.f27743c, this) == coroutineSingletons) {
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
