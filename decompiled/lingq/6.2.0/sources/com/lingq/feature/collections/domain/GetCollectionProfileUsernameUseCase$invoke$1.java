package com.lingq.feature.collections.domain;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.feature.collections.domain.GetCollectionProfileUsernameUseCase", m4291f = "GetCollectionProfileUsernameUseCase.kt", m4292l = {11}, m4293m = "invoke", m4294v = 2)
final class GetCollectionProfileUsernameUseCase$invoke$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f25630a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2038d f25631b;

    /* JADX INFO: renamed from: c */
    public int f25632c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetCollectionProfileUsernameUseCase$invoke$1(C2038d c2038d, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f25631b = c2038d;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f25630a = obj;
        this.f25632c |= Integer.MIN_VALUE;
        return this.f25631b.m8961b(this);
    }
}
