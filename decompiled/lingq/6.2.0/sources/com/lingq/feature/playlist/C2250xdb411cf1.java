package com.lingq.feature.playlist;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;
import p000.ij2;

/* JADX INFO: renamed from: com.lingq.feature.playlist.PlaylistViewModel$observePendingAutoPlay$1$invokeSuspend$lambda$0$$inlined$map$1$2$1 */
/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.feature.playlist.PlaylistViewModel$observePendingAutoPlay$1$invokeSuspend$lambda$0$$inlined$map$1$2", m4291f = "PlaylistViewModel.kt", m4292l = {217}, m4293m = "emit", m4294v = 2)
public final class C2250xdb411cf1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f27715a;

    /* JADX INFO: renamed from: b */
    public int f27716b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ ij2 f27717c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2250xdb411cf1(ij2 ij2Var, Continuation continuation) {
        super(continuation);
        this.f27717c = ij2Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f27715a = obj;
        this.f27716b |= Integer.MIN_VALUE;
        return this.f27717c.emit(null, this);
    }
}
