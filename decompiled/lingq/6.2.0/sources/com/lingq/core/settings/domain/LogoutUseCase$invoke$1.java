package com.lingq.core.settings.domain;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.settings.domain.LogoutUseCase", m4291f = "LogoutUseCase.kt", m4292l = {24, 25, 26, 29}, m4293m = "invoke", m4294v = 2)
final class LogoutUseCase$invoke$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f22786a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C1864c f22787b;

    /* JADX INFO: renamed from: c */
    public int f22788c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LogoutUseCase$invoke$1(C1864c c1864c, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f22787b = c1864c;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f22786a = obj;
        this.f22788c |= Integer.MIN_VALUE;
        return this.f22787b.m8625a(this);
    }
}
