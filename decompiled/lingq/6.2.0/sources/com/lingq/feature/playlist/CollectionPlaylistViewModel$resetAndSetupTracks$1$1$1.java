package com.lingq.feature.playlist;

import com.lingq.core.domain.model.audio.DownloadItem;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.C3386nv;
import p000.c32;
import p000.tb7;
import p000.un1;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.playlist.CollectionPlaylistViewModel$resetAndSetupTracks$1$1$1", m4291f = "CollectionPlaylistViewModel.kt", m4292l = {207}, m4293m = "invokeSuspend", m4294v = 2)
final class CollectionPlaylistViewModel$resetAndSetupTracks$1$1$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f27569a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2251a f27570b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ tb7 f27571c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CollectionPlaylistViewModel$resetAndSetupTracks$1$1$1(C2251a c2251a, tb7 tb7Var, Continuation continuation) {
        super(2, continuation);
        this.f27570b = c2251a;
        this.f27571c = tb7Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new CollectionPlaylistViewModel$resetAndSetupTracks$1$1$1(this.f27570b, this.f27571c, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((CollectionPlaylistViewModel$resetAndSetupTracks$1$1$1) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f27569a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            tb7 tb7Var = this.f27571c;
            DownloadItem downloadItem = new DownloadItem(tb7Var.f62110j, tb7Var.f62101a, tb7Var.f62102b);
            this.f27569a = 1;
            if (this.f27570b.f27776e.mo8234r(downloadItem, this) == coroutineSingletons) {
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
