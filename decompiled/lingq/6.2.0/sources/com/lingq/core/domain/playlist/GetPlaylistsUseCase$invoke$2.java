package com.lingq.core.domain.playlist;

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

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.domain.playlist.GetPlaylistsUseCase$invoke$2", m4291f = "GetPlaylistsUseCase.kt", m4292l = {19}, m4293m = "invokeSuspend", m4294v = 2)
final class GetPlaylistsUseCase$invoke$2 extends SuspendLambda implements vi3 {

    /* JADX INFO: renamed from: a */
    public int f19930a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C1523f f19931b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ String f19932c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetPlaylistsUseCase$invoke$2(C1523f c1523f, String str, Continuation continuation) {
        super(1, continuation);
        this.f19931b = c1523f;
        this.f19932c = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new GetPlaylistsUseCase$invoke$2(this.f19931b, this.f19932c, continuation);
    }

    @Override // p000.vi3
    public final Object invoke(Object obj) {
        return ((GetPlaylistsUseCase$invoke$2) create((Continuation) obj)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f19930a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            xd7 xd7Var = this.f19931b.f19947a;
            this.f19930a = 1;
            if (((C1302r) xd7Var).m7354n(this.f19932c, this) == coroutineSingletons) {
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
