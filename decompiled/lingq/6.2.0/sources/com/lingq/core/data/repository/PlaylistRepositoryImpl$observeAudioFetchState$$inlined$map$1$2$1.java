package com.lingq.core.data.repository;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;
import p000.zd7;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.core.data.repository.PlaylistRepositoryImpl$observeAudioFetchState$$inlined$map$1$2", m4291f = "PlaylistRepositoryImpl.kt", m4292l = {50}, m4293m = "emit", m4294v = 2)
public final class PlaylistRepositoryImpl$observeAudioFetchState$$inlined$map$1$2$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f15997a;

    /* JADX INFO: renamed from: b */
    public int f15998b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ zd7 f15999c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlaylistRepositoryImpl$observeAudioFetchState$$inlined$map$1$2$1(zd7 zd7Var, Continuation continuation) {
        super(continuation);
        this.f15999c = zd7Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f15997a = obj;
        this.f15998b |= Integer.MIN_VALUE;
        return this.f15999c.emit(null, this);
    }
}
