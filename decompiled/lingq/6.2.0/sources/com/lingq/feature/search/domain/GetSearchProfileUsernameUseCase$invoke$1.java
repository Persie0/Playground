package com.lingq.feature.search.domain;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.search.domain.GetSearchProfileUsernameUseCase", m4291f = "GetSearchProfileUsernameUseCase.kt", m4292l = {11}, m4293m = "invoke", m4294v = 2)
final class GetSearchProfileUsernameUseCase$invoke$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f32825a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2766b f32826b;

    /* JADX INFO: renamed from: c */
    public int f32827c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetSearchProfileUsernameUseCase$invoke$1(C2766b c2766b, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f32826b = c2766b;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f32825a = obj;
        this.f32827c |= Integer.MIN_VALUE;
        return this.f32826b.m9674a(this);
    }
}
