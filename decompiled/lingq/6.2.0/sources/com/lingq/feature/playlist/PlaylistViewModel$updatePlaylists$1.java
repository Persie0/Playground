package com.lingq.feature.playlist;

import com.lingq.core.data.repository.C1302r;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.C3386nv;
import p000.c32;
import p000.vi3;
import p000.xd7;
import p000.xfa;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.playlist.PlaylistViewModel$updatePlaylists$1", m4291f = "PlaylistViewModel.kt", m4292l = {483}, m4293m = "invokeSuspend", m4294v = 2)
final class PlaylistViewModel$updatePlaylists$1 extends SuspendLambda implements vi3 {

    /* JADX INFO: renamed from: a */
    public int f27771a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2255e f27772b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlaylistViewModel$updatePlaylists$1(C2255e c2255e, Continuation continuation) {
        super(1, continuation);
        this.f27772b = c2255e;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new PlaylistViewModel$updatePlaylists$1(this.f27772b, continuation);
    }

    @Override // p000.vi3
    public final Object invoke(Object obj) {
        return ((PlaylistViewModel$updatePlaylists$1) create((Continuation) obj)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f27771a;
        try {
            if (i == 0) {
                AbstractC3193b.m15359b(obj);
                C2255e c2255e = this.f27772b;
                xd7 xd7Var = c2255e.f27837n;
                String strMo4589b2 = c2255e.f27825b.mo4589b2();
                this.f27771a = 1;
                if (((C1302r) xd7Var).m7354n(strMo4589b2, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                AbstractC3193b.m15359b(obj);
            }
        } catch (Exception unused) {
        }
        return xfa.f68157a;
    }
}
